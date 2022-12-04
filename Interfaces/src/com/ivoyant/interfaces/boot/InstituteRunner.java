package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.Xworkz;
import com.ivoyant.interfaces.rules.institute.DevelopmentInstitute;
import com.ivoyant.interfaces.rules.institute.Institute;
import com.ivoyant.interfaces.rules.institute.TestingInstitute;
import com.ivoyant.interfaces.rules.institute.XworkzRajajinagar;

public class InstituteRunner {

	public static void main(String[] args) throws InterruptedException {
		
		Object obj = new Xworkz();
		System.out.println(obj.equals(obj));
		obj.getClass();
		obj.hashCode();
		obj.notify();
		obj.notifyAll();
		obj.toString();
		obj.wait();
		obj.wait(0);
		obj.wait(0, 0);
		
		Xworkz xworkz=new Xworkz();
		xworkz.placement();
		xworkz.training();
		xworkz.interview();
		xworkz.equals(obj);
		xworkz.getClass();
		xworkz.hashCode();
		xworkz.notify();
		xworkz.notifyAll();
		xworkz.toString();
		xworkz.wait();
		xworkz.wait(0);
		xworkz.wait(0, 0);
		
		Institute institute=new Xworkz();
		institute.placement();
		institute.training();
		institute.equals(obj);
		institute.getClass();
		institute.hashCode();
		institute.notify();
		institute.notifyAll();
		institute.toString();
		institute.wait();
		institute.wait(0);
		institute.wait(0, 0);
		
		DevelopmentInstitute development=new Xworkz();
		development.interview();
		development.placement();
		development.training();
		
		TestingInstitute testing = new Xworkz();
		testing.interview();
		testing.placement();
		testing.training();
		
		XworkzRajajinagar xworkz1 = new XworkzRajajinagar() {
			
			@Override
			public boolean placement() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean interview() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public double training() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		xworkz1.interview();
		xworkz1.placement();
		xworkz1.training();
		
	}

}
