package com.crust87.tvremocon;

public class SamsungTV extends TV {

	private int mChannel;
	
	public SamsungTV() {
		System.out.println("Init Samsung TV");
	}

	@Override
	public void on() {
		System.out.println("Samsung TV On!");
	}

	@Override
	public void off() {
		System.out.println("Samsung TV Off!");
	}

	@Override
	public void tuneChannel(int channel) {
		mChannel = channel;
		
		System.out.println("Samsung TV tune channel to " + mChannel);
	}

}
