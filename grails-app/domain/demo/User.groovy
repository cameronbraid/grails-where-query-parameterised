package demo

class User {

	String username
	String country
	
	static belongsTo = [
		category:Category
	]

    static constraints = {
    }
}
