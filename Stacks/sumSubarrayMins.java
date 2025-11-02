
// leetcode qs 907. Sum of Subarray Minimums


//brute force approach
class Solution {
    public int sumSubarrayMins(int[] arr) {
        double mod=1e9+7;
       double sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int mini=arr[i];
            for(int j=i;j<n;j++){
                mini=Math.min(mini,arr[j]);
                sum=(sum+mini)%mod;
            }
        }
        return (int)sum;
    }
}

//optimized using psee & nse
class Solution2 {
    private static int[] psee(int[] arr){
        int n=arr.length;
            Stack<Integer> st=new Stack<>();
            int[] psee=new int[n];
        for(int i=0;i<n;i++){
            
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();
            if(st.isEmpty())
            psee[i]=-1;
            else
            psee[i]=st.peek();
            st.push(i);
        }
            return psee;
        }


        private static int[] nse(int[] arr){
             int n=arr.length;
            Stack<Integer> st=new Stack<>();
            int[] nse=new int[n];
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
                if(st.isEmpty())
               nse[i]=n;
               else
               nse[i]=st.peek();
               st.push(i);
               
            }

return nse;
        

    }
    public int sumSubarrayMins2(int[] arr) {
        int n=arr.length;
       long sum=0;
       int mod=(int) 1e9+7;
        int[] psee=psee(arr);
        int[] nse=nse(arr);
        for(int i=0;i<n;i++){
            long left=i-psee[i];
            long right=nse[i]-i;

            sum=(sum+(((long)arr[i] * left % mod) * right % mod))%mod;
        }
        return (int)sum;
    }
}
