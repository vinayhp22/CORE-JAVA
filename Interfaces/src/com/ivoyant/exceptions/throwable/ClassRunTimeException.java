package com.ivoyant.exceptions.throwable;

import java.awt.color.CMMException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.time.DateTimeException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletionException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.JMRuntimeException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.NoSuchMechanismException;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class ClassRunTimeException {

	public void method1() {
		System.out.println("RuntimeException()");
		throw new RuntimeException();
	}
	public void method2() {
		System.out.println("ArithmeticException");
		throw new ArithmeticException(" ");
	}
	public void method3() {
		System.out.println(" ArrayStoreException");
		throw new  ArrayStoreException();
	}
	public void method4() {
		System.out.println("BufferOverflowException()");
		throw new BufferOverflowException();
	}

	public void method5()   {
		System.out.println(" CannotRedoException");
		throw new  CannotRedoException();
	}
	public void method6()  {
		System.out.println(" CannotUndoException");
		throw new  CannotUndoException();
	}
	public void method7()  {
		System.out.println("ClassCastException");
		throw new ClassCastException();
	}

	public void method8()  {
		System.out.println("CMMException(String)");
		throw new CMMException(null);
	}

	public void method9()  {
		System.out.println("CompletionException(null)");
		throw new CompletionException(null);
	}

	public void method10()  {
		System.out.println("ConcurrentModificationException");
		throw new ConcurrentModificationException();
	}

	public void method11()  {
		System.out.println("DateTimeException(null)");
		throw new DateTimeException(null);
	}

	public void method12()  {
		System.out.println("DOMException");
		throw new DOMException((short) 4, null);
	}

	public void method13()  {
		System.out.println("EmptyStackException");
		throw new EmptyStackException();
	}

	public void method14()  {
		System.out.println("EnumConstantNotPresentException");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void method15()  {
		System.out.println("EventException");
		throw new EventException((short) 1, null);
	}

	public void method16()  {
		System.out.println("FileSystemAlreadyExistsException");
		throw new FileSystemAlreadyExistsException();
	}

	public void method17()  {
		System.out.println("FileSystemNotFoundException");
		throw new FileSystemNotFoundException();
	}

	public void method18()  {
		System.out.println(" IllegalArgumentException");
		throw new  IllegalArgumentException();
	}

	public void method19()  {
		System.out.println("IllegalMonitorStateException");
		throw new IllegalMonitorStateException(null);
	}

	public void method20()  {
		System.out.println("IllegalPathStateException");
		throw new IllegalPathStateException();
	}

	public void method21()  {
		System.out.println("IllegalStateException");
		throw new IllegalStateException();
	}

	public void method22()  {
		System.out.println(" IllformedLocaleException");
		throw new IllformedLocaleException();
	}

	public void method23()  {
		System.out.println(" ImagingOpException");
		throw new ImagingOpException(null);
	}

	public void method24()  {
		System.out.println(" IncompleteAnnotationException");
		throw new  IncompleteAnnotationException(null, null);
	}

	public void method25()  {
		System.out.println(" IndexOutOfBoundsException");
		throw new IndexOutOfBoundsException();
	}

	public void method26()  {
		System.out.println(" JMRuntimeException");
		throw new  JMRuntimeException();
	}

	public void method27()  {
		System.out.println("LSException");
		throw new LSException((short) 1, null);
	}

	public void method28()  {
		System.out.println("MalformedParameterizedTypeException");
		throw new MalformedParameterizedTypeException();
	}

	public void method29()  {
		System.out.println("MalformedParametersException");
		throw new MalformedParametersException();
	}

	public void method30()  {
		System.out.println(" MirroredTypesException");
		throw new MirroredTypesException(null);
	}

	public void method31()  {
		System.out.println(" MissingResourceException");
		throw new  MissingResourceException(null,null,null);
	}

	public void method32()  {
		System.out.println("NegativeArraySizeException");
		throw new NegativeArraySizeException();
	}

	public void method33()  {
		System.out.println(" NoSuchElementException");
		throw new NoSuchElementException();
	}

	public void method34()  {
		System.out.println("NoSuchMechanismException");
		throw new NoSuchMechanismException();
	}

	public void method35()  {
		System.out.println(" NullPointerException");
		throw new NullPointerException();
	}
}
