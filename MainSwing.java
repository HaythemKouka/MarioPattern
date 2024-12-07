import javax.swing.*;
import java.awt.*;

public class MainSwing extends JFrame {
    private Mario mario;
    private JTextArea outputArea;
    private JLabel imageLabel;

    public MainSwing() {
        mario = new Mario();
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        setTitle("Mario Game");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 2));

        JButton jumpButton = new JButton("Jump");
        JButton runButton = new JButton("Run");
        JButton takeDamageButton = new JButton("Take Damage");
        JButton bigMarioButton = new JButton("Become Big Mario");
        JButton invincibleMarioButton = new JButton("Become Invincible Mario");
        JButton fireMarioButton = new JButton("Add Fire Flower");

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        updateImage("ressources/normal_mario.png"); // Default image

        jumpButton.addActionListener(e -> {
            mario.jump();
            updateOutput("Mario jumps.");
            updateImage("ressources/jump.png");
        });

        runButton.addActionListener(e -> {
            mario.run();
            updateOutput("Mario runs.");
            updateImage("ressources/Run.jpg");
        });

        takeDamageButton.addActionListener(e -> {
            mario.takeDamage();
            updateOutput("Mario takes damage.");
            updateImage("ressources/TakeDamage.jpg");
        });

        bigMarioButton.addActionListener(e -> {
            mario.setState(new BigMario());
            updateOutput("Mario becomes Big Mario.");
            updateImage("ressources/BigMario.png");
        });

        invincibleMarioButton.addActionListener(e -> {
            mario.setState(new InvincibleMario());
            updateOutput("Mario becomes Invincible.");
            updateImage("ressources/BecomesInvincible.png");
        });

        fireMarioButton.addActionListener(e -> {
            mario = new FireMario(mario);
            updateOutput("Mario gets Fire Flower.");
            updateImage("ressources/AddFireFlower.jpg");
        });

        buttonPanel.add(jumpButton);
        buttonPanel.add(runButton);
        buttonPanel.add(takeDamageButton);
        buttonPanel.add(bigMarioButton);
        buttonPanel.add(invincibleMarioButton);
        buttonPanel.add(fireMarioButton);
        

        add(new JScrollPane(outputArea), BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }

    private void updateOutput(String action) {
        outputArea.append(action + "\n");
    }

    private void updateImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainSwing gameUI = new MainSwing();
            gameUI.setVisible(true);
        });
    }
}