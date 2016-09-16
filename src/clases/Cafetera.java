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

    public void LlenarCafetera(){
    this.capacidad_actual = this.capacidad_maxima;
}

     public void ServirTaza(int a, int b){
       int c;
       c = (a * b) + this.getCapacidad_actual();
       if (this.capacidad_actual < 0) {
           this.capacidad_actual = 0;
       }
       
   }

     public void Vaciar(){
       this.capacidad_actual = 0;
       this.capacidad_actual = this.getCapacidad_maxima();
   }

   public void AgregarCafe(int d){
        int a;
        if (d > getCapacidad_maxima()) {
            this.capacidad_actual = this.capacidad_maxima;
        } else {
            a = getCapacidad_actual() + d;
            if (a > getCapacidad_maxima()) {
                Helper.mensaje(null, "No puede ingresar mas café", "Error", 1);
            } else {
                this.capacidad_actual = a;
            }
            
        }
        
    }
    
}