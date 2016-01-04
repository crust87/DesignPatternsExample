package com.crust87.tvremocon;

public class ConcreteRemoteControl extends RemoteControl {

	private int mChannel;
	
	public ConcreteRemoteControl() {
	}

	@Override
	public void on() {
		TV tv = getWindowImp();
		tv.on();
	}

	@Override
	public void off() {
		TV tv = getWindowImp();
		tv.off();
	}

	@Override
	public void setChannel(int channel) {
		mChannel = channel;
		TV tv = getWindowImp();
		tv.tuneChannel(mChannel);
	}
	
	public void nextChannel() {
		setChannel(mChannel + 1);
	}
	
	public void previousChannel() {
		setChannel(mChannel - 1);
	}
	
	public static void main(String[] args) {
		ConcreteRemoteControl remocon = new ConcreteRemoteControl();
		remocon.on();
		remocon.nextChannel();
		remocon.previousChannel();
		remocon.off();
	}
}
