package br.edu.dio.desadio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso Java", "Curso Java", 30);
		Curso curso2 = new Curso("Curso JS", "Curso JS", 20);
		
		Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp JAVA Developer");
		bootcamp.setDescricao("Descrição bootcamp java developer ");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devJhonatan = new Dev();
		devJhonatan.setNome("Jhonatan");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		
		devJhonatan.inscreverBootcamp(bootcamp);
		devCamila.inscreverBootcamp(bootcamp);
		
		devJhonatan.progredir();
		System.out.println("Contéudo Inscritos " + devJhonatan.getNome() + devJhonatan.getConteudoInscritos());
		System.out.println("Contéudo Concluídos " + devJhonatan.getNome() + devJhonatan.getConteudoConcluido());
		System.out.println("---------------------------");
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Contéudo Inscritos " + devCamila.getNome() + devCamila.getConteudoInscritos());
		System.out.println("Contéudo Concluído " + devCamila.getNome() + devCamila.getConteudoConcluido());
		
		System.out.println(devJhonatan.calcularTotalXp());
		System.out.println(devCamila.calcularTotalXp());
		

		
		
	}
	
}
