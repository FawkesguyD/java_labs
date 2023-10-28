package org.example.lab24.ex3;

public class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        content = "";
    }

    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    public void edit(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }
}
