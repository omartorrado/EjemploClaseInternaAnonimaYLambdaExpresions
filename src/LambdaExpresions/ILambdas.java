/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpresions;

/**
 *
 * @author otorradomiguez
 */
@FunctionalInterface
public interface ILambdas {
    
    public abstract void operacion(int a,int b);
    default void saludo(){
        System.out.println("Hola");
    }
}
