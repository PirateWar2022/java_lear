public class Main {
    public static void main(String[] args) {

        // Your goal in this kata is to implement a difference function,
        // which subtracts one list from another and returns the result.
        int[] first = {2, 2, 2, 3, 1};
        int[] second = {2, 2, 2};
        Kata kata = new Kata(first, second);
        System.out.println(kata.findDifference());

        //Your task is to write a function that takes a string and return
        // a new string with all vowels removed.
        String str_vocal = "Hello, my name is Arseenii";
        DisemvowelTrolls disemvowelTrolls = new DisemvowelTrolls(str_vocal);
        System.out.println(disemvowelTrolls.unvocal());

    }
}