public class arrytwo {
    public static void main(String args[]){
        int a[]={10,20,50,12,70,90};
        
        int max = Integer.MIN_VALUE;//Read about min value and max value
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
           if(a[i]<min){
            min = a[i];
           }
           if(a[i]>max){
            max = a[i];
           }

        }
        System.out.println("Maximum ="+max);
        System.out.println("minimun ="+min);

    }
}
