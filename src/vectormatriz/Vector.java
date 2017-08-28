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
    private int b, aux;
    int []vect;
    public void vector(){
        
        Scanner opc2 = new Scanner(System.in);
        System.out.print(" Digite el tamaño del vector: ");
        Scanner opc1 = new Scanner(System.in);
        b= opc1.nextInt();
        vect = new int[b];
        for(int i=0;i<b;i++){
            System.out.print(" Digite numero: ");
            vect[i] = opc2.nextInt();

        }
    }
    public int ascendente(){
        int i,j;
        for(i=0;i<b;i++){
            for(j=0;j<b;j++){
                if(vect[j]>vect[j+1]){
                    aux=vect[j];
                    vect[j]=vect[j+1];
                    vect[j+1]= aux;
                }
            }
        }    
        for(i=0;i<b;i++){
            System.out.println(vect[i]);
        }
    
        return 0;
    }

}
