package JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends JFrame {

    private JLabel nameLabel;
    private JLabel pathLabel;

    public Main() {

        setTitle("File Chooser Application");
        setSize(550, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton openButton = new JButton("Choose Java File");

        nameLabel = new JLabel("No file selected");
        pathLabel = new JLabel("File path will appear here");

        setLayout(new GridLayout(4, 1, 10, 10));

        add(openButton);
        add(nameLabel);
        add(pathLabel);

        openButton.addActionListener(e -> chooseFile());

    }

    private void chooseFile() {

        JFileChooser fc = new JFileChooser();

        fc.addChoosableFileFilter(new JavaFilter());
        fc.setAcceptAllFileFilterUsed(false);

        int result = fc.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fc.getSelectedFile();

            nameLabel.setText("File: " + file.getName());

            pathLabel.setText(
                "Path: " + file.getAbsolutePath()
            );

        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}