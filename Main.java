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
