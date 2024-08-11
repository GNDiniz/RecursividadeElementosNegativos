package controller;

public class ElementosNegativosController {

	public ElementosNegativosController() {
		super();
	}

	public int contVetor(int [] vetor, int tamanho) {
		//Condição de parada ==> Quando o vetor não tiver mais posições
		int qtd = 0;
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho -1;
			if (vetor[ultimaPosicao] < 0) {
				qtd++;
			}
			tamanho = tamanho -1;
			return qtd + contVetor(vetor, tamanho);
			//Função deve contar a quantidade de números inteiros negativos, com base na chamada da função com um vetor de tamanho reduzido em 1 posição.
		}
	}
}
