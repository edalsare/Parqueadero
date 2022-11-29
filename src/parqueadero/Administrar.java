/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

/**
 *
 * @author Edison Salazar
 */
public class Administrar {

    HashMap<String, Vehiculo> vehiculos = new HashMap<String, Vehiculo>();

    public String IngresarCliente(String nombres, String apellidos, Long cedula,
            Long telefono, String direccion, String tipo, String color,
            String placa, String marca, String contrato) {
        Vehiculo nuevo = new Vehiculo(nombres, apellidos, cedula, telefono, direccion, tipo, color, placa, marca);

        LocalDateTime fechaIngreso = LocalDateTime.now();
        
        Factura NueFac = new Factura(fechaIngreso, contrato);

        nuevo.facnueva = NueFac;

        vehiculos.put(placa, nuevo);

        return "Cliente Ingresado correctamente";

    }

    public Vehiculo clienteExiste(String placa) {
        Vehiculo vehiculoRegistrado;
        vehiculoRegistrado = vehiculos.get(placa);
        if (vehiculoRegistrado.facnueva.FechaIngreso == null) {
            vehiculoRegistrado.facnueva.FechaIngreso = LocalDateTime.now();
            return null;
            
        } else {
            this.calcularTarifa(vehiculoRegistrado);
            return vehiculoRegistrado;
        }

        
    }

    public void calcularTarifa(Vehiculo veiTarifa) {
        long valor;
        //Calcula el tiempo transcurrido desde el ingreso
        long tiempo = ChronoUnit.HOURS.between(veiTarifa.facnueva.FechaIngreso, LocalDateTime.now());

        if ("Moto".equals(veiTarifa.Tipo) && "Dia".equals(veiTarifa.facnueva.TipoIngreso)) {
            if (tiempo <= 24) {
                veiTarifa.facnueva.Valor = 3000.0;
            } else {
               veiTarifa.facnueva.Valor = ((tiempo - 24) * 1000.0) + 3000.0;
            }
            
        } else if ("Carro".equals(veiTarifa.Tipo) && "Dia".equals(veiTarifa.facnueva.TipoIngreso)) {
            if (tiempo <= 24) {
                veiTarifa.facnueva.Valor = 5000.0;
            } else {
                veiTarifa.facnueva.Valor = ((tiempo - 24) * 1500.0) + 5000.0;
            }
        } else if ("Moto".equals(veiTarifa.Tipo)) {
            long tiempoMes = ChronoUnit.DAYS.between(veiTarifa.facnueva.FechaIngreso, LocalDateTime.now());
            if (tiempoMes > 30) {
                System.out.println("Supera el mes" + tiempoMes);
                System.out.println(veiTarifa.Tipo);
            }
            veiTarifa.facnueva.Valor = 40000.0;
        }else if ("Carro".equals(veiTarifa.Tipo)) {
            long tiempoMes = ChronoUnit.DAYS.between(veiTarifa.facnueva.FechaIngreso, LocalDateTime.now());
            if (tiempoMes > 30) {
                System.out.println("Supera el mes" + tiempoMes);
                System.out.println(veiTarifa.Tipo);
            }
            veiTarifa.facnueva.Valor = 60000.0;
        }
    }

    public Vehiculo Buscar(String placa) {
        Vehiculo NuevoVehiculo;
        if (vehiculos.containsKey(placa) == false) {//devuelve False si la placa aun no esta registrada
            return null;
        } else {
            NuevoVehiculo = vehiculos.get(placa);
           return NuevoVehiculo;         
        }
        
    }

}
