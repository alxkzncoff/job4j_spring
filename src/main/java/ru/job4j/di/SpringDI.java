package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ui.add("Alex Smith");
        ui.add("John Doe");
        ui.print();

        Store first = context.getBean(Store.class);
        first.add("Will Smith");
        Store second = context.getBean(Store.class);
        second.getAll().forEach(System.out::println);
    }
}
