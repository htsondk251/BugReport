package vn.techmaster.blog.model;

public enum RoleType {
    ANONYMOUS(0),
    CUSTOMER(1),
    SUPPORTER(2);

    public final int value;

    private RoleType(int value) {
        this.value = value;
    }
}
