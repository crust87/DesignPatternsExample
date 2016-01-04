package com.crust87.tvremocon;

public class SonyTV extends TV {

	private int mChannel;
	
	public SonyTV() {
		System.out.println("Init Sony TV");
	}

	@Override
	public void on() {
		System.out.println("Sony TV On!");
	}

	@Override
	public void off() {
		System.out.println("Sony TV Off!");
	}

	@Override
	public void tuneChannel(int channel) {
		mChannel = channel;
		
		System.out.println("Sony TV tune channel to " + mChannel);
	}

}
