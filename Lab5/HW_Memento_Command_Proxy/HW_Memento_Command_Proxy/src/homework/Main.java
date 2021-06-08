package homework;

public class Main {
    public static void main(String[] args) {
        User boss1 = new User("boss1");
        boss1.setAccess(User.BOSS);
        User manager1 = new User("manager1");
        manager1.setAccess(User.MANAGER);
        User employee1 = new User("employee1");
        employee1.setAccess(User.EMPLOYEE);

        RealInternetServer internetServer = new RealInternetServer();
        ProxyServer server = new ProxyServer(internetServer);

        server.addSiteFilter(new SiteFilter(User.MANAGER, "facebook"));
        server.addSiteFilter(new SiteFilter(User.EMPLOYEE, "facebook"));

        server.handle(employee1, "www.google.com");
        server.handle(employee1, "www.facebook.com");

        server.addSiteFilter(new SiteFilter(User.EMPLOYEE, "youtube"));
        server.addSiteFilter(new SiteFilter(User.EMPLOYEE, "twitter"));
        server.addSiteFilter(new SiteFilter(User.EMPLOYEE, "instagram"));

        server.handle(employee1, "www.youtube.com");
        server.handle(employee1, "www.twitter.com");
        server.handle(employee1, "www.instagram.com");
        server.handle(manager1, "www.youtube.com");
        server.handle(boss1, "www.instagram.com");

        server.addSiteFilter(new SiteFilter(User.MANAGER, "porn"));
        server.addSiteFilter(new SiteFilter(User.EMPLOYEE, "porn"));

        server.handle(employee1, "www.pornhub.com");
        server.handle(manager1, "www.pornhub.com");
        server.handle(boss1, "www.pornhub.com");
    }
}
