package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Contex contex = new Contex();
        contex.reg(Store.class);
        contex.reg(ConsoleInput.class);
        contex.reg(StartUI.class);

        StartUI ui = contex.get(StartUI.class);

        ui.add("Alex Smith");
        ui.add("John Doe");
        ui.print();
    }
}
