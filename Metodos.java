// Metodos propuestos en clase
package trabajoa.p;

public class Metodos {

    public static void multiplicarPolvF1conPolvF2(int[] F1, int[] F2) {
        int expoActual = F1[0];
        int posF1 = 1;
        int posF2 = 1;
        int coeRes = 0;
        int expRes = 0;

        for (int i = 0; i < F1.length; i++) {
            if (posF1 > F1.length-1) {
                break;
            }
            for (int j = 0; j < F2.length; j++) {
                if (F1[posF1] != 0) {
                    if (posF2 > F2.length - 1) {
                        break;
                    }
                    coeRes = F1[posF1] * F2[posF2 + 1];
                    expRes = expoActual * F2[posF2];
                    posF2 += 2;
                }
            }
            posF1++;
            posF2 = 1;

        }

    }

}
