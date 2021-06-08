import javax.swing.*;

public class SnackFrame extends JFrame {
    SnackFrame(){
        this.add(new SnackPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Snack");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
