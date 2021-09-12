package cs.ing.software.lab1;

public class Camion extends Vehiculo{

    Camion(double _consumo, double _capacidad, double _cantidad){
        super(_consumo,_capacidad,_cantidad);
    }

    @Override
    String reabastecer(double combustible) {
        double disponible = capacidad - cantidad;

        if (combustible > disponible) {
            return "Camión no se puede reabastecer el tanque, está lleno.";
        }

        cantidad = cantidad + (combustible * 0.95);

        return "La cantidad de combustible del Camión es: " + String.format("%.2f", cantidad);
    }
}
