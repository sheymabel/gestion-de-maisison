package Atelier6Ex2v0;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

public class ConnectionForm extends JFrame implements ActionListener{

	JTextField txtLogin = new JTextField();
	JTextField txtpwd = new JTextField();
	JLabel lbllogin = new JLabel ("Login");
	JLabel lblpwd = new JLabel ("Mot de passe");
	JButton btnconnecter = new JButton ("Se connecter");
	JButton btnInscrire = new JButton ("S'inscrire");
	File f = new File ("fusers.dat");
	public ConnectionForm ()
	{
		super ("Formulaire de connexion");
		setSize(350,200);
		JPanel p1 = new JPanel(new GridLayout(0,2));
		p1.add(lbllogin); p1.add(txtLogin);
		p1.add(lblpwd); p1.add(txtpwd);
		JPanel p2 = new JPanel();
		btnconnecter.addActionListener(this);
		btnInscrire.addActionListener(this);
		p2.add(btnconnecter);	p2.add(btnInscrire);
		getContentPane().add(p1);
		getContentPane().add(p2, BorderLayout.SOUTH);
		this.setLocation(500,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		JButton bt = (JButton) evt.getSource();
		Compte u1, u2; 
		boolean existe = false;
		if (bt.equals(btnconnecter)) {
		//A compléter
		}
		else
		{ 
			if (bt.equals(btnInscrire)) {
				//A compléter
			}
			
			
		}
	}
	
	public static void main(String []argv)
	{
		new ConnectionForm();
	}
	
}
