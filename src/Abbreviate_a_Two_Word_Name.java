/*
https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F

 */

public class Abbreviate_a_Two_Word_Name {

    public static String abbrevName(String name) {
        int spaceInd = name.indexOf(" ");
        return name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(spaceInd + 1);
    }
}
