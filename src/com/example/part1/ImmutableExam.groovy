package com.example.part1

import groovy.transform.Immutable

@Immutable class FixedBook {                         // #1 AST annotation
    String title
}
def gina   = new FixedBook('Groovy in Action')       // #2 positional ctor
def regina = new FixedBook(title:'Groovy in Action') // #3 named arg ctor
assert gina.title == 'Groovy in Action'
assert gina == regina
try {
    gina.title = "Oops!"
    assert false, "should not reach here"
} catch (ReadOnlyPropertyException e) {
    e.printStackTrace()
}