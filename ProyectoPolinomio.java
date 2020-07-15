package trabajoa.p;

import java.awt.BorderLayout;
import java.util.Scanner;

public class ProyectoPolinomio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String sAuxiliar = "";
        String terminoNuevoEntrada = "";
        int[] terminoNuevo = new int[1];

        //No funciona con polinomios avanzados 
        //No funciona si el polinomio esta mal escrito
        //Solo recibe polinomios con numero de coheficiente
        //Solo funciona con una X y su exponente, si es 1 se puede omitir
        String polinomio = "33x^4+2x^2+x+7";
        String polinomio2 = "8x^5+5x^2+x";

        //
        //
        //CREANDO POLINOMIO FORMA 1//
        // - Polinomio 1
        int[] polinomioFinal = new int[1];
        Polinomio Polinomio = new Polinomio(0, polinomioFinal);
        polinomioFinal = Polinomio.pasarStringAvector(polinomio);
        Polinomio = new Polinomio(polinomioFinal[0], polinomioFinal);
        // - Polinomio 2
        int[] polinomioFinal2 = new int[1];
        Polinomio Polinomio2 = new Polinomio(0, polinomioFinal2);
        polinomioFinal2 = Polinomio2.pasarStringAvector(polinomio2);
        Polinomio2 = new Polinomio(polinomioFinal2[0], polinomioFinal2);

        //
        //
        //CREANDO POLINOMIO FORMA 2
        // - Polinomio 1
        Polinomio.polinomioF2(Polinomio.getPolinomio());
        // - Polinomio 2
        Polinomio2.polinomioF2(Polinomio2.getPolinomio());

        //
        //
        //CREANDO POLINOMIO EN LISTA ENLAZADA
        // - Polinomio 1
        PolinomioLista polUnoLista = new PolinomioLista();
        polUnoLista.generarPolinomioLista(Polinomio.getPolinomioF2());
        // - Polinomio 2
        PolinomioLista polDosLista = new PolinomioLista();
        polDosLista.generarPolinomioLista(Polinomio2.getPolinomioF2());

        /////////////////////////////////////////////////////////////////
        System.out.println("\t..:: FORMAS ::..");

        char[] opcion = new char[1];
        String pause = "";
        System.out.print("Cambiar el polinomio en el proyectoPolinomio.java");
        System.out.println("\n===============================================\n");
        Polinomio.reconstruirPolinomio();
        System.out.println(" -> Polinomio principal\n");

        System.out.println("Polinomio Forma 1:");
        System.out.print("Pol 1 >>> ");
        Polinomio.mostrarVector();
        System.out.print("\nPol 2 >>> ");
        Polinomio2.mostrarVector();

        System.out.println("\n\nPolinomio Forma 2:");
        System.out.print("Pol 1 >>> ");
        Polinomio.mostrarF2(Polinomio.getPolinomioF2());
        System.out.print("\nPol 2 >>> ");
        Polinomio2.mostrarF2(Polinomio2.getPolinomioF2());

        System.out.println("\n\nPolinomio Lista:");
        System.out.print(">>> Pol 1: \n");
        polUnoLista.mostrarPolLista();
        System.out.print("\n>>> Pol 2: \n");
        polDosLista.mostrarPolLista();

        System.out.println("\n===============================================\n");

        System.out.println("Multiplicacion de P1 con P2 salida Lista");
        Metodos.multiplicarPolvF1conPolvF2(Polinomio2.getPolinomio(), Polinomio.getPolinomioF2());
    }

}
