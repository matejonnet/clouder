package matejonnet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import org.junit.Test;


@Named
@RequestScoped
@ManagedBean
public class MyBean implements Serializable {

	private static final long serialVersionUID = 1926695191451533895L;

	private String message;

	public MyBean() {}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public String getTime() {
		return System.currentTimeMillis() + "";
	}
	
	@Test
	public void test() {
		
	}
}