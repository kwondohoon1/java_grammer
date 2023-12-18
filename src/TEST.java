import javax.xml.namespace.QName;
import java.util. *;
//public class TEST {
//    public static void main(String[] args) {
//    }
//}//// 인스턴스 변수 생성
////// 생성자 : 모든 인스턴스 변수 초기화
////// 모든클래스에 getter 생성
////// 1. 회원가입
////// 2.게시글작성
////// 3.회원목록조회:회원email을 출력
////// 4.회원상세조회 : 회원명, 회원email, 회원작성글수
////// 5. 게시글 상세조회 : 제목, 작성자email
////
//class Author{
//    private Long id;
//    private String name;
//    private String email;
//    private List<Post> post;
//    static Long static_id = 0L
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
//    public List<Post> getPost() {
//        return post;
//    }
//
//    public static Long getStatic_id() {
//        return static_id;
//    }
//
//    Author(String name, String email){
//        static_id += 1;
//        this.name = name;
//        this. email= email;
//        this.post = new ArrayList<>();
//
//        void addPost(Post post){
//            this.post.add(post);
//        }
//
//    }
//
//}
//class Post{
//    private String id;
//    private String title;
//    private String contents;
//    private Author author;
//    static Long static_id = 0L;
//
//    Post(String title, String contents, Author author){
//        static_id += 1;
//        this.title = title;
//        this.contents = contents;
//        this.author = author;
//        this id = static_id;
//    }
//
//    public String getId() {
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
//    public Author getAuthor() {
//        return author;
//    }
//
//    public static Long getStatic_id() {
//        return static_id;
//    }
//}