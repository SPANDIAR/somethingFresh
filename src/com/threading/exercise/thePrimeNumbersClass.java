package com.threading.exercise;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class thePrimeNumbersClass extends JFrame implements Runnable, ActionListener{
	
	primeNumberIdentifier listOfPrimes;
	JLabel labelText;
	JTextField primeRange;
	JButton getPrimes;
	JTextArea primeZone;
	Thread go;

	public thePrimeNumbersClass() {
		// TODO Auto-generated constructor stub
		
		super();
		this.setTitle("Prime Number Sequence");
		//this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		labelText = new JLabel("Enter the range for Prime Numbers: ");
		this.add(labelText);
		
		primeRange = new JTextField(5);
		//primeRange.setSize(100, 30);
		this.add(primeRange);
		
		getPrimes = new JButton("Get Prime No's");
		this.add(getPrimes);
		getPrimes.addActionListener(this);
		
		
		primeZone = new JTextArea(8, 30);
		//primeZone.setSize(300, 300);
		primeZone.setLineWrap(true);
		this.add(primeZone);
		
		FlowLayout layoutManager = new FlowLayout();
		this.setLayout(layoutManager);
		this.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("I am here");
		
		if(primeRange.getText().isEmpty()) {
			primeZone.repaint();
			primeZone.append("Hello there!!! Please enter a range for the Prime Numbers");
			//primeRange.setF
		} else 
			//if (go==null) 
			{
			go = new Thread(this);
			go.start();
		} 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am inside Run" + primeRange.getText());
		int range = Integer.parseInt(primeRange.getText());
		listOfPrimes = new primeNumberIdentifier();
		ArrayList<Integer> primeNumberList = listOfPrimes.primeNumberIdentifier(range);
		
		primeZone.setText(null);
		for(Integer primeNos: primeNumberList) {
			
			primeZone.append(primeNos + " ");
		}
		go.stop();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new thePrimeNumbersClass();

	}

}
