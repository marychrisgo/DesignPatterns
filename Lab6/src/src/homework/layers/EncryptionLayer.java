package homework.layers;

public class EncryptionLayer implements NetworkLayer {

    private String key;

    public EncryptionLayer(String key) {
        this.key = key;
    }

    @Override
    public String send(String requestMessage) {
        return encrypt(requestMessage);
    }

    @Override
    public String receive(String requestMessage) {
        return encrypt(requestMessage);
    }

    private String encrypt(String requestMessage) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < requestMessage.length(); i++) {
            sb.append((char)(requestMessage.charAt(i) ^ key.charAt(i % key.length())));
        }
        return sb.toString();
    }
}
