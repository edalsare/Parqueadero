/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;

/**
 *
 * @author Edison Salazar
 */
public class Vehiculo extends Clientes {
    String Tipo;
    String Color;
    String Placa;
    String Marca;
    Factura facnueva;
    
    public Vehiculo(String nombres, String apellidos, Long cedula, 
           Long telefono, String direccion,String tipo, String color, 
           String placa, String marca){
        super(nombres, apellidos, cedula, telefono, direccion);
    this.Color = color;
    this.Marca = marca;
    this.Placa = placa;
    this.Tipo = tipo;
    facnueva = null;
    
    }
    
}
