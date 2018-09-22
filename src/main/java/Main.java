import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\rusri\\IdeaProjects\\lexan\\src\\main\\java\\Program.txt");
        String text = FileUtils.readFileToString(file);

        MyLexicalAnalyzer analyzer = new MyLexicalAnalyzer();

        while (text != null) {
            text = StringUtils.strip(text, " \t");
            String[] res = analyzer.GetNextLexicalAtom(text);
            text = res[1];
            if (res[1] != null)
                System.out.print(res[0]);
        }
    }
}