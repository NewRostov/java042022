package ru.gb.sergey;

public abstract class animal {
    private String name;
    private int run;
    private int lim;

    public animal(String name, int run, int lim) {
        this.name = name;
        this.run = run;
        this.lim = lim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int swim) {
        this.lim = lim;
    }

    public void print() {
        System.out.println(getName() + " пробежал " + getRun() + " м.");
    }

    public abstract void limSwim();
}

