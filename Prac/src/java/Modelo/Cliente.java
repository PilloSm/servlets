/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
    String nombre;
    double telefono;
    String correo;
    String lineaC, linea, respuesta;
    ArrayList<Producto> lista=new ArrayList();
    ArrayList<ProductoC> listaCompra=new ArrayList();
    ArrayList clientes=new ArrayList();
    Producto pro;
    ProductoC proc;
    Cliente cli;
    Iterator <Producto> objIterador= lista.iterator();
    Iterator <ProductoC> objItC= listaCompra.iterator();
    public Cliente(String nombre, double telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    public Cliente(){
    
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public ArrayList getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    public ArrayList<ProductoC> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<ProductoC> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void agregarP(String nombre, float precio, int existencia){
    pro=new Producto(nombre, precio, existencia);
    lista.add(pro);
    }
    public void agregarC(String nombre, double telefono, String correo){
    cli=new Cliente(nombre, telefono, correo);
    clientes.add(cli);

    }
    public String comprar(String nombre, int unidades){
    while (objIterador.hasNext()){
        pro=objIterador.next();
        if (nombre.equals(pro.getNombre()))
            {
            if (pro.getExistencia()<unidades){
                break;
                respuesta="No hay suficientes"
                }
                else{
                float precio=pro.getPrecio();
                pro.setExistencias(pro.getExistencia()-unidades);
                proc=new ProductoC(nombre, precio, unidades);
                listaCompra.add(proc);
                respuesta="Se ha realizado tu compra"+nombre+unidades;
                }
            } 
        }
        return respuesta;
    }    
}
