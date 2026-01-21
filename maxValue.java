public class maxValue {
    public static void main(String[]args){
        int [] nums = {-2, 0, 5, 7, 9};

        int v = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(v < nums[i]){
                v = nums[i];
            }
            
        }

        System.out.println(v);
    }
    
}
