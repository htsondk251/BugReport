package vn.techmaster.blog.model;

public enum StatusType {
    NOT_FIXED(0),
    FIXED(1),
    ESCALATED(2);

    public final int displayValue;

    private StatusType(int value) {
        this.displayValue = value;
    }

    public int getDisplayValue() {
        return displayValue;
    }

    
}
