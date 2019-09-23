public class ExtraMethodsExercises {

    public static void main(String[] args) {
        countVowels("extra banana operator");
        System.out.println(countCapitalLetters("AAAbbCCC"));
        printEveryLetterRecursion("Banana");

        System.out.println(isPalindrome("Bob"));
    }

    public static void countVowels(String word) {
        int a = countAs(word);
        int e = countEs(word);
        int i = countIs(word);
        int o = countOs(word);
        int u = countUs(word);

        System.out.println("|==============Vowel Count==============|");
        System.out.println("| A's\t| E's\t| I's\t| O's\t| U's\t|");
        System.out.println(String.format("| %d\t\t| %d\t\t| %d\t\t| %d\t\t| %d\t\t|", a, e, i, o, u));
        System.out.println("|=======================================|");

    }

    public static int countAs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public static int countEs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                count++;
            }
        }
        return count;
    }

    public static int countIs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'i' || word.charAt(i) == 'I') {
                count++;
            }
        }
        return count;
    }

    public static int countOs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'o' || word.charAt(i) == 'O') {
                count++;
            }
        }
        return count;
    }

    public static int countUs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < word.length(); i++) {
            if (capitals.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String getType(int input) {
        return "Integer";
    }

    public static String getType(boolean input) {
        return "Boolean";
    }

    public static String getType(String input) {
        return "String";
    }

    public static String getType(char input) {
        return "Char";
    }

    public static String getType(double input) {
        return "Double";
    }

    public static void printEveryLetterRecursion(String input) {
        if (input.equals("")) {

        } else {
            System.out.print(input.charAt(0));
            printEveryLetterRecursion(input.substring(1));
        }
    }

    public static boolean isPalindrome(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equalsIgnoreCase(reversed);
    }
}