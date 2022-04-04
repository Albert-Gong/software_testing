package lab5;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.io.*;
import java.util.*;

public class StudentLoader {
    private LinkedHashMap<String, String> student_info;
    private String file_name;

    public StudentLoader(String file_name) {
        this.student_info = new LinkedHashMap<>();
        this.file_name = file_name;
    }

    public LinkedHashMap<String, String> load_stu_info() throws IOException {
        this.student_info = new LinkedHashMap<>();

        LinkedList<String> lines = readLines(this.file_name);
        lines.removeFirst();
        for (String line : lines) {
            line = line.trim();
            String[] tokens = line.split(",");
            this.student_info.put(tokens[0], tokens[1]);
        }

        return this.student_info;
    }


    private LinkedList<String> readLines(String fsrc) throws IOException {

        try (InputStream in = new FileInputStream(fsrc);
             Reader reader = new InputStreamReader(in, "UTF-8");
             // LineNumberReader 必须在其他流基础上构建
             LineNumberReader lineReader = new LineNumberReader(reader);) {
            String line = lineReader.readLine();
            LinkedList<String> lines = new LinkedList<String>();
            while (line != null) {
                lines.add(line);
                line = lineReader.readLine();
            }
            return lines;
        }
    }

    public static void main(String[] args) {
        String file_name = "/Users/albert/Codings/JavaProject/Software_Testing/cn/edu/tju/se/testing/src/lab5/user_info.csv";
        StudentLoader studentLoader = new StudentLoader(file_name);
        LinkedHashMap<String, String> res = null;
        try {
            res = studentLoader.load_stu_info();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator it = res.keySet().iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = res.get(key);
            System.out.println(key + " " + value);
        }


    }
}
