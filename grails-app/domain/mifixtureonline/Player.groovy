package mifixtureonline

class Player {
	User user
	static belongsTo = [Team]
	static hasMany = [teams:Team]
	
    static constraints = {
    }
}
