package code.examples.solid.srp.valid;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * This class has a single responsibility to manage the Journals
 *
 */

public class Journal
{
    private final List<String> entries = new ArrayList<>();

    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add((++count) + ": " + text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // here we break SRP
    public void save(String filename) throws Exception
    {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(this);
        }
    }

}