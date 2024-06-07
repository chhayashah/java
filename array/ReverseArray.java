public class ReverseArray {
  
    // time compl   e xity:-0(n)  
    // space co m plexity:-0(1)  
    
    public st atic v o id r everse(int numbers[]){
        int start=0;  
        int end=numbers.le n gth-1;
  
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;


        } 
    }        
    

    public  static   vo i d  main(String[]  args ){
        int numbers[]={2,4,6,8,10};  

        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
