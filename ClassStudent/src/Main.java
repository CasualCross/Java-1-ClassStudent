import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.name = "Asanov Erlan";
        student1.department = "Cybersecurity";
        student1.studentID = 101101;
        student1.GPA = 70;
        student1.age = 19;

        Student student2 = new Student();
        student2.name = "Gambino Chiquita";
        student2.department = "Computer Science";
        student2.studentID = 909909;
        student2.GPA = 75;
        student2.age = 20;

        Student student3 = new Student();
        student3.name = "Sabre Lamarr";
        student3.department = "Martial Arts";
        student3.studentID = 808808;
        student3.GPA = 80;
        student3.age = 21;

        student1.displayInfo();
        System.out.println(" ");
        student2.displayInfo();
        System.out.println(" ");
        student3.displayInfo();
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 0 to exit, Enter 1-3 to change info, Enter 4 to display info");
            int userInput = scanner.nextInt();
            if (userInput == 0)
            {
                break;
            }
            else if (userInput == 1)
            {
                changeData(student1, scanner);
            }
            else if (userInput == 2)
            {
                changeData(student2, scanner);
            }
            else if (userInput == 3)
            {
                changeData(student3, scanner);
            }
            else if(userInput == 4)
            {
                student1.displayInfo();
                System.out.println(" ");
                student2.displayInfo();
                System.out.println(" ");
                student3.displayInfo();
                System.out.println(" ");
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }

    public static void changeData(Student student, Scanner scanner)
    {
        scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        student.changeName(newName);

        System.out.println("Enter new department: ");
        String newDep = scanner.nextLine();
        student.changeDepartment(newDep);

        System.out.println("Enter new age: ");
        int newAge = scanner.nextInt();
        student.changeAge(newAge);

        System.out.println("Enter new GPA: ");
        int newGPA = scanner.nextInt();
        student.changeGPA(newGPA);

        System.out.println("Enter new Student ID: ");
        int newID = scanner.nextInt();
        student.changeID(newID);
    }
}