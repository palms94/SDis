package ttt;
 
import java.rmi.*;
import java.rmi.registry.*;
 
public class TTTServer{
 
    public static final int registryPort = 1099;
     
    public static void main(String args[]){
 
        try{
            TTT ttt = new TTT();
             
            final Registry reg = LocateRegistry.createRegistry(registryPort);
            reg.rebind("TTT",ttt);
             
            System.err.println("Server ready");
             
            System.in.read();
            System.exit(0);
             
        }
        catch (Exception e){ 
        	System.out.println("TTT server main " + e.getMessage());
        	} 
    }
}