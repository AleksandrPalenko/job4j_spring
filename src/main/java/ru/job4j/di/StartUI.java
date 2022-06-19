package ru.job4j.di;

public class StartUI {
    private Store store;

    private ConsoleInput input;

    public StartUI(ConsoleInput input, Store store) {
        this.input = input;
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void addAnswer() {
        String val = " ";
        if (val.isEmpty()) {
            throw new IllegalArgumentException("Empty message");
        }
        store.add(input.askStr(val));
    }
}
