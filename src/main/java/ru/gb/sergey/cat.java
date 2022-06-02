package ru.gb.sergey;

public class cat extends animal{
    public cat(String name, int run, int lim) {
        super(name, run, lim);
    }

    @Override
    public void limSwim() {
        System.out.println(getName() + " коты не плаваюи");

    }

}
