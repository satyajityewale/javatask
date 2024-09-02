import java.util.Scanner;

public class StudentGradeCalculator 
{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter total number of subject to calculate
        System.out.println("Enter total number of subject:");
        int numSubjects = scan.nextInt();

        int totalMarks =0;

        for (int i=0; i<numSubjects; i++)
        {
            System.out.print("Enter marks for subject" + i + "(out of 100):");
            int marks = scan.nextInt();

            //input validation
        while(marks <0 || marks > 100){
            System.out.println("Invalid marks. Pleasw enter marks between 0 & 100.");
            System.out.println("Enter marks for subject "+ i +"out of 100");
            marks = scan.nextInt();

        }
        totalMarks += marks;
        }
        
        System.out.println("Student Result:");
        System.out.println("Total marks obtained in all subjects: " + totalMarks);
        

        // calculate average percentage

        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("Average percentage: "+AveragePercentage);

        // grade

        if(AveragePercentage >=90){
            System.out.println("Your grade is : A+");
        }
        else if(AveragePercentage >=80){
            System.out.println("Your grade is : A");
        }
        else if(AveragePercentage >=70){
            System.out.println("Your grade is : B+");
        }
        else if(AveragePercentage >=60){
            System.out.println("Your grade is : B");
        }
        else if(AveragePercentage >=50){
            System.out.println("Your grade is : C+");
        }
        else if(AveragePercentage >=40){
            System.out.println("Your grade is : C");
        }
        else if(AveragePercentage >=30){
            System.out.println("Your grade is : D");
        }
        else{
            System.out.println("Your grade is : F");
        }

        scan.close();
    }
}
