package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        PrintSpooler spooler1 = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance();

        spooler1.printDocument("Report.pdf");
        spooler2.printDocument("Invoice.docx");

        System.out.println(spooler1 == spooler2);
    }
}