public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (popA.length == 0||pushA.length==0 ||popA.length!=pushA.length)
            return false;
        int index = -1;
        for (int i = 0; i < pushA.length; i++) {
            if (pushA[i] == popA[0]) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false;
        for (int i = 0; i < index; i++) {
            if (pushA[i] != popA[popA.length - 1 - i])
                return false;
        }
        return true;
    }
}
