package com.doctum.oo;
public class Cachorro {
    public String nome;
    public float tamanho;
    public static int quantidade;

    
    public Cachorro(String nome, float tamanho) {
       this.nome = nome;
       this.tamanho = tamanho;
       Cachorro.quantidade++; 
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Cachorro.quantidade = quantidade;
    }

    public void brincar(){
        System.out.println(this.nome + " está Brincando!");
    }
    
    public void latir(){
        System.out.println(this.nome + " está Latindo!");
    }
    
    public static int quantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + ", tamanho=" + tamanho + '}';
    }
    
    

    

    
}
