package controller;

public class RedesController {

	public RedesController() {
		super();
	}
	
	//1 - SISTEMA OPERACIONAL 
	//NOTA: Verificar a validação com operação contains e privatizar
	
	public String os() {
		
		String os = System.getProperty("os.name");
		
		return os;
	}
	
	//2 - IP
	
	public void IP (String processo) {
		
		String os = System.getProperty("os.name");
		
		if (os == "Windows 10") {
			Runtime.getRuntime().exec(processo);
		}
		
		
	}
}

