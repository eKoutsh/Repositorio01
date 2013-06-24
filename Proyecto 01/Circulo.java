public class Circulo{
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double getDiametro(){
        return 2*radio;
    }
    
    public double getArea(){
        return -1;
    }
    
    public double getPerimetro(){
        return -1;
    }
}