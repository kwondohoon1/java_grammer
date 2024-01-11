//package samcope;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Sequence{
//    int start;
//    int end;
//
//    public Sequence(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//}
//public class 연속된부분수열의합 {
//    public static void main(String[] args) {
//        int[] sequence = {1, 2, 3, 4, 5};
//        int k=7;
//        List<Sequence> answers = new ArrayList<>();
//        int[] answer = new int[2];
//
//        int sum=0;
//        int lt=0;
//        for (int rt = 0; rt < sequence.length; rt++) {
//            sum += sequence[rt];
//            if(sum==k) {
//                answers.add(new Sequence(lt, rt)); //7과 1 7의 경우
//            }
//
//            while(sum>k){
//                sum -= sequence[lt];
//                lt++;
//                if(sum==k) {
//                    answers.add(new Sequence(lt, rt)); // 1 2 3 4의 경우
//                }
//            }
//        }
//
//        int minLength = Integer.MAX_VALUE;
//        int minIndex=0;
//        // 정답 후보들을 모두 돌면서 가장 짧은 길이를 가지는 부분 수열의 index 값 찾기
//        int answers_len = answers.size();
//        for (int i = 0; i < answers_len; i++) { //(0번째 정답 후보 )-[1, 1, 1, 2], (1번째 정답 후보 )-[2, 3], (2번째 정답 후보 )-[5] 이렇게 있으면 5가 가장 짧잖아
//            int sequence_len = answers.get(i).end - answers.get(i).start;
//            if(sequence_len < minLength) { // =은 고려하지 않음으로서, 길이가 같은 부분 수열 중 시작 인덱스가 가장 작은 것을 찾음
//                minLength = sequence_len; //여기 if문에 들어와서 5가 가장 짧다 = 5의 길이 1의 값을 minLength에 넣어줘
//                minIndex = i; //그럼 minIndex에 2가 담기거든?? 여기서 2의 값은 "2"번째 정답 후보가 진짜 정답이라는 뜻인데
//            }
//        }
//        System.out.println(answers.get(minIndex).start + ", " + answers.get(minIndex).end);
//    }
//}