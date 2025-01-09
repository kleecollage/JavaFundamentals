package test;

import arithmetic_application.Arithmetic;

public class TestArithmetic {
    public static void main(String[] args) {
        var arithmetic = new Arithmetic(7, 5);
        arithmetic.add();
        arithmetic.subtract();
        arithmetic.setOperand1(10);
        arithmetic.setOperand2(15);
        arithmetic.add();
        arithmetic.subtract();
        System.out.println("Dir. Memo obj1: " + arithmetic);

        var arithmetic2 = new Arithmetic(1, 2);
        arithmetic2.add();
        arithmetic2.subtract();
        arithmetic2.setOperand1(16);
        arithmetic2.setOperand2(4);
        System.out.println("Dir. Memo obj2: " + arithmetic2);
        arithmetic2.add();
        arithmetic2.subtract();
        System.out.println("Dir. Memo obj2: " + arithmetic2);
        arithmetic2.setOperand2(7);
        arithmetic2.setOperand2(3);
        arithmetic2.add();
        arithmetic2.subtract();
        System.out.println("Dir. Memo obj2: " + arithmetic2);

        System.out.println("\n*** EMPTY CONSTRUCTOR ***");
        var arithmetic3 = new Arithmetic();
        arithmetic3.setOperand1(50);
        arithmetic3.setOperand2(25);
        arithmetic3.add();
        arithmetic3.subtract();
    }
}
