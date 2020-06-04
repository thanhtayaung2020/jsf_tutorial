
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AA
 */
@ManagedBean
public class StudentTwo {
    private String firstName;
    private String lastName;
    private String favoriteLanguages;
    
    public StudentTwo(){
        //pre-populate the bean
        firstName = "Mary";
        lastName = "Public";
        favoriteLanguages="Ruby";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public void setFavoriteLanguages(String favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }
    
    
}
