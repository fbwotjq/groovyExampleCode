package com.example.part1

def totalClinks = 0
def partyPeople = 100

1.upto(partyPeople) { guestNumber ->
    clinksWithGuest = guestNumber - 1
    totalClinks += clinksWithGuest
    println(guestNumber)
}

assert totalClinks == (partyPeople * (partyPeople-1)) / 2
println(totalClinks)
