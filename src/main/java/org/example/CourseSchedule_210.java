package org.example;

import java.util.*;

public class CourseSchedule_210 {

    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        //Map to model the Graph!
        Map<Integer, List<Integer>> mapGraph = new HashMap<Integer, List<Integer>>();
        //to save the indegree of each node in the graph
        int[] indegree = new int[numCourses];
        //The output or the correct sequence of courses
        int[] topologicalOrder = new int[numCourses];

        //to know where we are and where can we go
        for (int i = 0; i < prerequisites.length; i++) {
            // there is always 2
            int destination = prerequisites[i][0];
            int origin = prerequisites[i][1];
            // adjacency list -> return the destinations depends on the source or an empty arraylist
            List<Integer> lst = mapGraph.getOrDefault(origin, new ArrayList<Integer>());
            lst.add(destination);
            mapGraph.put(origin, lst);
            indegree[destination] += 1;
        }
        //System.out.println("indegree >>>> " + Arrays.toString(indegree));

        //mapGraph.forEach((key, value) -> System.out.println(key + ":" + value));

        //A Queue to save nodes with indegree == 0
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        //q.forEach(v -> System.out.println("Q " + v));

        int i = 0;
        //poping out the indegree == 0 nodes from the graph
        //and store them in the output(topologicalOrder),
        //until the queue is empty
        while (!q.isEmpty()) {
            int node = q.remove();
            topologicalOrder[i++] = node;
            //If the graph contains the node,
            //it updates the indegree of its neighbors
            if (mapGraph.containsKey(node)) {
                for (Integer neighbor : mapGraph.get(node)) {//that means where we can go
                    //decreases the indgree of the neighbor
                    indegree[neighbor]--;
                    //If the neighboring node has no
                    //other neighbors(becomes indegree == 0),
                    //adds it to the queue
                    if (indegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
        }

        //q.forEach(v -> System.out.println("indegree " + v));
        //System.out.println("Result " + Arrays.toString(topologicalOrder));

        if ( prerequisites.length == 0 ) {
            int j = 0;
            for(int course : topologicalOrder){
                topologicalOrder[--numCourses] = j++;
            }
            //System.out.println("Result " + Arrays.toString(topologicalOrder));
            return topologicalOrder;
        }

        //Returns the suitable order of the courses
        if (i == numCourses) {
            return topologicalOrder;
        }

        //If there was no suitable order, return null array
        int arr[] = {};
        return arr;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        int numCourses2 = 4;
        int[][] prerequisites2 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        //System.out.println();
        //findOrder(numCourses, prerequisites);

        //System.out.println();
        //findOrder(numCourses2, prerequisites2);

        int numCourses3 = 2;
        int[][] prerequisites3 = {};
        findOrder(numCourses3, prerequisites3);

    }

}
