class Solution {
    void merge(int arr[], int s, int mid, int e){
        int temp[] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i <= mid ){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j <= e ){
            temp[k] = arr[j];
            k++;
            j++;
        }
     
        for(k=0, i=s; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }

    void mergesort(int arr[], int s, int e){
        if(s >= e){
            return;
        }

        int mid = (s + e)/2;

        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e); 
        merge(arr, s, mid, e);
    }

    public int[] sortArray(int[] arr) {
        int n = arr.length;
        mergesort(arr, 0, n-1);

        return arr;
    }
}