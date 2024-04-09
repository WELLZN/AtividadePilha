package Controle;

import Modelagem.Peca;

public class Montador {
	private int tamanhoPilha = 9;
	private Peca[] computador;
	private int ponteiro;
	
	public Montador() {
		
		this.computador = new Peca[tamanhoPilha];
		this.ponteiro =0;
	}

	public Peca[] getComputador() {
		return computador;
	}

	public void setComputador(Peca[] computador) {
		this.computador = computador;
	}
	public void empilhar(Peca peca) {
		System.out.println("Empilhando:"+peca.getNome()+":");
		
		movimentarPilha();
		computador[0]= peca;
		ponteiro++;
		printComputador();		
		
	}
	 public void desempilhar(Peca peca) {
	        if (ponteiro > 0) {
	            System.out.println("Desempilhando: " + computador[0].getNome() + ":");
	            for (int i = 0; i < ponteiro - 1; i++) {
	                computador[i] = computador[i + 1];
	            }
	            computador[ponteiro - 1] = null;
	            ponteiro--;
	            printComputador();
	        } else {
	            System.out.println("Não há peças para desempilhar.");
	        }
	    }

	
	public void movimentarPilha() {
		for(int i = 0; i < ponteiro;i++) {
			if(ponteiro-i<computador.length) {
				computador[ponteiro-i]=computador[ponteiro-i-1];
			}
		}
		computador[0]=null;
	}
	
	public void printComputador() {
		String retorno = "";
		for(int i =0;i <computador.length;i++) {
				
			retorno += String.format("\t\t[%s] => %s",i,computador[i] != null? computador[i].getNome() : " ");
		}
		System.out.println(retorno);
	}
}