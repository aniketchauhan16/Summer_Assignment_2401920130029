package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix { public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while (startrow <= endrow && startcol <= endcol) {
            //top
            for(int j=startcol;j<=endcol;j++){
                 ans.add(matrix[startrow][j]);
            }
            //right
            for(int i =startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            //bottom
            for(int j = endcol-1;j>= startcol;j--){
                ans.add(matrix[endrow][j]);
                
            }
            //left
            for(int i= endrow-1;i>=startrow+1;i--){
                ans.add(matrix[i][startcol]);
                
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;

    }  return ans;
        }
    
}
