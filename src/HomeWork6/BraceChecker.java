package HomeWork6;

import java.util.Stack;

public class BraceChecker {
    private final String text;

    // Փակագծի + նրա ինդեքսը պահելու համար փոքր ներմուծային կլաս
    private static class BraceInfo {
        char brace;
        int index;

        BraceInfo(char brace, int index) {
            this.brace = brace;
            this.index = index;
        }
    }

    public BraceChecker(String text) {
        this.text = text;
    }

    // Վերադարձ չի անում, բայց տպում է սխալների մասին հաղորդագրություններ կամ ոչինչ՝ եթե ամեն ինչ ठीक է
    public void check() {
        Stack<BraceInfo> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Եթե հանդիպում ենք բացվող փակագիծ — պահում ենք նրա տեսակը և ինդեքսը
            if (c == '(' || c == '[' || c == '{') {
                stack.push(new BraceInfo(c, i));
            }

            // Եթե հանդիպում ենք փակող փակագիծ — պետք է ստուգենք համապատասխանությունը
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    // Պակաս գոյություն ունեցող բացվող
                    System.out.println("Error: closed " + c + " but not opened at " + i);
                    return;
                } else {
                    BraceInfo opened = stack.peek(); // միայն տեսնու՝ ինչով է բացվել
                    if (isMatching(opened.brace, c)) {
                        stack.pop(); // ճիշտ համապատասխանություն — հանում ենք
                    } else {
                        // Չհամապատասխանում են՝ օրինակ opened '[' but closed ')' at 16
                        System.out.println("Error: opened " + opened.brace + " but closed " + c + " at " + i);
                        return;
                    }
                }
            }
            // այլ նիշերը անտեսում ենք
        }

        // Վերջում՝ եթե դեռ կան բացված փակագծեր՝ դրանք չեն փակվել
        if (!stack.isEmpty()) {
            // Կարող ենք տպել բոլոր մնացած բացվածները կամ առաջինը — այստեղ տպում ենք բոլորն՝ հերթով
            while (!stack.isEmpty()) {
                BraceInfo b = stack.pop();
                System.out.println("Error: opened " + b.brace + " at " + b.index + " but not closed");
            }
            return;
        }

        // Եթե ոչ մի սխալ չկա՝ կարող ենք ոչինչ չարտածել կամ տպել OK հաղորդագրություն
        System.out.println("All braces are properly matched.");
    }

    // Հետաքրքիր մի կ_HELP՝ գցում ենք թե ընթացիկ открытый և փակող զույգը համապատասխան են թե ոչ
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}

