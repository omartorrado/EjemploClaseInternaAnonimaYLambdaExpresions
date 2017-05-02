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
public class ExemploLambdaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clase anonima
        ILambdas op = new ILambdas(){
            @Override
            public void operacion(int a,int b){
                System.out.println("op: "+(a*b));
            }
        };
        op.operacion(5, 9);
        //Expresiones Lambda
        ILambdas op2 = (int a,int b) -> System.out.println("Resultado: "+(a+b));
        op2.operacion(3, 6);
        op2.saludo();
        ILambdas op3=(int a,int b)->{System.out.println("R: "+(a*b));};
        op3.operacion(8, 2);
    }
    
}
