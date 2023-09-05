/*
    @author DanujaV
    @created 9/5/23 - 2:32 PM   
*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Numerical<Student, Integer, String> numerical1 = new Numerical<>(student, 20, "Kamal"); //since JDK1.5
        numerical1.print();


//        Numerical<Boy, Student, Integer> numerical2 = new Numerical<>("Kamal", student, 15);    //Illegal
    }
}
