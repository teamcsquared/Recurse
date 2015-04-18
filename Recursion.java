package recurse;

/**
 *
 * @author Forest
 */
public class Recursion {
    
    public static void main(String[] args) {
        new Recursion().recurse(new Recurse(""));
    }
    
    Recurse.recurse recurse(Recurse recurse) {
        return recurse(recurse.recurse(recurse).recurse(recurse.recurse(recurse).recurse(recurse) + recurse.recurse(recurse).recurse(recurse.recurse(recurse).Recurse(recurse), recurse.recurse(recurse).Recurse(recurse.recurse(recurse))))); //what does it do?!?!?1
    }
    
}

class Recurse {

    String recurse;
    
    public Recurse(String recurse) {
        this.recurse = recurse;
    }
    
    public String Recurse() {
        return this.recurse;
    }
    
    public recurse recurse(Recurse recurse) {
        return recurse.new recurse();
    }
    
    public class recurse {
        
        public Recurse recurse(String recurse) {
            return new Recurse(Recurse.this.recurse + recurse);
        }
        
        public String recurse(Recurse recurse) {
            return recurse.Recurse();
        }
        
        public String recurse(String recurse, String Recurse) {
            return recurse + Recurse;
        }
        
        public String Recurse(Recurse recurse) {
            return "Hello ";
        }
        
        public String Recurse(Recurse.recurse recurse) {
            return "World! ";
        }
    }
}
