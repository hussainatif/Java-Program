import java.util.ArrayList;
import java.util.Scanner;

 class Student {
    private String roll;
    private String name;
    private String age;
	private String stream;
	public Student(){}
   
    //Construct with four parameters
    public Student(String roll, String name, String age, String stream) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.stream = stream;
    }
    //Corresponding get/set methods
    public String getroll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getstream() {
        return stream;
    }

    public void setroll(String roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setstream(String stream) {
        this.stream = stream;
    }
}

public class DETS {

    public static void main(String[] args) {
        //Create a collection object to store student data
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("--------Welcome to the Student Management System--------");
            System.out.println("1.Add Students");
            System.out.println("2.Delete Students");
            System.out.println("3.Modify Students");
            System.out.println("4.View all students");
            System.out.println("5.Sign out");
            System.out.println("Please enter your choice:");

            Scanner in = new Scanner(System.in);//Standard Input
            String line = in.nextLine();//Get a line of string

            //Selection to complete operation with switch statement
            switch (line) {
                case "1":
                    System.out.println("Add Students");
                    addStudent(array);//Call the Add Student method to store data
                    break;
                case "2":
                    System.out.println("Delete Students");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("Modify Students");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("View all students");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("Thank you for using!");
                    System.exit(0);
            }
        }
    }

    //Customize a method for adding student information
    public static void addStudent(ArrayList<Student> array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a student roll number:");
        String roll = in.nextLine();
        System.out.println("Please enter the student name:");
        String name = in.nextLine();
        System.out.println("Please enter the student age:");
        String age = in.nextLine();
        System.out.println("Please enter the student's stream:");
        String stream = in.nextLine();

		Student s = new Student();
        s.setroll(roll);
        s.setName(name);
        s.setAge(age);
        s.setstream(stream);

        //Add students to the collection
        array.add(s);

        //Give hint to add successfully
        System.out.println("Add Student Success!");

    }

    //Customize a method to view student information
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("No information, Please add information and query!");
            return;
        }
        
        System.out.println("Roll No.\t Full name\t Age(Year)\t Stream");//Separate a character table for aesthetics, but not enough more
        //Remove data from the collection to display student information in a format supplemented by age.
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);//Since the data is stored, there is no data in the student object, so assign values using an array
            System.out.println(s.getroll() + "\t\t " + s.getName() + "\t\t " + s.getAge() + "\t\t " + s.getstream());//Called using the data method inside the student
        }

    }

    //Customize a method to delete students
     public static void deleteStudent(ArrayList<Student>array){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student roll number you want to delete:");
        String roll = in.nextLine();
        for(int i=0;i<array.size();i++){
            Student s = array.get(i); 
            if(s.getroll().equals(roll)){
                array.remove(i);
                break;
            }
        }
        System.out.println("Delete successful!");


    }

    //Customize a method to modify students
    public static void updateStudent(ArrayList<Student>array){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student roll number to be modified:");
        String roll = in.nextLine();

        System.out.println("Please enter the new name of the student:");
        String name = in.nextLine();
        System.out.println("Please enter the new age of the student:");
        String age = in.nextLine();
        System.out.println("Please enter the new stream for the student:");
        String stream = in.nextLine();

        //Create Student Object
        Student s = new Student();
        s.setroll(roll);
        s.setName(name);
        s.setAge(age);
        s.setstream(stream);

        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            if(student.getroll().equals(roll)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("Successfully modified!");
    }
}