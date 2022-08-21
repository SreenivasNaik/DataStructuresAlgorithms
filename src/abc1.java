import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by SreenUNaik on 19-Apr-20.
 */
public class abc1 {
    public static int findCircleNum(int[][] M) {
        int[] uf = new int[M.length];
        for(int i = 0; i < M.length; i++) uf[i] = i;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                if(M[i][j] == 1 && i != j){
                    int i_root = uf[i];
                    int j_root = uf[j];
                    if(j_root != i_root){
                        //we traversal the whole array inorder to change the component id. It's not efficient.
                        for(int k = 0; k < M.length; k++){
                            if(uf[k] == j_root){
                                uf[k] = i_root;
                            }
                        }
                    }
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int n : uf) set.add(n);
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int m[][] = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println(findCircleNum(m));
    }
}

