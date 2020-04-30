public class task22 {
    public static void main(String[] args) {
        int[] d = {13,2,5,0,9,6,11};
        int min = d[0];
        for (int i = 1; i < d.length; i++){
            if (d[i]< min){
                min = d[i];
            }
        }
        System.out.println(min);
    }
}
