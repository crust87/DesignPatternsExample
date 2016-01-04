package com.crust87.tvremocon;

public abstract class RemoteControl {

	private TV mImplementor;
	
	protected TV getWindowImp() {
		if(mImplementor == null) {
			mImplementor = new SamsungTV();
		}
		
		return mImplementor;
	}
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void on();
	public abstract void off();
	public abstract void setChannel(int channel);

}
