public class Electrodomestico {
    private int precio;
    private String color;
    private char consumo;
    private int peso;

    public Electrodomestico() {
        this.precio = 50000;
        this.color = "Blanco";
        this.consumo = 'F';
        this.peso = 5;
    }

    public Electrodomestico(int precio,int peso){
        this.precio = precio;
        this.color = "Blanco";
        this.consumo = 'F';
        this.peso = peso;

    }

    public Electrodomestico(int precio,String color,char consumo,int peso){
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso =peso;

    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarCosumoEnegetico(char consumo){


        if((consumo != 'A') && (consumo != 'B') && (consumo != 'C') && (consumo != 'D') && (consumo != 'E')){
            this.consumo = 'F';

        }else{
            this.consumo = consumo;
        }

    }

    public void comprobarColor(String color){
        if((color != "negro") && (color != "rojo") && (color != "azul") && (color != "gris")){
            this.color = "Blanco";
        }else if((color != "Negro") && (color != "Rojo") && (color != "Azul") && (color != "Gris")){
            this.color = "Blanco";
        }else{
            this.color = color;
        }
    }

    public double precioFinal(char letra, int peso){

        int precioConsumo =0;
        int precioPeso = 0;
        int precioTotal = 0;

        if(letra == 'A'){
            precioConsumo = 100000;
        }else if(letra == 'B'){
            precioConsumo = 80000;
        }else if(letra == 'C'){
            precioConsumo = 60000;
        }else if(letra == 'D'){
            precioConsumo = 50000;
        }else if(letra == 'E'){
            precioConsumo = 30000;
        }else if(letra == 'F'){
            precioConsumo = 10000;
        }

        if(peso  >=0  && peso <=19){
            precioPeso = 10000;
        }else if (peso  >=20  && peso <=49){
            precioPeso = 50000;
        }else if (peso  >=50  && peso <=79){
            precioPeso = 80000;
        }else{
            precioPeso = 100000;
        }

        precioTotal = this.precio + precioPeso + precioConsumo;

        return precioTotal;



    }



}
