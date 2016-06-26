package user;

import javax.swing.JOptionPane;

public class StartUp {

	public static void main(String[] args) {
		
		UserManager usrManager = new UserManager();
		int result = JOptionPane.YES_OPTION;
		
		while(result == JOptionPane.YES_OPTION){
			usrManager.AddUser();
			result = JOptionPane.showConfirmDialog(null, "Weiteren Benutzer eingeben");
		}
		
		usrManager.ListUser();

	}

}
