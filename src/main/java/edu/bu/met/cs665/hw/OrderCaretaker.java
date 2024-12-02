package edu.bu.met.cs665.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderCaretaker.java
 * Description: Manages OrderMemento instances to save and restore Order states.
 */

public class OrderCaretaker {
    private final List<OrderMemento> mementos = new ArrayList<>();

    /**
     * Saves the given memento into the caretaker's history.
     * @param memento The memento to be saved.
     */
    public void save(OrderMemento memento) {
        mementos.add(memento);
        System.out.println("Memento saved. Current history size: " + mementos.size());
    }

    /**
     * Restores a memento at the given index.
     * @param index The index of the memento to be restored.
     * @return The restored memento.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    public OrderMemento restore(int index) {
        if (index < 0 || index >= mementos.size()) {
            throw new IndexOutOfBoundsException("Invalid memento index");
        }
        System.out.println("Restoring memento at index: " + index);
        return mementos.get(index);
    }

    /**
     * Gets the total number of saved mementos in the history.
     * @return The size of the history.
     */
    public int getHistorySize() {
        return mementos.size();
    }
}
