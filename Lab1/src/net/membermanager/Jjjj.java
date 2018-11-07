package net.membermanager;

import java.util.ArrayList;
import java.util.List;

public class Jjjj {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<Member>();
        Club club = new Club("IFK-Uddevalla", members);
        club.addMember(new Member("Max", 32));
        club.addMember(new Member("Tom", "sjdsd@sjhsd.com",22));
        club.addMember(new Member("Nick", 22));
        club.addMember(new Member("Bil", 24));

        System.out.println(club);


    }
}
