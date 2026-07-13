package Week_1.Design_Pattern.Implementing_Factory_Method_Pattern;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Word document opened.");
    }
}