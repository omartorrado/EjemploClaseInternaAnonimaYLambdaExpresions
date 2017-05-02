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
public class ImplementarInterfaz implements ILambdas{
    
    @Override
    public void operacion(int a, int b) {
        System.out.println(a*b);
    }
}
