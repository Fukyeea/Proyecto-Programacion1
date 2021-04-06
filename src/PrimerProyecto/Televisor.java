package PrimerProyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Televisor extends Electrodomestico{

    double resolucion = 20;
    boolean sintonizadorDigital= false;

    public Televisor(){

    }

    public Televisor(int basePrice, double weight){
        this.basePrice=basePrice;
        this.weight=weight;
    }

    public Televisor(int resolucion, boolean sintonizadorDigital, String color, char energyComsumption){
        this.resolucion=resolucion;
        this.sintonizadorDigital= sintonizadorDigital;
        this.color= color;
        this.energyConsumption= energyComsumption;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setSintonizadorDigital(boolean sintonizadorDigital) {
        this.sintonizadorDigital = sintonizadorDigital;
    }

    public boolean getSintonizadorDigital(){
        return sintonizadorDigital;
    }

    Scanner sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double precioFinal(){
        double finalPrice=0;
        double extraConsumo=0;
        double extraWeight=0;

        System.out.println("Ingrese las pulgadas del televisor: ");
        resolucion= sc.nextDouble();
        System.out.println("El televisor tiene sintonizador digitl true/false? ");
        sintonizadorDigital= sc.nextBoolean();

        if (sintonizadorDigital)//PENDIENTE

        if (energyConsumption != 'A') {
            extraConsumo=100000;
        } else if (energyConsumption != 'B') {
            extraConsumo=80000;
        } else if (energyConsumption != 'C') {
            extraConsumo=60000;
        } else if (energyConsumption != 'D') {
            extraConsumo=50000;
        } else if (energyConsumption != 'E') {
            extraConsumo=30000;
        } else {
            extraConsumo = 10000;
        }

        if (weight<=19) {
            extraWeight = 10000;
        } else if (weight>=20 && weight<=49 ) {
            extraWeight = 50000;
        } else if (weight>=50 && weight<=79) {
            extraWeight = 80000;
        } else if (weight<=80) {
            extraWeight = 100000;
        }

        if (resolucion>40 && sintonizadorDigital==true){

            finalPrice=(30*((basePrice+5000)+extraConsumo+extraWeight))/100;

        }else if (resolucion>40){
            finalPrice=(30*(basePrice+extraConsumo+extraWeight))/100;
        }else {
            finalPrice=(basePrice+5000)+extraConsumo+extraWeight;
        }

        return finalPrice;

    }
}
