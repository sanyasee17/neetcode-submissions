class Solution {

    /* Move Asteroid - Using Stack */
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();


        for(int asteroid : asteroids) {

            /* Right moving asteroid */
            if(asteroid > 0) {
                stack.push(asteroid);
            } 
            /* Left moving asteroid */
            else {

                /* If there is any right moving small asteroid, it will destroy that */
                while(!stack.isEmpty() 
                        && stack.get(stack.size() - 1) > 0
                        && stack.get(stack.size() - 1) < Math.abs(asteroid)) {

                            stack.pop();
                }

                /* If Right moving asteroid is of same size, both will be destroyed */
                if(!stack.isEmpty() 
                        && stack.get(stack.size() - 1) == Math.abs(asteroid)) {
                            
                            stack.pop();
                }
                /* Edge case - If we have left moving asteroid, 
                    which will not impact another left moving asteroid 
                    so this asteroid will stay */
                else if(stack.isEmpty() || stack.get(stack.size() - 1) < 0) {
                    stack.push(asteroid);
                }
            }

        }

        return stack.stream().mapToInt(Integer :: valueOf).toArray();
    }
}