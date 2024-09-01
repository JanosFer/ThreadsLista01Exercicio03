package controller;

public class ThreadVetorController  extends Thread{
	
	private int[] vetor;
	private int n;
	
	public ThreadVetorController(int[] vetor, int n) {
		this.vetor = vetor;
		this.n = n;
	}
	
	
	public void run() {
		temporiza();
	}
	
	private void temporiza() {
		int tamanho = vetor.length;
		double tempoInicial, tempoFinal, tempoTotal;
		
		if(n % 2 == 0) {
			tempoInicial = System.nanoTime();
			
			for(int i = 0; i < tamanho; i++) {
			}
			
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("O tempo para percorrer um vetor de " +tamanho+ " posições utilizando uma estrutura for, foi de " +tempoTotal+ "s");
		}else if(n % 2 != 0) {
			tempoInicial = System.nanoTime();
			for(@SuppressWarnings("unused") int valor : vetor) {
			}
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("O tempo para percorrer um vetor de " +tamanho+ " posições utilizando uma estrutura foreach, foi de " +tempoTotal+ "s");
		}
	}
}
