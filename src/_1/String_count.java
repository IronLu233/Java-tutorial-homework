package _1;import java.util.Scanner;/** * Created by 28013 on 2016/9/6 0006. */public class String_count {    public static void main(String[] args) {        String str = new String();        Scanner scanner = new Scanner(System.in);        if (scanner.hasNext())            str = scanner.nextLine();        int numCount = 0, letterCount = 0, spaceCount = 0;        for (int i = 0; i < str.length(); ++i) {            numCount += Character.isDigit(str.toCharArray()[i]) ? 1 : 0;            letterCount += Character.isLetter(str.toCharArray()[i]) ? 1 : 0;            spaceCount += Character.isDigit(str.toCharArray()[i]) ? 1 : 0;        }        System.out.printf("Number: %d\nDight: %d\nspace: %d", numCount, letterCount, spaceCount);    }}