import java.lang.Math;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PickACard {
    public static void main(String[] args){
        int cardsNumber = 52;
        int randomNumber = (int)(Math.random()*13);
        int randomSuit = (int)(Math.random()*5);
        String numberName = "";
        String suitName = "";
        
        switch(randomNumber){
            case 0: numberName = "Ace";
            break;
            case 1: numberName = "2";
            break;
            case 2: numberName = "3";
            break;
            case 3: numberName = "4";
            break;
            case 4: numberName = "5";
            break;
            case 5: numberName = "6";
            break;
            case 6: numberName = "7";
            break;
            case 7: numberName = "8";
            break;
            case 8: numberName = "9";
            break;
            case 9: numberName = "10";
            break;
            case 10: numberName = "Jack";
            break;
            case 11: numberName = "Queen";
            break;
            case 12: numberName = "King";
            break;
        }
        

            switch(randomSuit){
                case 0: suitName = "Clubs";
                break;
                case 1: suitName ="Diamonds";
                break;
                case 2: suitName ="Hearts";
                break;
                case 3: suitName ="Spades";
            }
       
        System.out.println("The card you picked is " + numberName + " of " + suitName + ". ");
    }    
}
