package com.hexaware.assignment;

import java.util.ArrayList;
import java.util.List;

public class SimilarAddresses {

    public static List<String> findSimilarAddresses(List<String> addresses, String searchAddress) {
        List<String> similarAddresses = new ArrayList<>();
        for (String address : addresses) {
            if (address.contains(searchAddress)) {
                similarAddresses.add(address);
            }
        }
        return similarAddresses;
    }

    public static void main(String[] args) {
        List<String> addresses = new ArrayList<>();
        addresses.add("123 Main St, New York, NY");
        addresses.add("124 Main St, New York, NY");
        addresses.add("456 Oak St, New York, NY");

        List<String> similar = findSimilarAddresses(addresses, "Main St");
        for (String address : similar) {
            System.out.println(address);
        }
    }
}

