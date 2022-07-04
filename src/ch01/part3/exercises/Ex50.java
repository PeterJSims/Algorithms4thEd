package ch01.part3.exercises;

public class Ex50 {
    public static void main(String[] args) {
        // Functionality implemented in StackExercises.java
        StackExercises<Integer> stackToThrowException = new StackExercises<>();
        for (int i = 0; i < 5; i++) {
            stackToThrowException.push(i);
        }
        for (int i : stackToThrowException) { // Collection was edited during iteration as hoped
            stackToThrowException.push(3);
        }
    }
}
