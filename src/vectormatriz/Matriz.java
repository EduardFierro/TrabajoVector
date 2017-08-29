/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormatriz;

import java.util.Scanner;

/**
 *
 * @author Pavilion 15
 */
public class Matriz {

    public void matriz() {
        int b, c, aux;
        int[][] matriz;
        Scanner opc2 = new Scanner(System.in);
        System.out.print(" Digite el tamaño de la matriz: ");
        Scanner opc1 = new Scanner(System.in);
        b = opc1.nextInt();
        matriz = new int[b][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" Digite numero: ");
                matriz[i][j] = opc2.nextInt();

            }

        }
        System.out.println(" En que orden desea la matriz ");
        System.out.println(" 1.Descendente");
        System.out.println(" 2.Ascendente");
        System.out.print(" Digite Opcion: ");
        Scanner opc3 = new Scanner(System.in);
        c = opc3.nextInt();
        switch (c) {
            case 1:
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < b; j++) {
                        for (int x = 0; x < b; x++) {
                            for (int y = 0; y < b; y++) {
                                if (matriz[i][j] > matriz[x][y]) {
                                    aux = matriz[i][j];
                                    matriz[i][j] = matriz[x][y];
                                    matriz[x][y] = aux;
                                }
                            }
                        }
                    }
                }    
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print(matriz[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            break;
            case 2:
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < b; j++) {
                        for (int x = 0; x < b; x++) {
                            for (int y = 0; y < b; y++) {
                                if (matriz[i][j] > matriz[x][y]) {
                                    aux = matriz[i][j];
                                    matriz[i][j] = matriz[x][y];
                                    matriz[x][y] = aux;
                                }
                            }
                        }
                    }
                }    
                for (int i=b-1; i>=0; i--) {
                    for(int j=b-1;j>=0;j--){
                        System.out.print(matriz[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            break;
        }
                          
    }
}
