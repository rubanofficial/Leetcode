class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }
        for(int i=0;i<image.length;i++){
            int l =0;
            int r = image.length-1;
            while(l<r){
                int t = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = t;
                l++;
                r--;
            }
        }
        return image;
    }
}