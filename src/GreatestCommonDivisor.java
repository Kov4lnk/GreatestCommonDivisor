public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10){
            return -1;
        }
        int minValue;
        int divider = 1;
        int common = 0;
        if (first > second) {
            minValue = second;
        } else {
            minValue = first;
        }
        while (minValue >= divider ){
            if ((first % divider == 0)&&(second % divider == 0)){
                common = divider;
            }
            divider += 1;
        }
        return common;
    }
}
