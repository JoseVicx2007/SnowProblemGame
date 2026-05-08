public class Levels {

    public static final int MAX_LEVEL = 80;
    private static final int SMALL_SNOWBALL = Board.SMALL_SNOWBALL;
    private static final int BIG_SNOWBALL = Board.BIG_SNOWBALL;
    private static final int TREE = Board.TREE;
    private static final int SNOWMAN_HEAD = Board.SNOWMAN_HEAD;

    public static void loadLevel(Board board, int level) {
        switch (level) {
            case 1: Level1(board); break;
            case 2: Level2(board); break;
            case 3: Level3(board); break;
            case 4: Level4(board); break;
            case 5: Level5(board); break;
            case 6: Level6(board); break;
            case 7: Level7(board); break;
            case 8: Level8(board); break;
            case 9: Level9(board); break;
            case 10: Level10(board); break;
            case 11: Level11(board); break;
            case 12: Level12(board); break;
            case 13: Level13(board); break;
            case 14: Level14(board); break;
            case 15: Level15(board); break;
            case 16: Level16(board); break;
            case 17: Level17(board); break;
            case 18: Level18(board); break;
            case 19: Level19(board); break;
            case 20: Level20(board); break;
            case 21: Level21(board); break;
            case 22: Level22(board); break;
            case 23: Level23(board); break;
            case 24: Level24(board); break;
            case 25: Level25(board); break;
            case 26: Level26(board); break;
            case 27: Level27(board); break;
            case 28: Level28(board); break;
            case 29: Level29(board); break;
            case 30: Level30(board); break;
            case 31: Level31(board); break;
            case 32: Level32(board); break;
            case 33: Level33(board); break;
            case 34: Level34(board); break;
            case 35: Level35(board); break;
            case 36: Level36(board); break;
            case 37: Level37(board); break;
            case 38: Level38(board); break;
            case 39: Level39(board); break;
            case 40: Level40(board); break;
            case 41: Level41(board); break;
            case 42: Level42(board); break;
            case 43: Level43(board); break;
            case 44: Level44(board); break;
            case 45: Level45(board); break;
            case 46: Level46(board); break;
            case 47: Level47(board); break;
            case 48: Level48(board); break;
            case 49: Level49(board); break;
            case 50: Level50(board); break;
            case 51: Level51(board); break;
            case 52: Level52(board); break;
            case 53: Level53(board); break;
            case 54: Level54(board); break;
            case 55: Level55(board); break;
            case 56: Level56(board); break;
            case 57: Level57(board); break;
            case 58: Level58(board); break;
            case 59: Level59(board); break;
            case 60: Level60(board); break;
            case 61: Level61(board); break;
            case 62: Level62(board); break;
            case 63: Level63(board); break;
            case 64: Level64(board); break;
            case 65: Level65(board); break;
            case 66: Level66(board); break;
            case 67: Level67(board); break;
            case 68: Level68(board); break;
            case 69: Level69(board); break;
            case 70: Level70(board); break;
            case 71: Level71(board); break;
            case 72: Level72(board); break;
            case 73: Level73(board); break;
            case 74: Level74(board); break;
            case 75: Level75(board); break;
            case 76: Level76(board); break;
            case 77: Level77(board); break;
            case 78: Level78(board); break;
            case 79: Level79(board); break;
            case 80: Level80(board); break;
        }
    }

    public static void Level1(Board board) {
        board.currentLevel = 1;
        board.clearBoard();
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[3][0] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level2(Board board) {
        board.currentLevel = 2;
        board.clearBoard();
        board.grid[1][0] = BIG_SNOWBALL;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][1] = TREE;
        board.grid[2][4] = SMALL_SNOWBALL;
    }

    public static void Level3(Board board) {
        board.currentLevel = 3;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[1][3] = SMALL_SNOWBALL;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][1] = TREE;
    }

    public static void Level4(Board board) {
        board.currentLevel = 4;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[3][0] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level5(Board board) {
        board.currentLevel = 5;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = TREE;
        board.grid[0][4] = TREE;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level6(Board board) {
        board.currentLevel = 6;
        board.clearBoard();
        board.grid[0][2] = TREE;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][1] = SMALL_SNOWBALL;
        board.grid[1][3] = BIG_SNOWBALL;
        board.grid[3][2] = TREE;
    }

    public static void Level7(Board board) {
        board.currentLevel = 7;
        board.clearBoard();
        board.grid[1][1] = TREE;
        board.grid[1][2] = TREE;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
    }

    public static void Level8(Board board) {
        board.currentLevel = 8;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[2][4] = TREE;
        board.grid[3][2] = SNOWMAN_HEAD;
    }

    public static void Level9(Board board) {
        board.currentLevel = 9;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[3][1] = BIG_SNOWBALL;
        board.grid[3][4] = TREE;
    }

    public static void Level10(Board board) {
        board.currentLevel = 10;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = TREE;
        board.grid[1][1] = TREE;
        board.grid[2][3] = SNOWMAN_HEAD;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level11(Board board) {
        board.currentLevel = 11;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = TREE;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][4] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
    }

    public static void Level12(Board board) {
        board.currentLevel = 12;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][4] = TREE;
        board.grid[2][1] = SNOWMAN_HEAD;
        board.grid[2][3] = SMALL_SNOWBALL;
    }

    public static void Level13(Board board) {
        board.currentLevel = 13;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][1] = TREE;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level14(Board board) {
        board.currentLevel = 14;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[1][3] = TREE;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level15(Board board) {
        board.currentLevel = 15;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[3][2] = TREE;
    }

    public static void Level16(Board board) {
        board.currentLevel = 16;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = TREE;
    }

    public static void Level17(Board board) {
        board.currentLevel = 17;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[1][4] = TREE;
        board.grid[2][0] = TREE;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level18(Board board) {
        board.currentLevel = 18;
        board.clearBoard();
        board.grid[0][2] = TREE;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[2][3] = TREE;
        board.grid[3][1] = SNOWMAN_HEAD;
    }

    public static void Level19(Board board) {
        board.currentLevel = 19;
        board.clearBoard();
        board.grid[0][2] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][4] = TREE;
        board.grid[2][1] = SNOWMAN_HEAD;
        board.grid[3][3] = BIG_SNOWBALL;
    }

    public static void Level20(Board board) {
        board.currentLevel = 20;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[3][2] = TREE;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level21(Board board) {
        board.currentLevel = 21;
        board.clearBoard();
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[1][0] = TREE;
        board.grid[2][4] = TREE;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
    }

    public static void Level22(Board board) {
        board.currentLevel = 22;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[3][2] = TREE;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level23(Board board) {
        board.currentLevel = 23;
        board.clearBoard();
        board.grid[0][2] = TREE;
        board.grid[1][0] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][1] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level24(Board board) {
        board.currentLevel = 24;
        board.clearBoard();
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[1][0] = TREE;
        board.grid[1][4] = TREE;
        board.grid[2][1] = TREE;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level25(Board board) {
        board.currentLevel = 25;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[2][3] = SNOWMAN_HEAD;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = TREE;
    }

    public static void Level26(Board board) {
        board.currentLevel = 26;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[1][4] = TREE;
        board.grid[2][0] = TREE;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
    }

    public static void Level27(Board board) {
        board.currentLevel = 27;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][4] = TREE;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[3][2] = TREE;
        board.grid[3][3] = BIG_SNOWBALL;
    }

    public static void Level28(Board board) {
        board.currentLevel = 28;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[1][4] = TREE;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
    }

    public static void Level29(Board board) {
        board.currentLevel = 29;
        board.clearBoard();
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][1] = SMALL_SNOWBALL;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[2][4] = BIG_SNOWBALL;
    }

    public static void Level30(Board board) {
        board.currentLevel = 30;
        board.clearBoard();
        board.grid[0][0] = SNOWMAN_HEAD;
        board.grid[0][2] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = BIG_SNOWBALL;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[3][0] = SNOWMAN_HEAD;
        board.grid[3][1] = BIG_SNOWBALL;
        board.grid[3][2] = TREE;
    }

    public static void Level31(Board board) {
        board.currentLevel = 31;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[2][4] = SMALL_SNOWBALL;
        board.grid[3][2] = SMALL_SNOWBALL;
    }

    public static void Level32(Board board) {
        board.currentLevel = 32;
        board.clearBoard();
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][2] = TREE;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level33(Board board) {
        board.currentLevel = 33;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[3][2] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level34(Board board) {
        board.currentLevel = 34;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[2][0] = TREE;
        board.grid[2][3] = SNOWMAN_HEAD;
        board.grid[3][3] = SMALL_SNOWBALL;
    }

    public static void Level35(Board board) {
        board.currentLevel = 35;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = TREE;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[0][4] = SNOWMAN_HEAD;
        board.grid[2][4] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
    }

    public static void Level36(Board board) {
        board.currentLevel = 36;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][1] = TREE;
        board.grid[2][2] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level37(Board board) {
        board.currentLevel = 37;
        board.clearBoard();
        board.grid[0][0] = SNOWMAN_HEAD;
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][3] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][2] = SMALL_SNOWBALL;
    }

    public static void Level38(Board board) {
        board.currentLevel = 38;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[1][4] = TREE;
        board.grid[3][2] = SMALL_SNOWBALL;
    }

    public static void Level39(Board board) {
        board.currentLevel = 39;
        board.clearBoard();
        board.grid[0][0] = SNOWMAN_HEAD;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[1][0] = SMALL_SNOWBALL;
        board.grid[1][2] = TREE;
        board.grid[2][4] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
    }

    public static void Level40(Board board) {
        board.currentLevel = 40;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][2] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][3] = TREE;
    }

    public static void Level41(Board board) {
        board.currentLevel = 41;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[3][0] = BIG_SNOWBALL;
    }

    public static void Level42(Board board) {
        board.currentLevel = 42;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[2][4] = SMALL_SNOWBALL;
    }

    public static void Level43(Board board) {
        board.currentLevel = 43;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][2] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level44(Board board) {
        board.currentLevel = 44;
        board.clearBoard();
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[1][3] = TREE;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][3] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level45(Board board) {
        board.currentLevel = 45;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[1][0] = SMALL_SNOWBALL;
        board.grid[1][2] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][1] = SNOWMAN_HEAD;
        board.grid[2][3] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level46(Board board) {
        board.currentLevel = 46;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][2] = TREE;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[0][4] = SNOWMAN_HEAD;
        board.grid[2][0] = TREE;
        board.grid[2][1] = SNOWMAN_HEAD;
        board.grid[2][4] = SMALL_SNOWBALL;
    }

    public static void Level47(Board board) {
        board.currentLevel = 47;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][3] = TREE;
        board.grid[1][4] = SMALL_SNOWBALL;
        board.grid[3][0] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level48(Board board) {
        board.currentLevel = 48;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][1] = SMALL_SNOWBALL;
        board.grid[1][4] = TREE;
        board.grid[3][1] = SNOWMAN_HEAD;
        board.grid[3][2] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level49(Board board) {
        board.currentLevel = 49;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][2] = SNOWMAN_HEAD;
        board.grid[1][3] = TREE;
        board.grid[2][1] = BIG_SNOWBALL;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[3][2] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level50(Board board) {
        board.currentLevel = 50;
        board.clearBoard();
        board.grid[0][0] = SNOWMAN_HEAD;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][2] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][2] = TREE;
        board.grid[3][1] = SNOWMAN_HEAD;
        board.grid[3][2] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level51(Board board) {
        board.currentLevel = 51;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[1][0] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][2] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][2] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
    }

    public static void Level52(Board board) {
        board.currentLevel = 52;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][3] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][3] = SNOWMAN_HEAD;
        board.grid[2][4] = BIG_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
    }

    public static void Level53(Board board) {
        board.currentLevel = 53;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = TREE;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][0] = TREE;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level54(Board board) {
        board.currentLevel = 54;
        board.clearBoard();
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][1] = TREE;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level55(Board board) {
        board.currentLevel = 55;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = TREE;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][3] = TREE;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level56(Board board) {
        board.currentLevel = 56;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][3] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[2][4] = BIG_SNOWBALL;
        board.grid[3][1] = SNOWMAN_HEAD;
        board.grid[3][3] = BIG_SNOWBALL;
    }

    public static void Level57(Board board) {
        board.currentLevel = 57;
        board.clearBoard();
        board.grid[0][2] = TREE;
        board.grid[1][0] = TREE;
        board.grid[1][2] = SMALL_SNOWBALL;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[2][1] = SMALL_SNOWBALL;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level58(Board board) {
        board.currentLevel = 58;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = TREE;
        board.grid[2][2] = BIG_SNOWBALL;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level59(Board board) {
        board.currentLevel = 59;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][3] = TREE;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level60(Board board) {
        board.currentLevel = 60;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][4] = SNOWMAN_HEAD;
        board.grid[1][1] = TREE;
        board.grid[1][2] = TREE;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level61(Board board) {
        board.currentLevel = 61;
        board.clearBoard();
        board.grid[0][0] = SNOWMAN_HEAD;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][3] = BIG_SNOWBALL;
        board.grid[1][4] = TREE;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][1] = SMALL_SNOWBALL;
        board.grid[2][2] = SMALL_SNOWBALL;
        board.grid[3][3] = BIG_SNOWBALL;
    }

    public static void Level62(Board board) {
        board.currentLevel = 62;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[1][1] = TREE;
        board.grid[1][2] = BIG_SNOWBALL;
        board.grid[1][3] = BIG_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][1] = TREE;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level63(Board board) {
        board.currentLevel = 63;
        board.clearBoard();
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][2] = TREE;
        board.grid[1][4] = SMALL_SNOWBALL;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][2] = SNOWMAN_HEAD;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level64(Board board) {
        board.currentLevel = 64;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[1][0] = TREE;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][3] = SNOWMAN_HEAD;
        board.grid[1][4] = BIG_SNOWBALL;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[2][4] = TREE;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level65(Board board) {
        board.currentLevel = 65;
        board.clearBoard();
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[1][0] = TREE;
        board.grid[1][1] = SMALL_SNOWBALL;
        board.grid[1][2] = BIG_SNOWBALL;
        board.grid[2][2] = SMALL_SNOWBALL;
        board.grid[2][4] = TREE;
        board.grid[3][2] = BIG_SNOWBALL;
    }

    public static void Level66(Board board) {
        board.currentLevel = 66;
        board.clearBoard();
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
        board.grid[3][3] = SMALL_SNOWBALL;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level67(Board board) {
        board.currentLevel = 67;
        board.clearBoard();
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][4] = SMALL_SNOWBALL;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[3][2] = SNOWMAN_HEAD;
        board.grid[3][3] = SMALL_SNOWBALL;
    }

    public static void Level68(Board board) {
        board.currentLevel = 68;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[1][0] = SMALL_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[2][4] = BIG_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][2] = SNOWMAN_HEAD;
    }

    public static void Level69(Board board) {
        board.currentLevel = 69;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[1][0] = SMALL_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[2][3] = TREE;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][3] = SMALL_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level70(Board board) {
        board.currentLevel = 70;
        board.clearBoard();
        board.grid[0][1] = TREE;
        board.grid[0][2] = SMALL_SNOWBALL;
        board.grid[0][3] = SMALL_SNOWBALL;
        board.grid[1][1] = TREE;
        board.grid[1][3] = SMALL_SNOWBALL;
        board.grid[1][4] = BIG_SNOWBALL;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][1] = BIG_SNOWBALL;
        board.grid[3][0] = SNOWMAN_HEAD;
        board.grid[3][2] = BIG_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
    }

    public static void Level71(Board board) {
        board.currentLevel = 71;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][2] = TREE;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][2] = TREE;
        board.grid[1][4] = SMALL_SNOWBALL;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][1] = BIG_SNOWBALL;
        board.grid[2][2] = SMALL_SNOWBALL;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][4] = SNOWMAN_HEAD;
    }

    public static void Level72(Board board) {
        board.currentLevel = 72;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][1] = SNOWMAN_HEAD;
        board.grid[3][2] = SMALL_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level73(Board board) {
        board.currentLevel = 73;
        board.clearBoard();
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[2][0] = BIG_SNOWBALL;
        board.grid[2][4] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level74(Board board) {
        board.currentLevel = 74;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = BIG_SNOWBALL;
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[1][1] = SMALL_SNOWBALL;
        board.grid[1][2] = SMALL_SNOWBALL;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[3][3] = TREE;
    }

    public static void Level75(Board board) {
        board.currentLevel = 75;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][1] = TREE;
        board.grid[1][4] = SNOWMAN_HEAD;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][0] = BIG_SNOWBALL;
        board.grid[3][1] = TREE;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level76(Board board) {
        board.currentLevel = 76;
        board.clearBoard();
        board.grid[0][0] = BIG_SNOWBALL;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[0][4] = SMALL_SNOWBALL;
        board.grid[1][0] = TREE;
        board.grid[1][2] = BIG_SNOWBALL;
        board.grid[2][4] = SNOWMAN_HEAD;
        board.grid[3][1] = SMALL_SNOWBALL;
    }

    public static void Level77(Board board) {
        board.currentLevel = 77;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][1] = SMALL_SNOWBALL;
        board.grid[0][3] = BIG_SNOWBALL;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][4] = SMALL_SNOWBALL;
        board.grid[2][2] = TREE;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[2][4] = BIG_SNOWBALL;
        board.grid[3][1] = SNOWMAN_HEAD;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = BIG_SNOWBALL;
    }

    public static void Level78(Board board) {
        board.currentLevel = 78;
        board.clearBoard();
        board.grid[0][1] = SNOWMAN_HEAD;
        board.grid[0][2] = SNOWMAN_HEAD;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[0][4] = BIG_SNOWBALL;
        board.grid[2][0] = SMALL_SNOWBALL;
        board.grid[2][4] = BIG_SNOWBALL;
        board.grid[3][0] = SMALL_SNOWBALL;
        board.grid[3][1] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
    }

    public static void Level79(Board board) {
        board.currentLevel = 79;
        board.clearBoard();
        board.grid[0][0] = TREE;
        board.grid[0][2] = BIG_SNOWBALL;
        board.grid[0][4] = TREE;
        board.grid[1][0] = SNOWMAN_HEAD;
        board.grid[1][1] = SNOWMAN_HEAD;
        board.grid[1][2] = SMALL_SNOWBALL;
        board.grid[2][0] = SNOWMAN_HEAD;
        board.grid[2][1] = BIG_SNOWBALL;
        board.grid[2][2] = SMALL_SNOWBALL;
        board.grid[3][2] = BIG_SNOWBALL;
        board.grid[3][4] = SMALL_SNOWBALL;
    }

    public static void Level80(Board board) {
        board.currentLevel = 80;
        board.clearBoard();
        board.grid[0][0] = SMALL_SNOWBALL;
        board.grid[0][1] = TREE;
        board.grid[0][3] = SNOWMAN_HEAD;
        board.grid[1][1] = BIG_SNOWBALL;
        board.grid[1][2] = BIG_SNOWBALL;
        board.grid[1][3] = SMALL_SNOWBALL;
        board.grid[1][4] = BIG_SNOWBALL;
        board.grid[2][0] = TREE;
        board.grid[2][3] = SMALL_SNOWBALL;
        board.grid[3][3] = SNOWMAN_HEAD;
        board.grid[3][4] = SNOWMAN_HEAD;
    }
}
