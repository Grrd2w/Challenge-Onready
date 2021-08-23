import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.*;

public class Concecionaria {

    public static void main (String[]Args){
            List<Object> vehiculos = new ArrayList<>();
            vehiculos.add(new VhAuto("Peugeot", "206", 200000.000, 4));
            vehiculos.add(new VhAuto("Peugeot", "208", 250000.000, 5));
            vehiculos.add(new VhMoto("Honda", "Titan", 60000.00, 125));
            vehiculos.add(new VhMoto("Yamaha", "YBR", 80500.000, 160));
            
for(int i=0; i< vehiculos.size();i++){
    System.out.println(vehiculos.get(i));
}

        }
    }







    /*
        System.out.println("Marca: "+ +" //"+" Modelo: "+p206.getModelo()+" //"+" Puertas: "+p206.getPuertas()+" //"+" Precio: $"+p206.getPrecio()+"0");
        System.out.println("Marca: "+p208.getMarca()+" //"+" Modelo: "+p208.getModelo()+" //"+" Puertas: "+p208.getPuertas()+" //"+" Precio: $"+p208.getPrecio()+"0");
        System.out.println("Marca: "+hTitan.getMarca()+" //"+" Modelo: "+hTitan.getModelo()+" //"+" Cilindrada: "+hTitan.getCilindrada()+"cc"+" //"+" Precio: $"+hTitan.getPrecio()+"0");
        System.out.println("Marca: "+yYbr.getMarca()+" //"+" Modelo: "+yYbr.getModelo()+" //"+" Cilindrada: "+yYbr.getCilindrada()+"cc"+" //"+" Precio: $"+yYbr.getPrecio()+"0");
        System.out.println("=====================================");
        System.out.println("Vehiculo mas caro: "+p208.getModelo()+" "+p208.getModelo());
        System.out.println("Vehiculo mas barato: "+hTitan.getMarca()+" "+hTitan.getModelo());
        System.out.println("Vehiculo que contiene en el modelo la letra 'Y: "+yYbr.getMarca()+" "+ yYbr.getModelo());
        System.out.println("=====================================");
        System.out.println("vehiculos ordenados por precio de mayor a menor: ");
        System.out.println(p208.getMarca() + " "+ p206.getModelo());
        System.out.println(p206.getMarca() + " "+ p208.getModelo());
        System.out.println(yYbr.getMarca() + " "+ yYbr.getModelo());
        System.out.println(hTitan.getMarca() + " "+ hTitan.getModelo());
  */
