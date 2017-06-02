/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircularproyecto;

/**
 *
 * @author gerson
 */
public class Pelicula {
    private int gender, code,total,premier, subtitled;
    private String title;
    public Pelicula(){
        this.gender = 0;
        this.code = 0;
        this.total = 0;
        this.premier = 0;
        this.subtitled = 0;
        this.title = "";
    }//const

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPremier() {
        return premier;
    }

    public void setPremier(int premier) {
        this.premier = premier;
    }

    public int getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(int subtitled) {
        this.subtitled = subtitled;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Pelicula(int gender, int code, int total, int premier, int subtitled, String title) {
        this.gender = gender;
        this.code = code;
        this.total = total;
        this.premier = premier;
        this.subtitled = subtitled;
        this.title = title;
    }//const
    
}//class
