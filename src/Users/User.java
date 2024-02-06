package Users;

import Database.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Exception.InvalidCredintial;

public  class User {
	public int id;
	public String name;
	public String email;
	protected Connection connect;
	static ConnectionDB db = new ConnectionDB();

	public User() {
		try {
			connect = db.load();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public User(int id, String name, String email) {
		this.id = id;
		this.email = email;
		this.name = name;
		try {
			connect = db.load();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
