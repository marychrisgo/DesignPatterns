package homework;

import homework.layers.ApplicationLayer;
import homework.layers.NetworkLayer;

import java.util.ArrayList;

public class Network {

    private ArrayList<NetworkLayer> layers;

    public Network() {
        layers = new ArrayList<NetworkLayer>();
        layers.add(new ApplicationLayer());
    }

    public String send(String message) {
        for (int i = 0; i < layers.size(); i++) {
            message = layers.get(i).send(message);
        }
        return message;
    }

    public String receive(String message) {
        for (int i = layers.size() - 1; i >= 0; i--) {
            message = layers.get(i).receive(message);
        }
        return message;
    }

    public void setLayers(ArrayList<NetworkLayer> layers) {
        this.layers = layers;
    }
}
