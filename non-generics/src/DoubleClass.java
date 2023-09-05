/*
    @author DanujaV
    @created 9/5/23 - 1:24 PM   
*/

public class DoubleClass {
    Double obj;

    public DoubleClass(Double obj) {
        this.obj = obj;
    }

    public Double getObj() {
        return obj;
    }

    public void setObj(Double obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(this.getClass().getName() + ": " + this.obj);
    }
}
