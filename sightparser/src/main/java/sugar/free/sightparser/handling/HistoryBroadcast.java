package sugar.free.sightparser.handling;

public class HistoryBroadcast {

    //Sent to service
    public static final String ACTION_START_SYNC = "sugar.free.sightremote.services.HistorySyncService.START_SYNC";

    //Sent from service
    public static final String ACTION_BOLUS_DELIVERED = "sugar.free.sightremote.services.HistorySyncService.BOLUS_DELIVERED";
    public static final String ACTION_PUMP_STATUS_CHANGED = "sugar.free.sightremote.services.HistorySyncService.PUMP_STATUS_CHANGED";
    public static final String ACTION_BOLUS_PROGRAMMED = "sugar.free.sightremote.services.HistorySyncService.BOLUS_PROGRAMMED";
    public static final String ACTION_END_OF_TBR = "sugar.free.sightremote.services.HistorySyncService.END_OF_TBR";
    public static final String ACTION_SYNC_STARTED = "sugar.free.sightremote.services.HistorySyncService.SYNC_STARTED";
    public static final String ACTION_STILL_SYNCING = "sugar.free.sightremote.services.HistorySyncService.STILL_SYNCING";
    public static final String ACTION_SYNC_FINISHED = "sugar.free.sightremote.services.HistorySyncService.SYNC_SYNC_FINISHED";

    public static final String EXTRA_BOLUS_ID = "BOLUS_ID";
    public static final String EXTRA_BOLUS_TYPE = "BOLUS_TYPE";
    public static final String EXTRA_DURATION = "DURATION";
    public static final String EXTRA_TBR_AMOUNT = "TBR_AMOUNT";
    public static final String EXTRA_EVENT_NUMBER = "EVENT_NUMBER";
    public static final String EXTRA_EXTENDED_AMOUNT = "EXTENDED_AMOUNT";
    public static final String EXTRA_IMMEDIATE_AMOUNT = "IMMEDIATE_AMOUNT";
    public static final String EXTRA_PUMP_SERIAL_NUMBER = "PUMP_SERIAL_NUMBER";
    public static final String EXTRA_EVENT_TIME = "EVENT_TIME";
    public static final String EXTRA_START_TIME = "START_TIME";
    public static final String EXTRA_OLD_STATUS = "OLD_STATUS";
    public static final String EXTRA_NEW_STATUS = "NEW_STATUS";

}
