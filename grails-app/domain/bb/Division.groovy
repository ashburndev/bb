package bb

class Division {

	String abbrev
	String name
	String longname

	static hasMany = [ teams:Team ]

	static belongsTo = [ league:League ]

	static constraints = {
	}

	String toString() {
		"${name}-${id}"
	}

}
