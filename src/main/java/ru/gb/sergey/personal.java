package ru.gb.sergey;


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.



public class personal {
    private String fullName;
    private String poast;
    private String email;
    private int phone;
    private int money;
    private int age;

    public personal(String fullName, String poast, String email, int phone, int money, int age) {
        this.fullName = fullName;
        this.poast = poast;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPoast() {
        return poast;
    }

    public void setPoast(String poast) {
        this.poast = poast;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    }


