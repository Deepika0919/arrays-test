import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            int requiredNum = target - nums[i];
            if(indexMap.containsKey(requiredNum)){
                result[0] = indexMap.get(requiredNum);
                result[1] = i;
            }
            else{
                indexMap.put(nums[i],i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int nums[] = new int[]{3,2,4};
        int[] response = twoSum.twoSum(nums, 6);
        for (int i =0; i<response.length; i++){
            System.out.print(response[i] + " ");
        }


    }
}
