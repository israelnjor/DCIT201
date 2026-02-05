public class Main {

    public static void main(String[] args) {
      
    }
    static void executeGradeReport(double score) {
      if(!validateScore(score)) {
        System.out.println("Ivalid Score");
        return;
      }
      char grade = calculateLetterGrade(score);
      displayPerfomanceMessage(grade);
    }

    private boolean validateScore(double score) {
        retrun score >= 0 && score <= 100;
    }

    private char calculateLetterGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return "F";
    }

    private void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A' : System.out.println("Excellent!"); break;
            case 'B': System.out.println("Good job!"); break;
            case 'C': System.out.println("Fair effort!"); break;
            case 'D': System.out.println("Needs improvement"); break;
            case 'F': System.out.println("Failing. Try harder!"); break;
            default: System.out.println("Unknown grade."); break;
        }
    }
    public static void main(String[] args {
        GradeReport report = new GradeReport();
        report.execueGradeReport(85);
    }
}
    
