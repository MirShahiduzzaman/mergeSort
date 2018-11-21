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
        int i = left;
        int j = mid+1;
        int k = left;

        while(i<=mid && j<=right)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<=right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int a = left;a<=right;a++)
        {
            arr[a] = temp[a];
        }
    }
}
