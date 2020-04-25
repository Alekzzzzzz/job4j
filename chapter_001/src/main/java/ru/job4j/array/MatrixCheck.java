package ru.job4j.array;

public class MatrixCheck {
    /**
     * проверяем равна ли колонка 'X'
     *
     * @param board
     * @param column
     * @return
     */
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

    /**
     *проверяем равна ли строка 'X'
     *
     * @param board
     * @param row
     * @return
     */
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

    /**
     * Проверяем выйгрышная ли у нас комбинация
     *
     * @param board
     * @return
     */
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

    /**
     * Проходим массив по диагонали
     *
     * @param board
     * @return
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i < rsl.length; i++ ) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
