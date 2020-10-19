import java.util.*;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n) / 2 + 1;

        int head = l - Math.min(n, l);
        int tail = Math.min(m, l) + 1;

        while(head + 1 != tail) {
            int mid = (head + tail) / 2;
            if(nums1[mid - 1] > nums2[l - mid]) tail = mid;
            else head = mid;
        }

        if((m + n) % 2 == 0) {

            List<Integer> res = new ArrayList<>();

            if(head > 1) res.add(nums1[head - 2]);
            if(head > 0) res.add(nums1[head - 1]);
            if(l - head > 1) res.add(nums2[l - head - 2]);
            if(l - head > 0) res.add(nums2[l - head - 1]);

            Collections.sort(res, Collections.reverseOrder());

            return (double)(res.get(0) + res.get(1)) / 2.;

        } else {
            if(head == 0) return (double)nums2[l - 1];
            if(head == l) return (double)nums1[l - 1];
            return (double)Math.max(nums1[head - 1], nums2[l - head - 1]);
        }

    }

}
