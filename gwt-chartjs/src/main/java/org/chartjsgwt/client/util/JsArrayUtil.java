package org.chartjsgwt.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * Utility class for conversion between JsArray and Java arrays.
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class JsArrayUtil
{

	static public final <T extends JavaScriptObject> JsArray<T> toJsArray (final T[] array)
	{
		final JsArray<T> jsArr = JavaScriptObject.createArray().cast();
		for (T o : array)
		{
			jsArr.push(o);
		}
		return jsArr;
	}

	static public final <T extends JavaScriptObject> T[] toJavaArray (final JsArray<T> array)
	{
		final int length = array.length();
		@SuppressWarnings("unchecked")
		final T[] javaArr = (T[]) new JavaScriptObject[length];
		for (int i = 0; i<length; i++)
		{
			javaArr[i] = array.get(i);
		}
		return javaArr;
	}

	static public final JsArrayString toJsArray (final String[] array)
	{
		final JsArrayString jsArr = JsArrayString.createArray().cast();
		for (String o : array)
		{
			jsArr.push(o);
		}
		return jsArr;
	}

	static public final String[] toJavaArray (final JsArrayString array)
	{
		final int length = array.length();
		final String[] javaArr = new String[length];
		for (int i = 0; i<length; i++)
		{
			javaArr[i] = array.get(i);
		}
		return javaArr;
	}


	static public final JsArrayNumber toJsArray (final double[] array)
	{
		final JsArrayNumber jsArr = JsArrayNumber.createArray().cast();
		for (double d : array)
		{
			jsArr.push(d);
		}
		return jsArr;
	}

	static public final double[] toDoubleArray (final JsArrayNumber array)
	{
		final int length = array.length();
		final double[] javaArr = new double[length];
		for (int i = 0; i<length; i++)
		{
			javaArr[i] = array.get(i);
		}
		return javaArr;
	}

	static public final JsArrayInteger toJsArray (final int[] array)
	{
		final JsArrayInteger jsArr = JsArrayInteger.createArray().cast();
		for (int d : array)
		{
			jsArr.push(d);
		}
		return jsArr;
	}

	static public final int[] toIntArray (final JsArrayInteger array)
	{
		final int length = array.length();
		final int[] javaArr = new int[length];
		for (int i = 0; i<length; i++)
		{
			javaArr[i] = array.get(i);
		}
		return javaArr;
	}

	static public <T extends JavaScriptObject> JsArray<T> singletonOrEmptyJsArray(T object)
	{
		final JsArray<T> array;
		if (object == null)
		{
			array = JsArray.createArray(0).cast();
		}
		else
		{
			array = JsArray.createArray(1).cast();
			array.set(0, object);
		}
		return array;
	}

}