
//leetcode qs no 42

class Solution {
  //approach 1
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lmax=0,rmax=0,total=0;
        while(l<r){
            if(height[l]<height[r]){
            if(lmax>height[l])
            total+=lmax-height[l];
            else
            lmax=height[l];
            l=l+1;

            }
            
            else{
                if(rmax>height[r])
                total+=rmax-height[r];
                else
                rmax=height[r];
                r=r-1;
            }
          

        }
        return total;
    }
//approach 2
  public int trap2(int[] height) {
     int leftsum=0;
     int rightsum=0;
     int n=height.length;
     int[] prefix=new int[n];
     int[] suffix=new int[n];
     int total=0;
     prefix[0]=height[0];

     suffix[n-1]=height[n-1];
     for(int i=1,j=n-2;i<n && j>=0;i++,j--){
        prefix[i]=Math.max(height[i],prefix[i-1]);
        suffix[j]=Math.max(height[j],suffix[j+1]);
     }
     for(int i=0;i<n;i++){
        leftsum=prefix[i];
        rightsum=suffix[i];
        total+=Math.min(leftsum,rightsum)-height[i];
     }
     return total;

    }
}
