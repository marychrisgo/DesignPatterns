package homework.layers;

public class EthernetLayer implements NetworkLayer {
    private String header;

    public EthernetLayer(String header) {
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
