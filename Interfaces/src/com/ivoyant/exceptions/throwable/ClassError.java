package com.ivoyant.exceptions.throwable;

import java.awt.AWTError;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.nio.charset.CoderMalfunctionError;
import java.util.ServiceConfigurationError;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;
import com.sun.jdi.Method;

public class ClassError {

	public void method1() {
		System.out.println("Error");
		throw new Error();
	}

	public void method2() {
		System.out.println("AnnotationFormatError(String)");
		throw new AnnotationFormatError("Test");
	}

	public void method3() {
		System.out.println("AssertionError");
		throw new AssertionError();
	}

	public void method4() {
		System.out.println("AWTError");
		throw new AWTError("Test");
	}

	public void method5() {
		System.out.println("CoderMalfunctionError");
		throw new CoderMalfunctionError(null);
	}

	public void method6() {
		System.out.println("FactoryConfigurationError");
		throw new FactoryConfigurationError();
	}

	public void method7() {
		System.out.println("javax.xml.parsers.FactoryConfigurationError");
		throw new javax.xml.parsers.FactoryConfigurationError();
	}

	public void method8() {
		System.out.println("IOError");
		throw new IOError(null);
	}

	public void method9() {
		System.out.println("LinkageError");
		throw new LinkageError();
	}

	public void method10() {
		System.out.println("Error(String)");
		throw new Error("Error(String)");
	}

	private void method11() {
		System.out.println("Error(Throwable cause)");
		throw new Error("Error(Throwable cause)");
	}

	public void method12() {
		System.out.println("Error(String message, Throwable cause)");
		throw new Error("Error", null);
	}

	public void method13() {
		System.out.println("SchemaFactoryConfigurationError");
		throw new SchemaFactoryConfigurationError();
	}

	public void method14() {
		System.out.println("ServiceConfigurationError(String msg)");
		throw new ServiceConfigurationError(null);
	}

	public void method15() {
		System.out.println("ServiceConfigurationError(String msg, Throwable cause)");
		throw new ServiceConfigurationError(null, null);
	}

	public void method16() {
		System.out.println("ThreadDeath()");
		throw new ThreadDeath();
	}

	public void method17() {
		System.out.println("TransformerFactoryConfigurationError()");
		throw new TransformerFactoryConfigurationError();
	}

	public void method18() {
		System.out.println("TransformerFactoryConfigurationError(String msg)");
		throw new TransformerFactoryConfigurationError(null, null);
	}
	public void method19() {
		System.out.println("InternalError()");
		throw new InternalError();
	}
	public void method20() {
		System.out.println("OutOfMemoryError()");
		throw new OutOfMemoryError();
	}
	public void method21() {
		System.out.println("OutOfMemoryError(String s)");
		throw new OutOfMemoryError(null);
	}
	public void method22() {
		System.out.println("StackOverflowError()");
		throw new StackOverflowError();
	}
	public void method23() {
		System.out.println("StackOverflowError(String)");
		throw new StackOverflowError(null);
	}
	public void method24() {
		System.out.println("UnknownError()");
		throw new UnknownError();
	}
	public void method25() {
		System.out.println("UnknownError(String)");
		throw new UnknownError(null);
	}
	public void method26() {
		System.out.println("AnnotationFormatError(String message, Throwable cause)");
		throw new AnnotationFormatError(null, null);
	}
	public void method27() {
		System.out.println("AssertionError(boolean detailMessage)");
		throw new AssertionError(false);
	}
	public void method28() {
		System.out.println("AssertionError(char detailMessage)");
		throw new AssertionError(' ');
	}
	public void method29() {
		System.out.println("AssertionError(double detailMessage)");
		throw new AssertionError(45);
	}
	public void method30() {
		System.out.println("AssertionError(float detailMessage)");
		throw new AssertionError(45);
	}
	public void method31() {
		System.out.println("AssertionError(int detailMessage)");
		throw new AssertionError(45);
	}
	
}
