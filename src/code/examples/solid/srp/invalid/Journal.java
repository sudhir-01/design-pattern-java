package code.examples.solid.srp.invalid;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Following class is supposed to handle a journal which means just to add/remove journal from ArrayList. But we can see
 * it is also trying to save it to filesystem as well as trying to load from filesystem/url which is breaking the SRP as
 * the saving/loading should have been performed through a separate class so that if the new ways, of saving/loading
 * journal, come in future then that could be easily handled through the dedicated class
 *
 */

public class Journal
{
    private final List<String> entries = new ArrayList<>();

    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add("" + (++count) + ": " + text);
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
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}