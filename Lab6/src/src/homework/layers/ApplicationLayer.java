package homework.layers;

public class ApplicationLayer implements NetworkLayer {
    @Override
    public String send(String requestMessage) {
        return requestMessage;
    }

    @Override
    public String receive(String requestMessage) {
        return requestMessage;
    }
}
