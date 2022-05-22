package pl.piotr.holda.codingtask;

public class LinearIn {

    public static void main(String[] args) {
/*
        Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

        linearIn([1, 2, 4, 6], [2, 4]) == true
        linearIn([1, 2, 4, 6], [2, 3, 4]) == false
        linearIn([1, 2, 4, 4, 6], [2, 4]) == true
*/
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}) == true);
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}) == false);
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}) == true);
        System.out.println(linearIn(new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}) == true);
        System.out.println(linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}) == true);
        System.out.println(linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}) == false);
        System.out.println(linearIn(new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}) == true);
        System.out.println(linearIn(new int[]{1, 2, 3}, new int[]{2}) == true);
        System.out.println(linearIn(new int[]{1, 2, 3}, new int[]{-1}) == false);
        System.out.println(linearIn(new int[]{1, 2, 3}, new int[]{}) == true);
        System.out.println(linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}) == true);
        System.out.println(linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}) == false);
        System.out.println(linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}) == false);
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int outer_left = 0;
        int outer_right = outer.length - 1;
        int inner_left = 0;
        int inner_right = inner.length - 1;
        while (inner_left <= inner_right ) {
            if (outer_left > outer_right) {
                return false;
            }
            if (outer[outer_left] > inner[inner_left]) {
                return false;
            }
            if (outer[outer_left] == inner[inner_left]) {
                outer_left = outer_left + 1;
                inner_left = inner_left + 1;
                continue;
            }
            if (outer[outer_left]  < inner[inner_left]) {
                outer_left = outer_left + 1;
            }
        }
        return true;
    }

}
