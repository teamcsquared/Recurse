package recurse;

/**
 *
 * @author Forest
 */
public class Recursion {

    public static void main(String[] args) {
      recurse(new Recurse("recurse"));
    }
    
    Recurse recurse(Recurse recurse){
        return recurse(recurse.recurse(recurse.recurse()+"recurse")); //what does it do?!?!?1
    }
    
}
class Recurse {
    String recurse;
    public Recurse(String recurse){
        this.recurse = recurse;
    }
    
    public Recurse recurse(String recurse){
        return new Recurse(recurse()+recurse);
    }
    public String recurse(){
        return this.recurse;
    }
}
