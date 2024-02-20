package enkapsulasi_user;


public class User {
    private String username;
    private String password;
    
    private int id;
    private boolean status; //true : menikah, false ; bm
    
    public User(String username, String password, int id){
        this.username = username;
        this.password = password;
    }

    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
