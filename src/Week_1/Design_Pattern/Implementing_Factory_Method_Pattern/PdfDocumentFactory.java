package Week_1.Design_Pattern.Implementing_Factory_Method_Pattern;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}