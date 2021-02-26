package br.com.curso.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.curso.entities.enums.Qualificacao;

public class Trabalhador {
	private String nome;
	private Qualificacao level;
	private double pisoSalarial;

	private Departamento departamento;
	private List<Contrato> listaContrato = new ArrayList<>();

	

	public Trabalhador(String nome, Qualificacao level, double pisoSalarial, Departamento departamento) {
		super();
		this.nome = nome;
		this.level = level;
		this.pisoSalarial = pisoSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Qualificacao getLevel() {
		return level;
	}

	public void setLevel(Qualificacao level) {
		this.level = level;
	}

	public double getPisoSalarial() {
		return pisoSalarial;
	}

	public void setPisoSalarial(double pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void AddContrato(Contrato contrato) {
		listaContrato.add(contrato);
	}
	
	public double ValorTotal(int year, int month ) {
		double soma = this.pisoSalarial;
		Calendar cal = Calendar.getInstance();	
		for(Contrato c : listaContrato) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+ cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month){
				soma += c.ValorTotal();			
				
			}

		}
		return soma;
		
	}

}
