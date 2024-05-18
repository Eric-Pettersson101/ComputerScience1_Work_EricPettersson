import java.util.Arrays;

public class DriverExamDemo {
    public static void main(String[] args) {
        char[] studentAnswers = {'B', 'c', 'A', 'B', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
        Eric_Pettersson_DriverExam exam = new Eric_Pettersson_DriverExam(studentAnswers);
        
        System.out.println("Did student pass: " + exam.passed());
        System.out.println("Total correct answers: " + exam.totalCorrect());
        System.out.println("Total incorrect answers: " + exam.totalIncorrect());
        System.out.println("Questions missed: " + Arrays.toString(exam.questionsMissed()));
    }
}
