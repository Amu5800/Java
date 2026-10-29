
import java.util.ArrayList;

public class CombinationSum {

    public static void findCombinations(
            int[] candidates,
            int target,
            int start,
            ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {

        // Base case: target becomes zero
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each candidate
        for (int i = start; i < candidates.length; i++) {

            // Skip numbers greater than the remaining target
            if (candidates[i] > target) {
                continue;
            }

            // Choose the current number
            current.add(candidates[i]);

            // Recursion: reuse the same number if needed
            findCombinations(
                    candidates,
                    target - candidates[i],
                    i,
                    current,
                    result);

            // Backtrack: remove the chosen number
            current.remove(current.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(
            int[] candidates, int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();

        findCombinations(candidates, target, 0, current, result);

        return result;
    }

    public static void main(String[] args) {

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        ArrayList<ArrayList<Integer>> result = combinationSum(candidates, target);

        System.out.println(result);
    }
}
