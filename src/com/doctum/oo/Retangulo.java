package com.doctum.oo;
public class Retangulo {
    public float base;
    public float altura;
    

   public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float perimetro(){
      return ((2 * base) + (2 * altura)); 
    }
    
    public float area(){
        return (base * altura);
    }
    
    public boolean eretangulo(){
        return this.altura == this.base;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "base = " + base + ", altura = " + altura + '}';
    }
   
    
    
}