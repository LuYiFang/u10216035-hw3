package useBMI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BMICalculator extends JFrame{
	  
	  private static JTextField jtfHeight = new JTextField();
	  private static JTextField jtfWeight = new JTextField();
	  private static JTextField jtfBMI = new JTextField();
	  private static JTextField jtfStatus = new JTextField();
	  private static JButton bt1 = new JButton("1");
	  private static JButton bt2 = new JButton("2");
	  private static JButton bt3 = new JButton("3");
	  private static JButton bt4 = new JButton("4");
	  private static JButton bt5 = new JButton("5");
	  private static JButton bt6 = new JButton("6");
	  private static JButton bt7 = new JButton("7");
	  private static JButton bt8 = new JButton("8");
	  private static JButton bt9 = new JButton("9");
	  private static JButton bt0 = new JButton("0");
	  private static JButton btpoint = new JButton(".");
	  private static JButton btclear = new JButton("clear");
	  private static JButton btback = new JButton("backspace");
	  private static JButton btenter = new JButton("enter");
	
	  public BMICalculator(){
		  JPanel p3 = new JPanel(new GridLayout(2,4));
		  p3.add(new JLabel("Weight(in pounds)"));
		  p3.add(new JLabel("Height(in inches)"));
		  p3.add(new JLabel("BMI"));
		  p3.add(new JLabel("Status"));
		  p3.add(jtfWeight);
		  p3.add(jtfHeight);
		  p3.add(jtfBMI);
		  p3.add(jtfStatus);
		  
		  JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(4,3));		
			p1.add(bt1);
			p1.add(bt2);
			p1.add(bt3);
			p1.add(bt4);
			p1.add(bt5);
			p1.add(bt6);
			p1.add(bt7);
			p1.add(bt8);
			p1.add(bt9);
			p1.add(btclear);
			p1.add(bt0);
			p1.add(btpoint);	
			
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(2,1));
			p2.add(btback);
			p2.add(btenter);
			
			add(p1,BorderLayout.SOUTH);
			add(p2,BorderLayout.EAST);
			add(p3,BorderLayout.CENTER);
			
			bt1.addActionListener(new UseBMIClass());
			bt2.addActionListener(new UseBMIClass());
			bt3.addActionListener(new UseBMIClass());
			bt4.addActionListener(new UseBMIClass());
			bt5.addActionListener(new UseBMIClass());
			bt6.addActionListener(new UseBMIClass());
			bt7.addActionListener(new UseBMIClass());
			bt8.addActionListener(new UseBMIClass());
			bt9.addActionListener(new UseBMIClass());
			bt0.addActionListener(new UseBMIClass());
			btpoint.addActionListener(new UseBMIClass());
			btclear.addActionListener(new UseBMIClass());
			btback.addActionListener(new UseBMIClass());
			btenter.addActionListener(new UseBMIClass());
			
			
}

private static class UseBMIClass  implements ActionListener{
  public static void main(String[] args) {
	  BMICalculator frame = new BMICalculator();
	  frame.setSize(700,400);
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
  @Override
  public void actionPerformed(ActionEvent e){
	  
	  String hinput = jtfHeight.getText();
	  String winput = jtfWeight.getText();
	  if(e.getSource() == bt1){
		  jtfHeight.setText(hinput + "1");
		  jtfWeight.setText(winput + "1");
	  }else if(e.getSource() == bt2){
		  jtfHeight.setText(hinput + "2");
		  jtfWeight.setText(winput + "2");
	  }else if(e.getSource() == bt3){
		  jtfHeight.setText(hinput + "3");
		  jtfWeight.setText(winput + "3");
	  }else if(e.getSource() == bt4){
		  jtfHeight.setText(hinput + "4");
		  jtfWeight.setText(winput + "4");
	  }else if(e.getSource() == bt5){
		  jtfHeight.setText(hinput + "5");
		  jtfWeight.setText(winput + "5");
	  }else if(e.getSource() == bt6){
		  jtfHeight.setText(hinput + "6");
		  jtfWeight.setText(winput + "6");
	  }else if(e.getSource() == bt7){
		  jtfHeight.setText(hinput + "7");
		  jtfWeight.setText(winput + "7");
	  }else if(e.getSource() == bt8){
		  jtfHeight.setText(hinput + "8");
		  jtfWeight.setText(winput + "8");
	  }else if(e.getSource() == bt9){
		  jtfHeight.setText(hinput + "9");
		  jtfWeight.setText(winput + "9");
	  }else if(e.getSource() == bt0){
		  jtfHeight.setText(hinput + "0");
		  jtfWeight.setText(winput + "0");
	  }else if(e.getSource() == btpoint){
		  jtfHeight.setText(hinput + ".");
		  jtfWeight.setText(winput + ".");
	  }else if(e.getSource() == btclear){
		  jtfHeight.setText("");
		  jtfWeight.setText("");
	  }
	  
	  double height = Double.parseDouble(jtfHeight.getText());
	  double weight = Double.parseDouble(jtfWeight.getText());
	  
	  BMI bmi = new BMI(weight,height);
	  
	  jtfBMI.setText(String.format("%2f",bmi.getBMI()));
	  jtfStatus.setText(String.format(bmi.getStatus()));
  }
  }
}	  



class BMI {
	
    public BMI(double weight,double height){
    	this.weight = weight;
        this.height = height;
    }
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
