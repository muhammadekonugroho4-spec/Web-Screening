package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/cloudbridge/CustomEventField;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "EVENT_TIME", "EVENT_NAME", "VALUE_TO_SUM", "CONTENT_IDS", "CONTENTS", "CONTENT_TYPE", "DESCRIPTION", "LEVEL", "MAX_RATING_VALUE", "NUM_ITEMS", "PAYMENT_INFO_AVAILABLE", "REGISTRATION_METHOD", "SEARCH_STRING", "SUCCESS", "ORDER_ID", "AD_TYPE", "CURRENCY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CustomEventField extends Enum<CustomEventField> {
    public static final CustomEventField AD_TYPE = null;
    public static final CustomEventField CONTENTS = null;
    public static final CustomEventField CONTENT_IDS = null;
    public static final CustomEventField CONTENT_TYPE = null;
    public static final CustomEventField CURRENCY = null;
    public static final a Companion = null;
    public static final CustomEventField DESCRIPTION = null;
    public static final CustomEventField EVENT_NAME = null;
    public static final CustomEventField EVENT_TIME = null;
    public static final CustomEventField LEVEL = null;
    public static final CustomEventField MAX_RATING_VALUE = null;
    public static final CustomEventField NUM_ITEMS = null;
    public static final CustomEventField ORDER_ID = null;
    public static final CustomEventField PAYMENT_INFO_AVAILABLE = null;
    public static final CustomEventField REGISTRATION_METHOD = null;
    public static final CustomEventField SEARCH_STRING = null;
    public static final CustomEventField SUCCESS = null;
    public static final CustomEventField VALUE_TO_SUM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CustomEventField[] f35799a = null;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CustomEventField a(String r6) {
            p.l(r6, "rawValue");
            CustomEventField[] r02 = CustomEventField.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CustomEventField r3 = r02[r2];
            if (p.g(r3.getRawValue(), r6) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L8:
            return null;
        }

        public a() {
        }
    }

    static {
        EVENT_TIME = new CustomEventField("EVENT_TIME", 0, "_logTime");
        EVENT_NAME = new CustomEventField("EVENT_NAME", 1, "_eventName");
        VALUE_TO_SUM = new CustomEventField("VALUE_TO_SUM", 2, "_valueToSum");
        CONTENT_IDS = new CustomEventField("CONTENT_IDS", 3, "fb_content_id");
        CONTENTS = new CustomEventField("CONTENTS", 4, "fb_content");
        CONTENT_TYPE = new CustomEventField("CONTENT_TYPE", 5, "fb_content_type");
        DESCRIPTION = new CustomEventField("DESCRIPTION", 6, "fb_description");
        LEVEL = new CustomEventField("LEVEL", 7, "fb_level");
        MAX_RATING_VALUE = new CustomEventField("MAX_RATING_VALUE", 8, "fb_max_rating_value");
        NUM_ITEMS = new CustomEventField("NUM_ITEMS", 9, "fb_num_items");
        PAYMENT_INFO_AVAILABLE = new CustomEventField("PAYMENT_INFO_AVAILABLE", 10, "fb_payment_info_available");
        REGISTRATION_METHOD = new CustomEventField("REGISTRATION_METHOD", 11, "fb_registration_method");
        SEARCH_STRING = new CustomEventField("SEARCH_STRING", 12, "fb_search_string");
        SUCCESS = new CustomEventField("SUCCESS", 13, "fb_success");
        ORDER_ID = new CustomEventField("ORDER_ID", 14, "fb_order_id");
        AD_TYPE = new CustomEventField("AD_TYPE", 15, "ad_type");
        CURRENCY = new CustomEventField("CURRENCY", 16, "fb_currency");
        f35799a = a();
        Companion = new a(null);
    }

    CustomEventField(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ CustomEventField[] a() {
        return new CustomEventField[]{EVENT_TIME, EVENT_NAME, VALUE_TO_SUM, CONTENT_IDS, CONTENTS, CONTENT_TYPE, DESCRIPTION, LEVEL, MAX_RATING_VALUE, NUM_ITEMS, PAYMENT_INFO_AVAILABLE, REGISTRATION_METHOD, SEARCH_STRING, SUCCESS, ORDER_ID, AD_TYPE, CURRENCY};
    }

    public static CustomEventField valueOf(String r1) {
        return (CustomEventField) Enum.valueOf(CustomEventField.class, r1);
    }

    public static CustomEventField[] values() {
        return (CustomEventField[]) f35799a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
