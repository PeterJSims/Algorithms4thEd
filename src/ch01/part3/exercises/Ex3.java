package ch01.part3.exercises;

public class Ex3 {
    public static void main(String[] args) {
//        COULD THESE OCCUR VIA STACK CALLS TO PUSH AND POP FOR NUMBERS 0 - 9 (IN ORDER)?

//        a. 4 3 2 1 0 9 8 7 6 5 : YES - PUSH 0 - 4, POP ALL, PUSH 5 - 9, POP ALL
//        b. 4 6 8 7 5 3 2 9 0 1 : NO , 0 AND 1 WOULD HAVE TO BE THE REVERSE ORDER
//        c. 2 5 6 7 4 8 9 3 1 0 : YES, AN ORDER EXISTS FOR THIS
//        d. 4 3 2 1 0 5 6 7 8 9 : YES, PUSH THE FIRST FIVE NUMBERS THEN PUSH AND POP ONE AT A TIME
//        e. 1 2 3 4 5 6 9 8 7 0 : YES, PUSH 0 - 6, POP 6 - 1, ADD REMAINDER, POP THE REST
//        f. 0 4 6 5 3 8 1 7 2 9 : NO - 1 WOULD BE UNREACHABLE AT THE POINT OF THE POP CALL
//        g. 1 4 7 9 8 6 5 3 0 2 : NO, 0 WOULD BE UNREACHABLE. 0 AND 2 WOULD HAVE TO BE REVERSED
//        h. 2 1 4 3 6 5 8 7 9 0 : YES, AN ORDER EXISTS FOR THIS

    }
}