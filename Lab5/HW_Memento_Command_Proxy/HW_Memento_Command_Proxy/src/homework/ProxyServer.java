package homework;

import java.util.ArrayList;

public class ProxyServer implements Server {
    private Server server;
    private ArrayList<SiteFilter> siteFilters = new ArrayList<>();

    public ProxyServer(Server server) {
        this.server = server;
    }

    public void handle(User user, String site) {
        System.out.println(user.getName() + " trying to access " + site);
        if (canAccessSite(user, site)) {
            server.handle(user, site);
        } else {
            System.out.println("access to " + site + " blocked");
        }
    }

    private boolean canAccessSite(User user, String site) {
        for (int i = 0; i < siteFilters.size(); i++) {
            SiteFilter siteFilter = siteFilters.get(i);
            if (user.getAccess().equals(siteFilter.getAccess()) && site.contains(siteFilter.getSite())) {
                return false;
            }
        }
        return true;
    }

    public void addSiteFilter(SiteFilter siteFilter) {
        this.siteFilters.add(siteFilter);
    }
}
