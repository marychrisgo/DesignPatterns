package lab4.homework;

public class PrintingVisitor implements Visitor {
    private String expression = "";

    public String getValue(Component component) {
//        System.out.println(component);
        if (component instanceof OperatorComponent) {
            String rightOperand = getValue(((OperatorComponent) component).getRight());
            String operator = ((OperatorComponent) component).getOperator();
            String leftOperand = getValue(((OperatorComponent) component).getLeft());
            expression = leftOperand + " " + operator + " " + rightOperand;
            return expression;
        } else if (component instanceof NumberComponent) {
            Integer number = ((NumberComponent) component).getNumber();
            return String.valueOf(number);
        } else {
            return "";
        }
    }

    @Override
    public void printResult() {
        System.out.println(expression);
    }
}
