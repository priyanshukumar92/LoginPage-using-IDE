import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        // Create panel and layout
        JPanel panel = new JPanel();
        panel.setLayout(null); // Absolute layout for simplicity
        frame.add(panel);

        // Title
        JLabel titleLabel = new JLabel("Login Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(120, 20, 200, 30);
        panel.add(titleLabel);

        // Username label and field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 80, 180, 25);
        userText.setToolTipText("Enter your username");
        panel.add(userText);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 120, 180, 25);
        passwordText.setToolTipText("Enter your password");
        panel.add(passwordText);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 170, 100, 30);
        panel.add(loginButton);

        // Action on login click
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
