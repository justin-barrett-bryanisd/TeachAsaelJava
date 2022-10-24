
/**
 *
 * @author NAME
 */

import java.lang.*;

public class OtherFunThings {

    public static void main(String[] args) throws Exception {
        Cricket a=new Cricket();
        a.jumps++;
        a.chirps++;
        a.chirps++;
        a.chirps++;
        a.chirps++;
        a.chirps++;
        Cricket b=new Cricket();
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.jumps++;
        b.chirps++;
        b.chirps++;
        b.chirps++;
        b.chirps++;
        b.chirps++;
        Cricket c=new Cricket();
        c.jumps++;
        c.chirps++;
        
        System.out.println(c+" "+b);
        

    }

    static class Cricket {

        static int chirps;
        int jumps;
        
        public String toString(){
            return "*** Cricket chirps "+chirps+". Cricket jumps "+jumps+" ***";
        }
    }
}
