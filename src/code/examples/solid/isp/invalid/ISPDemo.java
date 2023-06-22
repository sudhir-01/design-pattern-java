package code.examples.solid.isp.invalid;

interface Machine
{
    void print();
    void fax();
    void scan();
}

/**
 * In case we need to create a multi-function printer, we can easily implement the Machine interface and we are good to go
 */
class MultiFunctionPrinter implements Machine {

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


/**
 * In below example, we had to create an old-fashioned printer which can just print but since we implemented the Machine
 * interface, hence, we must provide implementation for all the methods which is obviously not what we wanted. Here comes
 * the Interface Segregation Principle which says that we can segregate interfaces so that a class will implement only
 * required interfaces
 */
class OldFashionedPrinter implements Machine {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void fax() {
        //throw Exception("Can't fax!")
    }

    @Override
    public void scan() {
        //throw Exception("Can't scan!")
    }
}

public class ISPDemo {
    public static void main(String[] args) {

    }
}
