package Modelagem;

public class Peca {
	private int codigo;
	private String nome;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	
	public String toString() {
		return this.nome;
	}
	
	public Peca (int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	

}
