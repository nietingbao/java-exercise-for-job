public class RectCover {
    public int RectCover(int target) {
        if (target < 3) return target;
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 3; i <= target ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
