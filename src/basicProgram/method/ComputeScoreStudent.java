package basicProgram.method;

public class ComputeScoreStudent {
    double getAverageScore(int[] scores){
        double total = 0.0;
        int count = scores.length;
        for (int i = 0; i < count; i++){
            total = total + scores[i];
        }
        double averageScore = total / count;
        return averageScore;
    }

    char computeGrade(double averageScore) {
        char grade;
        if (averageScore >= 80.0){
            grade = 'A';
        } else if (averageScore >= 60.0) {
            grade  = 'B';
        } else if (averageScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        ComputeScoreStudent obj = new ComputeScoreStudent();
        int[] studentScore = {55, 64, 75, 80, 65};
        double averageScore = obj.getAverageScore(studentScore);
        char grade = obj.computeGrade(averageScore);
        System.out.println("Average Score : " + averageScore);
        System.out.println("Grade : " + grade);

    }
}
