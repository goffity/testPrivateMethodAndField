package com.goffity.demo.testPrivateMethodAndFieldDemo;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrivateMethod() throws Exception {
		System.out.println("testPrivateMethod()");

		String expected = "TestMain()";

		Method method = App.class.getDeclaredMethod("privateMethod",
				String.class);
		method.setAccessible(true);

		String actual = (String) method.invoke(new App(), expected);

		assertNotNull(actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testPrivateField() throws Exception {
		System.out.println("testPrivateField()");

		String expected = "test_private_field";

		Field field = App.class.getDeclaredField("privateField");
		field.setAccessible(true);
		
		App app = new App();
		
		field.set(app, expected);
		
		assertNotNull(field);
		assertEquals(expected, field.get(app));
	}

}
