package com.example.part1

println("START PART1 EXAMPLE..")
Book gina = new Book('Groovy in Action')
assert gina.getTitle()         == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'
String getTitleBackwards(book) {
    String title = book.getTitle()
    return title.reverse()
}

class BookBean {
    String title                                // #1 Property declaration
}

def groovyBook = new BookBean()
groovyBook.setTitle('Groovy conquers the world')   // #2 Property use with explicit method
assert groovyBook.getTitle() == 'Groovy conquers the world' // #2
groovyBook.title = 'Groovy in Action'           // #3 Property use with Groovy shortcuts
assert groovyBook.title == 'Groovy in Action'   // #3