package lab4.homework;

public class NumberComponent implements Component {
    private Integer number;

    public NumberComponent(Integer number) {
        this.number = number;
    }

    @Override
    public void iterate(Visitor visitor) {
        visitor.getValue(this);
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "NumberComponent{" +
                "number=" + number +
                '}';
    }
}
