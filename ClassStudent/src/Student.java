public class Student
{
    public String name;
    public String department;
    public int age;
    public int studentID;
    public int GPA;

    //public Student(String name, String department, int studentID, int GPA, int age)
    //{
    //    this.name = name;
    //    this.department = department;
    //    this.studentID = studentID;
    //    this.GPA = GPA;
    //    this.age = age;
    //}

    public void displayInfo()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Department: " + department);
        System.out.println("Student GPA: " + GPA);
        System.out.println("Student Age: " + age);
    }

    public void changeName(String newName)
    {
        this.name = newName;
    }
    public void changeID (int newID)
    {
        this.studentID = newID;
    }
    public void changeDepartment(String newDep)
    {
        this.department = newDep;
    }
    public void changeGPA (int newGPA)
    {
        this.GPA = newGPA;
    }
    public void changeAge (int newAge)
    {
        this.age = newAge;
    }
}
