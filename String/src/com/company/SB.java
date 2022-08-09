package com.company;

import java.util.Scanner;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        Scanner in = new Scanner(System.in);
        String username = in.next();
        System.out.println(username);
    }
}
