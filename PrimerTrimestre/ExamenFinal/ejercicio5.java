package ExamenCorreccion;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '.';
            }
        }

        int peonI = 6;
        int peonJ = 1;
        int caballoI = 1;
        int caballoJ = 1;

        tablero[peonI][peonJ] = 'P';
        tablero[caballoI][caballoJ] = 'C';
        
        boolean salir = false;

        while (!salir) {


            System.out.println("  0 1 2 3 4 5 6 7");
            System.out.println("-----------------");
            for (int i = 0; i < 8; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 8; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("¿Que pieza quieres mover? (peon/caballo/fin): ");
            String pieza = sc.next();

            if (pieza.equals("fin")) {
                System.out.println("FIN");
                salir = true;
                continue;
            }

            int[][] movimientos = new int[8][2];
            int totalMovimientos = 0;

            if (pieza.equals("peon")) {

                int nuevaI = peonI - 1;

                if (nuevaI >= 0 && tablero[nuevaI][peonJ] == '.') {
                    movimientos[0][0] = nuevaI;
                    movimientos[0][1] = peonJ;
                    totalMovimientos = 1;
                }

            } else if (pieza.equals("caballo")) {

                int[] movI = {-2, -2, -1, -1, 1, 1, 2, 2};
                int[] movJ = {-1, 1, -2, 2, -2, 2, -1, 1};

                for (int k = 0; k < 8; k++) {
                    int ni = caballoI + movI[k];
                    int nj = caballoJ + movJ[k];

                    if (ni >= 0 && ni < 8 && nj >= 0 && nj < 8 && tablero[ni][nj] == '.') {
                        movimientos[totalMovimientos][0] = ni;
                        movimientos[totalMovimientos][1] = nj;
                        totalMovimientos++;
                    }
                }

            } else {
                System.out.println("Pieza no válida.");
                continue;
            }

            if (totalMovimientos == 0) {
                System.out.println("No hay movimientos válidos.");
                continue;
            }

            System.out.println("Movimientos válidos:");
            for (int i = 0; i < totalMovimientos; i++) {
                System.out.println(i + ": (" + movimientos[i][0] + "," + movimientos[i][1] + ")");
            }

            System.out.print("Elige movimiento: ");
            int opcion = sc.nextInt();

            if (opcion < 0 || opcion >= totalMovimientos) {
                System.out.println("Opción incorrecta.");
                continue;
            }

            if (pieza.equals("peon")) {
                tablero[peonI][peonJ] = '.';
                peonI = movimientos[opcion][0];
                peonJ = movimientos[opcion][1];
                tablero[peonI][peonJ] = 'P';
            } else {
                tablero[caballoI][caballoJ] = '.';
                caballoI = movimientos[opcion][0];
                caballoJ = movimientos[opcion][1];
                tablero[caballoI][caballoJ] = 'C';
            }
        }
    }
}
