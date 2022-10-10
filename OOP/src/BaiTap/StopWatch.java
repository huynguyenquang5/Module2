package BaiTap;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        long[] arr = new long[100000];
        for (int i = 0; i < arr.length; i++){
                arr[i] = (long) (Math.random() * 100);
            }
        watch.start();
        for(int i = 0;i < arr.length-1; i++){
            for(int j = i + 1;j < arr.length; j++){
                if(arr[i] > arr[j]){
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        watch.stop();
        }
    }


