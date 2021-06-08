package homework;

public class User {
    public static final String BOSS = "boss";
    public static final String MANAGER = "manager";
    public static final String EMPLOYEE = "employee";

    private String access = EMPLOYEE;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
