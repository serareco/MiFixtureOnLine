package mifixtureonline

class Team {
	String name
	String namePlayTeam
	static hasMany = [players:Player]
	
    static constraints = {
    }
}
