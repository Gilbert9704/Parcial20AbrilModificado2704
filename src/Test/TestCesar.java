/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.*;

/**
 *
 * @author User
 */
public class TestCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;
        byte b;
        String c;
        String d = "Aqui termina todo";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Ingrese a int");
            a = sc.nextInt();
            System.out.println("Ingrese b byte");
            b = sc.nextByte();
            System.out.println("Ingrese c String");
            c = sc.next();
        }catch(InputMismatchException e1){
            System.out.println("Excepcion, ingrese el tipo de dato solicitado");
        }catch(NumberFormatException e2){
            System.out.println("Excepcion, no se si será");
        }
        System.out.println(d);
        
        
    }
    
}
