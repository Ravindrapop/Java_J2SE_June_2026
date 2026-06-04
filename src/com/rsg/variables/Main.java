package com.rsg.variables;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        //Input: nums = [11,2,3,7,11,15],
        //target = 9
        //Output: [1,3]
        
        int[] a = {11,2,3,7,11,15};
       
            
            
       String temp =  findTargetIndex(a);
       
       System.out.println(temp);
        
        
       
    }
    
     public static String findTargetIndex(int[] a){
             int temp=0;
        
        int target=15;
        
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length-i;j++){
                
               temp =  a[i]+a[j];
               if(temp==target){
                   
                   return "["+i+" , "+j+"]";
                   
               }
            }
        }
        return "We did not find the targe index";
     }

}
