import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name ? ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        byte age = Byte.parseByte(JOptionPane.showInputDialog("What is your age ? "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        float height = Float.parseFloat(JOptionPane.showInputDialog(null,"What is your height ? "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}
