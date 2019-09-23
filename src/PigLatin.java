
public class PigLatin {

    public static void main(String[] args) {
        // convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//        check string for vowels
//        make substring in front of vowel
//        append to end of string with ay added

//        String word1 = "cat";
//      String pigLatinWord = word1
//          .trim()
//          .toLowerCase()
//          .substring(1)
//          .concat(word1.substring(0, 1).toLowerCase())
//          .concat("ay");
//      System.out.println(pigLatinWord);

        String cat = "cat"; // "atcay"
        int firstVowel = 0;
        String firstSubstring = "";

        for(int i=0; i<cat.length(); i++) {
            if(cat.charAt(i) == 'a'|| cat.charAt(i) == 'e'|| cat.charAt(i) == 'i' || cat.charAt(i) == 'o' || cat.charAt(i) == 'u') {
                firstVowel = i;
                firstSubstring = cat.substring(i);
            }
        }
        String pigOut = firstSubstring + cat.substring(0, firstVowel) + "ay";

        System.out.println(pigOut);


    }
}
