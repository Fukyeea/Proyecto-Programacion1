package PrimerProyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;

public class principalClass {
    public static void main(String[] args) {

        Lavadora lavado[] = new Lavadora[2];
        Televisor TV[] = new Televisor[5];
        OpcionesMenu opciones =new OpcionesMenu();
        Lavadora lav=new Lavadora();

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int option; //Guardaremos la opcion del usuario
        do {


            System.out.println("///////////////////////////////////////////////");
            System.out.println("/                MAIN                         /");
            System.out.println("////////////////////////////////////////////////");
            System.out.println("1. Fill Vector of Washing Machine            /");
            System.out.println("2. Fill Vector of TV                         /");
            System.out.println("3.calculate the price of washing machines    /");
            System.out.println("4.calculate the price of TV´s                /");
            System.out.println("5.show the list of washers                   /");
            System.out.println("6.show the list of TV´s                      /");
            System.out.println("////////////////////////////////////////////////");


            System.out.println("Choose an option:");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    opciones.LlenarLavadora(lavado);
                    break;

                case 2:
                    opciones.LlenarTV(TV);
                    break;

                case 3:

                    opciones.CalcularLavadora(lavado);
                    break;

                case 4:

                    break;

                case 5:
                    opciones.MostrarLavadora(lavado);
                    break;

                case 6:
                    opciones.MostrarTV(TV);
                    break;

                case 7:
                    System.out.println("Salir");
                break;
            }

        }while (option!=7);

    }
}
