package fizika9;

import java.util.Scanner;

public class topce {

	public static void main(String[] args) {
	System.out.println("Vnesete masa na bakarnoto topce");
	double masa = 64; // masa vo gramovi
	System.out.println("Vnesete volumen na bakarnoto topce");
	double volumen = 10; // volumen vo cm ^3
	System.out.println("Vnesete gustina na bakarnoto topce");
	double gustina = 8.9; // gustina vo g/cm^3
	  //Presmetka na gustinata na topceto
	double calculatedGustina = masa / volumen;
	  //Proverka dali gustinata na topceto se sovpaga so gustinata na bakarot
	if (calculatedGustina == gustina) {
		System.out.println("Vo bakarnoto topce nema suplina. ");
	}else{
		System.out.println("Vo bakarnoto topce ima suplina. ");
		
	}

	}

}
