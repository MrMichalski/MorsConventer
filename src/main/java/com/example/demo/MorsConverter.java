package com.example.demo;

import java.util.Map;

public class MorsConverter {

    Map<Character, String> characterStringMap;

    public MorsConverter() {
        MorseCodeMap codeMap = new MorseCodeMap();
        characterStringMap = codeMap.buildMap();
    }

    public String convert(String text) {

        StringBuilder mors = new StringBuilder();
        char[] znaki = text.toCharArray();

        for (int i = 0; i < znaki.length; i++) {
            final char c = znaki[i];
            final String s = characterStringMap.get(c);
            mors.append(" ");
            mors.append(s);
        }
        return mors.toString();
    }
}
