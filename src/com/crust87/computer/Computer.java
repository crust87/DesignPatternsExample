package com.crust87.computer;

import com.crust87.computer.core.CompositeEquipment;
import com.crust87.computer.parts.CPU;
import com.crust87.computer.parts.Cabinet;
import com.crust87.computer.parts.GraphicCard;
import com.crust87.computer.parts.MainBoard;
import com.crust87.computer.parts.Memory;
import com.crust87.computer.parts.PowerSupply;

public class Computer extends CompositeEquipment {

	protected Computer(String name) {
		super(name);
	}
	
	@Override
	public int getPower() {
		return 0;
	}

	public static void main(String[] args) {
		Computer computer = new Computer("Computer");
		
		Cabinet cabinet = new Cabinet("Cabinet");
		
		MainBoard mainBoard = new MainBoard("MainBoard");
		PowerSupply powerSupply = new PowerSupply("Power Supply");
		
		CPU cpu = new CPU("CPU");
		GraphicCard graphicCard = new GraphicCard("Graphic Card");
		Memory memory1 = new Memory("Memory1");
		Memory memory2 = new Memory("Memory2");
		
		mainBoard.add(cpu);
		mainBoard.add(graphicCard);
		mainBoard.add(memory1);
		mainBoard.add(memory2);
		
		cabinet.add(mainBoard);
		cabinet.add(powerSupply);
		
		computer.add(cabinet);
		
		computer.on();
	}
	
	public boolean on() {
		int power = calcPower();
		
		if(power > 0) {
			System.out.println("Computer ON!");
			return true;
		} else {
			System.out.println("Computer needs more power");
			return false;
		}
	}
}
