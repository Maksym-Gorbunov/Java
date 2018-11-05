package test;

import passport.Passport;

public class PassportTest {
    public static void main(String[] args) {
        String name = "Maks";
        String birth = "21 july 1986";
        Passport p1 = new Passport("John", birth);

        assert p1.name().equals(name) : "Wrong name";
    }
}
