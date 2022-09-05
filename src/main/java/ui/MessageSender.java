package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.BasicConfigurator;

import helper.XMLConvert;
import object.Person;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class MessageSender extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageSender frame = new MessageSender();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MessageSender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbSend = new JLabel("Send Message");
		lbSend.setForeground(new Color(64, 0, 128));
		lbSend.setHorizontalAlignment(SwingConstants.CENTER);
		lbSend.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbSend.setBackground(new Color(128, 128, 192));
		lbSend.setBounds(0, 0, 631, 45);
		contentPane.add(lbSend);
		
		JTextArea inputMessage = new JTextArea();
		inputMessage.setForeground(new Color(128, 128, 128));
		inputMessage.setFont(new Font("Monospaced", Font.PLAIN, 14));
		inputMessage.setBounds(40, 45, 560, 94);
		contentPane.add(inputMessage);
		
		JButton btnSend = new JButton("Send");
		btnSend.setForeground(new Color(255, 128, 0));
		btnSend.setBackground(new Color(64, 0, 128));
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnSend.setBounds(500, 163, 100, 35);
		contentPane.add(btnSend);
	}
}
