/**
 * Generic Method
 * ===============
 * 1. All generic method declarations have a type
 *    parameter section delimeter by angle brackets
 *    (< and >) that precedes the method's return type.
 * 2. Each type parameter section contains one or
 *    more type paramter section containe one or 
 *    more type paramter separated by commas.
 *      Syntax: public <E1, E2> void <name>(E1 x, E2) {}
 * 3.This can also be return type.
 */

 public class GenericMethod 
 {
    public <E> void printArray(E[] items) {
        for(E item:items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] countries = {"Chine", "India", "Paksitan"};
        Integer[] ages = {12}; 

        GenericMethod gm = new GenericMethod();
        gm.printArray(countries);
        gm.printArray(ages);
    }
 }