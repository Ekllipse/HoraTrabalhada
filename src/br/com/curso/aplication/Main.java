package br.com.curso.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.curso.entities.Contrato;
import br.com.curso.entities.Departamento;
import br.com.curso.entities.Trabalhador;
import br.com.curso.entities.enums.Qualificacao;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Trabalhador trab ;
		
		System.out.println("Digite o nome do Departamento");
		
		String dep = sc.next();
		
		
		System.out.println("Digite os dados do trabalhador(nome, level e Piso Salarial):");
		
		String nome = sc.next();
		String level = sc.next();
		double piso = sc.nextDouble();
		
		
		trab = new Trabalhador(nome,Qualificacao.valueOf(level), piso, new Departamento(dep));
		
		System.out.println("Quantos contratos esse trabalhador Terá?");
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++){
			System.out.println("Digite os dados do contrato #"+i+1);
			System.out.println("Data(DD/MM/AAAA):");
			Date data = sdf.parse(sc.next());
			System.out.println("Valor hora:");
			double valorHora = sc.nextDouble();
			System.out.println("Quantidade Horas:");
			int duracao = sc.nextInt();
			trab.AddContrato(new Contrato(data, valorHora, duracao));
			
		}
		
		System.out.println("Digite o mes e o ano para calcular o Valor total(MM/YYYY)");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println(mes);
		System.out.println(ano);
		
		System.out.println("Name: " + trab.getNome());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.println("Valor total para " + mesAno+ ": " + trab.ValorTotal(ano,mes));
		
		
		
		
		
		sc.close();
		
		

	}

}
