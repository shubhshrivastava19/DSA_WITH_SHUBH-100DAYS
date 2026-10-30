import java.util.*;

class DSA_JAVA_MONSTER{
    public static void main(String[]args){  
        int n=5;// number of monsters
        int exp = 100;//experience
        int kill=0;

        int[] monst = {300 , 400 , 500 , 100 ,200};// sort this before adding or substracting
        int[] bonus = {100 ,50 ,100 ,100 ,100 };

        for(int i =0 ;i<monst.length;i++)// finding the monster which can be defeatable
            {
                if(monst[i]<=exp){
                    // kill monster and take the exp ;
                    monst[i]=Integer.MAX_VALUE;
                    // increase the exp 
                    exp+=bonus[i];
                    // increase the kill by 1 
                    kill+=1;
                }
            }
            System.out.print("killed monster = ");
            System.out.println(kill);

    }
}