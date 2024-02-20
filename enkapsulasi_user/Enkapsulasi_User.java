
package enkapsulasi_user;


public class Enkapsulasi_User {

    
    public static void main(String[] args) {
       
        //objek dari class user
        User Shafa = new User ("APA", "OPO", 5);
        
        //pakai method setter
        Shafa.setUsername("Shafa");
        Shafa.setPassword("CoklatKlasik");
        
        //objek method getter
        System.out.println("Username; " + Shafa.getUsername());
        System.out.println("Password; " + Shafa.getPassword());
    }
    
}
