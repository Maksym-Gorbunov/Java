package net.membermanager;

import java.io.Serializable;
import java.util.Calendar;

public class Member implements Serializable {
    private String name;
    private String email;
    private int birthYear;
    public static final long serialVersionUID = 33L;

    //Constructor
    public Member(String name, int birthYear) {
        this.name = name;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if ( (currentYear - birthYear) < 18)
            throw new  IllegalArgumentException ("Too young to be a member");
        this.birthYear = birthYear;
    }

    public Member(String name, String email, int birthYear) {
        this(name, birthYear);
        if( (email == null) || (!email.matches("[A-Za-z0-9.]*[@][a-z]*[.][a-z]*")))
            throw new  IllegalArgumentException ("Invalid email");
        this.email = email;
    }



    //Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nBirthYear: " + getBirthYear() + "\nEmail: " + getEmail();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Member obj2 = (Member) obj;
        return getEmail().equals(obj2.getEmail());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getEmail());
    }
}
