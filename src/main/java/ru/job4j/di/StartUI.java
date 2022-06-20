package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput input;

    /**
     * public StartUI(ConsoleInput input, Store store) {
     * this.input = input;
     * this.store = store;
     * }
     */

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
