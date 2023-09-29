class Student{
    String Name;
    int Age;

    public void printInfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }

    Student(String name, int age){
        this.Name = name;
        this.Age = age;
    }
}

public class parameterConstructor {
    public static void main(String args[]) {
        Student s1 = new Student("dhuj", 22);
        s1.printInfo();
    }
}
