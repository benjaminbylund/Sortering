/*  Benjamin Bylund
    2018-03-02
    Four ways to sort with SelectionSort.
*/

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int [] numbers1 = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        double[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        String[] words = {"alex", "cecilia", "ben",};
        String[] words1 = {"alex", "cecilia", "ben",};

        selSortD(numbers);
        selSort(numbers1);
        selSortStringAlpha(words1);
        selSortStringLength(words);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words1));
        }


    public static void selSort(int[] numbers) {

        for (int i = 0 ; i < numbers.length ; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            swap(numbers, min, i);
        }
    }


    public static void selSortD(double[] numbers) {
        for (int i = 0 ; i < numbers.length ; i++) {
            int max = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            swap(numbers, max, i);
        }

    }


    public static void selSortStringLength(String[] words) {

        for (int i = 0 ; i < words.length ; i++) {
            int min = i;
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() < words[min].length()) {
                    min = j;
                }
            }
            swap(words, min, i);
        }


    }
    public static void selSortStringAlpha(String[] words) {
        for (int i = 0 ; i < words.length ; i++) {
            int min = i;
            for (int j = i + 1; j < words.length; j++) {

                if (words[j].compareTo(words[min]) == -1) {
                    min = j;
                }
            }
            swap(words, min, i);
        }
    }

    private static void swap(int[] numbers, int min, int i) {
        int tmp = numbers[min];
        numbers[min] = numbers[i];
        numbers[i] = tmp;
    }

    private static void swap(double[] numbers, int max, int i) {
        double tmp = numbers[max];
        numbers[max] = numbers[i];
        numbers[i] = tmp;
    }

    private static void swap(String[] words, int min, int i) {
        String tmp = words[min];
        words[min] = words [i];
        words[i] = tmp;
    }

}
