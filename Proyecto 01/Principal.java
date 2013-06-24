import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Circulo c = new Circulo(4);
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Diametro: " + c.getDiametro());
        System.out.println("Area: " + c.getArea());
    }
}