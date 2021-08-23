public class VhMoto extends Vehiculo{
    private String cilindrada;

    public VhMoto(String marca, String modelo, double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {return cilindrada;}
    public void setCilindrada(String cilindrada) {this.cilindrada = cilindrada;}
}
