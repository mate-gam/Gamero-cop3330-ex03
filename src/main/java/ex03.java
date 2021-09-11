/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gamero Mateo
 */
import java.io.Console;
public class ex03 {
    public static void main (String[] args)
    {
        Console con = System.console();
        String quote = con.readLine("What is the quote? ");
        String author = con.readLine("Who said it? ");
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
