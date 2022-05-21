public class CoinCase {

    // 変数の定義
    private int Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50  = 0;
    private int Yen10  = 0;
    private int Yen5   = 0;
    private int Yen1   = 0;

    // 硬貨を追加するメソッド
    public void AddCoins(int kind,int count) {
        switch ( kind ) {
            case 500:
                Yen500 += count;
                break;
            case 100:
                Yen100 += count;
                break;
            case 50:
                Yen50 += count;
                break;
            case 10:
                Yen10 += count;
                break;
            case 5:
                Yen5 += count;
                break;
            case 1:
                Yen1 += count;
                break;
            default:
                break;
        }
    }

    // 硬貨が何枚あるか取得するメソッド
    public int GetCount(int kind) {
        switch ( kind ) {
            case 500:
                return Yen500;
            case 100:
                return Yen100;
            case 50:
                return Yen50;
            case 10:
                return Yen10;
            case 5:
                return Yen5;
            case 1:
                return Yen1;
        }

        return 0;
    }

    // 硬貨の総額を取得するメソッド
    public int GetAmount() {
        int sum = 500 * Yen500 + 100 * Yen100
                + 50 * Yen50 + 10 * Yen10
                + 5 * Yen5 + Yen1;
        return sum;
    }

}
