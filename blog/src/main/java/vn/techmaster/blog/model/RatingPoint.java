package vn.techmaster.blog.model;

public enum RatingPoint {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);
    
    public int displayValue;

    private RatingPoint(int displayValue) {
        this.displayValue = displayValue;
    }

    public int getDisplayValue() {
        return displayValue;
    }   

}
