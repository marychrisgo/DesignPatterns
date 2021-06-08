package homework.layers;

public class TcpLayer implements NetworkLayer {

    private String header;

    public TcpLayer(String header) {
        this.header = header;
    }

    @Override
    public String send(String requestMessage) {
        return header + requestMessage;
    }

    @Override
    public String receive(String requestMessage) {
        return requestMessage.substring(header.length());
    }
}
