import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dimas
 */

public class Layout_Kalkulator {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Calculator - Julhan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Mengatur layout manager
        frame.setLayout(new BorderLayout());

        // Membuat JTextField dan menambahkannya ke frame
        JTextField displayField = new JTextField();
        frame.add(displayField, BorderLayout.NORTH);

        // Membuat panel untuk tombol-tombol
        JPanel buttonPanel = new JPanel(new GridLayout(3, 6));

        // Menambahkan tombol-tombol ke panel
        String[] buttons = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String text : buttons) {
            buttonPanel.add(new JButton(text));
        }

        // Menambahkan panel tombol ke frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Menampilkan frame
        frame.setVisible(true);
    }
}