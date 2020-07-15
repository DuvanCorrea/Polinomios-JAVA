// Nodo que contiene un 
package trabajoa.p;

public class NodoLista {

    public int coheficiente;
    public int exponente;
    public NodoLista liga  = null;

    public NodoLista(int coheficiente, int exponente) {
        this.coheficiente = coheficiente;
        this.exponente = exponente;
    }

    public int getCoheficiente() {
        return coheficiente;
    }

    public void setCoheficiente(int coheficiente) {
        this.coheficiente = coheficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public NodoLista getLiga() {
        return liga;
    }

    public void setLiga(NodoLista liga) {
        this.liga = liga;
    }
}
