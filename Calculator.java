import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Subject A (out of 100):");
        float subjectA = input.nextFloat();
        
        System.out.println("Subject B (out of 100):");
        float subjectB = input.nextFloat();

        System.out.println("Subject C (out of 100):");
        float subjectC = input.nextFloat();
        
        float total = subjectA+subjectB+subjectC;
        float percentage = total/3;
        
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + percentage);
       
        if (percentage >= 80 && percentage == 100)
        {
            System.out.println("Grade = A");
        }
        else if (percentage >= 60)
        {
            System.out.println("Grade = B");
        }
        else if (percentage >= 30)
        {
            System.out.println("Grade = C");
        }
        
        else
        {
            System.out.println("Grade = D");
        }
        System.out.println("\nGrade chart : ");
        System.out.println("========================================================");
        System.out.println("80 - 100% = A = Very Good");
        System.out.println("60 - 79% = B = Good");
        System.out.println("30 - 69% = C = Average");
        System.out.println("below 30% = D = Fail"); 
    }
}