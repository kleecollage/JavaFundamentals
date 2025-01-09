package arithmetic_application;

public class Arithmetic {
    private int operand1;
    private int operand2;
    // EMPTY CONSTRUCTOR
    public Arithmetic() {}
    // OVERLOAD CONSTRUCTOR
    public Arithmetic(int operand1, int operand2) {
        System.out.println("\n arithmetic_application.Arithmetic constructor ");
        this.operand1 = operand1;
        this.operand2 = operand2;
        System.out.println("Dir. Memo this: " + this);
    }
    // METHODS
    public void add() {
        int result = this.operand1 + this.operand2;
        System.out.println("add result = " + result);
    }

    public void subtract() {
        int result = this.operand1 - this.operand2;
        System.out.println("subtract result = " + result);
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}
