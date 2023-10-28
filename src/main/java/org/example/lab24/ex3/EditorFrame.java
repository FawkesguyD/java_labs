package org.example.lab24.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorFrame extends JFrame implements ActionListener {
    private ICreateDocument documentFactory;
    private IDocument currentDocument;

    public EditorFrame(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        initializeUI();
    }

    private void initializeUI() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        newMenuItem.setActionCommand("New");

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        openMenuItem.setActionCommand("Open");

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        saveMenuItem.setActionCommand("Save");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);
        exitMenuItem.setActionCommand("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setTitle("Text Editor");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New":
                currentDocument = documentFactory.createNew();
                currentDocument.open();
                break;
            case "Open":
                currentDocument = documentFactory.createOpen();
                currentDocument.open();
                break;
            case "Save":
                if (currentDocument != null) {
                    currentDocument.save();
                }
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new TextDocumentFactory();
        EditorFrame editorFrame = new EditorFrame(textDocumentFactory);
        editorFrame.setVisible(true);
    }
}
