package ru.job4j.array;

public class MatrixCheck {
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i < rsl.length; i++ ) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0;i < board.length;i ++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length;i ++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }

        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i ++ ) {
            if ( monoHorizontal(board,i) || monoVertical(board,i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
