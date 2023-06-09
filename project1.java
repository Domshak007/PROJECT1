
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
}import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ElectricPotentialGUI implements ActionListener {
    
    JTextField textField1, textField2, textField3;
    JButton button;
    JLabel label;
    
    public ElectricPotentialGUI() {
        
        JFrame frame = new JFrame("Electric Potential Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textField1 = new JTextField("Enter charge (in Coulombs)", 20);
        textField2 = new JTextField("Enter distance (in meters)", 20);
        textField3 = new JTextField("Enter voltage (in volts)", 20);
        button = new JButton("Calculate Electric Potential");
        label = new JLabel("");
        
        button.addActionListener(this);
        
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button);
        frame.add(label);
        
        frame.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        double charge = Double.parseDouble(textField1.getText());
        double distance = Double.parseDouble(textField2.getText());
        double voltage = Double.parseDouble(textField3.getText());
        
        double electricPotential = voltage * distance / charge;
        
        label.setText("The electric potential is: " + electricPotential + " volts");
        
    }
    
    public static void main(String[] args) {
        
        new ElectricPotentialGUI();
        
    }
}
public class VelocityCalculator {
    public static double calculateVelocity(double initialVelocity, double acceleration, double time) {
        double velocity = initialVelocity + acceleration * time;
        return velocity;
    }
    
    public static double calculateDisplacement(double initialVelocity, double acceleration, double time) {
        double displacement = initialVelocity * time + 0.5 * acceleration * time * time;
        return displacement;
    }
    
    public static double calculateTime(double initialVelocity, double acceleration, double velocity) {
        double time = (velocity - initialVelocity) / acceleration;
        return time;
    }
    
    public static void main(String[] args) {
        double initialVelocity = 10.0;
        double acceleration = 2.0;
        double time = 5.0;
        
        double velocity = calculateVelocity(initialVelocity, acceleration, time);
        double displacement = calculateDisplacement(initialVelocity, acceleration, time);
        double calculatedTime = calculateTime(initialVelocity, acceleration, velocity);
        
        System.out.println("Velocity: " + velocity);
        System.out.println("Displacement: " + displacement);
        System.out.println("Time: " + calculatedTime);
    }
}
public class VelocityCalculator {
    public static double calculateVelocity(double initialVelocity, double acceleration, double time) {
        double velocity = initialVelocity + acceleration * time;
        return velocity;
    }
    
    public static double calculateDisplacement(double initialVelocity, double acceleration, double time) {
        double displacement = initialVelocity * time + 0.5 * acceleration * time * time;
        return displacement;
    }
    
    public static double calculateTime(double initialVelocity, double acceleration, double velocity) {
        double time = (velocity - initialVelocity) / acceleration;
        return time;
    }
    
    public static void main(String[] args) {
        double initialVelocity = 10.0;
        double acceleration = 2.0;
        double time = 5.0;
        
        double velocity = calculateVelocity(initialVelocity, acceleration, time);
        double displacement = calculateDisplacement(initialVelocity, acceleration, time);
        double calculatedTime = calculateTime(initialVelocity, acceleration, velocity);
        
        System.out.println("Velocity: " + velocity);
        System.out.println("Displacement: " + displacement);
        System.out.println("Time: " + calculatedTime);
    }
}



