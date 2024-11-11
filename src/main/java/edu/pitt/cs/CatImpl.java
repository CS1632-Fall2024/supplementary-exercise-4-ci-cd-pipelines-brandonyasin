package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private boolean isRented = false;
	private int id;
	private String name;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		// TODO: Fill in
		this.isRented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		this.isRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return name;
	}

	public int getId() {
		// TODO: Fill in
		return id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + id + ". " + name;
	}

}