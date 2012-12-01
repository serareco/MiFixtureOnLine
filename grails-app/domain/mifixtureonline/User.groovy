package mifixtureonline

class User extends SecUser{
	String email
	String name
	String lastname
	Date   birthDay
	int	   age
	
    static constraints = {
		email(blank:false, unique: true, email: true) 
    }
}
