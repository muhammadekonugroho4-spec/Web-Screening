package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "ANON_ID", "APP_USER_ID", "ADVERTISER_ID", "PAGE_ID", "PAGE_SCOPED_USER_ID", "USER_DATA", "ADV_TE", "APP_TE", "CONSIDER_VIEWS", "DEVICE_TOKEN", "EXT_INFO", "INCLUDE_DWELL_DATA", "INCLUDE_VIDEO_DATA", "INSTALL_REFERRER", "INSTALLER_PACKAGE", "RECEIPT_DATA", "URL_SCHEMES", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AppEventUserAndAppDataField extends Enum<AppEventUserAndAppDataField> {
    public static final AppEventUserAndAppDataField ADVERTISER_ID = null;
    public static final AppEventUserAndAppDataField ADV_TE = null;
    public static final AppEventUserAndAppDataField ANON_ID = null;
    public static final AppEventUserAndAppDataField APP_TE = null;
    public static final AppEventUserAndAppDataField APP_USER_ID = null;
    public static final AppEventUserAndAppDataField CONSIDER_VIEWS = null;
    public static final a Companion = null;
    public static final AppEventUserAndAppDataField DEVICE_TOKEN = null;
    public static final AppEventUserAndAppDataField EXT_INFO = null;
    public static final AppEventUserAndAppDataField INCLUDE_DWELL_DATA = null;
    public static final AppEventUserAndAppDataField INCLUDE_VIDEO_DATA = null;
    public static final AppEventUserAndAppDataField INSTALLER_PACKAGE = null;
    public static final AppEventUserAndAppDataField INSTALL_REFERRER = null;
    public static final AppEventUserAndAppDataField PAGE_ID = null;
    public static final AppEventUserAndAppDataField PAGE_SCOPED_USER_ID = null;
    public static final AppEventUserAndAppDataField RECEIPT_DATA = null;
    public static final AppEventUserAndAppDataField URL_SCHEMES = null;
    public static final AppEventUserAndAppDataField USER_DATA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AppEventUserAndAppDataField[] f35774a = null;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final AppEventUserAndAppDataField a(String r6) {
            p.l(r6, "rawValue");
            AppEventUserAndAppDataField[] r02 = AppEventUserAndAppDataField.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            AppEventUserAndAppDataField r3 = r02[r2];
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
        ANON_ID = new AppEventUserAndAppDataField("ANON_ID", 0, "anon_id");
        APP_USER_ID = new AppEventUserAndAppDataField("APP_USER_ID", 1, "app_user_id");
        ADVERTISER_ID = new AppEventUserAndAppDataField("ADVERTISER_ID", 2, "advertiser_id");
        PAGE_ID = new AppEventUserAndAppDataField("PAGE_ID", 3, "page_id");
        PAGE_SCOPED_USER_ID = new AppEventUserAndAppDataField("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
        USER_DATA = new AppEventUserAndAppDataField("USER_DATA", 5, "ud");
        ADV_TE = new AppEventUserAndAppDataField("ADV_TE", 6, "advertiser_tracking_enabled");
        APP_TE = new AppEventUserAndAppDataField("APP_TE", 7, "application_tracking_enabled");
        CONSIDER_VIEWS = new AppEventUserAndAppDataField("CONSIDER_VIEWS", 8, "consider_views");
        DEVICE_TOKEN = new AppEventUserAndAppDataField("DEVICE_TOKEN", 9, "device_token");
        EXT_INFO = new AppEventUserAndAppDataField("EXT_INFO", 10, "extInfo");
        INCLUDE_DWELL_DATA = new AppEventUserAndAppDataField("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
        INCLUDE_VIDEO_DATA = new AppEventUserAndAppDataField("INCLUDE_VIDEO_DATA", 12, "include_video_data");
        INSTALL_REFERRER = new AppEventUserAndAppDataField("INSTALL_REFERRER", 13, "install_referrer");
        INSTALLER_PACKAGE = new AppEventUserAndAppDataField("INSTALLER_PACKAGE", 14, "installer_package");
        RECEIPT_DATA = new AppEventUserAndAppDataField("RECEIPT_DATA", 15, "receipt_data");
        URL_SCHEMES = new AppEventUserAndAppDataField("URL_SCHEMES", 16, "url_schemes");
        f35774a = a();
        Companion = new a(null);
    }

    AppEventUserAndAppDataField(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ AppEventUserAndAppDataField[] a() {
        return new AppEventUserAndAppDataField[]{ANON_ID, APP_USER_ID, ADVERTISER_ID, PAGE_ID, PAGE_SCOPED_USER_ID, USER_DATA, ADV_TE, APP_TE, CONSIDER_VIEWS, DEVICE_TOKEN, EXT_INFO, INCLUDE_DWELL_DATA, INCLUDE_VIDEO_DATA, INSTALL_REFERRER, INSTALLER_PACKAGE, RECEIPT_DATA, URL_SCHEMES};
    }

    public static AppEventUserAndAppDataField valueOf(String r1) {
        return (AppEventUserAndAppDataField) Enum.valueOf(AppEventUserAndAppDataField.class, r1);
    }

    public static AppEventUserAndAppDataField[] values() {
        return (AppEventUserAndAppDataField[]) f35774a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
