public class Main {
    public static void main(String[] args) {
        aloritms f = new aloritms();

        // Напишите программу на Java, чтобы найти наименьшее окно в
        // строке, содержащей все символы другой строки.
        String str1 = "Hello, my name is Arsenii";
        String str2 = ",";
        System.out.println(f.First(str1, str2));

        // Напишите программу на Java, чтобы проверить,
        // являются ли две данные строки вращением друг друга.
        String str_norm = "Hi";
        String str_rev = "iH";
        System.out.println(f.Second(str_norm, str_rev));

        //Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
        String hi = "Hello";
        int size = hi.length()-1;
        f.Third(hi, size);

        //Дано два числа, например 3 и 56, необходимо составить следующие
        // строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
        // Используем метод StringBuilder.append().
        System.out.println(f.Fours(3, 4));

        //Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        String f1 = "3 + 5 = 5";
        System.out.println(f.Fives(f1, "=", "is"));
        System.out.println(f.Sixes(f1, "=", "is"));






    }
}