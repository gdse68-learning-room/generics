/*
    @author DanujaV
    @created 9/5/23 - 1:23 PM   
*/

public class BooleanClass {
    Boolean obj;

    public BooleanClass(Boolean obj) {
        this.obj = obj;
    }

    public Boolean getObj() {
        return obj;
    }

    public void setObj(Boolean obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(this.getClass().getName() + ": " + this.obj);
    }
}
