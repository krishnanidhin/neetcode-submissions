class Solution {
    public boolean isValidSudoku(char[][] board) {
         boolean [] [] rowDigit = new boolean [9][10];
        boolean [] [] colDigit = new boolean [9][10];
        boolean [] [] boxDigit = new boolean [9][10];

        for(int row=0;row<board.length;row++){
            for (int col=0;col<board.length;col++){
                char ch = board[row][col];
                // only non null values
                if (ch!='.') {
                    int digit = ch-'0'; // ASCII of 0 is 47 so of 1 would be 48 so on thus if its 2 then 49-47=2
                    int box = (row/3)*3+(col/3);

                    if (rowDigit[row][digit]==true || colDigit[col][digit]==true || boxDigit[box][digit]==true) {
                        return false;
                    }
                    rowDigit[row][digit]=true;
                    colDigit[col][digit]=true;
                    boxDigit[box][digit]=true;
                }


            }
        }
        return true;
    }
}
