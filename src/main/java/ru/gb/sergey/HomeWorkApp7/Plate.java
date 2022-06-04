package ru.gb.sergey.HomeWorkApp7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (appetite <= food) {
            food -= appetite;
            return true;
        }
        System.out.println("Еды мало");
        return false;
    }

    public void increaseFood(int appetite) {
        food += appetite;
    }

    public int getFood() {
        return food;
    }
}
