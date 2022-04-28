package book.alert.grails

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Status {
    Integer id

    List<BookUser> bookUserList
    static hasMany = [status: Status]

    String name


    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    List<BookUser> getBookUserList() {
        return bookUserList
    }

    void setBookUserList(List<BookUser> bookUserList) {
        this.bookUserList = bookUserList
    }

    static getHasMany() {
        return hasMany
    }

    static void setHasMany(hasMany) {
        Status.hasMany = hasMany
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }
}
