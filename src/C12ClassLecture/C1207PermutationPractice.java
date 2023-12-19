package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207PermutationPractice {
    public static void main(String[] args) {
        /* 1. 순열 : 합계가 6이상인 2개 순열만 add
           2. 순열 : 합계가 6이상 모든 순열 add : temp.size 변화시키거나, 길이 제한
           3. 순열 : 3개 순열에서 합계가 가장 큰값 찾기 : max찾기 알고리즘 활용 (static활용)
         */
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = 3;
        boolean[] visited = new boolean[myList.size()];
        permutation(n, visited, temp, permutation_list, myList);
        System.out.println(permutation_list);

    }

    static void permutation(int n, boolean[] visited, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList) {
        if (temp.size() == n) {
            int sum = 0;
            for(int num : temp){
                sum = sum + num;
            }if(sum >= 6){
                permutation_list.add(new ArrayList<>(temp));
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permutation(n, visited, temp, permutation_list, myList);
                temp.remove(temp.size() - 1);
                visited[i] = false;

            }
        }
    }
}
