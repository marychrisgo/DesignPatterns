package homework;

public class RealInternetServer implements Server {
    @Override
    public void handle(User user, String site) {
        System.out.println(site + " loaded");
    }
}
