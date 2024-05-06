package org.example.arrays;

public class GasStation_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        var startingPoint = 0;
        var gasAvailable = 0;
        var gasUsed = 0;
        var paid = 0;

        for (int station = 0; station < gas.length; station++) {
            gasUsed += gas[station];
            paid += cost[station];
            gasAvailable += gas[station] - cost[station];
            if (gasAvailable < 0) {
                gasAvailable = 0;
                startingPoint = station + 1;
            }
        }

        return paid > gasUsed ? -1 : startingPoint;
    }

}
