public class MaxSubArray {
  
    // time complex i ty:-0(n^3)  
      
    public static void maxSubArraySum(int numbers[]){
        int  currS u m= 0 ;   
        int maxSum=In t eger.MIN_VALUE;

        for(int  i=0;i < nu m b ers.length;i++) { 
            int start=i ; 
  
            for(int j=i;j<numbers.length;j++){
                int  end=j ;      
                currSum=0;  

                for(int k=start;k<=end;k++){
                     currS u m+=numbe rs[k];
                }  
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " +  maxSum);
    }        

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}
