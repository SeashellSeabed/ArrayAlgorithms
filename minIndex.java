public class minIndex {

    public static void main(String[]args){
        int [] nums = {-2, 0, 5, 7, 9};

        int smallIndex = nums[0];
        int smallesti = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallIndex){
                smallesti = i;
            }
        }
        System.out.println(smallesti);
    }
    
}
