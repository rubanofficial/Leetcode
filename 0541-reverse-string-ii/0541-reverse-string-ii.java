class Solution {
    public String reverseStr(String s, int k) {
     int n = s.length();
     char arr[] = s.toCharArray();
     int r = n-1;
     int l =0;
     if(n<k){
        while(l<r){
            char t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
            r--;
            l++;
        }
     }  
     else if(n<(2*k) && n>=k){
        r=k-1;
        l=0;
        while(l<r){
            char t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
            r--;
            l++;
        }
     }
     else{
        for(int i=0;i<n;i=i+2*k){
            l=i;
            r=Math.min(i+k-1,n-1);
             while(l<r && r<n){
            char t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
            r--;
            l++;
        }
        }
     }
    return  new String(arr);
    }
}