public class JumpFloor {
    public int JumpFloor(int target) {
        if (target < 3) {
            return target;
        }
        long lowStep = 1;
        long highStep = 2;
        long result = 0;
        for (int i = 3; i <= target ; i++) {
            result = lowStep + highStep;
            lowStep = highStep;
            highStep = result;
        }
        return (int)result;
    }
}
