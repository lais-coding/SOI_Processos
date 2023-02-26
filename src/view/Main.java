package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
	
		
		RedesController redes = new RedesController();
		
		String os = redes.os();
		System.out.println("SISTEMA OPERACIONAL -> " +os);

	}

}
