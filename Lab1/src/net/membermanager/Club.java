package net.membermanager;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String clubName;
    private List<Member> members;

    //Constructor
    public Club(String clubName){
        if(clubName.equals(null))
            throw new IllegalArgumentException("Not valid club name");
        this.clubName = clubName;
        this.members = new ArrayList<>();
    }

    //Constructor
    public Club(String clubName, List<Member> members) {
        this(clubName);
        if(members == null)
            throw new IllegalArgumentException("Members list can't be empty");
        for(Member member : members){
            if(member == null)
                throw new IllegalArgumentException("Illegal (null) member found");
        }
        this.members = members;
    }

    //Add new member to the club
    public void addMember(Member member) {
        if(member == null)
            throw new IllegalArgumentException("Illegal (null) member found");
        members.add(member);
    }

    //Get total number of members
    public int numberOfMembers(){
        return members.size();
    }

    //Get club name
    public String name(){
        return clubName;
    }

    //Return copy of intern list of members
    public List<Member> members(){
        return new ArrayList<>(members);
    }

    @Override
    public String toString() {
        StringBuilder stringMembers = new StringBuilder();
        for(Member member : this.members){
            stringMembers.append("- " + member.toString() + "\n");
        }
        return clubName + ":\n" + stringMembers;
    }
}
