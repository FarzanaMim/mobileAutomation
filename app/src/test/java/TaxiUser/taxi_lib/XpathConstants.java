package TaxiUser.taxi_lib;

/**
 * Created by user on 10/5/2017.
 */

public class XpathConstants {
    public static class txu090Top{

        public static final String Header="//android.widget.ImageView[contains @index='1']";
        public static final String Menubar="//android.widget.ImageButton[@index='0']";
        public static final String LocationServiceOnText="//android.widget.TextView[contains(@resource-id,'com.android.packageinstaller:id/permission_message')and @index='1']";
        public  static final String LocationServiceOnButton="//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button')and @index='1']";
        public static final String LocationServiceOffButton="//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_deny_button')and @index='0']";
        public static final String ThankUDriverMsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_info_driver_rating_success') and @index='1']";
        public static final String SettingOfDestinationPlaceHolderText="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/textView') and @index='1']";
        public static final String SettingOfDestinationButton="//android.widget.ImageView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/imageView2') and @index='2']";
        public static final String GoBackToDefaultButton="//android.widget.ImageButton[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/fab_position_now') and @index='0']";
        public static final String DriverEvaluateMessage="//android.widget.TextView[@text='ご乗車ありがとうございます。\n" + "ドライバーの評価をお願いします。' and @index='0']";
        public static final String DriverEvaluateMsgClose="//android.widget.ImageView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/image_close_driver_rating') and @index='1']";

       /* public static final String GPSMessage_05="//android.widget.TextView[contains(resource-id,'com.earthcar.taxiuser.dev.debug:id/text_gps_off_message') and @text='申し訳ありません。\n" +
                "位置情報サービスをオンにしてご利用ください。' and @index='1']";*/
        /*public static final String GPSMessage_05Button="//android.widget.Button[contains(resource-id,'com.earthcar.taxiuser.dev.debug:id/button_open_location_setting') and @text='位置情報サービスをオン' and @index='2']";*/
        public  static  final String LocationButton="//android.widget.Switch[@text='OFF' and @index='1']";
        public static final String NoTexiMsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_no_taxi')and @index='0' and @text='申しわけありません。\n" + "この近くにタクシーはいません。']";
        public static final String NoTexiOkButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_no_taxi_ok')and @index='2']";











    }
    public static class txu100WhereTo{

        public static final String PageTitle="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_toolbar_title') and @index='1']";
        public static final String DepartureTextBox="//android.widget.EditText[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/departureEditText') and @index='2']";
        public static final String DestinationTextBox="//android.widget.EditText[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/destinationEditText') and @index='4']";
        public static final String PinPlacementText="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/infoTextView')and @index='3']";
        public static final String selectDriverButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/submitButton')and @index='0']";
        //public static final String ConfirmDriverButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/submitButton')and @index='0' and @text='完了']";
        public static final String backButton="//android.widget.ImageButton[ @index='0']";


    }

    public static class txu110RequestOption{
        public static final String PageTitle="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_toolbar_title')and @index='1' and @text='ドライバー選択']";
        public static final String backButton="//android.widget.ImageButton[@index='0']";
        public static final String nominateDriver="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_designate_driver') and @index='0']";
        public static final String designateReq="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_designate_driver_message')and @index='1']";
        public static final String callTexi="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_call_taxi')and @index='0']";
        public static final String broadcastReq="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_call_taxi_message')and @index='1']";
        public static final String broadcastpermission="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_broadcast_confirmation')and @index='0']";
        public static final String yes="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_broadcast_confirmation_yes') and @index='1']";
        public static final String no="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_broadcast_confirmation_cancel')and @index='2']";

    }

    public static class txu120DesignatingReq{
        public static final String PageTitle="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_toolbar_title') and @index='0']";
        public static final String BackButton="//android.widget.ImageButton[@index='0']";
        public static final String SelectDriverButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_select_driver')and @index='0']";
        public static final String favDriverButton="//android.widget.ImageButton[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/fab_driver_switch')and @index='0']";
        public static final String centerPlaceButton="//android.widget.ImageButton[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/fab_position_now')and @index='1']";
        public static final String driver="//android.view.View[@index='5']";
        public static final String ConfirmReqMeg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_designate_driver')and @index='0']";
        public static final String yes="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_designate_driver_yes')and @index='1']";
        public static final String no="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_designate_driver_cancel')and @index='2']";
        public static final String designatedTitel="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_designate')and @index='1']";
        public static final String  cancelButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request')and @index='3']";
        public static final String cancelConfirmMsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_cancel_request')and @index='0']";
        public static final String cancelYes="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request_yes')and @index='1']";
        public static final String cancelNo="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request_no')and @index='2']";
        public static final String confirmmsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_cancel_request')and @index='0']";
        public static final String ok="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_success_cancellation_ok')and @index='2']";







    }
    public static class txu130Requesting{

        public static final String PageTitle="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_broadcast') and @index='1']";
        public static final String CancelReqButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request')and @index='3']";
        public static final String CancelConfirmMsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_cancel_request')and @index='0']";
        public static final String yesButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request_yes')and @index='1']";
        public static final String noButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request_no') and @index='2']";
        public static final String canceledmsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_cancel_request') and @index='0']";
        public static final String okButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_success_cancellation_ok') and @index='2']";
        public static final String driverNotFoundmsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_matching_failure_broadcast')and @index='0']";
        public static final String driverListButton="//android.widget.Button[contains(@resoucre-id,'com.earthcar.taxiuser.dev.debug:id/button_matching_failure_broadcast_company_list')and @index='2']";
        public static final String backToTopButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_matching_failure_broadcast_back')and @index='3']";
        public static final String driverList="//android.widget.TextView[@index='0']";
        public static final String CloseupButton="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_close')and @index='0']";


    }


    public static class txu140Waiting{

        public static final String title="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.stg:id/textView3')and @index='0']";
        public static final String  headermsg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.stg:id/infoTextView')and @index='3']";
        public static final String driverName="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.stg:id/text_driver_name')and @index='2']";
        public static final String GoBackToDefaultButton="//android.widget.ImageButton[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/fab_position_now') and @index='2']";
        public static final String likeCounting="//android.widget.TextView[contains(@resourece-id,'com.earthcar.taxiuser.dev.debug:id/text_rating')and @index='6']";
        public static final String seatcapability="//android.widget.TextView[contains(@resourece-id,'com.earthcar.taxiuser.dev.debug:id/text_seat_capacity')and @index='8']";
        public static final String vehicleId="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_vehicle_id')and @index='0']";
        public static final String text_car_license_plate="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_car_license_plate')and @index='0']";
        public static final String departureLocation="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_departure')and @index='13']";
        public static final String destinationLocation="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_destination')and @index='16']";
        public static final String paymentMethod="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_payment_method')and @index='0']";
        public static final String coupon="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_coupons')and @index='0']";
        public static final String textTotalTip="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_total_tip')and @index='6']";
        public static final String text_tip_output="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_tip_output')and @index='7']";
        public static final String textGiveAtip="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_give_a_tip')and @index='10']";
        public static final String button_tip_minus="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_tip_minus')and @index='0']";
        public static final String text_tip_amount="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_tip_amount')and @index='2']";
        public static final String button_tip_plus="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_tip_plus')and @index='4']";
        public static final String button_submitInactive="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_submit')and @index='12']";
        public static final String text_dialog_message="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_dialog_message')and @index='0']";
        public static final String button_tip_confirmation_yes="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_tip_confirmation_yes')and @index='1']";
        public static final String button_tip_confirmation_no="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_tip_confirmation_no')and @index='2']";
        public static final String text_title_message_to_driver="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_title_message_to_driver')and @index='0']";
        public static final String text_message_send_message_to_driver="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_send_message_to_driver')and @index='1']";
        public static final String text_input_message="//android.widget.EditText[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_input_message')and @index='2']";
        public static final String button_send_message_to_driver="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_send_message_to_driver')and @index='3']";
        public static final String phonetextView="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/textView')and @index='1']";
        public static final String button_call_driver="//android.widget.RelativeLayout[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_call_driver')and @index='5']";
        public static final String button_cancel_request="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_cancel_request')and @index='6']";
        public static final String minimizeImageButton="//android.widget.ImageButton[@index='0']";
        public static final String text_arrival_time="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_arrival_time')and @index='2']";
        public static final String text_minutes="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_minutes')and @index='4']";
        public static final String driverArrivalMesg="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_message_driver_arrival')and @index='0']";
        public static final String arrivalOk="//android.widget.Button[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/button_driver_arrival_yes')and @index='1']";








    }

    public static class txu150_Onboard {

        public static final String title="//android.widget.TextView[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/text_toolbar_title')and @index='1']";
        public static final String GoBackToDefaultButton="//android.widget.ImageButton[contains(@resource-id,'com.earthcar.taxiuser.dev.debug:id/currentLocationButton')and @index='2']";





    }




}
