package COM.ARRAYS.EASY;

public class DuplicatesInArray {
    public static void main(String[] args) {
        long arr[] = {1,3,5,2,2};
        int n = 5;
        int left = 0, right = 4;
        long leftSum = 0, rightSum = 0;
        while(n-- > 1){
            if(leftSum <= rightSum){
                leftSum+=arr[left];
                left++;
            }
            else{
                rightSum+=arr[right];
                right--;
            }
        }

        if(leftSum==rightSum){
            System.out.print(right+1);
        }else{
            System.out.print(-1);
        }

    }
    static  void increment(Integer t){
       t=20;
    }

    static  void printDulicates(int arr[],int n){
        for(int i = 0; i<n; i++){
            int index = arr[i] % n;

            arr[index]+=n;
        }
        for(int i = 0; i<n; i++){
            if((arr[i]/n) >=2){
                System.out.print(i+" ");
            }
        }
    }

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int res = -1;
        for(int i = 0; i<n;i++){

            if((i > 0) && (i < n-1)){
                int leftEle = arr[i-1];
                int rightEle = arr[i+1];
                if(arr[i] > leftEle && arr[i] > rightEle){
                    res = i;
                    return res;
                }
            }
            else if( i < 1){
                int rightEle = arr[i+1];
                if(arr[i] > rightEle){
                    res = i;
                    return res;
                }
            }
            else if( i > n-1){
                int leftEle = arr[i-1];
                if(arr[i] > leftEle){
                    res = i;
                    return res;
                }
            }
        }
        return res;
    }
}

