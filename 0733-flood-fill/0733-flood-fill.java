class Solution {

    public void dfs(int i, int j, int[][] image, int original, int color) {

        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length) {
            return;
        }

        if (image[i][j] != original) {
            return;
        }

        image[i][j] = color;

        dfs(i + 1, j, image, original, color);
        dfs(i - 1, j, image, original, color);
        dfs(i, j + 1, image, original, color);
        dfs(i, j - 1, image, original, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];
        if (original == color) return image;

        dfs(sr, sc, image, original, color);

        return image;
    }
}