package book.alert.grails

import grails.compiler.GrailsCompileStatic
import groovy.transform.CompileStatic
import org.apache.tomcat.jni.User

import javax.persistence.JoinColumn

@GrailsCompileStatic
class BookUser {
    Integer id
    User user
    Book book
    Status status
    static hasMany = [users:  User, books: Book, status: Status]

    static mapping = {
        users joinTable: [column: 'user_id']
        books joinTable: [column: 'book_id']
        status joinTable: [column: 'status_id']

    }


    BookUser() {

    }

    BookUser(Integer id, User user, Book book, Status status) {
        this.id = id
        this.user = user
        this.book = book
        this.status = status
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    User getUser() {
        return user
    }

    void setUser(User user) {
        this.user = user
    }

    Status getStatus() {
        return status
    }

    void setStatus(Status status) {
        this.status = status
    }

    static getHasMany() {
        return hasMany
    }

    static void setHasMany(hasMany) {
        BookUser.hasMany = hasMany
    }


}
