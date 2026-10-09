package com.facebook.appevents.cloudbridge;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/cloudbridge/OtherEventConstants;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "EVENT", "ACTION_SOURCE", GrsBaseInfo.CountryCodeSource.APP, "MOBILE_APP_INSTALL", "INSTALL_EVENT_TIME", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum OtherEventConstants extends Enum<OtherEventConstants> {
    public static final OtherEventConstants ACTION_SOURCE = null;
    public static final OtherEventConstants APP = null;
    public static final OtherEventConstants EVENT = null;
    public static final OtherEventConstants INSTALL_EVENT_TIME = null;
    public static final OtherEventConstants MOBILE_APP_INSTALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OtherEventConstants[] f35800a = null;
    private final String rawValue;

    static {
        EVENT = new OtherEventConstants("EVENT", 0, NotificationCompat.CATEGORY_EVENT);
        ACTION_SOURCE = new OtherEventConstants("ACTION_SOURCE", 1, "action_source");
        APP = new OtherEventConstants(GrsBaseInfo.CountryCodeSource.APP, 2, "app");
        MOBILE_APP_INSTALL = new OtherEventConstants("MOBILE_APP_INSTALL", 3, "MobileAppInstall");
        INSTALL_EVENT_TIME = new OtherEventConstants("INSTALL_EVENT_TIME", 4, "install_timestamp");
        f35800a = a();
    }

    OtherEventConstants(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ OtherEventConstants[] a() {
        return new OtherEventConstants[]{EVENT, ACTION_SOURCE, APP, MOBILE_APP_INSTALL, INSTALL_EVENT_TIME};
    }

    public static OtherEventConstants valueOf(String r1) {
        return (OtherEventConstants) Enum.valueOf(OtherEventConstants.class, r1);
    }

    public static OtherEventConstants[] values() {
        return (OtherEventConstants[]) f35800a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
