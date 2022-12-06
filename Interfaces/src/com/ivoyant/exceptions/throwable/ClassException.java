package com.ivoyant.exceptions.throwable;

import java.awt.AWTException;
import java.awt.FontFormatException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.LambdaConversionException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.MarshalException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.ietf.jgss.GSSException;

public class ClassException {

	public void method1() throws Exception {
		System.out.println("Exception()");
		throw new Exception();
	}
	public void method2() throws Exception {
		System.out.println("Exception(String message)");
		throw new Exception(" ");
	}
	public void method3() throws ActivationException {
		System.out.println("AclNotFoundException");
		throw new ActivationException();
	}
	public void method4() throws Throwable {
		System.out.println("AlreadyBoundException()");
		throw new AlreadyBoundException();
	}
	public void method5() throws Throwable {
		System.out.println("InvalidApplicationException(null)");
		throw new InvalidApplicationException(null);
	}
	public void method6() throws Throwable {
		System.out.println("AWTException(null)");
		throw new AWTException(null);
	}
	public void method7() throws Throwable {
		System.out.println("MidiUnavailableException");
		throw new MidiUnavailableException();
	}

	public void method8() throws Throwable {
		System.out.println("BadAttributeValueExpException(null)");
		throw new BadAttributeValueExpException(null);
	}

	public void method9() throws Throwable {
		System.out.println("BadBinaryOpValueExpException(null)");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method10() throws Throwable {
		System.out.println("BadLocationException(null, 0);");
		throw new BadLocationException(null, 0);
	}

	public void method11() throws Throwable {
		System.out.println("BadStringOperationException(null)");
		throw new BadStringOperationException(null);
	}

	public void method12() throws Throwable {
		System.out.println("BrokenBarrierException");
		throw new BrokenBarrierException();
	}

	public void method13() throws Throwable {
		System.out.println("CertificateException");
		throw new CertificateException();
	}

	public void method14() throws Throwable {
		System.out.println("CloneNotSupportedException");
		throw new CloneNotSupportedException();
	}

	public void method15() throws Throwable {
		System.out.println("DataFormatException");
		throw new DataFormatException();
	}

	public void method16() throws Throwable {
		System.out.println("DatatypeConfigurationException");
		throw new DatatypeConfigurationException();
	}

	public void method17() throws Throwable {
		System.out.println("DestroyFailedException");
		throw new DestroyFailedException();
	}

	public void method18() throws Throwable {
		System.out.println("ExecutionException");
		throw new ExecutionException(null);
	}

	public void method19() throws Throwable {
		System.out.println("ExpandVetoException");
		throw new ExpandVetoException(null);
	}

	public void method20() throws Throwable {
		System.out.println("FontFormatException");
		throw new FontFormatException(null);
	}

	public void method21() throws Throwable {
		System.out.println("GeneralSecurityException");
		throw new GeneralSecurityException();
	}

	public void method22() throws Throwable {
		System.out.println(" GSSException");
		throw new GSSException(0);
	}

	public void method23() throws Throwable {
		System.out.println(" IllegalClassFormatException");
		throw new IllegalClassFormatException();
	}

	public void method24() throws Throwable {
		System.out.println("InterruptedException");
		throw new InterruptedException();
	}

	public void method25() throws Throwable {
		System.out.println(" IntrospectionException");
		throw new IntrospectionException();
	}

	public void method26() throws Throwable {
		System.out.println("InvalidApplicationException");
		throw new InvalidApplicationException(getClass());
	}

	public void method27() throws Throwable {
		System.out.println("InvalidMidiDataException");
		throw new InvalidMidiDataException();
	}

	public void method28() throws Throwable {
		System.out.println("InvalidPreferencesFormatException");
		throw new InvalidPreferencesFormatException(" ");
	}

	public void method29() throws Throwable {
		System.out.println("InvalidTargetObjectTypeException");
		throw new InvalidTargetObjectTypeException();
	}

	public void method30() throws Throwable {
		System.out.println(" IOException");
		throw new IOException();
	}

	public void method31() throws Throwable {
		System.out.println("JMException");
		throw new JMException();
	}

	public void method32() throws Throwable {
		System.out.println("KeySelectorException");
		throw new KeySelectorException();
	}

	public void method33() throws Throwable {
		System.out.println(" LambdaConversionException");
		throw new LambdaConversionException();
	}

	public void method34() throws Throwable {
		System.out.println("LineUnavailableException");
		throw new LineUnavailableException();
	}

	public void method35() throws Throwable {
		System.out.println(" MarshalException");
		throw new MarshalException();
	}

}
