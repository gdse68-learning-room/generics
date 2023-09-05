/*
    @author DanujaV
    @created 9/5/23 - 1:29 PM   
*/

public class CommonClass <T> {
    T obj;

    public CommonClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(this.getClass().getName() + ": " + this.obj);
    }
}
