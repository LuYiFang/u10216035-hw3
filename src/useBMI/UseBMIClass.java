package useBMI;
import java.awt.*;
import javax.swing.*;

class SetGUI extends JFrame{
	
	JPanel p1 = new JPanel();
	p1.setLayout(new GridLayout(4,3));
	
	for(int i = 1;i < 10; i++){
		p1.add(new JButton("" + i));
		p1.add(new JButton("clear"));
		p1.add(new JButton("" + 0));
		p1.add(new JButton("."));
		
	JPanel p2 = new JPanel();
	p2.setLayout(new GridLayout(2,1));
	p2.add(new JButton("backspace"));
	p2.add(new JButton("enter"));
	
	JPanel p3 = new JPanel();
	p3.setLayout(new GridLayout(1,3));
	p3.add(new JTextField("hight"));
	p3.add(new JTextField("weight"));
	p3.add(new JTextField("BMI"));
	}
}

public class UseBMIClass {
  public static void main(String[] args) {
	  SetGUI frame = new SetGUI();
	  frame.setSize(400,500);
	  frame.setTitle("BMI Calculator");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	  frame.setLocationRelativeTo(null);
	  
      BMI bmi1 = new BMI("John Doe", 18, 145, 70);
      System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());
    
      BMI bmi2 = new BMI("Peter King", 215, 70);
      System.out.println("The BMI for " + bmi2.getName() + " is "
        + bmi2.getBMI() + " " + bmi2.getStatus());
  }
}


class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237; 
    public static final double METERS_PER_INCH = 0.0254;  
  
    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }
  
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
    }
  
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND / 
        ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
    }
  
    public String getStatus() {
      double bmi = getBMI();
      if (bmi < 18.5)
        return "Underweight";
      else if (bmi < 25)
        return "Normal";
      else if (bmi < 30)
        return "Overweight";
      else
        return "Obese";
    }
    
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    public double getWeight() {
      return weight;
    }
  
    public double getHeight() {
      return height;
    }
}
