package trabajoa.p;

import java.util.Scanner;

public class Polinomio {

    private int grado;
    private int[] polinomio = null;
    private int[] polinomioF2 = null;

    public Polinomio(int grado, int[] polinomio) {
        this.grado = grado;
        this.polinomio = polinomio;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int[] getPolinomio() {
        return polinomio;
    }

    public void setPolinomio(int[] polinomio) {
        this.polinomio = polinomio;
    }

    public int[] getPolinomioF2() {
        return polinomioF2;
    }

    public void setPolinomioF2(int[] polinomioF2) {
        this.polinomioF2 = polinomioF2;
    }

    public void mostrar(int[] polinomio) {
        for (int i = 0; i < polinomio.length; i++) {
            System.out.print(" " + polinomio[i]);
        }
    }

    public void reconstruirPolinomio() { // para recontruir el polinomio interno

        int grado = polinomio[0];

        for (int i = 1; i < polinomio.length; i++) {

            if (i != 1) {
                if (polinomio[i] == 0) { // cuando no hay coheficiente
                    grado--;
                } else if (polinomio[i] > 1) { // cuando el coheficiente es mayor que 1
                    if (grado > 1) {
                        System.out.print("+" + polinomio[i] + "x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print("+" + polinomio[i] + "x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print("+" + polinomio[i]);
                        }
                    }
                } else if (polinomio[i] == 1) { // cuando el coheficiente es 1
                    if (grado > 1) {
                        System.out.print("+x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print("+x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print("+" + polinomio[i]);
                        }
                    }
                } else if (polinomio[i] < -1) { // cuando el coheficiente es menor que -1 
                    if (grado > 1) {
                        System.out.print(polinomio[i] + "x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print(polinomio[i] + "x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print(polinomio[i]);
                        }
                    }
                } else {
                    if (grado > 1) {
                        System.out.print("-x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print("-x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print(polinomio[i]);
                        }
                    }
                }
            } else { // aqui sigue cuando es el primero
                if (polinomio[i] == 0) {
                    grado--;
                } else if (polinomio[i] > 1) {
                    if (grado > 1) {
                        System.out.print(polinomio[i] + "x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print(polinomio[i] + "x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print(polinomio[i]);
                        }
                    }
                } else if (polinomio[i] == 1) {
                    if (grado > 1) {
                        System.out.print("x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print("x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print(polinomio[i]);
                        }
                    }
                } else if (polinomio[i] < -1) { // cuando el coheficiente es menor que -1 
                    if (grado > 1) {
                        System.out.print(polinomio[i] + "x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print(polinomio[i] + "x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print(polinomio[i]);
                        }
                    }
                } else {
                    if (grado > 1) {
                        System.out.print("-x^" + grado);
                        grado--;
                    } else if (grado == 1) {
                        System.out.print("-x");
                        grado--;
                    } else if (grado == 0) {
                        if (polinomio[i] == 0) {
                            grado--;
                        } else {
                            System.out.print("-" + polinomio[i]);
                        }
                    }
                }
            }
        }
    }

    public void reconstruirPolinomio(int[] polinomioVector) { // para uno externo

        int grado = polinomioVector[0];

        if (polinomio != null) {

            for (int i = 1; i < polinomioVector.length; i++) {

                if (i != 1) {
                    if (polinomioVector[i] == 0) { // cuando no hay coheficiente
                        grado--;
                    } else if (polinomioVector[i] > 1) { // cuando el coheficiente es mayor que 1
                        if (grado > 1) {
                            System.out.print("+" + polinomioVector[i] + "x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print("+" + polinomioVector[i] + "x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println("+" + polinomioVector[i]);
                            }
                        }
                    } else if (polinomioVector[i] == 1) { // cuando el coheficiente es 1
                        if (grado > 1) {
                            System.out.print("+x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print("+x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println("+" + polinomioVector[i]);
                            }
                        }
                    } else if (polinomioVector[i] < -1) { // cuando el coheficiente es menor que -1 
                        if (grado > 1) {
                            System.out.print(polinomioVector[i] + "x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print(polinomioVector[i] + "x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println(polinomioVector[i]);
                            }
                        }
                    } else {
                        if (grado > 1) {
                            System.out.print("-x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print("-x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println(polinomioVector[i]);
                            }
                        }
                    }
                } else { // aqui sigue cuando es el primero
                    if (polinomioVector[i] == 0) {
                        grado--;
                    } else if (polinomioVector[i] > 1) {
                        if (grado > 1) {
                            System.out.print(polinomioVector[i] + "x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print(polinomioVector[i] + "x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println(polinomioVector[i]);
                            }
                        }
                    } else if (polinomioVector[i] == 1) {
                        if (grado > 1) {
                            System.out.print("x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print("x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println(polinomioVector[i]);
                            }
                        }
                    } else if (polinomioVector[i] < -1) { // cuando el coheficiente es menor que -1 
                        if (grado > 1) {
                            System.out.print(polinomioVector[i] + "x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print(polinomioVector[i] + "x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println(polinomioVector[i]);
                            }
                        }
                    } else {
                        if (grado > 1) {
                            System.out.print("-x^" + grado);
                            grado--;
                        } else if (grado == 1) {
                            System.out.print("-x");
                            grado--;
                        } else if (grado == 0) {
                            if (polinomioVector[i] == 0) {
                                grado--;
                            } else {
                                System.out.println("-" + polinomioVector[i]);
                            }
                        }
                    }
                }

            }
        } else {
            System.out.println("Polinomio vacio...");
        }

    }

    public boolean bucarporCoheficiente(int coheficiente) {

        int grado = polinomio[0];
        boolean encontro = false;

        for (int i = 1; i < polinomio.length; i++) {
            if (polinomio[i] == coheficiente) {
                if (polinomio[i] != 1 && polinomio[i] != -1) {
                    if (grado > 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println(polinomio[i] + "x^" + grado);
                    } else if (grado == 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println(polinomio[i] + "x");
                    } else if (grado == 0) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println(polinomio[i]);
                    }
                } else if (polinomio[i] == 1) {
                    if (grado > 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println("x^" + grado);
                    } else if (grado == 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println("x");
                    } else if (grado == 0) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println(polinomio[i]);
                    }
                } else {
                    if (grado > 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println("-x^" + grado);
                    } else if (grado == 1) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println("-x");
                    } else if (grado == 0) {
                        System.out.println("Coheficiente encontrado... ");
                        System.out.println(polinomio[i]);
                    }
                }
                encontro = true;
                return true;
            }
            grado--;
        }
        if (encontro == false) {
            System.out.println("Coheficiente NO encontrado... ");

        }
        return false;
    }

    public boolean buscarporExponente(int exponente) {

        int grado = polinomio[0];
        boolean encontro = false;

        if (exponente > grado) {
            System.out.println("El grado ingresado es mayor que el del "
                    + "polinomio");
            return false;
        } else {
            for (int i = 1; i < polinomio.length; i++) {
                if (grado == exponente && polinomio[i] != 0) {
                    if (grado > 1) {
                        if (polinomio[i] != 1 && polinomio[i] != -1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println(polinomio[i] + "x^" + grado);
                        } else if (polinomio[i] == 1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println("x^" + grado);
                        } else if (polinomio[i] == -1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println("-x^" + grado);
                        }
                    } else if (grado == 1) {
                        if (polinomio[i] != 1 && polinomio[i] != -1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println(" " + polinomio[i] + "x");
                        } else if (polinomio[i] == 1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println("x");
                        } else if (polinomio[i] == -1) {
                            System.out.println("Termino encontrado... ");
                            System.out.println("-x");
                        }
                    } else if (grado == 0) {
                        System.out.println(" Termino encontrado... ");
                        System.out.println(polinomio[i]);
                    }
                    encontro = true;
                    return true;
                }
                grado--;
            }
            if (encontro == false) {
                System.out.println("Exponente NO encontrado... ");
            }
            return false;
        }

    }

    public void ingresarTermino(int[] termino) {
        int[] nuevoPolinomio = new int[termino[1] + 2];
        if (termino[1] <= polinomio[0]) {
            int posicion = (polinomio[0] - termino[1]) + 1;
            polinomio[posicion] = polinomio[posicion] + termino[0];
            nuevoPolinomio = polinomio;

        } else {

            nuevoPolinomio[0] = termino[1];
            int grado = polinomio[0];
            nuevoPolinomio[(nuevoPolinomio[0] - termino[1]) + 1] = termino[0];
            for (int i = 1; i < polinomio.length; i++) {
                int posicion = (nuevoPolinomio[0] - grado) + 1;
                nuevoPolinomio[posicion] = polinomio[i] + nuevoPolinomio[posicion];
                grado--;

            }
            polinomio = nuevoPolinomio;

        }
        System.out.println("\n Nuevo polinomio: ");
        reconstruirPolinomio(nuevoPolinomio);
        System.out.println("");

    }

    public void eliminarTermino(String termino) {

        // pasar string a vector
        int[] terminoVector = pasarTerminoAvector(termino);

        // fin pasar string a vector
        //
        boolean elimino = false;
        // Buscar exponente y eliminar
        if (terminoVector[1] < polinomio[0]) {
            int posicion = (polinomio[0] - terminoVector[1]) + 1;
            if (terminoVector[0] == polinomio[posicion]) {
                polinomio[posicion] = 0;
                System.out.println("Termino eliminado...\n"
                        + "Nuevo termino:");
                reconstruirPolinomio(polinomio);
                elimino = true;
            }

        } else if (terminoVector[1] == polinomio[0]) {
            if (terminoVector[0] == polinomio[1]) {
                polinomio[1] = 0;
                int contador = polinomio[0];
                for (int i = 1; i < polinomio.length; i++) {
                    if (polinomio[i] != 0) {
                        int[] nuevoPolinomio = new int[contador + 2];
                        nuevoPolinomio[0] = contador;
                        int nuevoGrado = contador;
                        for (int j = i; j < polinomio.length; j++) {
                            int pocision = (nuevoGrado - contador) + 1;
                            nuevoPolinomio[pocision] = polinomio[i];
                            i++;
                            contador--;
                            System.out.println("");
                        }
                        System.out.println("Termino eliminado...\n"
                                + "Nuevo termino:");
                        polinomio = nuevoPolinomio;
                        reconstruirPolinomio(polinomio);
                        break;
                    }

                    contador--;
                }
            }
            elimino = true;
        }
        if (elimino == false) {
            System.out.println("\n Termino NO encontrado... \n");
        }

        // Fin buscar exponente y eliminar 
    }

    public int[] pasarTerminoAvector(String termino) {

        int[] terminoEnVectorRetornar = new int[2];
        char[] terminoEnVector = termino.toCharArray();
        int coheficiente = 0, exponente = 0;

        boolean encontroX = false;
        for (int i = 0; i < terminoEnVector.length; i++) {

            if (terminoEnVector[i] == 'x') {
                // SACANDO COHEFICIENTE DEL TERMINO
                if (i + 1 != terminoEnVector.length) {
                    if (terminoEnVector[i + 1] == '^') {

                        String concatenar = "";
                        for (int j = i + 2; j < terminoEnVector.length; j++) {
                            concatenar = concatenar + terminoEnVector[j];

                        }
                        terminoEnVectorRetornar[1] = Integer.parseInt(concatenar);

                    }
                } else {
                    terminoEnVectorRetornar[1] = 1;
                }

                // SACANDO COHEFICIENTE
                if (i == 0) {
                    terminoEnVectorRetornar[0] = 1;
                } else {
                    int contador = 0;
                    String concatenar = "";
                    while (contador != i) {
                        concatenar = concatenar + terminoEnVector[contador];
                        contador++;

                    }

                    terminoEnVectorRetornar[0] = Integer.parseInt(concatenar);

                }

                encontroX = true;
            }

            // CONDICION PARA CUANDO NO HAY X
            if (encontroX == false && i == terminoEnVector.length - 1) {
                int contador = 0;
                String concatenar = "";
                while (contador != terminoEnVector.length) {
                    concatenar = concatenar + terminoEnVector[contador];
                    contador++;
                }
                terminoEnVectorRetornar[0] = Integer.parseInt(concatenar);
                terminoEnVectorRetornar[1] = 0;
            }

        }
        System.out.println("");

        return terminoEnVectorRetornar;
    }

    public void sumarPolinomios(String polinomio2) {

        // Pasar polinomio en string a vector
        int[] polinomio2Vector = pasarStringAvector(polinomio2);

        // FIN Pasar polinomio en string a vector
        //
        // Sumando polinomio
        if (polinomio2Vector.length <= polinomio.length) {

            int contador = (polinomio.length - polinomio2Vector.length) + 1;
            int contador2 = 1;
            for (int i = contador; i < polinomio.length; i++) {
                if (polinomio2Vector[contador2] != 0) {
                    polinomio[contador] += polinomio2Vector[contador2];
                }
                contador++;
                contador2++;
            }

        } else {
            int contador = (polinomio2Vector.length - polinomio.length) + 1;
            int contador2 = 1;
            for (int i = contador; i < polinomio2Vector.length; i++) {
                if (polinomio[contador2] != 0) {
                    polinomio2Vector[contador] += polinomio[contador2];
                }
                contador++;
                contador2++;
            }
            polinomio = polinomio2Vector;
        }

        // FIN sumando polinomios
        System.out.println("\n Resultante de la suma:");
        reconstruirPolinomio(polinomio);
        System.out.println("");
    }

    public int[] pasarStringAvector(String polinomio) {

        char[] polinomioVector = polinomio.toCharArray();
        int[] polinomioFinal;
        String[] polinomioConcatenado = new String[polinomioVector.length];

        int contadorConcatenar = 0;
        int coheficiente = 0;
        int exponente = 0;
        int grado = 0;

        if (polinomioVector.length == 1) {
            polinomio = polinomio + "+0";
            polinomioVector = polinomio.toCharArray();
        } else if (polinomioVector[polinomioVector.length - 1] == '^'
                || polinomioVector[polinomioVector.length - 2] == '^') {
            polinomio = polinomio + "+0";
            polinomioVector = polinomio.toCharArray();
        }

        grado = sacarGradoMayor(polinomioVector);
        polinomioFinal = new int[grado + 2];
        polinomioFinal[0] = grado;

        for (int i = 0; i < polinomioVector.length; i++) {

            // SACANDO COHEFICIENTE
            if (polinomioVector[i] == 'x'
                    || i == polinomioVector.length - 1 && polinomioVector[i] != 'x') {
                if (i == 0) {
                    coheficiente = 1;
                } else if (i == 0 && polinomioVector[0] == '-'
                        && polinomioVector[1] == 'x') {
                    coheficiente = -1;
                } else {
                    if (polinomioVector[i] == 'x') {
                        if (polinomioVector[i - 1] == '+'
                                || polinomioVector[i - 1] == '-') {
                            if (polinomioVector[i - 1] == '-') {
                                coheficiente = -1;
                            } else {
                                coheficiente = 1;
                            }
                        } else {
                            int contador = i;
                            String concatenar = "";
                            while (polinomioVector[contador] != '+'
                                    && polinomioVector[contador] != '-'
                                    && polinomioVector[contador] != '^'
                                    && contador != 0) {
                                contador--;
                            }
                            while (contador != i) {
                                if (polinomioVector[contador] == '+') {
                                    contador++;
                                } else {
                                    concatenar = concatenar + polinomioVector[contador];
                                    contador++;
                                }
                            }

                            coheficiente = Integer.parseInt(concatenar);
                        }
                    }
                }

                // SACANDO EXPONENTES
                if (polinomioVector[i] == 'x') {

                    if (i != polinomioVector.length - 1) {
                        if (polinomioVector[i + 1] == '^') {
                            int contador = i + 2;
                            String concatenar = "";
                            while (polinomioVector[contador] != '+'
                                    && polinomioVector[contador] != '-'
                                    && polinomioVector[contador + 1] != '^'
                                    && contador != polinomioVector.length) {
                                concatenar = concatenar + polinomioVector[contador];
                                contador++;
                            }

                            exponente = Integer.parseInt(concatenar);

                        } else {

                            exponente = 1;

                        }
                    } else {

                        exponente = 1;

                    }
                }
                // EVALUANDO SI HAY ULTIMO TERMINO
                if (i == polinomioVector.length - 1 && polinomioVector[i] != 'x') {
                    int contador = i;
                    String concatenar = "";
                    while (polinomioVector[contador] != '+'
                            && polinomioVector[contador] != '-'
                            && polinomioVector[contador] != '^'
                            && contador != -1) {
                        contador--;
                    }
                    while (contador != i + 1) {
                        if (polinomioVector[contador] == '+') {
                            contador++;
                        } else {
                            concatenar = concatenar + polinomioVector[contador];
                            contador++;
                        }
                    }

                    coheficiente = Integer.parseInt(concatenar);
                    exponente = 0;

                }

                int posicion = (grado - exponente) + 1;
                polinomioFinal[posicion] = coheficiente + polinomioFinal[posicion];

            }
        }

        // FIN DE PASAR POLINOMIO A VECTOR
        return polinomioFinal;
    }

    public int sacarGradoMayor(char[] polinomio) {
        int grado = 0;
        int exponente = 0;
        for (int i = 0; i < polinomio.length; i++) {

            if (polinomio[i] == 'x') {

                if (i != polinomio.length - 1) {
                    if (polinomio[i + 1] == '^') {
                        int contador = i + 2;
                        String concatenar = "";
                        while (polinomio[contador] != '+'
                                && polinomio[contador] != '-'
                                && polinomio[contador + 1] != '^'
                                && contador != polinomio.length) {
                            concatenar = concatenar + polinomio[contador];
                            contador++;
                        }

                        exponente = Integer.parseInt(concatenar);
                        if (grado < exponente) {
                            grado = exponente;
                        }
                    } else {
                        exponente = 1;
                        if (grado < exponente) {
                            grado = exponente;
                        }
                    }
                } else {
                    exponente = 1;
                    if (grado < exponente) {
                        grado = exponente;
                    }
                }
            }
        }

        return grado;
    }

    public void multiplicarPolinomios(String Polinomio) {
        //pasar string a vector
        int[] nuevoPolinomio = pasarStringAvector(Polinomio);
        // Fin pasar string a vector
        //
        // multiplicacion

        int grado1 = nuevoPolinomio[0];
        int grado2 = polinomio[0];
        ///System.out.println("Grado 1: "+grado1);
        //System.out.println("Grado 2: "+grado2);

        int[] polinomioFinal = new int[grado1 + grado2 + 2];
        polinomioFinal[0] = grado1 + grado2;

        //System.out.println("Grado nuevo polinomio: "+polinomioFinal[0]);
        if (polinomio.length >= nuevoPolinomio.length) {

            for (int i = 1; i < polinomio.length; i++) {

                for (int j = 1; j < nuevoPolinomio.length; j++) {
                    int posicion = (polinomioFinal[0] - (grado1 + grado2)) + 1;
                    polinomioFinal[posicion] += polinomio[i] * nuevoPolinomio[j];
                    grado2--;

                }
                grado2 = polinomio[0];
                grado1--;

            }
        } else {
            for (int i = 1; i < nuevoPolinomio.length; i++) {

                for (int j = 1; j < polinomio.length; j++) {
                    int posicion = (polinomioFinal[0] - (grado1 + grado2)) + 1;
                    polinomioFinal[posicion] += nuevoPolinomio[i] * polinomio[j];
                    grado2--;

                }
                grado2 = polinomio[0];
                grado1--;

            }
        }

        polinomio = polinomioFinal;

        System.out.println("");
        reconstruirPolinomio(polinomio);
        System.out.println("");

        // fin multiplicacion
    }

    public void reemplazarCoheficiente(String nuevo) {

        // pasar a vector
        int[] termino = pasarTerminoAvector(nuevo);

        // Fin pasar a avector
        if (buscarporExponente(termino[0]) == true) {

            Scanner entrada = new Scanner(System.in);
            System.out.print("\nNuevo Coheficiente: ");
            int coheficienteNuevo = entrada.nextInt();
            termino[0] = coheficienteNuevo;

            int[] nuevoPolinomio = new int[termino[1] + 2];
            if (termino[1] <= polinomio[0]) {
                int posicion = (polinomio[0] - termino[1]) + 1;
                polinomio[posicion] = termino[0];
                nuevoPolinomio = polinomio;

            } else {
                System.out.println("\nTermino no encontrado...");
            }

            System.out.println("\nNuevo polinomio: ");
            reconstruirPolinomio(nuevoPolinomio);
            System.out.println("");
        } else {
            System.out.println("\nTermino no encontrado...");
        }
    }

    public void mostrarVector() {
        for (int i = 0; i < polinomio.length; i++) {
            System.out.print(polinomio[i] + " ");

        }
    }

    public void polinomioF2(int[] polinomioF2) {
        int tamVec = 0;
        int posNuevo = 1;
        int[] polF2;

        for (int i = 1; i < polinomioF2.length; i++) {
            if (polinomioF2[i] != 0) {
                tamVec++;
            }
        }
        polF2 = new int[(tamVec * 2) + 1];
        polF2[0] = polinomioF2[0];
        //System.out.println(polinomioF2.length);

        for (int i = 1; i < polinomioF2.length; i++) {
            if (polinomioF2[i] != 0) {
                //System.out.println(polinomioF2.length-(i+1));
                polF2[posNuevo] = polinomioF2.length - (i + 1);
                polF2[posNuevo + 1] = polinomioF2[i];
                posNuevo += 2;
            }
        }
        this.polinomioF2 = polF2;
    }

    public void mostrarF2(int[] polinomioF2) {
        for (int i : polinomioF2) {
            System.out.print(i + " ");
        }
    }
}
