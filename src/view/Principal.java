package view;

import controller.ElementosNegativosController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {2, -3, -7, 8, 9, 10, -2, 13, -5};
		 int tamanho = vetor.length;
		 
		 ElementosNegativosController enc = new ElementosNegativosController();
		 int contElementos = enc.contVetor(vetor, tamanho);
		 System.out.println("A quantidade de elementos negativos no vetor é igual a: "+contElementos);

	}

}
