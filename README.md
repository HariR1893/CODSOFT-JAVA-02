# CODSOFT-JAVA-DEVELOPMENT-TASK 2
Repository showcasing my completed projects and tasks during my Java Development internship at CODSOFT. 
Here, you'll find the code and documentation for the various assignments and projects I worked on, demonstrating my growth and skills as a Java intern at CODSOFT.

## Task 2
### STUDENT GRADE CALCULATOR
- Input: Take marks obtained (out of 100) in each subject.
- Calculate Total Marks: Sum up the marks obtained in all subjects.
- Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
- Grade Calculation: Assign grades based on the average percentage achieved.
- Display Results: Show the total marks, average percentage, and the corresponding grade to the user

## Approach Overview

The Student Grade Calculator program is designed to calculate the average percentage and assign grades based on the marks obtained by a student in each subject. The approach can be broken down into the following steps:

1. **Input:** The program starts by taking the number of subjects as input from the user. For each subject, the program prompts the user to enter the marks obtained (out of 100).

2. **Calculate Total Marks:** The program calculates the total marks obtained by summing up the marks obtained in all subjects.

3. **Calculate Average Percentage:** The total marks are divided by the total number of subjects to calculate the average percentage achieved by the student. This value is then converted to a percentage.

4. **Grade Calculation:** Using a series of if statements, the program determines the corresponding grade based on the calculated average percentage. The grade is assigned as follows:
   - A: >= 90%
   - B: >= 80% and < 90%
   - C: >= 70% and < 80%
   - D: >= 60% and < 70%
   - E: >= 50% and < 60%
   - F: < 50%

5. **Display Results:** The program displays the following results to the user:
   - Total marks obtained
   - Average mark percentage
   - Corresponding grade based on the average percentage

This program provides a simple way to evaluate a student's performance and provide instant feedback regarding their grade. It showcases basic input handling, mathematical calculations, and conditional logic to achieve its purpose.



## Getting Started

Follow these steps to get your Java project up and running on your local machine.

### Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) [Download](https://www.oracle.com/java/technologies/javase-downloads.html)
- Git (for cloning the repository) [Download](https://git-scm.com/downloads)

#### After installation
-Clone or download this repository to your local machine.
-Open the `NumberGussingGame.java` file in any Java IDE to run the code.

## Usage

Follow these steps to play the Number Guessing Game in Java.

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/your-repository-name.git
   cd your-repository-name
   ```
### After Cloning the source code
1. Compile the java program
   ` javac GradeCalculator.java`
2. Run the program
   `java GradeCalculator`
3. Enter Mark
   -The program will prompt you to enter the number of subjects for which you want to calculate grades.
   -For each subject, enter the marks obtained out of 100 when prompted.
4. View Results
   -After entering the marks for all subjects, the program will calculate and display the following:
   -Total marks obtained across all subjects.
   -Average mark percentage based on the entered marks.
   -Corresponding grade based on the calculated average percentage.
5. Try Different Input
   -Feel free to run the program with various sets of marks to see how the grades change based on the average percentage achieved.
6. Exit The Program
   -The program will display the results and then close automatically.
   -You can re-run the program to calculate grades for different sets of marks.

Feel free to modify the code and customize the ranges, maximum attempts, and other settings to tailor the game to your preferences.

Note: Make sure you have the Java Development Kit (JDK) installed on your system before running the program.
