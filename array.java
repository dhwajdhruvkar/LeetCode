public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=99;
        marks[1]=98;
        marks[2]=97;

        //or
        //int[] marks = {99,98,97};

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
