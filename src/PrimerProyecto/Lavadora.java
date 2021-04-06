package PrimerProyecto;

public class Lavadora extends Electrodomestico{
    int carga= 5;

    public Lavadora(){

    }

    public Lavadora(int basePrice, double weight){
        this.basePrice= basePrice;
        this.weight=weight;
    }

    public Lavadora(int carga, String color, char energyComsumption, int basePrice, double weight){
        this.carga=carga;
        this.color= color;
        this.energyConsumption= energyComsumption;
        this.basePrice=basePrice;
        this.weight= weight;
    }


    public void setCarga(int carga){
        carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public double PrecioFinal(){
        double finalPrice=0;
        double extraConsumo;
        double extraWeight=0;
        int precioCarga;

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

        if(carga>30){
            precioCarga=50000;
        }else precioCarga=0;

        finalPrice=basePrice+extraConsumo+extraWeight+precioCarga;

        return finalPrice;
    }



}

