abstract class Content
 {
     int a;
 
    // Constructor of abstract class
    public Content(int a)
    
        this.a = a;
    }
 
    // Abstract method 
    abstract int multiply(int val);
}
 
//child class of the absract class
class Text extends Content {
    Text()
    {
        super(2);
    }
    public int multiply(int val)
    {

        return this.a * val;
    }
}

// Main class
public class Absractconst
{
    public static void main(String args[])
    {
        Content c = new Text();
        System.out.println(c.multiply(3));
    }
}