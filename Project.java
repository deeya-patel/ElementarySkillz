import java.util.*;
import java.awt.*;
import java.io.File;
import java.awt.Font;

public class Project {
    
    public Project() {
        
    }

    public static int getSimpleNumber1() { 
        return StdRandom.uniform(0, 6);
    }
    public static int getSimpleNumber2() { 
        return StdRandom.uniform(1, 6);
    }
    public static int getHardNumber1() { 
        return StdRandom.uniform(0, 16);
    }
    public static int getHardNumber2() { 
        return StdRandom.uniform(1, 16);
    } 

    



    public static void mathInputs(String equation, int solution, int difficulty, String operation){
        StdDraw.textLeft(0.1,0.9, "Click Space to check your answer.");
        StdDraw.textLeft(0.1,0.7, "Solve the equation:");
        StdDraw.textLeft(0.1,0.5,equation);
        if(operation.equals("division")){
            StdDraw.textLeft(0.1, 0.8,"Round down to the nearest whole number.");
        }
        String answer = "";
        char key;
        int ans;
        while(true){
            if(StdDraw.hasNextKeyTyped()){
                key = StdDraw.nextKeyTyped();
                if (key == 32){
                    ans = Integer.parseInt(answer);
                    StdDraw.clear();
                    if(ans != solution){
                        StdDraw.text(0.4,0.7,"Incorrect. Try Another (Click Space) or Click q to quit.");
                        while(true){
                            if(StdDraw.hasNextKeyTyped()){
                                if(StdDraw.nextKeyTyped()==32){
                                    StdDraw.clear();
                                    mathChoices(difficulty, operation);
                                }
                            }
                            if(StdDraw.hasNextKeyTyped()){
                                if(StdDraw.nextKeyTyped()==113){
                                    cancel();
                                }
                            }
                        }
                    }else if(ans == solution){
                        StdDraw.text(0.4,0.7,"Correct! Try Another (Click Space) or Click q to quit.");
                        while(true){
                            if(StdDraw.hasNextKeyTyped()){
                                if(StdDraw.nextKeyTyped()==32){
                                    StdDraw.clear();
                                    mathChoices(difficulty, operation);
                                }
                            }
                            if(StdDraw.hasNextKeyTyped()){
                                if(StdDraw.nextKeyTyped()==113){
                                    cancel();
                                }
                            }
                        }
                    }
                }else if((key>=48 && key<=57) || key==45|| key==46){
                    answer += key;
                    StdDraw.textLeft(0.1,0.3,answer);
                }
            }
        }        
    }

    public static void mathChoices(int difficulty, String operation){
        if(difficulty == 1){
            if(operation.equals("addition")){
                simpleMathOperations("addition");
            }else if(operation.equals("subtraction")){
                simpleMathOperations("subtraction");
            }else if(operation.equals("multiplication")){
                simpleMathOperations("multiplication");
            }else if(operation.equals("division")){
                simpleMathOperations("division");
            }
        }else if(difficulty == 2){
            if(operation.equals("addition")){
                complicatedMathOperations("addition");
            }else if(operation.equals("subtraction")){
                complicatedMathOperations("subtraction");
            }else if(operation.equals("multiplication")){
                complicatedMathOperations("multiplication");
            }else if(operation.equals("division")){
                complicatedMathOperations("division");
            }
        }
    }
    
    public static void cancel(){
        StdDraw.clear();
        AnimatedDriver.main(null);
    }
    
    public static void simpleMathOperations(String operation){        
        if (operation.toLowerCase().equals("addition")){
            int x = getSimpleNumber1();
            int y = getSimpleNumber2();
            mathInputs(x + " + " + y + " = ",x + y, 1, "addition");
        }else if (operation.toLowerCase().equals("subtraction")){
            int x = getSimpleNumber1(); 
            int y = getSimpleNumber2(); 
            mathInputs(x + " - " + y + " = ",x - y, 1, "subtraction");
        }else if (operation.toLowerCase().equals("multiplication")){
            int x = getSimpleNumber1();
            int y = getSimpleNumber2();
            mathInputs(x + " * " + y + " = ",x * y, 1, "multiplication");
        }else if (operation.toLowerCase().equals("division")){
            int x = getSimpleNumber1();
            int y = getHardNumber2();
            mathInputs(x + " / " + y + " = ", x / y, 1, "division");
        }
    }
   
    public static void complicatedMathOperations(String operation){
        if (operation.toLowerCase().equals("addition")){
            int x = getHardNumber1();
            int y = getHardNumber2();
            mathInputs(x + " + " + y + " = ",x + y, 1, "addition");
        }else if (operation.toLowerCase().equals("subtraction")){
            int x = getHardNumber1(); 
            int y = getHardNumber2(); 
            mathInputs(x + " - " + y + " = ",x - y, 1, "subtraction");
        }else if (operation.toLowerCase().equals("multipliciation")){
            int x = getHardNumber1();
            int y = getHardNumber2();
            mathInputs(x + " * " + y + " = ",x * y, 1, "multiplication");
        }else if (operation.toLowerCase().equals("division")){
            int x = getHardNumber1();
            int y = getHardNumber2();
            mathInputs(x + " / " + y + " = ", x / y, 1, "division");
        }
    }
  
    public static void alphabetRecur(Character[] alphabet){
        char userLetter;
        while(true){
                int index = StdRandom.uniform(1, 26);
                char letter = alphabet[index];
                StdDraw.textLeft(.1, .5, "What letter comes after " + letter + "? (Click q to quit)");
                while (true){
                    if (StdDraw.hasNextKeyTyped()){
                        userLetter = StdDraw.nextKeyTyped();
                        if(userLetter==alphabet[index+1]) {
                            StdDraw.clear();
                            StdDraw.textLeft(.1, .5, "Correct! Try Another (Click Space) or Click q to quit.");
                            while(true){
                                if(StdDraw.hasNextKeyTyped()){
                                    if(StdDraw.nextKeyTyped()==32){
                                        StdDraw.clear();
                                        learnTheAlphabet();;
                                    }   
                                }
                                if(StdDraw.hasNextKeyTyped()){
                                    if(StdDraw.nextKeyTyped()==113){
                                        cancel();
                                    }
                                }
                            }
                        }
                        else if (userLetter != alphabet[index+1]){
                            StdDraw.clear();
                            StdDraw.textLeft(.1, .5, "Incorrect. Try Another (Click Space) or Click q to quit.");
                            StdDraw.textLeft(.1, .7, "The correct answer is "+ alphabet[index+1] + ".");
                            while(true){
                                if(StdDraw.hasNextKeyTyped()){
                                    if(StdDraw.nextKeyTyped()==32){
                                        StdDraw.clear();
                                        learnTheAlphabet();;
                                    }   
                                }
                                if(StdDraw.hasNextKeyTyped()){
                                    if(StdDraw.nextKeyTyped()==113){
                                        cancel();
                                    }
                                }
                            }
                            
                        }
                    }
                }   
            
        }
    }


  
    public static void learnTheAlphabet(){
        Character[] alphabet = {'a', 'b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        while(true){
            //49-57
            StdDraw.clear();
            alphabetRecur(alphabet);
        }        
    }
    

}


