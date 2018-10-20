package com.company;

public class Main {

    public static void main(String[] args) {
    printCapsAlphabet();
    }

    public static void printCapsAlphabet(){
        char alpha = 'A'; //'A' == 65
        for(int i = 0 ; i < 26; i++){

            if(alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U')
            {System.out.println("VOWEL");}
            else {
                System.out.println(alpha);
        }
        alpha++;
    }
}}