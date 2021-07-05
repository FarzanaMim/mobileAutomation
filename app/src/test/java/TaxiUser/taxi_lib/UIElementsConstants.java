package TaxiUser.taxi_lib;

/**
 * Created by user on 10/5/2017.
 */

public class UIElementsConstants {

    public static class txu090Top {
        public static final String Header = "my taxi";

        public static final String SettingOfDestinationPlaceHolderText = "どこへ向かいますか？";

        ;
        public static final String DriverEvaluationMesg = "ご乗車ありがとうございます。\n" + "ドライバーの評価をお願いします。";

        public static final String ThanksMsg = "評価ありがとうございました。";
        public static final String LocationServiceOnText = "TaxiUser に「この機器の位置情報へのアクセス」を許可しますか？";

        public static final String  LocationServiceOnButtonText = "許可";
        public static final String  LocationServiceOffButtonText = "許可しない";
        public static final String NoTexiMsg= "申しわけありません。\n" + "この近くにタクシーはいません。";

    }

    public  static class txu100WhereTo{
        public static final String PageTitle="乗降車位置";
        public static final String DepartureTextBox="51 Rd No 13D, Dhaka 1212 バングラデシュ";
        public static final String DestinationPlaceHolderText="降車位置を入力";
        public static final String PinPlacementText="タクシーが停車しやすい場所に ピンを合わせてください。";
        public static final String selectDriverButton="完了";
        //public static final String ConfirmDriverButton="完了";


    }
    public static class txu110RequestOption{
        public static final String pageTitle="ドライバー選択";
        public static final String nominateDriverText="ドライバーを指名する";
        public static final String designateReqText="近くのドライバーから選択して依頼をします。";
        public static final String callTexiText="タクシーを呼ぶ";
        public static final String broadcastReqText="今すぐ近くのドライバーすべてに依頼する。";
        public static final String broadcastpermissionText="近くのドライバーすべてにリクエストを投げます。\n" + "よろしいですか？";
        public static final String yesText="はい";
        public static final String notext="キャンセル";
    }
    public static class txu120DesignatingReq{
        public static final String pageTitle="ドライバー指名";
        public static final String SelectDriverButton1="ドライバーを選択してください";
        public static final String SelectDriverButton2="OBARA YUKI さんを呼ぶ";
        public static final String ConfirmReqMeg="選択したドライバーにリクエストを投げます。\n" + "よろしいですか？";
        public static final String yes="はい";
        public static final String no="キャンセル";
        public static final String designatedTitel="Obara Yuki さんにリクエストしています。";
        public static final String cancelButton="リクエストをキャンセルする";
        public static final String cancelConfirmMsg="リクエストをキャンセルします。\n" + "よろしいですか？";
        public static final String cancelYes="はい";
        public static final String cancelNo="いいえ";
        public static final String confirmmsg="呼び出しをキャンセルしました。\n" + "またのご利用をお待ちしております。";
        public static final String ok="OK";

    }

    public static class txu130Requesting{
        public static final String pageTitle="近くのドライバー全てにリクエストしています。";
        public static final String CancelReqButtonText="リクエストをキャンセルする";
        public static final String CancelConfirmMsg="リクエストをキャンセルします。\n" + "よろしいですか？";
        public static final String yesText="はい";
        public static final String noText="いいえ";
        public static final String canceledmsg="呼び出しをキャンセルしました。\n" + "またのご利用をお待ちしております。";
        public static final String driverNotFoundmsg="ドライバーが見つかりませんでした。";
        public static final String driverListButton="タクシー会社一覧を表示する";
        public static final String backtoTopbutton="トップに戻る";
        public static final String driverList="タクシー会社一覧";
        public static final String CloseupButton="閉じる";
    }


    public static class txu140Waiting {

        public static final String  title="迎車中";
        public static final String headermsg="特Pテスト用パートナー 特Pテスト用パートナー 様をお迎えに向かっております。";
        public static final String driverName="Sharmin Mim";
        public static final String paymentMethod="My Taxiで決済";
        public static final String coupon="クーポン";
        public static final String textTotalTip="チップ合計金額";
        public static final String text_tip_amount="¥0";
        public static final String text_dialog_message="¥100をチップとしてわたします。\n" + "よろしいですか？";
        public static final String button_tip_confirmation_yes="YES";
        public static final String button_tip_confirmation_no="NO";

        public static final String textGiveAtip="ドライバーにチップをわたす";
        public static final String button_tip_minus="-¥100";

        public static final String button_tip_plus="+¥100";
        public static final String button_submitInactive="金額を追加してください";
        public static final String button_submitactive="金額を確定する";
        public static final String text_title_message_to_driver="ドライバーにメッセージする";
        public static final String text_message_send_message_to_driver="※メッセージは乗車開始時まで変更できます。";
        public static final String text_input_message="建物名や乗車位置の詳細情報、乗車時のお願いなどをドライバーに伝えることができます。";
        public static final String button_send_message_to_driver_inactive="メッセージを追加してください";
        public static final String button_send_message_to_driver_active="メッセージを送る";
        public static final String phonetextView="ドライバーに電話";
        public static final String button_cancel_request="呼び出しをキャンセル";
        public static final String text_arrival_time="到着まで";
        public static final String text_minutes="分";
        public static final String text_message_driver_arrival="ドライバーが乗車位置に到着しました。";



    }

    public static class txu150OnBoard {

        public static final String header="乗車中";



    }
    }

