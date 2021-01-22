import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
The Purpose of this program is to develop a fuckton of random numbers and to find all the highest number positions.
This Algorithm should demonstrate key functionality in the (n) number of operations it should take to find all of the highest numbers.

@Author: John Koch: for Personal developmental algorithmic searching 


Post Dev Comments: The algorithm runs at an -0-(n) relationship since it has to run through every element in the array.
    If anyone has any recomendations to decrease the time it takes to find these elements, please feel free to modify or send or comment your 
    suggestions.

    What I learned: Increasing the number of spots on the numList will increase the peaks exponentially.
                    Increasing the number for Randomness will decrease the peaks exponentially.

    This relationship makes perfect sense.

        -John Koch

*/
public class linear {

    private static ArrayList<Integer> numList = new ArrayList<>(); 
    private static ArrayList<Integer> pos = new ArrayList<>(); 
    Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    private static boolean peaksFound = false;
    private static int select, var;
    

    public static void main(String[] args) {

        //Generate new random number sequence
        linear linear = new linear();

        System.out.println("Press and enter any Key to begin algorithm.");
        String start = sc.next();
        
        //########Algorithm Begins#########

        

        while(!peaksFound)
        {
            var = 0;

            for (int i = 0; i < numList.size(); i++) {
                select = numList.get(i);
                if(select >= var)
                { 
                    var = select;
                    if(pos.size() < 1)
                    {
                        pos.add(i);
                    }
                    else if(select > pos.get(0))
                    {
                        pos.clear();
                        pos.add(i);
                    }
                    else
                    {
                        pos.add(i);
                    }
                }
            
            }
            //#########Algorithm Ends#############
            peaksFound = true;
        }
        
        System.out.println("Here are the following positions in numList: " + pos.toString() +
        "\n with a value of " + numList.get(pos.get(0)) + ".");
    }

    linear(){
        for(int i = 0; i <= 100000000; i++) {
            numList.add(i, r.nextInt(1000000));
        }

    }
}