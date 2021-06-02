class Solution {
    public int reverse(int x) {  
        long reverse1=0;
        while(x!=0){    
            reverse1=x%10+reverse1*10;
            x=x/10;
        }
        if(Integer.MIN_VALUE > reverse1 || reverse1 > Integer.MAX_VALUE){
            return 0;
        }
        return (int)reverse1;
    }
}
