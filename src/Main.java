import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] prtc=new int[11];
        int vote;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a num between 1-10!!");
        vote=scan.nextInt();
        while (vote > 0 && vote < 11) {

            prtc[vote]++;

            System.out.println("please enter a num between 1-10!!");
            vote=scan.nextInt();
        }


        int min=prtc[1],iMin=1;
        for (int i = 1; i < prtc.length; i++) {
            System.out.println("arr["+i+"], "+prtc[i]);
            if(prtc[i]<min){
                min=prtc[i];
                iMin=i;
            }
        }

        System.out.println("the losser is participent num :"+iMin);
    }

    public  static void lesson6(){
        // 0, 1, 2,3,4
        // int[] arr={10,20,3};
        int[] arr2=new int[5];
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("please enter a num");
            arr2[i]=scan.nextInt();


        }


        System.out.print("{");
        for (int i = 0; i < arr2.length-1; i++) {
            System.out.print(arr2[i]+", ");

        }
        System.out.println(arr2[arr2.length-1]+"}");

    }
    public  static void lesson6_1(){
        int max ;
        int[] arr1={2,4,5,6,78,78};
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= scan.nextInt();
        }
        max=arr1[0];




        int iMax=0;
        for (int i = 0; i < arr1.length; i++) {
            //  max=Math.max(max,arr1[i]);//(arr1[5],arr[2])
            if(arr1[i]>max){
                max=arr1[i];
                iMax=i;
            }



        }
        System.out.println(" ***********************************");
        System.out.println(" the max is :"+ max);
        System.out.println(" the i of max is :"+ iMax);
    }
}