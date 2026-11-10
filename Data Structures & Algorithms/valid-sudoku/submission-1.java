class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (char c : board[i]) {
                if (c != '.') {
                    if (seen.contains(c)) {
                        return false;
                    }
                    seen.add(c);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0;j<9;j++) {
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        HashSet<Character> seen = new HashSet<>();
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =0;i<3;i++){
            for(int j=3;j<6;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =0;i<3;i++){
            for(int j=6;j<9;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =3;i<6;i++){
            for(int j=0;j<3;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =3;i<6;i++){
            for(int j=3;j<6;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =3;i<6;i++){
            for(int j=6;j<9;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =6;i<9;i++){
            for(int j=0;j<3;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =6;i<9;i++){
            for(int j=3;j<6;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        seen.clear();
        for(int i =6;i<9;i++){
            for(int j=6;j<9;j++){
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) {
                        return false;
                    }
                    seen.add(board[j][i]);
                }
            }
        }
        return true;
    }
}
