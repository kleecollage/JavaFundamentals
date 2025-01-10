import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyForm extends JFrame {
    private JPanel principalPanel;
    private JTextField inputText;
    private JLabel replicatorLabel;

    public MyForm() {
        initForm();
//        inputText.addActionListener(actionEvent -> {
//            replicateText();
//        });

        inputText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicateText();
            }
        });
    }

    private void initForm() {
        setContentPane(principalPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // centered window
    }

    private void replicateText() {
        this.replicatorLabel.setText( this.inputText.getText());
    }

    public static void main (String[] args) {
        FlatDarculaLaf.setup(); // dark mode
        MyForm myForm = new MyForm();
        myForm.setVisible(true);
    }
}
