public class Duplicate {

    public static boolean containsDuplicate(String [] arr){
        int counter = 0;
        while(counter < arr.length){
            for(int i = counter + 1; i < arr.length; i++){
                if(arr[counter].equals(arr[i])){
                    return true;
                }
            }
            counter++;
        }
        return false;


    }
    public static void main(String[]args){
        String [] classes = {"APWH", "Algebra II", "Study hall", "ELA9H", "Lunch", "APCSA", "Chemistry", "Chemistry", "French"};
    
        System.out.println(containsDuplicate(classes));
    }
    
}
