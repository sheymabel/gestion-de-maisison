package Atelier6Ex2v0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
public class Connexion implements Serializable{
	private Compte user;
	private  String date;
	public  static String fileLog="FileLogs3.dat"; 
	public Connexion (Compte u) throws FileNotFoundException, IOException, ClassNotFoundException {
		   //A compléter
	 }
	 
	 public String toString() {
		 return("User: " + user.getLogin() +  " Connection Date: " + date+   "\n");
	 }
}
