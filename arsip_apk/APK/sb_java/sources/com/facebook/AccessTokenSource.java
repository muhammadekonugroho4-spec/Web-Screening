package com.facebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/AccessTokenSource;", "", "canExtendToken", "", "(Ljava/lang/String;IZ)V", "fromInstagram", "NONE", "FACEBOOK_APPLICATION_WEB", "FACEBOOK_APPLICATION_NATIVE", "FACEBOOK_APPLICATION_SERVICE", "WEB_VIEW", "CHROME_CUSTOM_TAB", "TEST_USER", "CLIENT_TOKEN", "DEVICE_AUTH", "INSTAGRAM_APPLICATION_WEB", "INSTAGRAM_CUSTOM_CHROME_TAB", "INSTAGRAM_WEB_VIEW", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AccessTokenSource extends Enum<AccessTokenSource> {
    public static final AccessTokenSource CHROME_CUSTOM_TAB = null;
    public static final AccessTokenSource CLIENT_TOKEN = null;
    public static final AccessTokenSource DEVICE_AUTH = null;
    public static final AccessTokenSource FACEBOOK_APPLICATION_NATIVE = null;
    public static final AccessTokenSource FACEBOOK_APPLICATION_SERVICE = null;
    public static final AccessTokenSource FACEBOOK_APPLICATION_WEB = null;
    public static final AccessTokenSource INSTAGRAM_APPLICATION_WEB = null;
    public static final AccessTokenSource INSTAGRAM_CUSTOM_CHROME_TAB = null;
    public static final AccessTokenSource INSTAGRAM_WEB_VIEW = null;
    public static final AccessTokenSource NONE = null;
    public static final AccessTokenSource TEST_USER = null;
    public static final AccessTokenSource WEB_VIEW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AccessTokenSource[] f35538a = null;
    private final boolean canExtendToken;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35539a = null;

        static {
            int[] r02 = new int[AccessTokenSource.values().length];
            r02[AccessTokenSource.INSTAGRAM_APPLICATION_WEB.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[AccessTokenSource.INSTAGRAM_WEB_VIEW.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f35539a = r02;
        }
    }

    static {
        NONE = new AccessTokenSource("NONE", 0, false);
        FACEBOOK_APPLICATION_WEB = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
        FACEBOOK_APPLICATION_NATIVE = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
        FACEBOOK_APPLICATION_SERVICE = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
        WEB_VIEW = new AccessTokenSource("WEB_VIEW", 4, true);
        CHROME_CUSTOM_TAB = new AccessTokenSource("CHROME_CUSTOM_TAB", 5, true);
        TEST_USER = new AccessTokenSource("TEST_USER", 6, true);
        CLIENT_TOKEN = new AccessTokenSource("CLIENT_TOKEN", 7, true);
        DEVICE_AUTH = new AccessTokenSource("DEVICE_AUTH", 8, true);
        INSTAGRAM_APPLICATION_WEB = new AccessTokenSource("INSTAGRAM_APPLICATION_WEB", 9, true);
        INSTAGRAM_CUSTOM_CHROME_TAB = new AccessTokenSource("INSTAGRAM_CUSTOM_CHROME_TAB", 10, true);
        INSTAGRAM_WEB_VIEW = new AccessTokenSource("INSTAGRAM_WEB_VIEW", 11, true);
        f35538a = a();
    }

    AccessTokenSource(String r1, int r2, boolean r3) {
        this.canExtendToken = r3;
    }

    public static final /* synthetic */ AccessTokenSource[] a() {
        return new AccessTokenSource[]{NONE, FACEBOOK_APPLICATION_WEB, FACEBOOK_APPLICATION_NATIVE, FACEBOOK_APPLICATION_SERVICE, WEB_VIEW, CHROME_CUSTOM_TAB, TEST_USER, CLIENT_TOKEN, DEVICE_AUTH, INSTAGRAM_APPLICATION_WEB, INSTAGRAM_CUSTOM_CHROME_TAB, INSTAGRAM_WEB_VIEW};
    }

    public static AccessTokenSource valueOf(String r1) {
        return (AccessTokenSource) Enum.valueOf(AccessTokenSource.class, r1);
    }

    public static AccessTokenSource[] values() {
        return (AccessTokenSource[]) f35538a.clone();
    }

    public final boolean canExtendToken() {
        return this.canExtendToken;
    }

    public final boolean fromInstagram() {
        int r02 = a.f35539a[ordinal()];
        if (r02 != 1) goto L5;
    L10:
        return true;
    L5:
        if (r02 == 2) goto L10;
        if (r02 == 3) goto L10;
        return false;
    }
}
