/*
    @author DanujaV
    @created 9/5/23 - 2:32 PM   
*/

public class Numerical <T1 extends Human, T2 extends Number, T3>{
    T1 obj1;
    T2 obj2;
    T3 obj3;

    public Numerical(T1 obj1, T2 obj2, T3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void print() {
        System.out.println(obj1 + " - " + obj2);
    }
}
