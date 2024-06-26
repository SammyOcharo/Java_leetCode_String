package com.sam.leetCodeString;

public class DefangingAddress {
    //1108. Defanging an IP Address
    //Easy
    //Topics
    //Companies
    //Given a valid (IPv4) IP address, return a defanged version of that IP address.
    //
    //A defanged IP address replaces every period "." with "[.]".
    //
    //
    //
    //Example 1:
    //
    //Input: address = "1.1.1.1"
    //Output: "1[.]1[.]1[.]1"
    //Example 2:
    //
    //Input: address = "255.100.50.0"
    //Output: "255[.]100[.]50[.]0"

    public static String defangIpaddress(String ipAddress){
        StringBuilder newIpAddress = new StringBuilder();

        String word = "[.]";

        for(Character s: ipAddress.toCharArray()){
            if(s == '.'){
                newIpAddress.append(word);
            }else{
                newIpAddress.append(s);
            }

        }

        return newIpAddress.toString();
    }
}
