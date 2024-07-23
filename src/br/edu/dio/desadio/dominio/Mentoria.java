package br.edu.dio.desadio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		// TODO Auto-generated constructor stub
		super(titulo, descricao);
		this.data = data;
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
	}


	



	
	
	
	

}
