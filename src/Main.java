import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1.Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
        System.out.println("Enter your height(m): ");
        double height=input.nextDouble();

        System.out.println("Enter your weight(kg): ");
        double weight=input.nextDouble();

        double bmi=weight/(height*height);
        System.out.println("BMI= " + bmi);

        //2.Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
        System.out.print("\nYour marks: ");
        double opptainedMarks = input.nextDouble();

        System.out.print("\nTotal marks: ");
        double totalMarks = input.nextDouble();

        double percentage = (opptainedMarks/totalMarks) * 100;
        System.out.println("\nPercentage= " + percentage +"%");

        //3.Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
        System.out.print("\nThe money you want to exchange: ");
        double money=input.nextDouble();

        System.out.print("\nExchange rate(0.00 - 1.00): ");
        double exchangeRate=input.nextDouble();

        double amount = money*exchangeRate;
        System.out.println("\nAmount= " + amount);

        //4.Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
        input.nextLine();
        System.out.print("\nEnter your sentence: ");
        String stringInput = input.nextLine();

        StringBuilder reverseString = new StringBuilder(stringInput);
        System.out.println("Length of the string: "+reverseString.length() + " And Reversed string: " + reverseString.reverse());

        //5.Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
        System.out.println("\nEnter your sentence: ");
        String sentence = input.nextLine();

        System.out.println("starting index: ");
        int start=input.nextInt();

        System.out.println("Ending index: ");
        int end=input.nextInt();

        System.out.println(sentence.substring(start,end));

        //6.Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
        input.nextLine();
        System.out.println("\nEnter your sentence: ");
        String sentenceEx6 = input.nextLine();

        System.out.println("Enter a keyword: ");
        String keyword = input.next();

        System.out.println("is \""+keyword+"\" present in the sentence? " + sentenceEx6.contains(keyword));

        //7.Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
        input.nextLine();
        System.out.println("\nEnter a sentence: ");
        String sentenceEx7 = input.nextLine();

        System.out.println("Which word do you want to replace: ");
        String wordToReplace = input.next();

        System.out.println("What word do you want to replace it with? ");
        String replacementWord = input.next();

        System.out.println(sentenceEx7.replace(wordToReplace,replacementWord));

        //8.Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
        System.out.println("\nEnter the first word: ");
        String firstWord=input.next();

        System.out.println("Enter the second word: ");
        String secondWord=input.next();

        System.out.println("Are they equals(ignoring case)? "+firstWord.equalsIgnoreCase(secondWord));

    }
}