package inter;

/*
    implementasi interface
    exten hasbrand dan ismaintnace

    app/CarApp
 */
public interface Car extends HasBrand,IsMaintenance {
    void drive();
    int getTire();

    default boolean isBig(){
        return false;
    }
}
