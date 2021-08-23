public class VhAuto extends Vehiculo{
    private int puertas;

    @Override
    public String toString() {
        return "Marca: "+getMarca()+" // "+"Modelo: "+getModelo()+" // "+"Precio: "+getPrecio() + " // "+"Puertas: "+getPuertas();
    }

    public VhAuto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {return puertas;}
    public void setPuertas(int puertas) {this.puertas = puertas;}
}
