package com.example.part1

import groovy.transform.EqualsAndHashCode

class Inner1Class {
    def name1;
}

class Inner2Class {
    def name2;
}

@EqualsAndHashCode
class WrarpperClass {
    Inner1Class inner1Class
    Inner2Class inner2Class
}

def map1 = [:]
def map2 = [:]
def map3 = [:]

map1[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq1"))] = 1
map1[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq2"))] = 2
map1[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq3"))] = 3

map2[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq1"))] = 4
map2[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq2"))] = 5
map2[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq4"))] = 6

map3[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq1"))] = 7
map3[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq2"))] = 8
map3[new WrarpperClass(inner1Class: new Inner1Class(name1: "fbwotjq"), inner2Class: new Inner2Class(name2: "fbwotjq5"))] = 9

Set mapSet = (map1.keySet() + map2.keySet() + map3.keySet()) as Set

mapSet.each {
    WrarpperClass wrarpperClass ->
        def varmap1 = map1[wrarpperClass]
        def varmap2 = map2[wrarpperClass]
        def varmap3 = map3[wrarpperClass]

        println "$wrarpperClass.inner1Class.name1 $wrarpperClass.inner2Class.name2 $varmap1 $varmap2 $varmap3"
}