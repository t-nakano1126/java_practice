public class Test03 {
    public static void main(String args[]) {

        // インスタンス生成
        CoinCase coinCase = new CoinCase();

        // 硬貨の追加
        coinCase.AddCoins(500,3);
        coinCase.AddCoins(100,2);
        coinCase.AddCoins(50,4);
        coinCase.AddCoins(10,7);
        coinCase.AddCoins(5,2);
        coinCase.AddCoins(1,13);

        coinCase.AddCoins(10,2);

        // 硬貨の枚数を取得
        int Yen10 = coinCase.GetCount(10);
        System.out.println("10円は" + Yen10 + "枚です。");

        // コインケースの総額を取得
        int sum = coinCase.GetAmount();
        System.out.println("総額は" + sum + "円です。");

    }
}
