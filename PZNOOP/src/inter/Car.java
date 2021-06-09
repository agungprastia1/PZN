package inter;

public interface Car {
    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    }
}
