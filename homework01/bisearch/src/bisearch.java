import java.util.Arrays;

public class bisearch {
    public static void main(String[] args) {
        int[] mass = {0,1,2,3,4,5,6,7,8,9,10};
        int i = search(9, mass);
        System.out.println(i);
    }

    public static int search(int key, int[] arr) {
        int result = -1;
        int i = arr.length / 2;
        int l = 0;
        int r = arr.length;
        boolean isDone = false;
        while (!isDone) {
            i = l + ((r - l) / 2);
            isDone = (l == r);

            if (key > arr[i]) {
                l = i;
            }
            else if (key < arr[i]) {
                r = i;
            }
            else {
                isDone = true;
                if (key == arr[i])
                    result = i;
            }
        }

        return result;
    }
}
