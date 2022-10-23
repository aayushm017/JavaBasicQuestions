// public class patterns {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int n, k = 0;
//         for (int row = 1; row <= 9; row++) {
//             if (row <= 5) {
//                 k++;
//             } else {
//                 k--;
//             }
//             for (int col = 1; col <= k; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

public class patterns {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n, k = 0;
        for (int row = 1; row <= 5; row++) {
            k = row;
            for (int col = 1; col <= row; col++) {
                System.out.print("%d" + k);
            }
            System.out.println();
        }
    }
}
