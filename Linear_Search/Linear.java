package Linear_Search;

class search_Element{

    public int Searching(int arr[], int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

}

public class Linear {
    public static void main(String[] args) {
       int arr[]={1,4,22,55,7,11,32};
    search_Element sc=new search_Element();
    int index=sc.Searching(arr,22);
        System.out.println("The index is: "+index+" and the element is"+arr[index]);
    }
}
