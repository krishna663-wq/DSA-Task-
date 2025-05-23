class Solution {

    private boolean isValid(int[][] image, int i, int j, int n, int m, int color) {
        return i >= 0 && i < n && j >= 0 && j < m && image[i][j] == color;
    }

    private void floodFillRec(int[][] image, int i, int j, int n, int m, int color, int newColor) {
        image[i][j] = newColor;

        if (isValid(image, i + 1, j, n, m, color)) {
            floodFillRec(image, i + 1, j, n, m, color, newColor);
        }
        if (isValid(image, i - 1, j, n, m, color)) {
            floodFillRec(image, i - 1, j, n, m, color, newColor);
        }
        if (isValid(image, i, j + 1, n, m, color)) {
            floodFillRec(image, i, j + 1, n, m, color, newColor);
        }
        if (isValid(image, i, j - 1, n, m, color)) {
            floodFillRec(image, i, j - 1, n, m, color, newColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int color = image[sr][sc];

        if (color == newColor) return image;

        floodFillRec(image, sr, sc, n, m, color, newColor);
        return image;
    }
}
