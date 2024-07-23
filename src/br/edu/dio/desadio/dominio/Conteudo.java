package br.edu.dio.desadio.dominio;

public abstract class Conteudo {
	
	protected  static final int XP_PADRAO = 10;
	
	private String titulo;
	private String descricao;
	
	public Conteudo(String titulo, String descricao) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}



	public String getDescricao() {
		return descricao;
	}


	public abstract double calcularXp();

}
