package com.facebook.appevents.cloudbridge;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "VALUE_TO_SUM", "EVENT_TIME", "EVENT_NAME", "CONTENT_IDS", "CONTENTS", "CONTENT_TYPE", "DESCRIPTION", "LEVEL", "MAX_RATING_VALUE", "NUM_ITEMS", "PAYMENT_INFO_AVAILABLE", "REGISTRATION_METHOD", "SEARCH_STRING", "SUCCESS", "ORDER_ID", "AD_TYPE", "CURRENCY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ConversionsAPICustomEventField extends Enum<ConversionsAPICustomEventField> {
    public static final ConversionsAPICustomEventField AD_TYPE = null;
    public static final ConversionsAPICustomEventField CONTENTS = null;
    public static final ConversionsAPICustomEventField CONTENT_IDS = null;
    public static final ConversionsAPICustomEventField CONTENT_TYPE = null;
    public static final ConversionsAPICustomEventField CURRENCY = null;
    public static final ConversionsAPICustomEventField DESCRIPTION = null;
    public static final ConversionsAPICustomEventField EVENT_NAME = null;
    public static final ConversionsAPICustomEventField EVENT_TIME = null;
    public static final ConversionsAPICustomEventField LEVEL = null;
    public static final ConversionsAPICustomEventField MAX_RATING_VALUE = null;
    public static final ConversionsAPICustomEventField NUM_ITEMS = null;
    public static final ConversionsAPICustomEventField ORDER_ID = null;
    public static final ConversionsAPICustomEventField PAYMENT_INFO_AVAILABLE = null;
    public static final ConversionsAPICustomEventField REGISTRATION_METHOD = null;
    public static final ConversionsAPICustomEventField SEARCH_STRING = null;
    public static final ConversionsAPICustomEventField SUCCESS = null;
    public static final ConversionsAPICustomEventField VALUE_TO_SUM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ConversionsAPICustomEventField[] f35795a = null;
    private final String rawValue;

    static {
        VALUE_TO_SUM = new ConversionsAPICustomEventField("VALUE_TO_SUM", 0, "value");
        EVENT_TIME = new ConversionsAPICustomEventField("EVENT_TIME", 1, "event_time");
        EVENT_NAME = new ConversionsAPICustomEventField("EVENT_NAME", 2, "event_name");
        CONTENT_IDS = new ConversionsAPICustomEventField("CONTENT_IDS", 3, "content_ids");
        CONTENTS = new ConversionsAPICustomEventField("CONTENTS", 4, "contents");
        CONTENT_TYPE = new ConversionsAPICustomEventField("CONTENT_TYPE", 5, "content_type");
        DESCRIPTION = new ConversionsAPICustomEventField("DESCRIPTION", 6, "description");
        LEVEL = new ConversionsAPICustomEventField("LEVEL", 7, FirebaseAnalytics.Param.LEVEL);
        MAX_RATING_VALUE = new ConversionsAPICustomEventField("MAX_RATING_VALUE", 8, "max_rating_value");
        NUM_ITEMS = new ConversionsAPICustomEventField("NUM_ITEMS", 9, "num_items");
        PAYMENT_INFO_AVAILABLE = new ConversionsAPICustomEventField("PAYMENT_INFO_AVAILABLE", 10, "payment_info_available");
        REGISTRATION_METHOD = new ConversionsAPICustomEventField("REGISTRATION_METHOD", 11, "registration_method");
        SEARCH_STRING = new ConversionsAPICustomEventField("SEARCH_STRING", 12, "search_string");
        SUCCESS = new ConversionsAPICustomEventField("SUCCESS", 13, "success");
        ORDER_ID = new ConversionsAPICustomEventField("ORDER_ID", 14, "order_id");
        AD_TYPE = new ConversionsAPICustomEventField("AD_TYPE", 15, "ad_type");
        CURRENCY = new ConversionsAPICustomEventField("CURRENCY", 16, FirebaseAnalytics.Param.CURRENCY);
        f35795a = a();
    }

    ConversionsAPICustomEventField(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ ConversionsAPICustomEventField[] a() {
        return new ConversionsAPICustomEventField[]{VALUE_TO_SUM, EVENT_TIME, EVENT_NAME, CONTENT_IDS, CONTENTS, CONTENT_TYPE, DESCRIPTION, LEVEL, MAX_RATING_VALUE, NUM_ITEMS, PAYMENT_INFO_AVAILABLE, REGISTRATION_METHOD, SEARCH_STRING, SUCCESS, ORDER_ID, AD_TYPE, CURRENCY};
    }

    public static ConversionsAPICustomEventField valueOf(String r1) {
        return (ConversionsAPICustomEventField) Enum.valueOf(ConversionsAPICustomEventField.class, r1);
    }

    public static ConversionsAPICustomEventField[] values() {
        return (ConversionsAPICustomEventField[]) f35795a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
