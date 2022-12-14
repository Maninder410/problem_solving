public class binarysearch
{
    static int search(int arr[],int s,int e, int key){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key)
            return mid;
        if(arr[mid]<key)

            return search(arr,mid+1,e,key);
        return search(arr,s,mid-1,key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,44,55,77};
        int s = 0;
        int e = arr.length-1;
        int key = 22;
        System.out.println(search(arr,s,e,key));
    }
}
