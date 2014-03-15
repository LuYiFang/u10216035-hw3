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
	  private static JButton btenter = new JButton("enter");
	
	  public BMICalculator(){
		  JPanel p3 = new JPanel(new GridLayout(1,4));
		  p3.add(jtfHeight);
		  p3.add(jtfWeight);
		  p3.add(jtfBMI);
		  p3.add(jtfStatus);
		  
		  JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(4,3));
			
			for(int i = 1;i < 10; i++){
				p1.add(new JButton("" + i));
			}	
			p1.add(new JButton("clear"));
			p1.add(new JButton("" + 0));
			p1.add(new JButton("."));	
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(2,1));
			p2.add(new JButton("backspace"));
			p2.add(new JButton("enter"));
			
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
			btenter.addActionListener(new UseBMIClass());
			
			
}

private static class UseBMIClass  implements ActionListener{
  public static void main(String[] args) {
	  BMICalculator frame = new BMICalculator();
	  frame.setSize(500,400);
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
	  
	  String input = jtfHeight.getText();
	  
	  if(e.getSource() == bt1){
		  jtfHeight.setText(input + "1");
	  }else if(e.getSource() == bt2){
		  jtfHeight.setText(input + "2");
	  }else if(e.getSource() == bt3){
		  jtfHeight.setText(input + "3");
	  }else if(e.getSource() == bt4){
		  jtfHeight.setText(input + "4");
	  }else if(e.getSource() == bt5){
		  jtfHeight.setText(input + "5");
	  }else if(e.getSource() == bt6){
		  jtfHeight.setText(input + "6");
	  }else if(e.getSource() == bt7){
		  jtfHeight.setText(input + "7");
	  }else if(e.getSource() == bt8){
		  jtfHeight.setText(input + "8");
	  }else if(e.getSource() == bt9){
		  jtfHeight.setText(input + "9");
	  }else if(e.getSource() == bt0){
		  jtfHeight.setText(input + "0");
	  }else if(e.getSource() == btpoint){
		  jtfHeight.setText(input + ".");
	  }else if(e.getSource() == btclear){
		  jtfHeight.setText(input + "");
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
