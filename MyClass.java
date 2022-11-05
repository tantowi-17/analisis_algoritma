public class MyClass {
    public static void main(String args[]) {
     // Algoritma 1
        int[] max = new int[10];
        int a = 10;

        System.out.println("-----------Algoritma 1--------------");
        for (int i = 2; i < max.length; i++) {
            if (i < 5) {
                a = i;
                System.out.println("return :" +a);
            }
        }

        // Algoritma 2
        int[] linearSearch = new int[10];
        int b = 5;
        int q = 0;
        System.out.println("-----------Algoritma 2--------------");
        while (q <= linearSearch.length) {
            if (b <= q) {
                q = q;
                System.out.println("location :" +q);
            } else {
                System.out.println("location : Not Found");
            }
            q++;
        }

        // Algoritma 3
        int[] i1 = new int[20];
        int[] j = new int[30];
        int result = 0, ho = i1.length;

        System.out.println("-----------Algoritma 3--------------");
        while (true) {
            int m =(i1.length + j.length) / 2;
            int x = 10;
            if (x > j[4]) {
                result += m + 1;
                System.out.println("location :" + result);
            } else {
                ho = m;
                System.out.println("location :" + ho);
            }
            break;
        }

        // Algoritma 4
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("-----------Algoritma 4--------------");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int g = 0; g < n - i - 1; g++)
                if (arr[g] > arr[g + 1]) {
                    int temp = arr[g];
                    arr[g] = arr[g + 1];
                    arr[g + 1] = temp;
                }
        System.out.println("Sorted array");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}