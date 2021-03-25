package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhone11;
import br.com.cod3r.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;

public enum IPhoneFactory {
	
	IPHONE11 {
		@Override
		public IPhone orderIPhone() {
			IPhone11 device = new IPhone11();
			buildDevice(device);
			return device;
		}
	},
	IPHONE11PRO {
		@Override
		public IPhone orderIPhone() {
			IPhone11Pro device = new IPhone11Pro();
			buildDevice(device);
			return device;
		}
	},
	IPHONEX {
		@Override
		public IPhone orderIPhone() {
			IPhoneX device = new IPhoneX();
			buildDevice(device);
			return device;
		}
	},
	IPHONEXSMAX {
		@Override
		public IPhone orderIPhone() {
			IPhoneXSMax device = new IPhoneXSMax();
			buildDevice(device);
			return device;
		}
	};
	
	public abstract IPhone orderIPhone();
	
	public static void buildDevice(IPhone device) {
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
	}

}
