package mifixtureonline

class Match {
	def teamsMap = [L:Team,V:Team] 
	def goalsMap = [L:'-',V:'-']
	boolean penaltiesDefinition
	def yellowCardMap = [L:'-',V:'-']
	def redCardMap = [L:'-',V:'-']
	def penaltiesGoalsMap = [L:'-',V:'-']
	
    static constraints = {
    }
}
