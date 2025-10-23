package org.tarun.oop.patterns.behavioral.memento;

import java.util.Stack;

/*
    Caretaker
 */
public class TextCareTaker {

    private Stack<TextMemento> undoStack = new Stack<>();
    private Stack<TextMemento> redoStack = new Stack<>();

    public void saveState(TextEditor editor) {
        undoStack.push(editor.save());
        redoStack.clear();
    }

    public void undo(TextEditor editor){
        if (undoStack.isEmpty()){
            return;
        }
        redoStack.push(editor.save());
        editor.restore(undoStack.pop());
    }

    public void redo(TextEditor editor){
        if (redoStack.isEmpty()) {
            return;
        }
        undoStack.push(editor.save());
        editor.restore(redoStack.pop());

    }
}
