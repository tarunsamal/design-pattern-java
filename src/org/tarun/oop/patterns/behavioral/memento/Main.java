package org.tarun.oop.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextCareTaker careTaker = new TextCareTaker();

        editor.setText("A");
        careTaker.saveState(editor);
        System.out.println(editor);

        editor.setText("B");
        careTaker.saveState(editor);
        System.out.println(editor);

        editor.setText("C");
        System.out.println(editor);

        System.out.println("UNDO->");
        careTaker.undo(editor);
        System.out.println(editor);

        System.out.println("REDO->");
        careTaker.redo(editor);
        System.out.println(editor);

    }
}
