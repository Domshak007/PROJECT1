
import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mass, velocity, kineticEnergy;

        System.out.print("Enter mass (kg): ");
        mass = sc.nextDouble();

        System.out.print("Enter velocity (m/s): ");
        velocity = sc.nextDouble();

        kineticEnergy = 0.5 * mass * velocity * velocity;

        System.out.println("Kinetic Energy = " + kineticEnergy + " J");
    }
}
import javax.swing.*;

public class KineticEnergyGUI {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Kinetic Energy Calculator");
      JPanel panel = new JPanel();
      JLabel massLabel = new JLabel("Enter mass (kg):");
      JTextField massField = new JTextField(10);
      JLabel velocityLabel = new JLabel("Enter velocity (m/s):");
      JTextField velocityField = new JTextField(10);
      JButton calculateButton = new JButton("Calculate");
      JLabel resultLabel = new JLabel("Kinetic energy = ");
      JTextField resultField = new JTextField(10);
      resultField.setEditable(false);
      
      panel.add(massLabel);
      panel.add(massField);
      panel.add(velocityLabel);
      panel.add(velocityField);
      panel.add(calculateButton);
      panel.add(resultLabel);
      panel.add(resultField);
      
      frame.add(panel);
      frame.pack();
      frame.setVisible(true);
      
      calculateButton.addActionListener(event -> {
         double mass = Double.parseDouble(massField.getText());
         double velocity = Double.parseDouble(velocityField.getText());
         double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
         resultField.setText(Double.toString(kineticEnergy) + " J");
      });
   }
}
