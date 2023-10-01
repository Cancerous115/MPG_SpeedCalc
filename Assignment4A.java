import java.util.Scanner;
public class Assignment4A {
    public static void main(String[]args){
        int m,de;
        int sec;
        System.out.println("[Stopping Time ]");
        Scanner sc = new Scanner(System.in);
        System.out.println("How fast are you going (miles/hour)?");
        m= sc.nextInt();

        System.out.println("How quickly can you decelerate (miles)?");
        de = sc.nextInt();

        System.out.println("How often do you want to see updates (in seconds) ?");
        sec=sc.nextInt();
        //set our formula for the problem.Mph * ft per second.
        float t = (float)(m *1.4667);
        //Our do while loop will start here as we want to loop the formula and
        // add it to the updated mph until we reach 0 mph.
        do{
            //(m-1) prints out miles as shown in the output.Does nothing to the actual code/formula outcome.
            System.out.println("At " + sec + " seconds, you have traveled " + t + " feet and are now moving at " + (m-1) + " MPH.");
            //Count down our miles until we hit zero, and update our t for each iteration of the loop.
            //Count each second
            sec++;
            --m;
            //inside the loop updated formula that will add the previous traveled in feet to the new calculated Traveled ft.
            //New mile will be utilized in the formula each loop until miles = 0.
            //Replacing each t with the updated and adding it in the following loop iteration.
            t= (float)(m*1.4667)+t;}
            while (m !=0);{
                System.out.println("Thankyou.");}
        }}






