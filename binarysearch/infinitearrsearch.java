public class infinitearrsearch {
    static int bs(int arr[], int start, int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }

        return -1;
    }
    static int findTarget(int arr[],int target){
        int start =0;
        int end = 1;
            while(target>arr[end]){
                int temp = end+1;
                end = end+(end-start+1)*2;
                start = temp;
            }
        return bs(arr,start,end,target);
    }
    public static void main(String[] args) {
         //in this program what we are basically trying to do is to apply binary search without using length of the arr
         int arr[] = {22,33,44,55,88,99,101,150};
         int target = 44;
         System.out.print(findTarget(arr,target));

    }
}
