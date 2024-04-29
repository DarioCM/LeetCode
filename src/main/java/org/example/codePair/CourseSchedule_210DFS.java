package org.example.codePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CourseSchedule_210DFS {

    public boolean dfs(int i, List<List<Integer>> adj, boolean[] vis, boolean[] path, Stack<Integer> st) {

        // Stack st -> to store the nodes for ordering in Topo Sort.
        vis[i] = true; // ->  track of visited nodes
        path[i] = true; // -> check for nodes in the current path during DFS

        for (int x : adj.get(i)) {
            if (!vis[x]) {
                if (dfs(x, adj, vis, path, st)) {
                    return true;
                }
            } else if (path[x]) {
                return true;
            }
        }

        path[i] = false;
        st.push(i);
        return false;
    }

    public int[] findOrder(int n, int[][] pre) {

        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < pre.length; i++) {
            adj.get(pre[i][1]).add(pre[i][0]);
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, path, st)) {
                    return new int[0];
                }
            }
        }

        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        CourseSchedule_210DFS dfs = new CourseSchedule_210DFS();

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        int numCourses2 = 4;
        int[][] prerequisites2 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};

        int numCourses3 = 2;
        int[][] prerequisites3 = {};

        dfs.findOrder(numCourses, prerequisites);
        dfs.findOrder(numCourses2, prerequisites2);
        dfs.findOrder(numCourses3, prerequisites3);


    }

}
