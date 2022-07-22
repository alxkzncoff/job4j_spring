package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {
    private final Store store;
    private final ConsoleInput input;

    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        System.out.println("Hello, " + input.askStr("What's your name?\n") + "!\n");
        store.getAll().forEach(System.out::println);
    }
}
