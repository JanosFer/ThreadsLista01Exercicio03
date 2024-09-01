package view;

import controller.ThreadVetorController;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1; 
		}
		
		ThreadVetorController foreach = new ThreadVetorController(vetor, 1);
		ThreadVetorController fori = new ThreadVetorController(vetor, 2);
			
		foreach.start();
		fori.start();
	}
}
