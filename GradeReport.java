public class GradeReport {
   public GradeReport() {
   }

   public void executeGradeReport(double var1) {
      if (!this.validateScore(var1)) {
         System.out.println("Ivalid Score");
      } else {
         char var3 = this.calculateLetterGrade(var1);
         this.displayPerformanceMessage(var3);
      }
   }

   private boolean validateScore(double var1) {
      return var1 >= 0.0 && var1 <= 100.0;
   }

   private char calculateLetterGrade(double var1) {
      if (var1 >= 90.0) {
         return 'A';
      } else if (var1 >= 80.0) {
         return 'B';
      } else if (var1 >= 70.0) {
         return 'C';
      } else if (var1 >= 60.0) {
         return 'D';
      } else {
         return (char)(var1 >= 50.0 ? 'E' : 'F');
      }
   }

   private void displayPerformanceMessage(char var1) {
      switch (var1) {
         case 'A':
            System.out.println("Excellent!");
            break;
         case 'B':
            System.out.println("Good job!");
            break;
         case 'C':
            System.out.println("Fair effort!");
            break;
         case 'D':
            System.out.println("Needs improvement");
            break;
         case 'E':
            System.out.println("Poor performance!");
            break;
         case 'F':
            System.out.println("Failing. Try harder!");
            break;
         default:
            System.out.println("Unknown grade.");
      }

   }
    
}
