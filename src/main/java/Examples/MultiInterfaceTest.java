
package Examples;

import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 4:28:55 PM Sep 7, 2022
 * This file is part of "Examples" Package.
 */
interface employee1{
    public float setOT(float s);
}
interface employee2{
    public float calOT(float s,int h);
}
public class MultiInterfaceTest implements employee1,employee2{
    public float setOT(float s){
        return s/30;
    }
    public float calOT(float s ,int h){
        return setOT(s)*h;
    }
    public static void main(String[] args){
        MultiInterfaceTest emp = new MultiInterfaceTest();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter OT RATE >>> ");
        float salary = scan.nextFloat();
        System.out.print("Enter OT HOUR >>> ");
        int hr = scan.nextInt();
        System.out.println("OT HOUR = "+hr+" HR.");
        System.out.println("OT RATE = "+emp.setOT(salary)+" BAHT/HR.");
        System.out.println("TOTAL OT = "+emp.calOT(salary,hr)+" BAHT");
    }

}

