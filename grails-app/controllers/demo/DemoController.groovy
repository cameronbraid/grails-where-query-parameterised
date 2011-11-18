package demo

import javax.persistence.criteria.Order;

class DemoController {

	def index() {
		def mainCategory = Category.findAllByName("main").get(0)
		def q = User.where { category == mainCategory }.sort("username", "desc")
		def users = q.list()
		render "Found ${users.size()} users"
	}

	def index2() {
		def mainCategory = Category.findAllByName("main").get(0)
		def q = User.where { username != 'test' && category == mainCategory }.sort("username", "desc")
		def users = q.list()
		render "Found ${users.size()} users"
	}

}
