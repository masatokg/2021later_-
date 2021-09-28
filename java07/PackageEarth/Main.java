package PackageEarth;
import packageMoon.Endeavour;
// import packageMoon.Discovery;
public class Main {
    public static void main(String[] args){
        Atlantis atlantis = new Atlantis();
        atlantis.showOwner();
        
        Discovery discovery = new Discovery();
        discovery.showOwner();

        Endeavour endeavour = new Endeavour();
        endeavour.showOwner();

        String msg = 
        String.format(" %s : %s : %s ", 
        atlantis.name, atlantis.country, atlantis.color);
        System.out.println(msg);

        // msg = 
        // String.format(" %s : %s : %s ", 
        // endeavour.name, endeavour.country, endeavour.color);
        // System.out.println(msg);

        another.printMsg();
    }
}

class another{
    static public void printMsg(){
        System.out.println("anotherクラスの処理です!!");
    }
}

