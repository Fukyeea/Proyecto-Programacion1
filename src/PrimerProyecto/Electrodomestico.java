package PrimerProyecto;

import javax.xml.stream.events.EndElement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Electrodomestico {

    int basePrice =50000;
    String color = "white";
    char energyConsumption= 'F';
    double weight=5;
    String vecEnergia [] = {"A", "B", "C", "D", "E", "F"};
    String vecColor[] = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico() {

    }

    public Electrodomestico(int basePrice, String color, char energyComsumption, double weight) {

        this.basePrice = basePrice;
        this.color = color;
        this.energyConsumption = energyComsumption;
        this.weight = weight;

    }

    public Electrodomestico(int price, double WeightElect){
        this.basePrice=price;
        this.weight=WeightElect;
    }


    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setColor(String colorElectro) {
        this.color = colorElectro;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    Scanner sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void comprobarConsumoEnergetico() {

        if (energyConsumption != 'A') {

            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);

        } else if (energyConsumption != 'B') {

            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);

        } else if (energyConsumption != 'C') {

            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);

        } else if (energyConsumption != 'D') {

            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);

        } else if (energyConsumption != 'E') {

            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);

        } else
            System.out.println("Ingrese nuevamente el consumo energetico, debe ser entre las letras A y F");
            char energyConsumption = sc.next().charAt(0);



    }

    public void comprobarColor() {

        System.out.println("Ingrese el color del electrodomestico (colores disponibles  blanco, negro, rojo, azul y gris) ");
        color = sc.nextLine().toLowerCase();

        if (color != "blanco") {
            System.out.println("Los colores disponibles son blanco, negro, rojo, azul y gris, ingreselo nuevamente");
            color = sc.nextLine().toLowerCase();
        } else if (color != "negro") {
            System.out.println("Los colores disponibles son blanco, negro, rojo, azul y gris, ingreselo nuevamente");
            color = sc.nextLine().toLowerCase();
        } else if (color != "rojo") {
            System.out.println("Los colores disponibles son blanco, negro, rojo, azul y gris, ingreselo nuevamente");
            color = sc.nextLine().toLowerCase();
        } else if (color != "azul") {
            System.out.println("Los colores disponibles son blanco, negro, rojo, azul y gris, ingreselo nuevamente");
            color = sc.nextLine().toLowerCase();
        } else
            System.out.println("Los colores disponibles son blanco, negro, rojo, azul y gris, ingreselo nuevamente");
            color = sc.nextLine().toLowerCase();
    }

    public double precioFinal(){
        double finalPrice=0;
        double extraConsumo;
        double extraWeight=0;

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

        finalPrice=basePrice+extraConsumo+extraWeight;

        return finalPrice;
    }
}


