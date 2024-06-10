/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ginas
 */
public class Admin extends Pengguna{
    private String UserName;
    private String Email;
    private String Password;
    
    public Admin(String username_pengguna, String email_pengguna, String password_pengguna) {
        super(username_pengguna, email_pengguna, password_pengguna);
    }
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public void viewProfile() {
        System.out.println("Profil Admin ");
        System.out.println("Username: " + UserName);
        System.out.println("Email Admin:" + Email);
    }

}
