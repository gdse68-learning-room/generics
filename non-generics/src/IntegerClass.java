/*
    @author DanujaV
    @created 9/5/23 - 1:19 PM   
*/

public class IntegerClass {
    Integer obj;

    public IntegerClass(Integer obj) {
        this.obj = obj;
    }

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(this.getClass().getName() + ": " + this.obj);
    }
}
