public class VhMoto extends Vehiculo{
    private int cilindrada;

    public VhMoto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {return cilindrada;}
    public void setCilindrada(int cilindrada) {this.cilindrada = cilindrada;}
}
