package bb

class Player {

	String abbrev
	String name
	String longname

	static belongsTo = [ team:Team ]

	static constraints = {
	}

	String toString() {
		"${name}-${id}"
	}

}
