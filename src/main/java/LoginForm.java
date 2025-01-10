import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel principalPanel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton sendButton;

    public LoginForm() {
        initForm();
        sendButton.addActionListener(actionEvent -> validation());
    }

    private void initForm() {
        setContentPane(principalPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void validation() {
        var user = this.userText.getText();
        var password = new String(this.passwordText.getPassword());
        if ("root".equals(user) && "admin".equals(password))
            showMessage("Valid Credentials. Welcome!");
        else if ("root".equals(user))
            showMessage("Incorrect Password. Try again!");
        else if ("admin".equals(password))
            showMessage("Incorrect Username. Try again!");
        else
            showMessage("Invalid Credentials. Try again!");
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
