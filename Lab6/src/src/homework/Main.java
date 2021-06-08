package homework;

import homework.layers.*;

import java.util.ArrayList;

public class Main {

    private static ArrayList<NetworkLayer> layers = new ArrayList<NetworkLayer>();
    static {
        layers.add(new ApplicationLayer());
        layers.add(new EncryptionLayer("my_encryption_key"));
        layers.add(new TcpLayer("<TCP> "));
        layers.add(new EthernetLayer("<Ethernet> "));
    }

    public static void main(String[] args) {
        Network network = new Network();
        String message = "Hello World";

        System.out.println("No layers");

        System.out.println("Message to send: " + message);
        String requestMessage = network.send(message);
        System.out.println("Sending data: " + requestMessage);

        String responseMessage = network.receive(requestMessage);
        System.out.println("Received data: " + responseMessage);


        System.out.println("");
        System.out.println("Add network layers");
        System.out.println("");
        network.setLayers(layers);

        System.out.println("Message to send: " + message);

        requestMessage = network.send(message);
        System.out.println("Sending data: " + requestMessage);

        responseMessage = network.receive(requestMessage);
        System.out.println("Received data: " + responseMessage);
    }

}
