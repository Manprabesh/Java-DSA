package Binary_Search;

class searchArray{

    public int SearchingBinary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
   while(start<=end){
       int mid=start+(end-start)/2;
       if(target<arr[mid]){
           end=mid-1;
       } else if (target>arr[mid]) {
           start=mid+1;
       } else {
           return mid;
       }

   }


        return -1;
    }
}

public class Binary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        searchArray sc=new searchArray();
       int index= sc.SearchingBinary(arr,target);
        System.out.println("The index of"+": "+target+" "+"is: "+index);
    }
}
