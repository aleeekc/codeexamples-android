package de.vogella.android.temperature.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.vogella.android.temperature.ConverterUtil;

public class ConverterUtilTest extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testConvertFahrenheitToCelsius() throws Exception {
		float actual = ConverterUtil.convertCelsiusToFahrenheit(100);
		// expected value is 212
		float expected = 212;
		// use this method because float is not precise
		assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
	}

	public void testConvertCelsiusToFahrenheit() throws Exception {
		float actual = ConverterUtil.convertFahrenheitToCelsius(212);
		// expected value is 100
		float expected = 100;
		// use this method because float is not precise
		assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
	}

}
