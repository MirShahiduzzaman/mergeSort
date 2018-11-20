public class mergeSortArray
{
    public void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    private void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    private void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        for(int i = 0;i<right;i++)
        {

        }
    }
}
