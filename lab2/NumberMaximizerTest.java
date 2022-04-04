package lab2;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumberMaximizerTest {

    // the class under test
    private NumberMaximizer numberMaximizer;
    private int input;
    private int expected;
    private static Object[][] testcases;

    // constructor
    public NumberMaximizerTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass: Initialize some expensive resources");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass: Finish all tests");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before testing");
        // initialize an instance
        numberMaximizer = new NumberMaximizer();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After testing");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() throws IOException {
        String file_path = new File("").getAbsolutePath() + "/src/lab2/testinput.txt";
        LinkedList<String> lines = null;

        lines = readLines(file_path);
        int size = lines.size();
        testcases = new Object[size][];

        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).split(",");
            int num = Integer.parseInt(words[0]);
            int res = Integer.parseInt(words[1]);
            testcases[i] = new Object[]{num, res};
        }
        return Arrays.asList(testcases);
    }

    @Test
    public void maximum() {
        System.out.printf("input %d expect %d \n", this.input, this.expected);
        assertEquals(this.expected, this.numberMaximizer.maximum(this.input));
    }

    /*
    * read lines from a file
    * */
    public static LinkedList<String> readLines(String fsrc) throws IOException {
        try (InputStream in = new FileInputStream(fsrc);
             Reader reader = new InputStreamReader(in, "UTF-8");
             // LineNumberReader should be built on other streams
             LineNumberReader lineReader = new LineNumberReader(reader);) {
            String line = lineReader.readLine();
            LinkedList<String> lines = new LinkedList<>();
            while (line != null) {
                lines.add(line);
                line = lineReader.readLine();
            }
            return lines;
        }
    }

}

