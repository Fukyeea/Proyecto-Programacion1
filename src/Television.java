public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Television() {
        this.resolucion = 20;
        this.sintonizador = false;
    }

    public Television(int precio, int peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizador = false;

    }

    public Television(int precio, String color, char consumo, int peso,int resolucion,boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public double PrecioFinalTelevisor(int resolucion,boolean sintonizador){

        double precioTotalTelevicion = 0;

        if(resolucion >= 40){
            precioTotalTelevicion = precioFinal(this.getConsumo(),this.getPeso()) + (precioFinal(this.getConsumo(),this.getPeso())*0.30);
        }else{
            precioTotalTelevicion = precioFinal(this.getConsumo(),this.getPeso());
        }

        if(sintonizador){
            precioTotalTelevicion = precioTotalTelevicion + 5000;
        }
        return precioTotalTelevicion;

    }

}
