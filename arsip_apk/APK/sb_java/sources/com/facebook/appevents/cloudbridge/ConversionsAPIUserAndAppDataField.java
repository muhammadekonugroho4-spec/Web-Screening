package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "ANON_ID", "FB_LOGIN_ID", "MAD_ID", "PAGE_ID", "PAGE_SCOPED_USER_ID", "USER_DATA", "ADV_TE", "APP_TE", "CONSIDER_VIEWS", "DEVICE_TOKEN", "EXT_INFO", "INCLUDE_DWELL_DATA", "INCLUDE_VIDEO_DATA", "INSTALL_REFERRER", "INSTALLER_PACKAGE", "RECEIPT_DATA", "URL_SCHEMES", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ConversionsAPIUserAndAppDataField extends Enum<ConversionsAPIUserAndAppDataField> {
    public static final ConversionsAPIUserAndAppDataField ADV_TE = null;
    public static final ConversionsAPIUserAndAppDataField ANON_ID = null;
    public static final ConversionsAPIUserAndAppDataField APP_TE = null;
    public static final ConversionsAPIUserAndAppDataField CONSIDER_VIEWS = null;
    public static final ConversionsAPIUserAndAppDataField DEVICE_TOKEN = null;
    public static final ConversionsAPIUserAndAppDataField EXT_INFO = null;
    public static final ConversionsAPIUserAndAppDataField FB_LOGIN_ID = null;
    public static final ConversionsAPIUserAndAppDataField INCLUDE_DWELL_DATA = null;
    public static final ConversionsAPIUserAndAppDataField INCLUDE_VIDEO_DATA = null;
    public static final ConversionsAPIUserAndAppDataField INSTALLER_PACKAGE = null;
    public static final ConversionsAPIUserAndAppDataField INSTALL_REFERRER = null;
    public static final ConversionsAPIUserAndAppDataField MAD_ID = null;
    public static final ConversionsAPIUserAndAppDataField PAGE_ID = null;
    public static final ConversionsAPIUserAndAppDataField PAGE_SCOPED_USER_ID = null;
    public static final ConversionsAPIUserAndAppDataField RECEIPT_DATA = null;
    public static final ConversionsAPIUserAndAppDataField URL_SCHEMES = null;
    public static final ConversionsAPIUserAndAppDataField USER_DATA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ConversionsAPIUserAndAppDataField[] f35798a = null;
    private final String rawValue;

    static {
        ANON_ID = new ConversionsAPIUserAndAppDataField("ANON_ID", 0, "anon_id");
        FB_LOGIN_ID = new ConversionsAPIUserAndAppDataField("FB_LOGIN_ID", 1, "fb_login_id");
        MAD_ID = new ConversionsAPIUserAndAppDataField("MAD_ID", 2, "madid");
        PAGE_ID = new ConversionsAPIUserAndAppDataField("PAGE_ID", 3, "page_id");
        PAGE_SCOPED_USER_ID = new ConversionsAPIUserAndAppDataField("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
        USER_DATA = new ConversionsAPIUserAndAppDataField("USER_DATA", 5, "ud");
        ADV_TE = new ConversionsAPIUserAndAppDataField("ADV_TE", 6, "advertiser_tracking_enabled");
        APP_TE = new ConversionsAPIUserAndAppDataField("APP_TE", 7, "application_tracking_enabled");
        CONSIDER_VIEWS = new ConversionsAPIUserAndAppDataField("CONSIDER_VIEWS", 8, "consider_views");
        DEVICE_TOKEN = new ConversionsAPIUserAndAppDataField("DEVICE_TOKEN", 9, "device_token");
        EXT_INFO = new ConversionsAPIUserAndAppDataField("EXT_INFO", 10, "extInfo");
        INCLUDE_DWELL_DATA = new ConversionsAPIUserAndAppDataField("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
        INCLUDE_VIDEO_DATA = new ConversionsAPIUserAndAppDataField("INCLUDE_VIDEO_DATA", 12, "include_video_data");
        INSTALL_REFERRER = new ConversionsAPIUserAndAppDataField("INSTALL_REFERRER", 13, "install_referrer");
        INSTALLER_PACKAGE = new ConversionsAPIUserAndAppDataField("INSTALLER_PACKAGE", 14, "installer_package");
        RECEIPT_DATA = new ConversionsAPIUserAndAppDataField("RECEIPT_DATA", 15, "receipt_data");
        URL_SCHEMES = new ConversionsAPIUserAndAppDataField("URL_SCHEMES", 16, "url_schemes");
        f35798a = a();
    }

    ConversionsAPIUserAndAppDataField(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ ConversionsAPIUserAndAppDataField[] a() {
        return new ConversionsAPIUserAndAppDataField[]{ANON_ID, FB_LOGIN_ID, MAD_ID, PAGE_ID, PAGE_SCOPED_USER_ID, USER_DATA, ADV_TE, APP_TE, CONSIDER_VIEWS, DEVICE_TOKEN, EXT_INFO, INCLUDE_DWELL_DATA, INCLUDE_VIDEO_DATA, INSTALL_REFERRER, INSTALLER_PACKAGE, RECEIPT_DATA, URL_SCHEMES};
    }

    public static ConversionsAPIUserAndAppDataField valueOf(String r1) {
        return (ConversionsAPIUserAndAppDataField) Enum.valueOf(ConversionsAPIUserAndAppDataField.class, r1);
    }

    public static ConversionsAPIUserAndAppDataField[] values() {
        return (ConversionsAPIUserAndAppDataField[]) f35798a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
