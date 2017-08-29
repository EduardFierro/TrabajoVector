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
public class Vector {

    private int b,c,aux;
    int[] vect;

    public void vector() {

        Scanner opc2 = new Scanner(System.in);
        System.out.print(" Digite el tamaño del vector: ");
        Scanner opc1 = new Scanner(System.in);
        b = opc1.nextInt();
        vect = new int[b];
        for (int i=0; i<b;i++) {
            System.out.print(" Digite numero: ");
            vect[i] = opc2.nextInt();
         
        }

        System.out.println(" En que orden desea el vector ");
        System.out.println(" 1.Ascendente");
        System.out.println(" 2.Descendente");
        System.out.print(" Digite Opcion: ");
        Scanner opc3 = new Scanner(System.in);
        c = opc3.nextInt();
        switch (c) {
            case 1:
                for (int i = 0; i < b-1; i++) {
                    for (int j = 0; j < b-1; j++) {
                        if (vect[j]>vect[j+1]) {
                            aux = vect[j+1];
                            vect[j+1] = vect[j];
                            vect[j] = aux;
                        }
                    }
                }
                for (int i = 0; i < b; i++) {
                    System.out.print(vect[i]);
                    System.out.print(" ");
                }
            break;
            case 2:
                for (int i = 0; i < b-1; i++) {
                    for (int j = 0; j < b-1; j++) {
                        if (vect[j]>vect[j+1]) {
                            aux = vect[j+1];
                            vect[j+1] = vect[j];
                            vect[j] = aux;
                        }
                    }
                }
                for (int i=b-1; i>=0; i--) {
                    System.out.print(vect[i]);
                    System.out.print(" ");
                }
            break;
        }

    }

}
