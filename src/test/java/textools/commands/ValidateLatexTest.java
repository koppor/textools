package textools.commands;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ValidateLatexTest {

    @Test
    public void testRules() throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/errors.tex"));

        Map<Pattern, String> compiledRules = ValidateLatex.getCompiledRules();

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);

            List<String> violatedRules = new ArrayList<>();
            for (Map.Entry<Pattern, String> entry : compiledRules.entrySet()) {

                Matcher matcher = entry.getKey().matcher(line);
                while (matcher.find()) {
                    violatedRules.add(entry.getValue());
                }

            }

            assertEquals("line #" + i + " violates rules " + violatedRules, 1, violatedRules.size());
        }
    }
}