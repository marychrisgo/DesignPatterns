package homework;

public class SiteFilter {
    private final String access;
    private final String site;

    public SiteFilter(String access, String site) {
        this.access = access;
        this.site = site;
    }

    public String getAccess() {
        return access;
    }

    public String getSite() {
        return site;
    }
}
