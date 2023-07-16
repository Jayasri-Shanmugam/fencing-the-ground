/*The college ground is rectangular in shape. The Management decides to build a fence around the ground. In order to help the construction workers to build a straight fence, they planned to place a thick rope around the ground. They wanted to buy only the exact length of the rope that is needed. They also wanted to cover the entire ground with a thick carpet during rainy season. They wanted to buy only the exact quantity of carpet that is needed. They requested your help.

Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carper that is required?

Input Format:

Input consists of 2 integers. The first integer corresponds to the length of the ground and the second integer corresponds to the breadth of the ground.

Output Format:

Refer Sample Input and Output for exact formatting specifications.

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]



50

20

Required length is 140m

Required quantity of carpet is 1000sqm

*/
package Jayasrijavapractice;
import java.util.Scanner;
public class fencingtheground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        //area of rectangle=length*breadth
        //perimeter of rectangle = 2(l*b)
        int perimeter=2*(length+breadth);
        
        System.out.println("Required length is "+perimeter+"m");
        System.out.println("Required quantity of carpet "+length*breadth+"sqm");
        sc.close();
	}

}
