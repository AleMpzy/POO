public class Ex4{
    public static void main (String[] args){
        int[] nums = {99, -10, 100, 19, 977, -562, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for(int n: nums){
            if(n < min)
                min = n;
            if(n > max)
                max = n;
        }
        System.out.println("Min e Max: " + min + " " + max);
    }
}