class Solution {
    public int calPoints(String[] operations) {

        List<Integer> scores = new ArrayList<>();

        for(String op : operations) {

            if(op.equals("+")) {
                int prev = scores.get(scores.size() - 1);
                int prevPrev = scores.get(scores.size() - 2);
                int newScore = prev + prevPrev;
                scores.add(newScore);
            }
            else if(op.equals("C")) {
                scores.remove(scores.size() - 1);
            }
            else if(op.equals("D")) {
                int prev = scores.get(scores.size() - 1);
                int newScore = 2 * prev;
                scores.add(newScore);
            } else {
                scores.add(Integer.valueOf(op));
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();

    }
}