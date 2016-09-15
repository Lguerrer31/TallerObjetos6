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
        if (this.capacidad_actual > this.capacidad_maxima) {
            this.capacidad_actual = this.capacidad_maxima;
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
        int a, m, l;
        a = this.getCapacidad_actual();
        m = this.getCapacidad_maxima();
        l = a = m;
    }

    public void vaciarcafetera() {
        int v, a;
        a = this.getCapacidad_actual();
        v = a = 0;
    }
    
}
