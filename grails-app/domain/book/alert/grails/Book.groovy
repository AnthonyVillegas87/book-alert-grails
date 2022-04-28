package book.alert.grails

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Book {
    Integer id
    String title
    String description
    Date releaseDate
    String itunesUrl
    String artworkUrl
    Author author
    long externalId
    List<BookUser> bookUser


    static belongsTo = Author
    static hasMany = [authors: Author, bookUser: BookUser]

    static mapping = {
        authors joinTable: [name: "author_books", key: 'book_id']
    }

    static constraints = {
        title(nullable: false, maxSize: 100)
        description(nullable: false, maxSize: 10000)
        releaseDate format: 'yyyy-MM-dd'
        itunesUrl(url: true)
        artworkUrl(url: true)

    }

    Book() {

    }

    Book(Integer id, String title, String description, Date releaseDate, String itunesUrl, String artworkUrl, Author author, long externalId, List<BookUser> bookUser) {
        this.id = id
        this.title = title
        this.description = description
        this.releaseDate = releaseDate
        this.itunesUrl = itunesUrl
        this.artworkUrl = artworkUrl
        this.author = author
        this.externalId = externalId
        this.bookUser = bookUser
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    Date getReleaseDate() {
        return releaseDate
    }

    void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate
    }

    String getItunesUrl() {
        return itunesUrl
    }

    void setItunesUrl(String itunesUrl) {
        this.itunesUrl = itunesUrl
    }

    String getArtworkUrl() {
        return artworkUrl
    }

    void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl
    }

    Author getAuthor() {
        return author
    }

    void setAuthor(Author author) {
        this.author = author
    }

    long getExternalId() {
        return externalId
    }

    void setExternalId(long externalId) {
        this.externalId = externalId
    }

    List<BookUser> getBookUser() {
        return bookUser
    }

    void setBookUser(List<BookUser> bookUser) {
        this.bookUser = bookUser
    }

    static getConstraints() {
        return constraints
    }

    static void setConstraints(constraints) {
        Book.constraints = constraints
    }
}
