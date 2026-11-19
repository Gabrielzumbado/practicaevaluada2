/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_3;

import java.util.Random;



/**
 *
 * @author gabrielzumbadoortiz
 */
public class Inventario {
    //atributos//
    private int ids;
    private String nombre;
    private int idp;
    private String producto;
    private String empleado;
    private double cedula;
    private double precio;     
    private int cantidad; 
    private String clasificacion; //Alimentos, Bebidas, Higiene, Limpieza
//constructior para los ID//
    public Inventario() {
        Random aleatorio = new Random();
        this.ids = aleatorio.nextInt(1, 100);
        this.idp = aleatorio.nextInt(1, 1000);
        
    }
// constructo para los atributos//

    public Inventario(int ids, String nombre, int idp, String producto, String empleado, double cedula, double precio, int cantidad, String clasificacion) {
        Random aleatorio = new Random();
        this.ids = aleatorio.nextInt(1, 100);
        this.idp = aleatorio.nextInt(1, 1000);
        this.nombre = nombre;
        this.producto = producto;
        this.empleado = empleado;
        this.cedula = cedula;
        this.precio = precio;
        this.cantidad = cantidad;
        this.clasificacion = clasificacion;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    //calculo del precio bruto 
    public void productoBruto(){
        double bruto = this.precio * this.cantidad;
        
        if (this.clasificacion.equals("Alimentos")) {
            bruto = precio + (0.20 *precio);
        }
        if (this.clasificacion.equals("Bevidas")) {
            bruto = precio + (0.30 *precio);
        }
        if (this.clasificacion.equals("Higiene")) {
            bruto = precio + 500 + (0.25 *precio);
        }
        if (this.clasificacion.equals("Higiene")) {
            bruto = precio + (0.19 *precio)+ (0.4 *precio + 400);
        }
      
    }
}

    
   