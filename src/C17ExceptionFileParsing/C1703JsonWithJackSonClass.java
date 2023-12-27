//package C17ExceptionFileParsing;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class C1703JsonWithJackSonClass {
//    public static void main(String[] args) {
//        ObjectMapper mapper = new ObjectMapper();
//        File myPath = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
//        try {
//            JsonNode data1 = mapper.readTree(myPath);
//            JsonNode students = data1.get("students");
//            List<String> myList = new ArrayList<>();
//            for(JsonNode j : students){
//                Student student = mapper.readValue(j.toString(), Student.class);
//                myList.add(student);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(myList);
//
//
//    }
//}class Student {
//    public int id;
//    public String name;
//    public String classNumber;
//    public String city;
//
//
//    Student (int id, String name, String classNumber, String city) {
//        this.id = id;
//        this.name = name;
//        this.classNumber = classNumber;
//        this.city = city;
//    }
//
//    @Override
//    public String toString() {
//        return "Post{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", classNumber='" + classNumber + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
//}
