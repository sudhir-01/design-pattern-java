package code.examples.solid.srp.valid;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

/**
 *
 * This class handles the responsibility of persisting objects. Hence, the Journal class will have a single responsibility
 * of handling Journal ONLY
 *
 */

public class Persistence
{
    public void saveToFile(Journal journal,
                           String filename, boolean overwrite) throws Exception
    {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
    }

    public void load(Journal journal, String filename) {}
    public void load(Journal journal, URL url) {}
}
