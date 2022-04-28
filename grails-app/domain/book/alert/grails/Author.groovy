package book.alert.grails

class Author {
    Integer id;
    String name;

    List<Book> books;

    static hasMany = [books: Book]

    Author(List<Book> books) {
        this.books = books
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    List<Book> getBooks() {
        return books
    }

    void setBooks(List<Book> books) {
        this.books = books
    }

    static getHasMany() {
        return hasMany
    }

    static void setHasMany(hasMany) {
        Author.hasMany = hasMany
    }

    static getConstraints() {
        return constraints
    }

    static void setConstraints(constraints) {
        Author.constraints = constraints
    }

    static getMapping() {
        return mapping
    }

    static void setMapping(mapping) {
        Author.mapping = mapping
    }


    static constraints = {
        name nullable: false, blank: false
    }
    static mapping = {
        books(cascade: 'all-delete')
    }
}
