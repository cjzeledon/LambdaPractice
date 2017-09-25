package com.TheIronYard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.sun.tools.doclint.Entity.lambda;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by gilpratte on 7/26/17.
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));


        System.out.println("Before sorting");
        print(addresses);

//         DONE - Write an anonymous class to sort by state (alphabetically)
        Collections.sort(addresses, new Comparator<Address>() {
                    @Override
                    public int compare(Address o1, Address o2) {
                        // this is your anonymous class that is being compared
                        return o1.getState().compareTo(o2.getState());
                    }
                }
        );

        System.out.println("\nAfter sorting by state");
        print(addresses);

        // !! - Write a lambda to sort by city alphabetically
//        Collections.sort(addresses, /* lambda here */
//                (Address s1, Address s2)-> s1.getCity().compareTo(s2.getCity()));

        // lambda version of the Collections.sort?
//        addresses.sort((Address s1, Address s2)-> s1.getState().compareTo(s2.getState()));

        addresses.sort((s1, s2)-> s1.getCity().compareTo(s2.getCity()));

        System.out.println("\nAfter sorting by city");
        print(addresses);

        // lambda version of the print list?
//        addresses.forEach((blahaddress)-> System.out.println(blahaddress));
    }


    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}
