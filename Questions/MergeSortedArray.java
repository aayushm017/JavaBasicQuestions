package Questions;
//Just sort the array in the first index.
// 3, 6, 13 , 0, 0, 0 and 11, 15, 17 insert into the first index and the output will be 3, 6, 13, 11, 15, 17.

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }

        while (p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mer = new MergeSortedArray();
        int p1[] = {3, 6, 13};
        int p2[] = {4, 5, 11};
//        int m = 3;
//        int n = 3;
        mer.merge(p1, 3, p2, 3);
    }
}
