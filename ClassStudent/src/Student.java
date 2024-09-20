public class Student
{
    private String name;
    private String department;
    private int age;
    private int studentID;
    private int GPA;

    public Student(String name, String department, int studentID, int GPA, int age)
    {
        this.name = name;
        this.department = department;
        this.studentID = studentID;
        this.GPA = GPA;
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Department: " + department);
        System.out.println("Student GPA: " + GPA);
        System.out.println("Student Age: " + age);
    }

    public String getName()
    {
        return name;
    }
    public String getDepartment()
    {
        return department;
    }
    public int getAge()
    {
        return age;
    }
    public int getGpa()
    {
        return GPA;
    }
    public String getStudentID()
    {
        if(studentID > 99)
        {
            return String.valueOf(studentID);
        }
        else if(studentID > 9)
        {
            return String.format("%03d", studentID);
        }
        else
        {
            return String.format("%02d", studentID);
        }
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setDepartment(String newDepartment)
    {
        this.department = newDepartment;
    }
    public void setAge(int newAge)
    {
        if(newAge >= 18)
        {
            this.age = newAge;
        }
        else
        {
            System.out.println("Error! Age should be from 18+");
        }
    }
    public void setStudentID(int newStudentID)
    {
        if(newStudentID >= 1 && newStudentID <= 999)
        {
            this.studentID = newStudentID;
        }
        else
        {
            System.out.println("Error! StudentID should be in range: 1-999");
        }
    }
    public void setGPA(int newGPA)
    {
        if(newGPA >= 1 && newGPA <= 100)
        {
            this.GPA = newGPA;
        }
        else
        {
            System.out.println("Error! GPA should be 1-100");
        }
    }
}
