package org.example.graph.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CloneGraph_133 {

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        var map = new HashMap<Node, Node>();
        var queue = new LinkedList<Node>();
        queue.add(node);

        while (!queue.isEmpty()) {

            var originalNode = queue.poll();
            var clonedNode = map.get(originalNode);

            if (clonedNode == null) {
                clonedNode = new Node(node.val, new ArrayList<>());
                map.put(originalNode, clonedNode);
            }

            for (var originalNeighborNode : originalNode.neighbors) {
                var clonedNeighborNode = map.get(originalNeighborNode);
                if (clonedNeighborNode == null) {
                    clonedNeighborNode = new Node(originalNeighborNode.val, new ArrayList<>());
                    map.put(originalNeighborNode, clonedNeighborNode);
                    queue.add(originalNeighborNode);
                }
                clonedNode.neighbors.add(map.get(originalNeighborNode));
            }
        }
        return map.get(node);
    }

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

}
