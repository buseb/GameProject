package gameProject.entities.concretes;

import gameProject.entities.abstracts.Entity;

public class Player implements Entity {
	public long nationalId;
	public String firstname;
	public String lastname;
	public int dateOfBirth;
	
	public Player ( ) {}
	
	public Player(long nationalId, String firstname, String lastname, int dateOfBirth) {
		super();
		this.nationalId = nationalId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
	}
	public long getNationalId() {
		return nationalId;
	}
	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
}
