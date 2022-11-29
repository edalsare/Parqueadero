/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;
import java.time.*;
/**
 *
 * @author Ryzen 5
 */
public class Factura {
    LocalDateTime FechaIngreso;
    String TipoIngreso;
    Double Valor;
    
    public Factura(LocalDateTime fechaingreso, String tipoingreso){
        this.FechaIngreso = fechaingreso;
        this.TipoIngreso = tipoingreso;
        
    }
    
}
