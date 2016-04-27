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
public abstract class A implements C {
   
    String As;
    int Ai;

    public A(String As, int Ai) {
        this.As = As;
        this.Ai = Ai;
    }
    
    
    public static void st(){
    int a = 0;
        System.out.println(a);
    }
    
    public abstract void apv();
    
    public void apc(){}
    
    public void apc(String a){
        
    }
    
    public int entero(int ent){
        return 0;
    }
    
    @Override
    public void p(){}
    
}
