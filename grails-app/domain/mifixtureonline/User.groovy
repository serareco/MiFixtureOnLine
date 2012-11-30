package mifixtureonline

class User {
	String email
	String name
	String lastname
	Date   birthDay
	int	   age
	
    static constraints = {
		email(blank:false, unique: true, email: true) 
    }
}
