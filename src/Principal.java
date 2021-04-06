import java.util.Scanner;

public class Principal {

    public static void  main(String args[]){
        Lavadora lavadoras[] = new Lavadora[5];
        Lavadora lavadora = new Lavadora();
        Television televisores[] = new Television[5];
        Television televisor = new Television();

        Scanner leer = new Scanner(System.in);
        int opc ;
        int opc1;
        int precio;
        String color;
        char consumo;
        int peso;
        int carga;
        int resolucion;
        boolean sintonizador = false;


        double precioTelevisores =0;
        double precioLavadoras =0;

        do{


            System.out.println("****MENU*****");
            System.out.println("1.Llenar vector de Lavadoras");
            System.out.println("2.Llenar vector de Lavadoras");
            System.out.println("3.Calcular Precio Televisores");
            System.out.println("4.Calcular Precio Lavadoras");
            System.out.println("5.Mostrar Listado de Lavadoras");
            System.out.println("6.Mostrar Listado de Televisores");
            System.out.println("7.Salir");
            opc = leer.nextInt();

            switch(opc){
                case 1:
                    System.out.println("LLenado de vector de lavadoras");
                    for(int i = 0; i <5; i++) {
                        System.out.println("Lavadora  "+(i+1));
                        System.out.println("Ingrese el Precio");
                        precio = leer.nextInt();
                        System.out.println("Ingrese el color");
                        color = leer.next();
                        System.out.println("Ingrese el cosumo");
                        consumo = 'F';
                        System.out.println("Ingrese el peso");
                        peso = leer.nextInt();
                        System.out.println("Ingrese la carga");
                        carga = leer.nextInt();

                        lavadora.setPrecio(precio);
                        lavadora.setColor(color);
                        lavadora.setConsumo(consumo);
                        lavadora.setPeso(peso);
                        lavadora.setCarga(carga);

                        precioLavadoras = precioLavadoras + lavadora.PrecioFinalLavadora(carga);

                        lavadoras[i] = new Lavadora(precio,color,consumo,peso,carga);


                    }

                    break;
                case 2:
                    for(int i = 0; i <5; i++) {
                        System.out.println("Telivisor  "+(i+1));
                        System.out.println("Ingrese el Precio");
                        precio = leer.nextInt();
                        System.out.println("Ingrese el color");
                        color = leer.next();
                        System.out.println("Ingrese el cosumo");
                        consumo = 'F';
                        System.out.println("Ingrese el peso");
                        peso = leer.nextInt();
                        System.out.println("Ingrese la resolucion");
                        resolucion = leer.nextInt();
                        System.out.println("Tiene sintonizador");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        opc1 = leer.nextInt();
                        switch(opc1){
                            case 1:
                                sintonizador = true;
                                break;
                            case 2:
                                sintonizador = false;
                                break;
                        }

                        televisor.setPrecio(precio);
                        televisor.setColor(color);
                        televisor.setConsumo(consumo);
                        televisor.setPeso(peso);
                        televisor.setResolucion(resolucion);
                        televisor.setSintonizador(sintonizador);

                        precioTelevisores = precioTelevisores + televisor.PrecioFinalTelevisor(resolucion, sintonizador);

                        televisores[i] = new Television(precio,color,consumo,peso,resolucion,sintonizador);

                    }
                    break;
                case 3:
                    System.out.println("Precio total de Televisores");
                    System.out.println(precioTelevisores);
                    break;
                case 4:
                    System.out.println("Precio total Lavadoras");
                    System.out.println(precioLavadoras);
                    break;
                case 5:
                    for(int i = 0; i <5; i++) {
                        System.out.println("Lavadora en la posicion "+(i+1));
                        System.out.println(lavadoras[i].getPrecio() +"  "+ lavadoras[i].getColor() + "  "+ lavadoras[i].getConsumo()+"  "+ lavadoras[i].getPeso() + " " +lavadoras[i].getCarga());
                        System.out.println("");
                    }


                    break;
                case 6:
                    for(int i = 0; i <5; i++) {

                        System.out.println("Televisor en la posicion "+(i+1));
                        System.out.println(televisores[i].getPrecio() +"  "+ televisores[i].getColor() + "  "+ televisores[i].getConsumo()+"  "+ televisores[i].getPeso() + " " + televisores[i].getResolucion()+" pulgads"+televisores[i].isSintonizador());
                        System.out.println("");
                        System.out.println("");
                    }
                    break;
            }

        }while(opc != 7);
        System.exit(0);
    }

}


