package bb

class League {

	String abbrev
	String name
	String longname

	static hasMany = [ divisions:Division ]

	static constraints = {
	}

	String toString() {
		"${name}-${id}"
	}

}
