package org.example;

import java.util.*;

public class CourseSchedule_210B {

    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> mapGraph = new HashMap<Integer, List<Integer>>();
        int[] indegree = new int[numCourses]; //Indegree of a vertex is defined as the number of incoming edges incident on a vertex in a directed graph.
        int[] topologicalOrder = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = mapGraph.getOrDefault(src, new ArrayList<Integer>());
            lst.add(dest);
            mapGraph.put(src, lst);
            indegree[dest] += 1;
        }
        System.out.println("---------------");
        System.out.println("indegree >>>> " + Arrays.toString(indegree));
        mapGraph.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println("---------------");

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
            //If the graph contains the node, it updates the indegree of its neighbors
            if (mapGraph.containsKey(node)) {
                for (Integer neighbor : mapGraph.get(node)) { // it returns a list with the posible next nodes
                    //decreases the indgree of the neighbor
                    indegree[neighbor]--;
                    //If the neighboring node has no other neighbors(becomes indegree == 0), adds it to the queue
                    if (indegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
        }

        //System.out.println("Result >> " + Arrays.toString(topologicalOrder));

        //Returns the suitable order of the courses
        if (i == numCourses) {
            return topologicalOrder;
        }

        //If there was no suitable order, return null array
        return new int[0];
    }


    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        int numCourses2 = 4;
        int[][] prerequisites2 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        int numCourses3 = 2;
        int[][] prerequisites3 = {};

        findOrder(numCourses, prerequisites);
        findOrder(numCourses2, prerequisites2);
        findOrder(numCourses3, prerequisites3);


    }

}



