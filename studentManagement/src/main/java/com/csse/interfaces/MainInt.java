package com.csse.interfaces;

import java.awt.EventQueue;
import java.util.Properties;

import javax.swing.JFrame;

import com.csse.application.starter.ApplictionHandler;
import com.csse.common.utill.ApplicationConfig;
import com.csse.common.utill.Filehandler;
import com.csse.interfaces.payment.PaymentStudentUI;
import com.csse.admin.RestServer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class MainInt {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplictionHandler.start();
					MainInt window = new MainInt();
					window.frame.setVisible(true);
					
//					StudentRegistrationUI window = new StudentRegistrationUI();
//					/*MainInt window = new MainInt();*/
//					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PaymentStudentUI paymentStudentUI = new PaymentStudentUI();
				paymentStudentUI.setVisible(true);
			}
		});
		btnPayment.setBounds(306, 46, 89, 23);
		frame.getContentPane().add(btnPayment);

		JButton btnRegistration_1 = new JButton("Registration");
		btnRegistration_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentRegistrationUI studentRegistrationUI = new StudentRegistrationUI();
				studentRegistrationUI.frame.setVisible(true);
			}
		});
		btnRegistration_1.setBounds(39, 46, 99, 23);
		frame.getContentPane().add(btnRegistration_1);
	}
}
