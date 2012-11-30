package mifixtureonline

class League {
	String name
	String console
	String gameName
	static belongsTo = [Team]
	static hasMany = [teams:Team, matchs:Match]
	
    static constraints = {
    }
}
