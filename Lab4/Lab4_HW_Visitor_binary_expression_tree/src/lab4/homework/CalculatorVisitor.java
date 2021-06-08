package lab4.homework;

public class CalculatorVisitor implements Visitor {
    int result = 0;

    @Override
    public String getValue(Component component) {
//        System.out.println(component);
        if (component instanceof OperatorComponent) {
            if (((OperatorComponent) component).getOperator().equals("+")) {
                Integer right = Integer.valueOf(getValue(((OperatorComponent) component).getRight()));
                Integer left = Integer.valueOf(getValue(((OperatorComponent) component).getLeft()));
                result = right + left;
            }
            else if (((OperatorComponent) component).getOperator().equals("*")) {
                Integer right = Integer.valueOf(getValue(((OperatorComponent) component).getRight()));
                Integer left = Integer.valueOf(getValue(((OperatorComponent) component).getLeft()));
                result = right * left;
            }
            return String.valueOf(result);
        } else if (component instanceof NumberComponent) {
            Integer number = ((NumberComponent) component).getNumber();
            return String.valueOf(number);
        } else {
            return "";
        }
    }

    @Override
    public void printResult() {
        System.out.println("Result = " + result);
    }
}
