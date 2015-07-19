package org.datta;

/**
 * Created by dparupud on 7/19/15.
 * Answer to Question 6
 *
 * Strategy design pattern is a design pattern where we decide at runtime what implementation/algorith to be used based
 * on some condition.
 *
 * Below example we are deciding to use the Breadth first Search algorith or the Depth First Search Algorithm. Please
 * see answer to question 7 to get a complete picture why "stash" was being passed.
 */
public class Question6 {

    public static void main(String[] args) {
        String strategy = args[0];
        Question7.Algorithm algorithm = null;

        if(strategy.equalsIgnoreCase("stash")){
             algorithm = new Question7.BFS();

        }else {
            algorithm = new Question7.DFS();
        }

        algorithm.implement();
    }

}
