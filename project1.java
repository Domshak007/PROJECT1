
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
import java.util.Scanner;

public class Force {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double mass, acceleration, force;
      
      System.out.print("Enter mass (kg): ");
      mass = sc.nextDouble();
      
      System.out.print("Enter acceleration (m/s^2): ");
      acceleration = sc.nextDouble();
      
      force = mass * acceleration;
      
      System.out.println("Force = " + force + " N");
   }
}
import javax.swing.*;

public class ForceGUI {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Force Calculator");
      JPanel panel = new JPanel();
      JLabel massLabel = new JLabel("Enter mass (kg):");
      JTextField massField = new JTextField(10);
      JLabel accelerationLabel = new JLabel("Enter acceleration (m/s^2):");
      JTextField accelerationField = new JTextField(10);
      JButton calculateButton = new JButton("Calculate");
      JLabel resultLabel = new JLabel("Force = ");
      JTextField resultField = new JTextField(10);
      resultField.setEditable(false);
      
      panel.add(massLabel);
      panel.add(massField);
      panel.add(accelerationLabel);
      panel.add(accelerationField);
      panel.add(calculateButton);
      panel.add(resultLabel);
      panel.add(resultField);
      
      frame.add(panel);
      frame.pack();
      frame.setVisible(true);
      
      calculateButton.addActionListener(event -> {
         double mass = Double.parseDouble(massField.getText());
         double acceleration = Double.parseDouble(accelerationField.getText());
         double force = mass * acceleration;
         resultField.setText(Double.toString(force) + " N");
      });
   }
}
import java.util.Scanner;

public class WorkDone {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double force, displacement, workDone;
      
      System.out.print("Enter force (N): ");
      force = sc.nextDouble();
      
      System.out.print("Enter displacement (m): ");
      displacement = sc.nextDouble();
      
      workDone = force * displacement;
      
      System.out.println("Work done = " + workDone + " J");
   }
}
import javax.swing.*;

public class WorkDoneGUI {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Work Done Calculator");
      JPanel panel = new JPanel();
      JLabel forceLabel = new JLabel("Enter force (N):");
      JTextField forceField = new JTextField(10);
      JLabel displacementLabel = new JLabel("Enter displacement (m):");
      JTextField displacementField = new JTextField(10);
      JButton calculateButton = new JButton("Calculate");
      JLabel resultLabel = new JLabel("Work done = ");
      JTextField resultField = new JTextField(10);
      resultField.setEditable(false);
      
      panel.add(forceLabel);
      panel.add(forceField);
      panel.add(displacementLabel);
      panel.add(displacementField);
      panel.add(calculateButton);
      panel.add(resultLabel);
      panel.add(resultField);
      
      frame.add(panel);
      frame.pack();
      frame.setVisible(true);
      
      calculateButton.addActionListener(event -> {
         double force = Double.parseDouble(forceField.getText());
         double displacement = Double.parseDouble(displacementField.getText());
         double workDone = force * displacement;
         resultField.setText(Double.toString(workDone) + " J");
      });
   }
}
import java.util.Scanner;

public class ElectricPotentialEnergy {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double charge1, charge2, distance, electricPotentialEnergy, k;
      
      System.out.print("Enter charge 1 (C): ");
      charge1 = sc.nextDouble();
      
      System.out.print("Enter charge 2 (C): ");
      charge2 = sc.nextDouble();
      
      System.out.print("Enter distance between charges (m): ");
      distance = sc.nextDouble();
      
      k = 8.99e9; // Coulomb's constant
      electricPotentialEnergy = k * charge1 * charge2 / distance;
      
      System.out.println("Electric potential energy = " + electricPotentialEnergy + " J");
   }
}
