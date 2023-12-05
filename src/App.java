import org.apache.commons.lang3.time.StopWatch;

public class App {
    public static void main(String[] args) {

        StopWatch s = new StopWatch();
        int size = 5000;
        int[] array = fillRandom(size);

        s.start();
        selectionSort(array.clone());
        s.stop();
        //System.out.println("Time for selection sort:\t" + s.getNanoTime());
        s.reset();

        s.start();
        insertionSort(array.clone());
        s.stop();
        //System.out.println("Time for insertion sort:\t" + s.getNanoTime());
        s.reset();

        s.start();
        mergeSort(array.clone());
        s.stop();
        //System.out.println("Time for merge sort:\t\t" + s.getNanoTime());
        s.reset();

        s.start();
        mergeSort(array.clone());
        s.stop();
        //System.out.println("Time for quick sort:\t\t" + s.getNanoTime());
        s.reset();

        s.start();
        heapSort(array.clone());
        s.stop();
        //System.out.println("Time for heap sort:\t\t" + s.getNanoTime());
        s.reset();

        /*System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }*/
    }

    public static void selectionSort(int[] arr) {
       
    }

    public static void insertionSort(int[] arr) {
        
    }

    public static void mergeSort(int[] arr) {
        
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        
    }

    public static void quickSort(int[] arr, int low, int high) {
        
    }

    /*private static int partition(int[] arr, int low, int high) {
        
    }*/

    public static void heapSort(int[] arr) {
        
    }

    private static void heapify(int[] arr, int n, int i) {
        
    }

    public static int[] fillRandom(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = (int)(Math.random()*1000);
        }
        return arr;
    }

    public static int[] fillReverse(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = n - i;
        }
        return arr;
    }

    public static int[] fillMostlySorted(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            //include only 5ish random elements
            if(n - i < 5)
                arr[i] = (int)(Math.random()*1000);
            else
                arr[i] = i;
        }
        return arr;
    }
}
