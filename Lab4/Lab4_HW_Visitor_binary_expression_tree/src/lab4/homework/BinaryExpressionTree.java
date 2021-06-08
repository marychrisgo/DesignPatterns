package lab4.homework;

import java.util.ArrayList;

public class BinaryExpressionTree implements Component {
    private Component top;

    public BinaryExpressionTree(String expression) {
        ArrayList<String> components = splitIntoParts(expression);
        buildExpressionTree(components);
    }

    private ArrayList<String> splitIntoParts(String expression) {
        ArrayList<String> components = new ArrayList<>();
        for (int i = 0; i < expression.length() - 1; i++) {
            for (int j = i + 1; j < expression.length(); j++) {
                if (!isOperator(expression, i) && isOperator(expression, j)) {
                    String operator = expression.substring(j, j + 1);
                    components.add(expression.substring(i, j));
                    components.add(operator);
                    i = j + 1;
                }
            }
            components.add(expression.substring(i));
        }
        return components;
    }

    private boolean isOperator(String expression, int index) {
        return expression.charAt(index) == '+' || expression.charAt(index) == '*';
    }

    private void buildExpressionTree(ArrayList<String> components) {
        if (components.size() == 0) {
            top = new NumberComponent(0);
        } else if (components.size() == 1) {
            top = new NumberComponent(Integer.valueOf(components.get(0)));
        } else {
            System.out.println("components: " + components);
            top = new OperatorComponent(components.get(components.size() - 2));
            OperatorComponent current = (OperatorComponent) top;
            for (int i = components.size() - 2; i >= 0; i = i - 2) {
                Integer rightNumber = Integer.valueOf(components.get(i + 1));
                NumberComponent right = new NumberComponent(rightNumber);
                current.setRight(right);
                if (i - 2 > 0) {
                    String operator = components.get(i - 2);
                    OperatorComponent left = new OperatorComponent(operator);
                    current.setLeft(left);

                    current = left;
                } else if (i - 1 > 0) {
                    String operator = components.get(i - 1);
                    OperatorComponent left = new OperatorComponent(operator);
                    current.setLeft(left);

                    current = left;
                } else {
                    Integer leftNumber = Integer.valueOf(components.get(i - 1));
                    NumberComponent left = new NumberComponent(leftNumber);
                    current.setLeft(left);
                }
            }
        }
    }

    @Override
    public void iterate(Visitor visitor) {
        top.iterate(visitor);
    }
}
