/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class Producto {
    String nombre;
    float precio;
    int existencia;
    public Producto(String nombre, float precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencias(int existencia) {
        this.existencia = existencia;
    }
}
