
package Examples;
import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 3:40:25 PM Sep 7, 2022
 * This file is part of "Examples" Package.
 */
interface employee{
    public void setOT(float s);
    public float calOT(int h,float s);
}
public class InterfaceTest implements employee {
    public void setOT(float s){
        System.out.println("OT RATE = "+s+"BAHT/HR.");
    }
    public float calOT(int h,float s){
        return h*s;
    }
    public static void main(String[] args){
        InterfaceTest emp = new InterfaceTest();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter OT RATE (BAHT/HR.) >>> ");
        float salary = scn.nextFloat();
        System.out.print("Enter OT HOUR >>> ");
        int hr = scn.nextInt();
        System.out.print("TOTAL OT = "+emp.calOT(hr, salary)+" BAHT");
    }

}

