import java.util.Arrays;

public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else if (type.equals("advanced")) {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        sorter.advancedSort(copy);

        long start = System.nanoTime();

        searcher.search(copy, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            int[] randomArray = sorter.generateRandomArray(size);

            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            sorter.advancedSort(sortedArray);

            int target = sortedArray[sortedArray.length / 2];

            System.out.println("Array size: " + size);

            System.out.println("Random array:");
            System.out.println("Bubble Sort time: " + measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Merge Sort time: " + measureSortTime(randomArray, "advanced") + " ns");
            System.out.println("Binary Search time: " + measureSearchTime(randomArray, target) + " ns");

            System.out.println("Sorted array:");
            System.out.println("Bubble Sort time: " + measureSortTime(sortedArray, "basic") + " ns");
            System.out.println("Merge Sort time: " + measureSortTime(sortedArray, "advanced") + " ns");
            System.out.println("Binary Search time: " + measureSearchTime(sortedArray, target) + " ns");

            System.out.println("--------------------------------");
        }
    }
}
