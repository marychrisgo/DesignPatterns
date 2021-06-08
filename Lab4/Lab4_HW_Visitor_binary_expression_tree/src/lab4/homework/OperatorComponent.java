package lab4.homework;

public class OperatorComponent implements Component {
    private String operator;
    private Component left;
    private Component right;

    public OperatorComponent(String operator) {
        this.operator = operator;
    }

    @Override
    public void iterate(Visitor visitor) {
        visitor.getValue(this);
    }

    public void setRight(Component component) {
        right = component;
    }

    public void setLeft(Component component) {
        left = component;
    }

    public Component getRight() {
        return right;
    }

    public Component getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "OperatorComponent{" +
                "left=" + left +
                ", operator='" + operator + '\'' +
                ", right=" + right +
                '}';
    }
}
