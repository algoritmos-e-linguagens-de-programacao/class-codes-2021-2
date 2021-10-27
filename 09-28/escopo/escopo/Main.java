
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        List list = new List(99);
        
        list.init.next = new Node(85);
        
        System.out.print(list);
        
    }
}
