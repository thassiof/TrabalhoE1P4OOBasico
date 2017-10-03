package com.doctum.oo;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private float altura;
    private double peso;
    private Calendar dataNascimento;
    private Calendar hoje;

    public Pessoa(String nome, float altura, double peso, int dia, int mes, int ano) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setdataNascimento(int dia, int mes, int ano){
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }
    
    public void sethoje(Calendar hoje){
        this.hoje = hoje;
    }
    
      
}
