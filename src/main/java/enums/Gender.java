package enums;

public enum Gender {
    MALE(1),
    FEMALE(2);

    Gender(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }
}
