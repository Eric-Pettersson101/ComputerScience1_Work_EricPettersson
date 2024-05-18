public class Eric_Pettersson_DriverExam {
    private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    private char[] studentAnswers;

    public Eric_Pettersson_DriverExam(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed() {
        return totalCorrect() >= 15;
    }

    public int totalCorrect() {
        int correctCount = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == studentAnswers[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }

    public int totalIncorrect() {
        return correctAnswers.length - totalCorrect();
    }

    public int[] questionsMissed() {
        int[] missedQuestions = new int[totalIncorrect()];
        int missedIndex = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] != studentAnswers[i]) {
                missedQuestions[missedIndex] = i+1;
                missedIndex++;
            }
        }
        return missedQuestions;
    }
}
