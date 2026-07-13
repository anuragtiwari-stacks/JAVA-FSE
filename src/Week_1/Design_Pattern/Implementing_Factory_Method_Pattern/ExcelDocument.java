package Week_1.Design_Pattern.Implementing_Factory_Method_Pattern;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Excel document opened.");
    }
}