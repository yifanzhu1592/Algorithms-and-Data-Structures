static void selectionSort(int[] lst) {
    // get the length
    int n = lst.length;
    for (int i = 0; i < n; i++) {
        int index = 0;
        int smallest = lst[i];
        for (int j = i; j < n; j++) {
            if (lst[j] < smallest) {
                smallest = lst[j];
                index = j;
            }
        int temp = lst[i];
        lst[i] = smallest;
        lst[index] = temp;
    }
   }
    System.out.println(Arrays.toString(lst));
}
