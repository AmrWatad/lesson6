import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int sum=0,grade,count=0;
        System.out.println();
         double avg;
        Scanner scan=new Scanner(System.in);
        //1.
        System.out.println("please enter a grade");
        grade=scan.nextInt();
        //2.
        while(grade!=0){
            //2.1
            sum+=grade;
            count++;
            //2.2
            System.out.println("please enter a grade");
            grade=scan.nextInt();
            //3


        }

        //****************
        int sum2=0,grade2,count2=0;
        double avg2;
        //1.
        System.out.println("please enter a grade");
        grade2=scan.nextInt();
        //2.
        while(grade2>=0 && grade2<=100){
            //2.1
            sum2+=grade2;
            count2++;
            //2.2
            System.out.println("please enter a grade");
            grade2=scan.nextInt();
            //3
        }
        avg=((double) sum)/count;//10
        avg2=((double) sum2)/count2;//20

        //double max= Math.max(avg,avg2);
        if(avg>avg2){
            System.out.println("school 1 is the bigger");
        } else if (avg2 > avg) {
            System.out.println("school 2 is the bigger");
        }
       else{
            System.out.println("both are equals!!");
        }
    }
}