package com.crust87.computer;

public class Computer {

	public static void main(String[] args) {
		Cabinet cabinet = new Cabinet("PC Cabinet");
		Chassis chassis = new Chassis("PC Chassis");
		
		cabinet.add(chassis);
		
		Bus bus = new Bus("MCA Bus");
		bus.add(new Card("16Mbs Token Ring"));
		chassis.add(bus);
		chassis.add(new FloppyDisk("3.5bin Floppy"));
		
		System.out.println("The net price is " + chassis.netPrice());
	}

}
