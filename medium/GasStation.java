package medium;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5}; // output: 3
        int[] cost = {3,4,5,1,2};

        int stationIndex = canCompleteCircuit(gas, cost);
        System.out.println("output: " + stationIndex);
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int gasRemaining = 0;
        int start = 0;

        // gathering the total gas and total cost from each array
        for(int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // if total cost is higher than the totalGas, then we cannot travel around the circuit once
        if(totalCost > totalGas) {
            return -1;
        }

        // traveling in the clockwise direction
        for(int i = 0; i < gas.length; i++) {
            // at each station subtract the amount of gas at the current station with the cost of gas of the current station
            gasRemaining = gasRemaining + (gas[i] - cost[i]);

            // if gas Remaining becomes negative, then it means that we need to set start to the next station
            if(gasRemaining < 0) {
                start = i + 1;
                gasRemaining = 0;
            }
        }

        // return the starting station
        return start;
    }
}
