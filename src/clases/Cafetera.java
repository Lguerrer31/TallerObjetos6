/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author coste
 */
public class Cafetera {

    private int capacidad_maxima;
    private int capacidad_actual;

    public Cafetera(int capacidad_maxima, int capacidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.capacidad_actual = capacidad_actual;
        if (this.capacidad_actual < this.capacidad_maxima) {
            this.capacidad_actual = this.capacidad_maxima;
            Helper.mensaje(null, "La capacidad actual ha sido ajustada a la maxima", "Mensaje", 1);

        } else {
            this.capacidad_maxima = capacidad_maxima;
        }
    }

    public Cafetera() {
        this.capacidad_maxima = 1000;
        this.capacidad_actual = 0;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

    public void llenarcafetera() {
        this.capacidad_actual = this.capacidad_maxima;
    }

    public void servirtaza(int a, int b) {
        int aux;
        int sw = 1;
        aux = this.getCapacidad_actual() - (a * b);
        if (this.capacidad_actual == 0) {
            Helper.mensaje(null, "La cafetera se encuentra vacia", "Error", 2); 
            sw = 0;
        } else if (aux < this.capacidad_actual) {
               Helper.mensaje(null, "La cafetera no tiene la cantidad requerida, se servira lo que alcance", "Error", 2);
        } else {
            if (sw == 1){
            this.capacidad_actual = aux;
            }
        } 
        
    }

    public void vaciarcafetera() {
        this.capacidad_actual = 0;
        this.capacidad_maxima = this.getCapacidad_maxima();
    }

    public void agregarcafe(int h) {
        int a;
        if (h > getCapacidad_maxima()) {
            this.capacidad_actual = this.capacidad_maxima;
        } else if (h < getCapacidad_maxima()) {
            Helper.mensaje(null, "No puede ingresar más café", "Error", 2);
        } else {
            a = this.getCapacidad_actual() + h;
            this.capacidad_actual = a;
            
        }
        
    }

}
