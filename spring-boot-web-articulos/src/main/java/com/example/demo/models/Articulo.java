package com.example.demo.models;

public class Articulo {
	private String descripcion;
	private float precio;
	private String marca;
	private int cantidad;
	private String proveedor;
	
	public Articulo() {
		
	}
	public Articulo(String desc,float precio,String marca,int cantidad,String proveedor) {
		descripcion=desc;
		this.precio=precio;
		this.marca=marca;
		this.cantidad=cantidad;
		this.proveedor=proveedor;
	}
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
}
