/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author gaangulosa
 */
public abstract class B extends A{

    public B(String As, int Ai) {
        super(As, Ai);
    }
    
    @Override
    public void apc(){}
    
    public void apc(int b){}
    
    @Override
    public void apc(String a){
        System.out.println("Hello World");
    }
    
    public static void st(){
        System.out.println("Hola Mundo");
    }
    
    public int entero(int ent){
    return ent;
    }
    
    
}
