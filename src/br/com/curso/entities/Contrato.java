package br.com.curso.entities;

import java.util.Date;

public class Contrato {

	private Date data;
	private double valorHora;
	private int hora;
	
	public Contrato() {
	}

	public Contrato(Date data, double valorHora, int hora) {
		this.data = data;
		this.valorHora = valorHora;
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double ValorTotal() {
		return valorHora * hora;
	}

}
