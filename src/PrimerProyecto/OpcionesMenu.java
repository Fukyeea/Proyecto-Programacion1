package PrimerProyecto;

import java.util.Scanner;

public class OpcionesMenu {
    public Lavadora[] LlenarLavadora(Lavadora[] lavado) {

        Scanner sc = new Scanner(System.in);
        System.out.println("                      [ Llenar  vector Lavadora]            ");
        System.out.println("");
        for (int i = 0; i < lavado.length; i++) {
            System.out.println ( "////////////////////////////////////////////////////" );
            System.out.println ( "Whashing machine #"+i);
            System.out.println ( " Enter the carga: " );
            int carga = sc.nextInt ( );
            System.out.println ( "Enter the weight: " );
            double weight = sc.nextDouble ( );
            System.out.println("Ingrese el consumo energetico (letras entre A y F) ");
            char energyConsumption = sc.next().charAt(0);

            lavado[i] = new Lavadora ( carga, weight);
            lavado[i].comprobarConsumoEnergetico();
            lavado[i].comprobarColor();

        }

        return lavado;
    }

    public Lavadora[] MostrarLavadora(Lavadora[] lavado) {
        //Lavadora lavado = new Lavadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("                      [ Mostrar  vector Lavadora]            ");
        System.out.println("");
        for (int i = 0; i < lavado.length; i++) {
            System.out.println ( "//////////////////////////////////////////////////////////////////////" );
            System.out.println ( "Whashing machine #" + i + " Price: " + lavado[i].basePrice );
            System.out.println ( "Whashing machine #" + i + " Weight: " + lavado[i].weight );
            System.out.println ( "Whashing machine #" + i + " Color: " + lavado[i].color );
            System.out.println ( "Whashing machine #" + i + " Energy Consumption: " + lavado[i].energyConsumption );
            System.out.println ( "Whashing machine #" + i + " Carga: " + lavado[i].getCarga ());
            System.out.println ( "////////////////////////////////////////////////////////////////////////////////" );
        }

        return lavado;
    }

    public Lavadora[] CalcularLavadora(Lavadora[] lavado) {
        //Lavadora lavado = new Lavadora();
        Scanner sc = new Scanner(System.in);
        double sum=0;
        for (int i = 0; i < lavado.length; i++) {

            lavado[i] = new Lavadora ();
            sum = sum + lavado[i].PrecioFinal();

        }
        System.out.println("The price is: " + sum);

        return lavado;
    }

    public Televisor[] LlenarTV(Televisor[] TV) {
        //Lavadora lavado = new Lavadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("                      [ Llenar  vector Televisor]            ");
        System.out.println("");
        for (int i = 0; i < TV.length; i++) {
            System.out.println ( "////////////////////////////////////////////////////" );
            System.out.println ( "TV #"+i);
            System.out.println ( " Enter the price: " );
            int basePrice = sc.nextInt ( );
            System.out.println (  " Enter the weight: " );
            double weight = sc.nextDouble ( );
            TV[i] = new Televisor ( basePrice, weight );
            System.out.println ( "////////////////////////////////////////////////////" );
        }

        return TV;
    }
    public Televisor[] MostrarTV(Televisor[] TV) {
        //Lavadora lavado = new Lavadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("                      [ Llenar  vector Televisor]            ");
        System.out.println("");
        for (int i = 0; i < TV.length; i++) {
            System.out.println ( "////////////////////////////////////////////////////" );
            System.out.println ( "TV #" + i + " Price: " + TV[i].basePrice );
            System.out.println ( "TV #" + i + " Weight: " + TV[i].weight );
            System.out.println ( "TV #" + i + " Color: " + TV[i].color );
            System.out.println ( "TV #" + i + " Energy Consumption: " + TV[i].energyConsumption);
            System.out.println ( "TV #" + i + " Sintonizador: " + TV[i].resolucion);
            System.out.println ( "TV #" + i + " Resolution: " + TV[i].sintonizadorDigital);
            System.out.println ( "////////////////////////////////////////////////////" );

        }

        return TV;
    }

}
