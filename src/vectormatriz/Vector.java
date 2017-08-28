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
    int []vec;
    private int tam;

    public Vector( int tam) {
        this.setTam(tam);
    }

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    public void Menu(){
        int a,b,c,d, mayor=0,menor=0;
        int []vect={};
    
        System.out.println("           Menu");
        System.out.println(" Va crear vector o matriz?");
        System.out.println("1.Vector ");
        System.out.println("2.Matriz ");
        System.out.print(": ");
        Scanner opc = new Scanner(System.in);
        a= opc.nextInt();
        switch(a){
            case 1:
                System.out.print(" Digite el tamaño del vector: ");
                Scanner opc1 = new Scanner(System.in);
                b= opc1.nextInt();
                
                for(int i=0;i<b;i++){
                    System.out.print(" Digite numero: ");
                     Scanner opc2 = new Scanner(System.in);
                    vect[i] = opc2.nextInt();
                     

                }
                System.out.println(" En que orden desea el vector: ");
                System.out.println(" 1.Ascendente");
                System.out.println(" 2.Descendente");
                System.out.println(" Digite Opcion: ");
                Scanner opc3 = new Scanner(System.in);
                c= opc3.nextInt();
                switch(c){
                    case 1:
                        for(int i=0;i<b;i++){
                            if(vect[i]<vect[i+1]){
                                
                            }
                        }
                        break;
                }
                
                
            break;
                 
        }

    }
}
