package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "MOBILE_APP_INSTALL", "CUSTOM", "OTHER", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AppEventType extends Enum<AppEventType> {
    public static final AppEventType CUSTOM = null;
    public static final a Companion = null;
    public static final AppEventType MOBILE_APP_INSTALL = null;
    public static final AppEventType OTHER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AppEventType[] f35773a = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final AppEventType a(String r2) {
            p.l(r2, "rawValue");
            if (p.g(r2, "MOBILE_APP_INSTALL") == false) goto L7;
            return AppEventType.MOBILE_APP_INSTALL;
        L7:
            if (p.g(r2, "CUSTOM_APP_EVENTS") == false) goto L11;
            return AppEventType.CUSTOM;
        L11:
            return AppEventType.OTHER;
        }

        public a() {
        }
    }

    static {
        MOBILE_APP_INSTALL = new AppEventType("MOBILE_APP_INSTALL", 0);
        CUSTOM = new AppEventType("CUSTOM", 1);
        OTHER = new AppEventType("OTHER", 2);
        f35773a = a();
        Companion = new a(null);
    }

    AppEventType(String r1, int r2) {
    }

    public static final /* synthetic */ AppEventType[] a() {
        return new AppEventType[]{MOBILE_APP_INSTALL, CUSTOM, OTHER};
    }

    public static AppEventType valueOf(String r1) {
        return (AppEventType) Enum.valueOf(AppEventType.class, r1);
    }

    public static AppEventType[] values() {
        return (AppEventType[]) f35773a.clone();
    }
}
