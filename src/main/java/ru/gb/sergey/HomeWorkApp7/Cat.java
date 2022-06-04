package ru.gb.sergey.HomeWorkApp7;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(getName() + " съел " + appetite);
        } else {
            System.out.println("Добавьте еды для " + getName() + ", хочет - " + getAppetite());
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;}
}