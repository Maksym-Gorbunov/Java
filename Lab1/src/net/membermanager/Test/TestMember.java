package net.membermanager.Test;

import net.membermanager.Member;

public class TestMember {
    public static void main(String[] args) {
        System.out.print("a. ");
        try{
            Member m1 = new Member("Max",2003);
            System.err.println("Test for invalid birth year - no exception thrown");
        }catch (IllegalArgumentException e){
            System.out.println("Birth year test success");
        }

        System.out.print("b. ");
        try{
            Member m2 = new Member("Bonny", "bonnymail.com" ,1999);
            System.err.println("Test for invalid email - no exception thrown");
        }catch (IllegalArgumentException e){
            System.out.println("Email test success");
        }

        System.out.print("c. ");
        Member m3 = new Member("Martin", "martin@mail.com", 1980);
        if( (m3.getName().equals("Martin")) &&
            (m3.getEmail().equals("martin@mail.com")) &&
            (m3.getBirthYear()==1980) ) {
            System.out.println(m3);
        } else {
            System.err.println("Save data error");
        }

        System.out.print("d. ");
        try{
            Member m4 = new Member("David", null, 1975);
            System.err.println("Test for invalid email - no exception thrown");
        }catch (IllegalArgumentException e){
            System.out.println("Email(null) test success");
        }
    }
}
