package com.tutorial;

class User{
    // Data member keyword private
    private String username;
    private String password;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }
        //Method Getter
        public String getUsername(){
            return this.username;
    }
    public String getpassword(){
        return this.password;
}
// method setter untuk ganti password
public void setPassword(String password){
    this.password = password;

}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        User person_1 = new User("Undikma", "jaya,jaya,jaya");

        //get username
        System.out.println(person_1.getUsername());
        System.out.println(person_1.getpassword());
        person_1.setPassword("Sukses");
        System.out.println("Password Baru : "+person_1.getpassword());
    }
    }
}



