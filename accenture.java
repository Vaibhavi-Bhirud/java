
public class accenture {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        double avg = 0;
        int N = arr.length;

        for(int i = 0; i<N; i++){
            avg += arr[i];
        }
        avg /= N;

        double sumofSquares = 0;
        for(int i=0; i<N;i++){
            sumofSquares +=Math.pow(arr[i] - avg,2);
        }

        double variance =  sumofSquares / N;

        System.out.println(variance);
    }
}
