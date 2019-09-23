import java.util.Scanner;

public class JavaStringBonuses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ================================= JAVA STRING BONUSES
//
//                ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/12/1999
//        output - December 12, 1999
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//        System.out.println("Enter a date MM/DD/YYYY");
//
//        String dateInput = input.nextLine().trim();
//
//        String[] arrOfStr = dateInput.split("/", 3);
//
//        String month = arrOfStr[0];
//        String day = arrOfStr[1];
//        String year = arrOfStr[2];
//
//        switch(month){
//            case "01" :
//                month = "January";
//                break;
//            case "02" :
//                month = "February";
//                break;
//            case "03" :
//                month = "March";
//                break;
//            case "04" :
//                month = "April";
//                break;
//            case "05" :
//                month = "May";
//                break;
//            case "06" :
//                month = "June";
//                break;
//            case "07" :
//                month = "July";
//                break;
//            case "08" :
//                month = "August";
//                break;
//            case "09" :
//                month = "September";
//                break;
//            case "10" :
//                month = "October";
//                break;
//            case "11" :
//                month = "November";
//                break;
//            case "12" :
//                month = "January";
//                break;
//        }
//
//
//        String output = month + " " + day + ", " + year;
//        System.out.println(output);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 7 vowels and 8 consonants
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("Enter a Sentence:");
//        String userInput = input.nextLine();
//
//        String noPeriod = "";
//
//        if(userInput.endsWith(".")){
//            noPeriod = userInput.substring(0, userInput.length()-1);
//        } else{
//            noPeriod = userInput;
//        }
//
//        int vowelCount = 0;
//
//        for (int i = 0; i < userInput.length(); i++) {
//            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
//                vowelCount++;
//            }
//        }
//
//
//        int totalVowels = vowelCount;
//        int totalConsonants = (noPeriod.replaceAll("\\s","").length()) - vowelCount;
//
//        String output = totalVowels + " vowels and " + totalConsonants + " consonants";
//
//        System.out.println(output);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this) asked justin, dont need this step
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!

//        System.out.println("Welcome to the Calculator!");
//        System.out.println("Do you with to enter a new calculation? Y/N");
//
//        String yesNo = input.nextLine();

//        char operator;
//        int answer = 0;
//        int operands = 0;
//
//        if(yesNo.equalsIgnoreCase("y")){
//            System.out.println("How many operands will you calculate?");
//            operands = input.nextInt();
//        }
//        System.out.println(operands);



//        switch (operator){
//            case "+":
//                answer = x + y;
//                break;
//            case "-":
//                answer = x - y;
//                break;
//            case "*":
//                answer = x * y;
//                break;
//            case "/":
//                answer = x / y;
//                break;
//        }


    }
}
