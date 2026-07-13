package Week_1.Design_Pattern.Implementing_Factory_Method_Pattern;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF document opened.");
    }
}