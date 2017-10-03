package com.doctum.oo;

public class Compra {
    public float valotTotal;
    public int numeroParcela;

    public Compra(float valotTotal, int numeroparcela) {
        this.valotTotal = valotTotal;
        this.numeroParcela = numeroparcela;
    }

    public float getValotTotal() {
        return valotTotal;
    }

    public void setValotTotal(float valotTotal) {
        this.valotTotal = valotTotal;
    }

    public float getNumeroparcela() {
        return this.numeroParcela;
    }

    public void setNumeroparcela(int numeroparcela) {
        this.numeroParcela = numeroParcela;
    }
    
    public float valorParcela(){
        return valotTotal / numeroParcela ;
    }

    @Override
    public String toString() {
        return "Compra{" + "valotTotal = " + valotTotal + ", numeroParcela = " + numeroParcela + '}';
    }
    
    
}
