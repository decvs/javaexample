package user;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UserManager {
	private ArrayList<User> UserList = new ArrayList<User>();
	
	public void AddUser(){
		
		String name;
		String password;
		String pos;
		int position;
		
		name = JOptionPane.showInputDialog("Username:");
		password = JOptionPane.showInputDialog("Passwort:");
		pos = JOptionPane.showInputDialog("An welcher Stelle willst du stehen?:");
		position = Integer.parseInt(pos);


		// neues user objekt
		User newUser = new User(name, password, position);
		// in der liste aufnehmen
		this.UserList.add(newUser); 
	}

	public void ListUser() {
		for(User usr: UserList){
			usr.anzeigen();
		}
	}

}
