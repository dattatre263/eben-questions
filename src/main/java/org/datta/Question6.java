package org.datta;

/**
 * Created by dparupud on 7/19/15.
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
