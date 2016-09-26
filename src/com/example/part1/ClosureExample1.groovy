package com.example.part1

//(1..10).each { println it }

//lines = ['a','b','c','d']
//def printer = { line -> println line }

def benchmark(repeat, Closure worker) {
    repeat.times{worker(it)}
}

step1 = benchmark(3) {(int) it / 2 }
step2 = benchmark(3) { it.intdiv(2) }

print step1
print step2