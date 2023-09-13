/*
 * 					TASK 2. STUDENT GRADE CALCULATOR
 * 
 * 1. Input: Take marks obtained (out of 100) in each subject.
 * 2. Calculate Total Marks: Sum up the marks obtained in all subjects.
 * 3. Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
      average percentage.
 * 4. Grade Calculation: Assign grades based on the average percentage achieved.
 * 5. Display Results: Show the total marks, average percentage, and the corresponding grade to the user
 * 
 */

package Grade_Calculator;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// Scanner for getting the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("STUDENT GRADE CALCLATOR");

		// Ask the user to enter number of subjects
		System.out.println("Enter number of subjects");
		// Initialize the totalMark is 0 and get the NumOfSubj from user
		int totalMark = 0;
		int NumOfSubj = sc.nextInt();
		// Using Loop we can iterate number of times based on the number of subject
		for (int i = 1; i <= NumOfSubj; i++) {
			System.out.print("Enter the Mark obtained in Subject " + i + " : ");

			// Assign marks for every subject and calculate the total mark
			int mark = sc.nextInt();
			totalMark += mark;
			System.out.println();
		}
		// Find the averagePercentage
		// Type cast the totalMark and NumOfSubj which is integer to double
		double AverageMarkPercentage = (double) totalMark / (NumOfSubj * 100) * 100;

		char Grade;

		// using if statements assign the respective Grades to the percentage
		if (AverageMarkPercentage >= 90) {
			Grade = 'A';
		} else if (AverageMarkPercentage >= 80) {
			Grade = 'B';
		} else if (AverageMarkPercentage >= 70) {
			Grade = 'C';
		} else if (AverageMarkPercentage >= 60) {
			Grade = 'D';
		} else if (AverageMarkPercentage >= 50) {
			Grade = 'E';
		} else {
			Grade = 'F';
		}
		// Display the totalMark, AveragePercentage and Grade of the student
		System.out.println("Total Number of Mark: " + totalMark);
		System.out.println("Average Mark Percentage: " + AverageMarkPercentage);
		System.out.println("Your Grade: " + Grade);

		sc.close();
	}
}
