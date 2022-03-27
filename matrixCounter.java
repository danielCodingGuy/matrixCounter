public class matrixCounter {
    public static void main(String[] args) {

        int[][] macierz3x3 = new int[3][3];
        macierz3x3[0][0] = 1;
        macierz3x3[0][1] = 2;
        macierz3x3[0][2] = 3;
        macierz3x3[1][0] = 4;
        macierz3x3[1][1] = 5;
        macierz3x3[1][2] = 6;
        macierz3x3[2][0] = 7;
        macierz3x3[2][1] = 8;
        macierz3x3[2][2] = 9;


        int a  = macierz3x3[0][0];
        int b  = macierz3x3[0][1];
        int c  = macierz3x3[0][2];
        int d  = macierz3x3[1][0];
        int e  = macierz3x3[1][1];
        int f  = macierz3x3[1][2];
        int g  = macierz3x3[2][0];
        int h  = macierz3x3[2][1];
        int i  = macierz3x3[2][2];

        int calc1 = a*e*i;
        int calc2 = b*f*g;
        int calc3 = c*d*h;
        int calc4 = c*e*g;
        int calc5 = b*d*i;
        int calc6 = a*f*h;
        int det = calc1 + calc2 + calc3 - calc4 - calc5 - calc6;

        System.out.println("Matrix 3x3");
        for (int i3 = 0; i3 < macierz3x3.length; i3++) {
            for (int j3 = 0; j3 < macierz3x3[i3].length; j3++) {
                System.out.print(macierz3x3[i3][j3]);
            }
            System.out.println();
        }
        
        int wyznacznik_macierzy3x3;

        wyznacznik_macierzy3x3 = (macierz3x3[0][0] * macierz3x3[1][1]) - (macierz3x3[0][1] * macierz3x3[1][0]);
        System.out.println("");
        System.out.println("Determinant = "+ wyznacznik_macierzy3x3);
        
        System.out.println("----------------\n");

        int[][] macierz2x2 = new int[2][2];
        macierz2x2[0][0] = 1;
        macierz2x2[0][1] = 2;
        macierz2x2[1][0] = 3;
        macierz2x2[1][1] = 4;

        System.out.println("Matrix 2x2");
        for (int i2 = 0; i2 < macierz2x2.length; i2++) {
            for (int j2 = 0; j2 < macierz2x2[i2].length; j2++) {
                System.out.print(macierz2x2[i2][j2]);
            }
            System.out.println();
        }
        int a2 = macierz2x2[0][0];
        int b2 = macierz2x2[0][1];
        int c2 = macierz2x2[1][0];
        int d2 = macierz2x2[1][1];

        int wyznacznik_macierzy2x2;

        wyznacznik_macierzy2x2 = (a2 * d2) - (b2 * c2);
        System.out.println("");
        System.out.println("Determinant = "+ wyznacznik_macierzy2x2);
        System.out.println("----------------");

        }
    }