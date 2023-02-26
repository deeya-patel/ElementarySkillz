import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.Font;


public class AnimatedDriver {
    public static void main(String[] args) {
        Font font = new Font("SansSerif", Font.PLAIN, 15);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setFont(font);
        StdDraw.textLeft(0.1, 0.9, "Welcome to ElementarySkillz!");
        StdDraw.textLeft(0.10, 0.7, "1. Learn Simple Math Operations");
        StdDraw.textLeft(0.10, 0.5, "2. Learn Hard Math Operations");
        StdDraw.textLeft(0.1, 0.3, "3. Learn the Alphabet");
        
        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();
                if ('1' == key) {
                    StdDraw.clear();
                    StdDraw.textLeft(0.1, 0.9, "Type '1', '2', '3' or '4' to choose.");
                    StdDraw.textLeft(0.1, 0.7, "1. Addition");
                    StdDraw.textLeft(0.1, 0.5, "2. Subtraction");
                    StdDraw.textLeft(0.1, 0.3, "3. Multiplication");
                    StdDraw.textLeft(0.1, 0.1, "4. Division");
                    while (true) {
                        if (StdDraw.hasNextKeyTyped()) {
                            char button = StdDraw.nextKeyTyped();
                            if ('1' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("addition");
                            }else if ('2' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("subtraction");
                            }else if ('3' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("multiplication");
                            }else if ('4' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("division");
                            }
                        }
                    }
                }else if('2'==key){
                    StdDraw.clear();
                    StdDraw.textLeft(0.1, 0.8, "1. Addition");
                    StdDraw.textLeft(0.1, 0.6, "2. Subtraction");
                    StdDraw.textLeft(0.1, 0.4, "3. Multiplication");
                    StdDraw.textLeft(0.1, 0.2, "4. Division");
                    while (true) {
                        if (StdDraw.hasNextKeyTyped()) {
                            char button = StdDraw.nextKeyTyped();
                            if ('1' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("addition");
                            }else if ('2' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("subtraction");
                            }else if ('3' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("multiplication");
                            }else if ('4' == button) {
                                StdDraw.clear();
                                Project.simpleMathOperations("division");
                            }
                        }
                    }
                }else if('3'==key){
                    StdDraw.clear();
                    Project.learnTheAlphabet();
                }
            }
        }
    }
}

