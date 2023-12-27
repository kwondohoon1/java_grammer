package C17ExceptionFileParsing;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

//text 파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text.txt");

//        버퍼기능이 구현되있고, nio 패키지 에서는 non blocking방식 사용
        try {
            if (Files.exists(filePath)) {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        파일읽기 : readString,readAllLines(List형태)
        try {
            String mySt = Files.readString(filePath);
            System.out.println(mySt);
//        readAllLines을 가지고 for문을 돌려 출력.
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<String> myList = Files.readAllLines(filePath);
            for (String a : myList) {
                System.out.println(a);
            }
//        readAllLines을 가지고 for문을 돌려 출력.
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
