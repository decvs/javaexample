package user;

public class User {
	private String name;
	private String password;
	private int position;
	
	public User(String aname, String apassword, int aposition) {
		this.name = aname;
		this.password = apassword;
		this.position = aposition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public void anzeigen() {
		System.out.println("Hallo, mein Vorname ist:" + name +".");
        System.out.println("mein Passwort lautet:" + password);
        System.out.println("Ich stehe an der Position:" + position);	
	}
}
