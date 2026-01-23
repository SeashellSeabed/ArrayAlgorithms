public class Selection {
    public static void main(String[]args){

        String [] classes = {"APWH", "Algebra II", "Study hall", "ELA9H", "Lunch", "APCSA", "Chemistry", "Chemistry", "French"};

        for(int i = 0; i < classes.length - 1; i++){ //subtract 1 from the length because length is always +1 of index

            System.out.println(classes[i] + " : "+ classes[i+1]);

        }

    }
}
