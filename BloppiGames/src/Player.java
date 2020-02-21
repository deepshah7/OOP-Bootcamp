import rules.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }

    // ***************
    // Fix this method
    public GameRule findBest(GameRule[] rules){
        int max = 0, chosenIndex = 0;
        for (int i = 0; i<rules.length; i++) {
            int ruleResult = rules[i].calculateResult(values);
            if(ruleResult > max) {
                max = ruleResult;
                chosenIndex = i;
            }
        }
        return rules[chosenIndex];
    }
}
