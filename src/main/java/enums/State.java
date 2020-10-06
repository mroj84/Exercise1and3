package enums;

public enum State {
    ALABAMA("Alabama", 1),
    ALASKA("Alaska", 2),
    ARIZONA("Arizona", 3);

    State(String name, int value) {
        this.name = name;
        this.value = value;
    }

    private final String name;
    private final int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
