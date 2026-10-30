import java.util.*;
class sort2Darray{
    public static void main (String[]args)
    {
        int [][] nums = {{4,8},{1,2},{2,3},{3,6},{3,4}};

        Arrays.sort(nums,
        (a,b)->
        {
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
        return Integer.compare(a[1],b[1]);
        }
        );

        System.out.println(Arrays.deepToString(nums));
    }
}