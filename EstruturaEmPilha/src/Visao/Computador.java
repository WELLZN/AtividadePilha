package View;

import javax.swing.JOptionPane;

import Controle.Montador;
import Modelagem.Peca;

public class Computador {

	public static void main(String[] args) {
		Montador m = new Montador();
		String nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca = new Peca(0, nomePeca); 
		m.empilhar(peca);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca1 = new Peca(1, nomePeca); 
		m.empilhar(peca1);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca2 = new Peca(2, nomePeca); 
		m.empilhar(peca2);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca3 = new Peca(3, nomePeca); 
		m.empilhar(peca3);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca4 = new Peca(4, nomePeca); 
		m.empilhar(peca4);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca5 = new Peca(5, nomePeca); 
		m.empilhar(peca5);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca6 = new Peca(6, nomePeca); 
		m.empilhar(peca6);
		nomePeca = JOptionPane.showInputDialog("Digite o nome da peça a ser empilhada:");
		Peca peca7 = new Peca(7, nomePeca); 
		m.empilhar(peca7);
		
		System.out.println("-----------DESEMPLINHANDO----------");
		m.desempilhar(peca7);
		m.desempilhar(peca6);
		m.desempilhar(peca5);
		m.desempilhar(peca4);
		m.desempilhar(peca3);
		m.desempilhar(peca2);
		m.desempilhar(peca1);
		m.desempilhar(peca);
}
}