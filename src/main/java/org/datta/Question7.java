package org.datta;

/**
 * Created by dparupud on 7/19/15.
 *
 * For this Question, I will not answer programmatically because I am assuming you
 * do not want an algorithm implementation using queues and trees. Several are available
 * on the internet.
 *
 * BSF or Breadth First Search is an algorithm used when you have to search through a
 * tree of nodes and you feel the solution is easy to find and not far from the root. You search
 * horizonatally through the nodes and then go down vertically.
 *
 * Say for example you as the CTO is looking for the number of projects in stash for company A then
 * you can follow the following steps
 *
 * a) ask VP of development ( Doug Miller) - No answer then
 * b) ask VP of Run ( Rob Crossley)  No answer the
 * c) ask Architects ..no answer ( you should probably get an answer by now)  or  sr prinicipal engineers
 * d) ask Principal Engineers... ask managers
 *
 *
 * DFS or Depth first Search is an algorithm when you know the answers are few and
 * the possibility of the answer is deep within the graph. You go down vertically and traverse
 * through vertices.
 *
 * Say for example you want to find the answer if the HDS system is using JMS to publish events
 * you can follow the following steps
 *
 * a) ask VP of development ( Doug) no answer then
 * b) ask Jeff Hickey
 * c) ask Sean
 * d) ask Datta ( at this point you should get an answer :) )
 * d) Datta asks Sachin ( from run )
 * e) Sachin asks a developer in run who is currently working on HDS
 *
 * Notice in DFS how you navigate through the vertices and do NOT go back up the chain and traverse back.
 * If Datta could not answer above we did NOT go back to Rob Crossley from Run and then
 * come down the tree.
 *
 *
 * The implementation below is in conjunction with Question 6
 *
 */
public class Question7 {

    public static interface Algorithm {
        void implement();
    }

    public static class BFS implements Algorithm{

        @Override
        public void implement() {

        }
    }

    public static class DFS implements Algorithm{

        @Override
        public void implement() {

        }
    }
}
