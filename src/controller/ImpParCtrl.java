package controller;

public class ImpParCtrl {
	public ImpParCtrl(){
		super();
	}
	
	public static void Contagem (int[] vetor) {
		
		
		for (int numero : vetor) {
			if(numero==0){
				break;
			}
			else if (numero % 2 != 0) {
                System.out.println(numero + " é ímpar");
            } else if (numero % 10 == 0) {
                System.out.println(numero + " é par e múltiplo de 10");
            }
        }
	}

}
