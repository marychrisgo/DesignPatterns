package lab4.homework;

public class Main {
    public static void main(String[] args) {
        Component tree = new BinaryExpressionTree("3+5*6");

        Visitor printer = new PrintingVisitor();
        tree.iterate(printer);
        printer.printResult();

        Visitor calculator = new CalculatorVisitor();
        tree.iterate(calculator);
        calculator.printResult();
    }
}
