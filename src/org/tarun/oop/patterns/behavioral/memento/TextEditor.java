package org.tarun.oop.patterns.behavioral.memento;

/*
    originator
 */
public class TextEditor {
    private String text;

    public TextEditor() {

    }

    public String getText() {
        return this.text;
    }

    public TextEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.text();
    }

    @Override
    public String toString() {
        return "["+text+"]";
    }
}
