package recurse;

/**
 *
 * @author Forest
 */
public class Recursion {

    public static void main(String[] args) {
        new Recursion().recurse(new Recurse("recurse"));
    }
    
    Recurse.recurse recurse(Recurse recurse){
        return recurse(recurse.recurse().recurse(recurse.recurse().recurse()+"recurse")); //what does it do?!?!?1
    }
    
}
class Recurse {
    String recurse;
    
    public Recurse(String recurse){
        this.recurse = recurse;
    }
    
    public String Recurse(){
        return this.recurse;
    }
    
    public recurse recurse(){
        return new recurse();
    }
    
    public class recurse{
    
        public Recurse recurse(String recurse){
            return new Recurse(recurse()+recurse);
        }
        
        public String recurse(){
            return Recurse.this.Recurse();
        }
    }
}
