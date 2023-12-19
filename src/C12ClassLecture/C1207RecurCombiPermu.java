package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combination_list = new ArrayList<>();
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = 2;
        combination(n, 0, temp, combination_list, myList);
        boolean[] visited = new boolean[myList.size()];
        permutation(n, visited, temp, permutation_list, myList);
//        System.out.println(combination_list);
        System.out.println(permutation_list);
    }

    static void combination(int n, int start, List<Integer> temp, List<List<Integer>> combination_list, List<Integer> myList) {
        if (temp.size() == n) {
            combination_list.add(new ArrayList<>(temp));
            System.out.println(temp);
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(n, i + 1,temp, combination_list, myList);
            temp.remove(temp.size() - 1);
        }
        //    구슬을 나누는 경우의 수

//class Solution {
//    static int answer = 0;
//    static int count = 0;
//    public int solution(int balls, int share) {
//        combination(count, 0, balls, share);
//        return answer;
//
//    }
//    static void combination(int count, int start, int balls, int share){
//        if(count == share){
//            answer++;
//        }
//        for(int i = start; i < balls; i++){
//            count ++;
//            combination(count, i+1, balls, share);
//            count --;
//        }
//    }
//}

    }

    static void permutation(int n,boolean[] visited, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList) {
        if (temp.size() == n) {
            permutation_list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(visited[i]==false){
                visited[i]=true;
                temp.add(myList.get(i));
                permutation(n, visited,temp, permutation_list, myList);
                temp.remove(temp.size() - 1);
                visited[i]=false;

            }
        }

    }
}


