package mifixtureonline



import grails.test.mixin.*

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testCreate() {
		Date fecha = new Date()
		User user = new User(
		   email: 'sergio_areco@hotmail.com',
		   name: 'Sergio',
		   lastname: 'Areco',
		   birthDay: fecha,
		   age: 25)
		assert 'sergio_areco@hotmail.com' == user.email
		assert 'Sergio' == user.name
		assert 'Areco' == user.lastname
		assert 25 == user.age
		assert 1 == user.birthDay.date
    }
}
