package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
		
		System.out.println("\n\n### Ordering an iPhone X");
		IPhone iphone3 = IPhoneFactory.IPHONEX.orderIPhone();
		System.out.println(iphone3);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = IPhoneFactory.IPHONEXSMAX.orderIPhone();
		System.out.println(iphone4);
	}
}