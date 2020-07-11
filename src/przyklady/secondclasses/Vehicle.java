package przyklady.secondclasses;

//klasa bazowa po ktorej dziedziczymy
public class Vehicle {

    //parametry przekazywane sa do klas podrzednych, o ile nie sa private
    protected int speed;
    protected String name;

    //metoda pobierajaca dane w sposob ustandaryzowany, tzw. getter
    public int getSpeed() {
        return speed;
    }

    //metoda zapisujaca dane w sposob ustandaryzowany, tzw. settter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
