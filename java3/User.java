package java3;



public class User {

private int id;
private String firstName;
private String lastName;
private int token;
private int creditcart;

public User() {
	
}
public User(int id,String firstName,String lastName,int token) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.token = token;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getToken() {
	return token;
}
public void setToken(int token) {
	this.token=token;
}
public int getCreditcart() {
	return creditcart;
}

public void setCreditcart(int creditcart) {
	this.creditcart = creditcart;
}

}