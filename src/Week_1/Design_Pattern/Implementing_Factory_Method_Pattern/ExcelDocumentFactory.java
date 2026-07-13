package Week_1.Design_Pattern.Implementing_Factory_Method_Pattern;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}