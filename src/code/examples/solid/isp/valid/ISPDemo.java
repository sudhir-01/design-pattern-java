package code.examples.solid.isp.valid;

/**
 * In this example, we have three interfaces: Printable, Faxable, and Scanable. These interfaces define specific actions
 * that a class can perform. According to the Interface Segregation Principle, clients should not be forced to depend on
 * interfaces they do not use or need.
 * The AllInOnePrinter class implements all three interfaces: Printable, Faxable, and Scanable. It provides implementations
 * for all the methods defined in those interfaces. This is appropriate if a class needs to fulfill all those responsibilities.
 * On the other hand, the FaxMachine class only implements the Faxable interface, as it is only concerned with faxing functionality.
 * Similarly, the Scanner class only implements the Scanable interface.
 * By segregating the interfaces based on specific responsibilities, we ensure that classes only depend on the interfaces
 * that are relevant to their functionality. This promotes a clean and focused design, allowing classes to be easily composed and reused.
 */

interface Printable {
    void print();
}

interface Faxable {
    void fax();
}

interface Scanable {
    void scan();
}

class AllInOnePrinter implements Printable, Faxable, Scanable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

class FaxMachine implements Faxable {
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

class Scanner implements Scanable {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class ISPDemo {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.fax();
        printer.scan();

        FaxMachine faxMachine = new FaxMachine();
        faxMachine.fax();

        Scanner scanner = new Scanner();
        scanner.scan();
    }
}
