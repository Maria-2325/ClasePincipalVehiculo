package com.mycompany.claseprincipalvehiculo.VehiculoClase;

import com.mycompany.claseprincipalvehiculo.Enumeraciones.*;

public class Automovil {

    //Atributos de la clase Automovil
    private String marca;
    private int modelo;
    private Double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMax;
    private Color color;
    private double velocidadActual;

    // Contructor con loa atributos de la clase Automovil

    public Automovil(String marca, int modelo, Double motor, TipoCombustible tipoCombustible, 
            TipoAutomovil tipoAutomovil,int numeroPuertas, int cantidadAsientos, double velocidadMax,
            Color color, double velocidadActual) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    // Constructor sin atributos de la clase Automovil

    public Automovil() {
        
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    public double getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    // Métodos de la clase Automovil
    public double acelerar (double aumentar) {
        if(this.velocidadActual + aumentar <= this.velocidadMax){
            this.velocidadActual += aumentar;
            
        } else {
            this.velocidadActual = this.velocidadMax;
        }
        return this.velocidadActual;
    }
    public double desacelerar(double disminuir) {
        if(velocidadActual - disminuir >= 0){
            this.velocidadActual -= disminuir;
        }else{
            this.velocidadActual = 0;
        }
  
        return this.velocidadActual;
    }
    public void frenar () {
        this.velocidadActual = 0;   
    }
    public double calcularTiempo(Double distanciaR) {
        double tiempo = 0;
        if(this.velocidadActual > 0){
            tiempo = distanciaR / this.velocidadActual;
        }
        return tiempo;
    }  
    public void imprimir() {
        System.out.println("--------DATOS DEL AUTOMOVIL-----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("El tipo de auto: " + tipoAutomovil);
        System.out.println("Numero de asientos: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos );
        System.out.println("Velocidad maxima: " + velocidadMax + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}