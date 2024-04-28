package org.example;

class Player {

    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {

        //get all available boxes
        int sumOfBoxes = 0;
        int numOfStacks = boxes.length;
        for (int box : boxes) {
            sumOfBoxes += box;
        }
        StringBuilder sb = new StringBuilder();

        //System.out.println("sumOfBoxes " + sumOfBoxes);
        //System.out.println("clawPos " + clawPos);
        //System.out.println("boxInClaw " + boxInClaw);

        // how the boxes should be organized
        int[] target = new int[numOfStacks];
        while (sumOfBoxes != 0) {
            for (int i = 0; i < numOfStacks; i++) {
                if (sumOfBoxes != 0) {
                    target[i] += 1;
                    sumOfBoxes -= 1;
                }
            }
        }
        //System.out.print(Arrays.toString(target));

        //At any position check if a boxed to be placed
        if (boxInClaw && boxes[clawPos] < target[clawPos]) {
            //return "PLACE";
            sb.append("PLACE");
            sb.append("|");
        }

        // #4 At any position check if a boxed to be picked
        if (!boxInClaw && boxes[clawPos] > target[clawPos]) {
            //return "PICK";
            sb.append("PICK");
            sb.append("|");
        }

        //Invalid Input: Expected LEFT|RIGHT|PICK|PLACE but got ''
        for (var i = clawPos; i < numOfStacks; i++) {
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

        // #6 Check if should go left
        for (var i = clawPos; i < numOfStacks; i--) {
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

    /* Ignore and do not change the code below */
    public static void main(String[] args) {
        Player player = new Player();
        int[] boxes = {3, 1, 2, 2};
        String result = solve(0, boxes, false);
        System.out.println(result);
    }

}