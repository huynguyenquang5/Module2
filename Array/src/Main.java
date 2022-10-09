public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double[] array = new double[10];
        array[0] = 5.6;
        array[1] = 4.5;
        array[2] = 3.3;
        array[3] = 13.2;
        array[4] = 4.0;
        array[5] = 34.33;
        array[6] = 34.0;
        array[7] = 45.45;
        array[8] = 99.993;
        array[9] = 11123;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println(array[1]);
        array[1] = array[0] + array[2];
        System.out.println(array[1]);

        double[] arr2 = {1.9, 2.9, 3.9, 4.9};
        for (double v : arr2) {
            System.out.println(v);
        }
    }
}