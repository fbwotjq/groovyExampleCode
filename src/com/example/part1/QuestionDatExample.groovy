package com.example.part1

/**
 * Created by KAKAO on 2016. 9. 23..
 */
class QuestionDatSample {

    QuestionDatInnerSample questionDatInnerSample

}

class QuestionDatInnerSample {

    def field1

}

def questionDatSample = new QuestionDatSample()
def varPrint = questionDatSample.questionDatInnerSample?.field1

println("=========== NO ASSIGN RESULT ===========")
println varPrint

questionDatSample.questionDatInnerSample = new QuestionDatInnerSample()
questionDatSample.questionDatInnerSample.field1 = 1
varPrint = questionDatSample.questionDatInnerSample?.field1

println("=========== YES ASSIGN RESULT ===========")
println varPrint
