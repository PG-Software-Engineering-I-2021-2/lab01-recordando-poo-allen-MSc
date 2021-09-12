package cs.ing.software.lab1;

public class Vehiculo {

    double consumo;
    double capacidad;
    double cantidad;

    Vehiculo(double _consumo, double _capacidad, double _cantidad){
        consumo = _consumo;
        capacidad = _capacidad;
        cantidad = _cantidad;
    }

    String viajar(double _kms) {
        double consumoViaje = _kms * consumo;

        double cantidadRemanente = cantidad - consumoViaje;

        if(cantidadRemanente < 0) {
            return "Automóvil/Camión necesita reabastecimiento de combustible.";
        }

        cantidad = cantidadRemanente;
        return "Automóvil/Camión viajó " + _kms + " km y aún tiene " + String.format("%.2f", cantidadRemanente) + " de combustible.";
    }

    String reabastecer(double combustible) {
        double disponible = capacidad - cantidad;

        if (combustible > disponible) {
            return "Automóvil/Camión no se puede reabastecer el tanque, esta lleno.";
        }

        cantidad = cantidad + combustible;

        return "La cantidad de combustible del Automóvil/Camión es: " + String.format("%.2f", cantidad);
    }
}
