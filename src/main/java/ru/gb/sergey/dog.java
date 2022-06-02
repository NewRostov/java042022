package ru.gb.sergey;

public class dog extends animal {
    public dog(String name, int run, int lim) {
        super(name, run, lim);
    }

    @Override
    public void limSwim() {
        System.out.println( getName() + " плавает на 10 м");

    }


}
