package com.example.part1

int assignValue = 0;
int target = 3;
assignValue = target ?: 1 // ==> target 이 true에 해당하는 결과를 가져오면 target 값, 아니면 1 이 할당 된다.
println assignValue