package _03_02;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    // Return true if the percentage is higher than or equal to 60.
    // Otherwise return false.
    return percentage >= 60 ? true : false;
  }

  public char getGrade(int percentage) {
    // If the percentage is 90 or above, return 'A'.
    // If it's 80-89, return 'B'.
    // If it's 70-79, return 'C'.
    // If it's 60-69, return 'D'.
    // If it's less than 60, return 'F'.
    char grade;
    if (percentage >= 90) {
      grade = 'A';
    } else if (percentage >= 80) {
      grade = 'B';
    } else if (percentage >= 70) {
      grade = 'C';
    } else if (percentage >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    return grade;
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    // If percentage is less than 60 and allowedToRetake is true, return a String
    // that says "The student has been entered for a retake."
    // If percentage is less than 60 and allowedToRetake is false, return a String
    // that says "The student is not allowed to retake this exam."
    // If percentage is 60 or higher, return a String that says "A retake is not
    // required."
    String retakeMsg;
    if (percentage >= 60) {
      retakeMsg = "A retake is not required.";
    } else {
      if (allowedToRetake) {
        retakeMsg = "The student has been entered for a retake.";
      } else {
        retakeMsg = "The student is not allowed to retake this exam.";
      }
    }
    return retakeMsg;
  }

}
