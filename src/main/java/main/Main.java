package main;

import calculadora.Calculadora;

public class Main {
    Calculadora c = new Calculadora();
    public static void main(String args[]){

        Calculadora<Integer> intCalc = new Calculadora<>();
        Calculadora<Double> doubleCalc = new Calculadora<>();
        Calculadora<Float> floatCalc = new Calculadora<>();


        System.out.println("-----------------------");
        System.out.println("--        SOMA       --");
        System.out.println("-----------------------");

        System.out.println("Soma int: " + intCalc.soma(1,2));
        System.out.println("Soma double: " + doubleCalc.soma(2.31, 2.53));
        System.out.println("Soma float: " + floatCalc.soma(2.2f, 2.51f));

       System.out.println("-----------------------");

       /************************************************************************/


        System.out.println("----------------------------");
        System.out.println("--        SUBTRAÇÃO       --");
        System.out.println("----------------------------");

        System.out.println("Subtração int: " + intCalc.subtracao(1,2));
        System.out.println("Subtração double: " + doubleCalc.subtracao(2.31, 2.53));
        System.out.println("Subtração float: " + floatCalc.subtracao(2.2f, 2.51f));

        System.out.println("----------------------------");


        /************************************************************************/


        System.out.println("--------------------------");
        System.out.println("--        DIVISÃO       --");
        System.out.println("--------------------------");

        System.out.println("Divisão int: " + intCalc.divisao(1,2));
        System.out.println("Divisão double: " + doubleCalc.divisao(2.31, 2.53));
        System.out.println("Divisão float: " + floatCalc.divisao(2.2f, 2.51f));

        System.out.println("--------------------------");


        /************************************************************************/


        System.out.println("--------------------------------");
        System.out.println("--        MULTIPLICACAO       --");
        System.out.println("--------------------------------");

        System.out.println("Multiplicação int: " + intCalc.multiplicacao(1,2));
        System.out.println("Multiplicação double: " + doubleCalc.multiplicacao(2.31, 2.53));
        System.out.println("Multiplicação float: " + floatCalc.multiplicacao(2.2f, 2.51f));

        System.out.println("--------------------------------");






    }
}
