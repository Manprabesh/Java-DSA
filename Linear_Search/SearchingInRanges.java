package Linear_Search;

public class SearchingInRanges {
    public static void main(String[] args) {
        int arr[]={5,4,33,6,77,53,71,95,32};
        int target=77;
        Ranges r1=new Ranges();
        boolean b=r1.searching(arr,target,2,7);
        System.out.println(b);
    }
}

class Ranges{
    public boolean searching(int arr[], int target, int start, int end){
        if(arr.length==0){
            return false;
        }

        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
