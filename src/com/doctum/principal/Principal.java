package com.doctum.principal;

    import com.doctum.oo.Cachorro;
    import com.doctum.oo.Retangulo;
    import com.doctum.oo.Pessoa;
    import com.doctum.oo.Compra;

    public class Principal {
    public static void main(String[] args) {
       System.out.println("~~~~~ CACHORRO ~~~~~~"); 
       Cachorro c1 = new Cachorro("Rex", 1.5f);
       System.out.println(c1.toString());
       c1.brincar();
       c1.latir();
       System.out.println("Quantidade de cachorro: " + Cachorro.quantidade);
       
       System.out.println("\n~~~~~ RETANGULO ~~~~~~");
       Retangulo r1 = new Retangulo(3.56f, 3.56f);
       System.out.println(r1.toString());
       r1.perimetro();
       r1.area();
       System.out.println("É um retangulo: " + r1.eretangulo());
      
       /*System.out.println("\n~~~~~ PESSOA ~~~~~~");
       Pessoa p1 = new Pessoa("Josiane", 1.64f, 62.200f, 07, 02, 1998);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println(p1.toString());*/
       
       
       System.out.println("\n~~~~~ COMPRA ~~~~~~");
       Compra co1 = new Compra(1567.65f, 3);
        System.out.println(co1.toString());
        System.out.println("Valor de cada parcela: " + co1.valorParcela());
       
    }
    
}
