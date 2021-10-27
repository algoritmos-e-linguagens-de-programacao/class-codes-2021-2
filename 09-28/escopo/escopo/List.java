
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class List
{
    // instance variables - replace the example below with your own
    Node init;
    
    /**
     * Constructor for objects of class Lista
     */
    public List()
    {
        
    }
    
    public List(int initialValue)
    {
        this.init = new Node(initialValue);
    }
    
    
    @Override
    public String toString()
    {
        String strAux = "[";
        Node nodeAux = this.init;
        while(nodeAux != null){
            strAux = strAux + nodeAux.x + ",";
            nodeAux = nodeAux.next;
        }        
        strAux = strAux + "]";
        return strAux;
    }

}
