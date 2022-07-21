import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemSolving2 {

    public static  void main(String[] gg){

//        Integer[] arr={1,2,2,1};
        Integer[] arr={1,2,1,2};
        int target = 4;

        System.out.println(targetArray(arr,target));

    }
    public static List<Integer> targetArray(Integer[] a,int t){
        List<Integer> alist= Arrays.asList(a);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<alist.size();i++){
            int diff = t-alist.get(i);
            if(alist.indexOf((diff))!=i && alist.indexOf(diff) !=-1 ){
                result.add(alist.get(i));
                result.add(alist.get(diff));
            }
        }
      return result;
    }
}
