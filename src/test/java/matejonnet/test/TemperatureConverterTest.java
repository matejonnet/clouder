package matejonnet.test;

import javax.inject.Inject;

import matejonnet.TemperatureConverter;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TemperatureConverterTest extends Arquillian { 

	   @Inject
	   private TemperatureConverter converter;


	   @Deployment
	   public static JavaArchive createTestArchive() {
	      return ShrinkWrap.create(JavaArchive.class, "test.jar")
	         .addClasses(TemperatureConverter.class)
	         .addManifestResource(EmptyAsset.INSTANCE,ArchivePaths.create("beans.xml")); 
	   }



	   @Test
	   public void testConvertToCelsiusNoInect() {
		  TemperatureConverter converter = new TemperatureConverter();
	      Assert.assertEquals(converter.convertToCelsius(32d), 0d);
	      Assert.assertEquals(converter.convertToCelsius(212d), 100d);
	   }

	   @Test
	   public void testConvertToCelsius() {
	      Assert.assertEquals(converter.convertToCelsius(32d), 0d);
	      Assert.assertEquals(converter.convertToCelsius(212d), 100d);
	   }


	   @Test
	   public void testConvertToFarenheit() {
	      Assert.assertEquals(converter.convertToFarenheit(0d), 32d);
	      Assert.assertEquals(converter.convertToFarenheit(100d), 212d);
	   }
	  
	}