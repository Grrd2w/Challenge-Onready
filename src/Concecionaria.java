import java.text.DecimalFormat;

public class Concecionaria extends vehiculo {
    private static DecimalFormat df2= new DecimalFormat("#.###");
    public static void main(String[] Args) {

        Concecionaria p206 = new Concecionaria(); p206.marca = "Peugeot"; p206.modelo = "206";   p206.puertas = 4;          p206.precio = 200000.00;
        Concecionaria p208 =new Concecionaria();  p208.marca="Peugeot";   p208.modelo="208";     p208.puertas= 5;           p208.precio=250000.00;
        Concecionaria hTitan =new Concecionaria();hTitan.marca="Honda";   hTitan.modelo="Titan"; hTitan.cilindrada="125cc"; hTitan.precio=60000.00;
        Concecionaria yYbr =new Concecionaria();  yYbr.marca="Yamaha";    yYbr.modelo="YBR";     yYbr.cilindrada="160cc";   yYbr.precio=80500.50;

        System.out.println("Marca: "+p206.marca+" //"+" Modelo: "+p206.modelo+" //"+" Puertas: "+p206.puertas+" //"+" Precio: $"+p206.precio+"0");
        System.out.println("Marca: "+p208.marca+" //"+" Modelo: "+p208.modelo+" //"+" Puertas: "+p208.puertas+" //"+" Precio: $"+p208.precio+"0");
        System.out.println("Marca: "+hTitan.marca+" //"+" Modelo: "+hTitan.modelo+" //"+" Cilindrada: "+hTitan.cilindrada+" //"+" Precio: $"+hTitan.precio+"0");
        System.out.println("Marca: "+yYbr.marca+" //"+" Modelo: "+yYbr.modelo+" //"+" Cilindrada: "+yYbr.cilindrada+" //"+" Precio: $"+yYbr.precio+"0");
        System.out.println("=====================================");
        System.out.println("Vehiculo mas caro: "+p208.marca+" "+p208.modelo);
        System.out.println("Vehiculo mas barato: "+hTitan.marca+" "+hTitan.modelo);
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y: "+yYbr.marca+" "+ yYbr.modelo);
        System.out.println("=====================================");
        System.out.println("vehiculos ordenados por precio de mayor a menor: ");
        System.out.println(p208.marca + " "+ p206.modelo);
        System.out.println(p206.marca + " "+ p208.modelo);
        System.out.println(yYbr.marca + " "+ yYbr.modelo);
        System.out.println(hTitan.marca + " "+ hTitan.modelo);


        }


    }