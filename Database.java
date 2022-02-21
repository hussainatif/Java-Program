import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    //School Number
    private String sid;
    //Full name
    private String name;
    //Age
    private String age;
    //Residence
    private String address;
    //Construction method
    public Student() {//Shortcut: Alt+Insert with none of the parameters selected. Selection packages are parameterless constructs
    }
    //Construct with four parameters
    public Student(String sid, String name, String age, String address) {//Hold down Shift Select All Construct Method with Four Parameters
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Corresponding get/set methods, shortcut keys all selected
    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
	public String getAddress() {
        return address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class StudentManage {

    //Define the main interface
    public static void main(String[] args) {
        //Create a collection object to store student data
        ArrayList<Student> array = new ArrayList<Student>();
        //Return to the main interface again with a loop, repeat the entire operation, but cannot exit
        while (true) {
            //Complete main interface writing with output statement
            System.out.println("--------Welcome to the Student Management System--------");
            System.out.println("1.Add Students");
            System.out.println("2.Delete Students");
            System.out.println("3.Modify Students");
            System.out.println("4.View all students");
            System.out.println("5.Sign out");
            System.out.println("Please enter your choice:");

            //Keyboard Entry Using Scanner
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
                    System.exit(0);//Virtual machine exit (entire program exit)
            }
        }
    }

    //Customize a method for adding student information
    public static void addStudent(ArrayList<Student> array) {
        //Keyboard records the data required by the student object, displays prompts, prompts for what information to enter
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a student number:");
        String sid = in.nextLine();
        System.out.println("Please enter the student name:");
        String name = in.nextLine();
        System.out.println("Please enter the student age:");
        String age = in.nextLine();
        System.out.println("Please enter the student's residence:");
        String address = in.nextLine();

        //Create a student object and assign keyboard data to member variables of the student object
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //Add students to the collection
        array.add(s);

        //Give hint to add successfully
        System.out.println("Add Student Success!");

    }

    //Customize a method to view student information
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {//If the length of the array is zero, there is no data in the array
            System.out.println("No information, Please add information and query!");
            return;//To stop the program from executing down
        }
        //Display header information
        System.out.println("School Number\t\t Full name\t\t\t Age\t\t Residence");//Separate a character table for aesthetics, but not enough more
        //Remove data from the collection to display student information in a format supplemented by age.
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);//Since the data is stored, there is no data in the student object, so assign values using an array
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "year\t" + s.getAddress());//Called using the data method inside the student
        }

    }

    //Customize a method to delete students
     public static void deleteStudent(ArrayList<Student>array){
        //Use the keyboard to enter the deleted student number and prompt for information
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student number you want to delete:");
        String sid = in.nextLine();//Accept data entered by keyboard

        //Traversing a collection loop matching student numbers will delete corresponding students from the collection
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);//The loop matches one data at a time until it matches the number we entered and then deletes, which is equivalent to scanning
            if(s.getSid().equals(sid)){
                array.remove(i);
                break;//Stop matching when found
            }
        }
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
                    System.exit(0);//Virtual machine exit (entire program exit)
            }
        }
    }

    //Customize a method for adding student information
    public static void addStudent(ArrayList<Student> array) {
        //Keyboard records the data required by the student object, displays prompts, prompts for what information to enter
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a student number:");
        String sid = in.nextLine();
        System.out.println("Please enter the student name:");
        String name = in.nextLine();
        System.out.println("Please enter the student age:");
        String age = in.nextLine();
        System.out.println("Please enter the student's residence:");
        String address = in.nextLine();

        //Create a student object and assign keyboard data to member variables of the student object
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //Add students to the collection
        array.add(s);

        //Give hint to add successfully
        System.out.println("Add Student Success!");

    }

    //Customize a method to view student information
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {//If the length of the array is zero, there is no data in the array
            System.out.println("No information, Please add information and query!");
            return;//To stop the program from executing down
        }
        //Display header information
        System.out.println("School Number\t\t Full name\t\t\t Age\t\t Residence");//Separate a character table for aesthetics, but not enough more
        //Remove data from the collection to display student information in a format supplemented by age.
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);//Since the data is stored, there is no data in the student object, so assign values using an array
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "year\t" + s.getAddress());//Called using the data method inside the student
        }

    }

    //Customize a method to delete students
     public static void deleteStudent(ArrayList<Student>array){
        //Use the keyboard to enter the deleted student number and prompt for information
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student number you want to delete:");
        String sid = in.nextLine();//Accept data entered by keyboard

        //Traversing a collection loop matching student numbers will delete corresponding students from the collection
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);//The loop matches one data at a time until it matches the number we entered and then deletes, which is equivalent to scanning
            if(s.getSid().equals(sid)){
                array.remove(i);
                break;//Stop matching when found
            }
        }
     //Give a successful deletion hint
        System.out.println("Delete successful!");


    }

    //Customize a method to modify students
    public static void updateStudent(ArrayList<Student>array){
        //Use the keyboard to enter the modified student number and prompt for information
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student number to be modified:");
        String sid = in.nextLine();//Accept data entered by keyboard

        //Keyboard entry of student information to be modified
        System.out.println("Please enter the new name of the student:");
        String name = in.nextLine();//Enter new data to be modified
        System.out.println("Please enter the new age of the student:");
        String age = in.nextLine();
        System.out.println("Please enter the new residence for the student:");
        String address = in.nextLine();

        //Create Student Object
        Student s = new Student();//Assigned to student objects, replaced with corresponding data after matching
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //Traversing a collection loop matching student numbers will modify the corresponding students from the collection
        for(int i=0;i<array.size();i++){
            Student student = array.get(i);//The loop matches one data at a time until it matches the number we entered and then modifies it, which is equivalent to scanning
            if(student.getSid().equals(sid)){
                array.set(i,s);//Delete the specified location to insert the specified element
                break;//Stop matching when found
            }
        }
        //Give a successful deletion hint
        System.out.println("Successfully modified!");

    }


}
