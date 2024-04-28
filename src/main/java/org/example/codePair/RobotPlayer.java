package org.example.codePair;


import java.util.Arrays;

public class RobotPlayer {

    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {

        int sumOfBoxes = 0;
        int numOfStacks = boxes.length;
        for (int box : boxes) {
            sumOfBoxes += box;
        }
        StringBuilder sb = new StringBuilder();

        int[] target = new int[numOfStacks];
        while (sumOfBoxes != 0) {
            for (int i = 0; i < numOfStacks; i++) {
                if (sumOfBoxes != 0) {
                    target[i] += 1;
                    sumOfBoxes -= 1;
                }
            }
        }
        System.out.print(Arrays.toString(target));

        if (boxInClaw && boxes[clawPos] < target[clawPos]) {
            //return "PLACE";
            sb.append("PLACE");
            sb.append("|");
        }

        if (!boxInClaw && boxes[clawPos] > target[clawPos]) {
            //return "PICK";
            sb.append("PICK");
            sb.append("|");
        }

        for (int i = clawPos; i < numOfStacks; i++) {
            if (boxInClaw) {
                if (boxes[i] < target[i]) {
                    //return "RIGHT";
                    sb.append("RIGHT");
                    sb.append("|");
                }
            } else {
                if (boxes[i] > target[i]) {
                    //return "RIGHT";
                    sb.append("RIGHT");
                    sb.append("|");
                }
            }
        }

        for (int i = numOfStacks; i < clawPos; i--) {
            if (boxInClaw) {
                if (boxes[i] < target[i]) {
                    //return "LEFT";
                    sb.append("LEFT");
                    sb.append("|");
                }
            } else {
                if (boxes[i] > target[i]) {
                    //return "LEFT";
                    sb.append("LEFT");
                    sb.append("|");
                }
            }
        }



        return sb.toString();
    }

    public static void main(String[] args) {
        RobotPlayer player = new RobotPlayer();
        int[] boxes = {3, 1, 2, 2};
        String result = solve(0, boxes, false);
        System.out.println(result);
    }

}
// LEFT|RIGHT|PICK|PLACE