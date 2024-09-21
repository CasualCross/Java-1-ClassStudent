import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Asanov Erlan", "Cybersecurity", 101101, 70, 19);
        Student student2 = new Student("Gambino Chiquita", "Computer Science", 909909, 75, 20);
        Student student3 = new Student("Sabre Lamarr", "Martial Arts", 808808, 80, 21);
        Student student4 = new Student();

        student1.displayInfo();
        System.out.println(" ");
        student2.displayInfo();
        System.out.println(" ");
        student3.displayInfo();
        System.out.println(" ");
        student4.displayInfo();
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 0 to exit, Enter 1-4 to change info, Enter 5 to display info");
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
            else if (userInput == 4)
            {
                changeData(student4, scanner);
            }
            else if(userInput == 5)
            {
                student1.displayInfo();
                System.out.println(" ");
                student2.displayInfo();
                System.out.println(" ");
                student3.displayInfo();
                System.out.println(" ");
                student4.displayInfo();
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
        student.setName(newName);

        System.out.println("Enter new department: ");
        String newDep = scanner.nextLine();
        student.setDepartment(newDep);

        System.out.println("Enter new age: ");
        int newAge = scanner.nextInt();
        student.setAge(newAge);

        System.out.println("Enter new GPA: ");
        int newGPA = scanner.nextInt();
        student.setGPA(newGPA);

        System.out.println("Enter new Student ID: ");
        int newID = scanner.nextInt();
        student.setStudentID(newID);
    }
}