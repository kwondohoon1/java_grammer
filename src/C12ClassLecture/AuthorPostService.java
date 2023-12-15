package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//public class AuthorPostService {
//    public static void main(String[] args) {
//        List<Author> authors = new ArrayList<>();
//        List<Author> posts = new ArrayList<>();
//        while (true){
//            System.out.println("1번:회원가입  2번:게시글작성  3번:회원목록조회  4번:회원상세조회  5번:게시글상세조회");
//            Scanner sc = new Scanner(System.in);
//            int menu = Integer.parseInt(sc.nextLine());
//            if(menu == 1){
//                System.out.println("회원가입하실 이름을 입력해주세요.");
//                String name = sc.nextLine();
//                System.out.println("회원가입하실 이메일을 입력해주세요.");
//                String email = sc.nextLine();
//                System.out.println("회원가입하실 비밀번호를 입력해주세요.");
//                String password = sc.nextLine();
//                Author Author1 = new Author(name, email, password);
//                System.out.println("가입자의 id는" + Author1.getId() + "이름은" + Author1.getName() +
//                        "이메일은" + Author1.getEmail() + "비밀번호는" + Author1.getPassword());
//                authors.add(Author1);
//                System.out.println("현재까지 가입자는 " + authors.size() + "명");
//            } else if (menu == 2) {
//                System.out.println("아이디를 입력하세요.");
//                Long author_id = (long) Integer.parseInt(sc.nextLine());
//                for(Author a : authors){
//                    if(a.getId() == author_id){
//                        System.out.println("게시글을 제목을 작성하세요.");
//                        String title = sc.nextLine();
//                        System.out.println("게시글 본문을 작성하세요.");
//                        String contents = sc.nextLine();
//                        Post post1 = new Post(title, contents, author_id);
//                    } else{
//                        System.out.println("회원가입을 진행하세요.");
//                    }
//                }
//            } else if (menu == 3) {
//                for(Author a : authors){
//                    System.out.println(a.getEmail());
//                }
//            } else if (menu == 4){
//                System.out.println("아이디를 입력하세요");
//                Long id = sc.nextLong();
//                for(Author a : authors){
//                    if(a.getId() == id){
//                        System.out.println(a.getName());
//                        System.out.println(a.getEmail());
//                    }
//                }
//            } else if (menu == 5){
//
//            }
//        }
//
//    }
//}
//// 인스턴스 변수 생성
//// 생성자 : 모든 인스턴스 변수 초기화
//// 모든클래스에 getter 생성
//// 1. 회원가입
//// 2.게시글작성
//// 3.회원목록조회:회원email을 출력
//// 4.회원상세조회 : 회원명, 회원email, 회원작성글수
//// 5. 게시글 상세조회 : 제목, 작성자email
//
//class Author{
//    private Long id;
//    private String name;
//    private String email;
//    private String password;
//    static Long static_id = 0L;
//    Author(String name, String email, String password){
//        static_id += 1;
//        this.id=static_id;
//        this.name=name;
//        this.email=email;
//        this.password=password;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
//class Post {
//    private Long id;
//    private String title;
//    private String contents;
//    private Long author_id;
//    static Long static_id = 0L;
//
//    Post(String title, String contents, Long author_id){
//        static_id += 1;
//        this.id=static_id;
//        this.title=title;
//        this.contents=contents;
//        this.author_id=author_id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public Long getAuthor_id() {
//        return author_id;
//    }
//}