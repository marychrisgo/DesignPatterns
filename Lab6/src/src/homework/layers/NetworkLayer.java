package homework.layers;

public interface NetworkLayer {

    String send(String requestMessage);

    String receive(String requestMessage);

}
