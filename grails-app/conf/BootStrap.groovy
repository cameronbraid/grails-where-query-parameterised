import demo.User
import demo.Category

class BootStrap {

    def init = { servletContext ->
			def mainCategory = new Category(name:'main').save(failOnError: true)
			new User(username:'u', country:"AU", category:mainCategory).save(failOnError: true)
    }
    def destroy = {
    }
}
