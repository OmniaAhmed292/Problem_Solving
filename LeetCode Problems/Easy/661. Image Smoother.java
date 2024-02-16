//https://leetcode.com/problems/image-smoother/description/

public int[][] imageSmoother(int[][] img) {
        int [][] result = new int [img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = 0;
                int count = 0;
                for (int k = i-1; k <= i+1; k++) {
                    for (int l = j-1; l <= j+1; l++) {
                        if (k >= 0 && k < img.length && l >= 0 && l < img[0].length) {
                            sum += img[k][l];
                            count++;
                        }
                    }
                }
                result[i][j] = sum/count;
            }
        }
        
        
    return result;
    }
