/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Akib Javed
 */
public class Calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x , y;
        
        Scanner input = new Scanner(System.in);
        
        x = input.nextDouble();
        y = input.nextDouble();
        
        Add sum = new Add(x,y);
        System.out.println(sum.getSum());
        SUB sub = new SUB(x,y);
        System.out.println(sub.getSub());
        Mul mul = new Mul(x ,y);
        System.out.println(mul.getMul());
        Div div = new Div(x , y);
        System.out.println(div.getDiv());
        input.close();
    }
}