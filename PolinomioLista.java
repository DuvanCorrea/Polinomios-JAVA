package trabajoa.p;

public class PolinomioLista {

    private NodoLista cabeza;
    private int grado;

    public PolinomioLista() {
        this.cabeza = null;
        this.grado = 0;
    }

    public NodoLista getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoLista cabeza) {
        this.cabeza = cabeza;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void generarPolinomioLista(int[] pol) {
        // Se crea un polinomop en lista a partir de F2
        this.grado = pol[0];
        for (int i = 1; i < pol.length; i+=2) {
            NodoLista nuevo = new NodoLista(pol[i + 1], pol[i]);
            if (this.cabeza == null) {
                this.cabeza = nuevo;
            } else {
                agregarNodo(nuevo);
            }
        }
    }

    public void agregarNodo(NodoLista nodo) {
        NodoLista aux = this.cabeza;
        while (aux.getLiga() != null) {
            aux = aux.getLiga();
        }
        aux.setLiga(nodo);
    }

    public void mostrarPolLista() {
        NodoLista aux = this.cabeza;
        while (aux != null) {
            System.out.println( aux.getCoheficiente() + "x^" + aux.getExponente());
            aux = aux.getLiga();
        }
    }
}
