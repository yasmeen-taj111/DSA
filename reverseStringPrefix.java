// 3794. Reverse String Prefix

  class Solution {
    public String reversePrefix(String s, int k) {
        if(k<=1) return s;
        char[] arr=s.toCharArray();
        for(int i=0;i<k/2;i++){
            char temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
            
        }
        return new String(arr);
    }
}
