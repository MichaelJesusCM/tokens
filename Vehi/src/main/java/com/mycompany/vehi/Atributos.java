/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehi;

import javax.swing.JOptionPane;

public class Atributos {

    //atributos
    // private hace que otros elementos de otras clases no puedan acceder  a esta 
    private String propietario;
    private double valorcomercial;
    private String color;
    private String placa;
    private String matriculado;
    private int aniofabricacion;

    // metodos // creamos un costructor 
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(double valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public Atributos() {
        JOptionPane.showInternalMessageDialog(null, " DATOS DEL VEHICULO SON ");
    }

    // sobre carcarga de metodos 
    public Atributos(String propietario) {
        this.propietario = propietario;
        JOptionPane.showInternalMessageDialog(null, "Bienvenido " + getPropietario());
    }

    public String calcularAnio() {
        double anioActual = 2021 - aniofabricacion;
        if (anioActual >= 2) {
            return "No debe de Presentarse a Revision ";

        } else {
            return "¡Alerta! \n, Si debe de`presentarse a la Revision";

        }
    }

    public String datos() {
        String informacion = "Informacion del Vehiculo \n"
                + "Propietario: " + propietario + "\n"
                + "Valor Comercial: " + valorcomercial + "\n"
                + "Color: " + color + "\n"
                + "Placa: " + placa + "\n"
                + "Matriculado: " + matriculado + "\n"
                + "Anio Fabricacion: " + aniofabricacion + "\n";

        // con el mas se concatena 
        return informacion;
    }
}
