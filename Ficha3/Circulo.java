public class Circulo{
    private double raio;
    private Ponto centro;


    //Construtores
    public Circulo(){
        this.raio = 0;
        Ponto ponto = new Ponto();
        this.centro = ponto;
    }

    public Circulo(Ponto ponto, double raio){
        this.centro = ponto.clone();
        this.raio = raio;
    }

    public Circulo(Circulo obj){
        this.raio = obj.getRaio();
        this.centro = obj.getCentro();
    }

    //Getters
    public double getX(){
        return this.centro.getX();
    }

    public double getY(){
        return this.centro.getY();
    }

    public double getRaio(){
        return this.raio;
    }

    public Ponto getCentro(){
        return this.centro.clone();
    }


    //Setters
    public void setX(int x){
        this.centro.setX(x);
    }

    public void setY(int y){
        this.centro.setY(y);
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public void setCentro(Ponto p){
        this.centro = p.clone();
    }

    public void alteraCentro(int x, int y){
        this.centro.setX(x);
        this.centro.setY(y);
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Circulo circulo = (Circulo) o;

        return this.centro.equals(circulo.centro) && this.raio == circulo.getRaio();
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    //falta toString

    public double calculaArea(){
        double area = 0;

        area = Math.PI * Math.pow(this.raio, 2);
        
        return area;
    }

    public double calculaPerimetro(){
        double perimetro = 0;

        perimetro = 2 * Math.PI * this.raio;

        return perimetro;
    }
}