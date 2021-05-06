package com.test.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method test) {
		annotation.setRetryAnalyzer(MyRetryAnalayzer.class);
	}

}
