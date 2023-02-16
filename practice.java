class top150 {
    public static void main(String[] args) {
        int a[] = { 42, 65, 42, 25, 35, 42, 42 };
        int t = 42;
        fandlo(a, t);
    }

    public static void fandlo(int a[], int t) {
        int ans[] = { -1, -1 };
        ans[0] = occurance(a, t, true);
        if (ans[0] != -1) {
            ans[1] = occurance(a, t, false);
        }
        printarray(ans);
    }

    public static void printarray(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int occurance(int a[], int t, boolean firstoccurance) {
        int ans = -1;
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] < t) {
                start = mid + 1;
            } else if (a[mid] > t) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstoccurance == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
