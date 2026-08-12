class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        if (original == color) {
            return image;
        }

        dfs(image, sr, sc, original, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c,
                     int original, int color) {

        // Boundary check
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) {
            return;
        }

        // Stop if this cell has a different color
        if (image[r][c] != original) {
            return;
        }

        // Change color
        image[r][c] = color;

        // Visit 4 directions
        dfs(image, r + 1, c, original, color); // down
        dfs(image, r - 1, c, original, color); // up
        dfs(image, r, c + 1, original, color); // right
        dfs(image, r, c - 1, original, color); // left
    }
}