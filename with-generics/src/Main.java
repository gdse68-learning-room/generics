/*
    @author DanujaV
    @created 9/5/23 - 1:19 PM   
*/

public class Main {
    public static void main(String[] args) {
        CommonClass<Integer> cc1 = new CommonClass<Integer>(10);
        cc1.print();

        CommonClass<Boolean> cc2 = new CommonClass<Boolean>(true);
        cc2.print();

        CommonClass<Double> cc3 = new CommonClass<Double>(10.5);
        cc3.print();

        CommonClass<String> cc4 = new CommonClass<String>("Kamal");
        cc4.print();
    }
}
