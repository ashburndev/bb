package bb

class Team {

	String abbrev
	String name
	String longname

	static hasMany = [ players:Player ]

	static belongsTo = [ division:Division ]

	static constraints = {
	}

	String toString() {
		"${name}-${id}"
	}

}
