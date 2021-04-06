public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int precio,String color,char consumo,int peso,int carga) {
        super(precio,color,consumo,peso);
        this.carga = carga;

    }

    public Lavadora(int precio,int peso){
        super(precio,peso);

        this.carga = 5;
    }

    public Lavadora(){
        super();
        this.carga = 5;
    }



    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double PrecioFinalLavadora(int carga){

        double precioTotalLavadora = 0;

        if(carga>=30){
            precioTotalLavadora = precioFinal(this.getConsumo(),this.getPeso()) + 50000;
        }else{
            precioTotalLavadora = precioFinal(this.getConsumo(),this.getPeso());
        }

        return precioTotalLavadora;

    }


}