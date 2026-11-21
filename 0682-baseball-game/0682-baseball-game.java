
class Solution {
    public int calPoints(String[] operations) {

        int[] arr = new int[operations.length];
        int size = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                size--;
            }
            else if (operations[i].equals("D")) {
                arr[size] = arr[size - 1] * 2;
                size++;
            }
            else if (operations[i].equals("+")) {
                arr[size] = arr[size - 1] + arr[size - 2];
                size++;
            }
            else {
                arr[size] = Integer.parseInt(operations[i]);
                size++;
            }
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
