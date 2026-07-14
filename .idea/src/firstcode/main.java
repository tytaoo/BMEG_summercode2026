package firstcode;

class main
{
    public static void main(String[] args) {
        int n = 5;
        int[] fry = {0,1,2,3,4};

        int m = 100;
        int[] bar = new int[m];
        for(int i = 0; i < m; i++){
            bar[i] = i;
        }

        System.out.println("The total number of even numbers in fry is: " + countEvenNum(fry));
        System.out.println("The total number of even numbers in bar is: " + countEvenNum(bar));
    }

    private static int countEvenNum(int[] arr){
        int count = 0;

        for(int num : arr){
            if(num % 2 == 0){
                count++;
            }
        }

        return count;
    }
}