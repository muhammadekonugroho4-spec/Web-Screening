package com.stockbit.uikit.bottomsheet.topbar;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/uikit/bottomsheet/topbar/TopBarType;", "", "<init>", "(Ljava/lang/String;I)V", "AVATAR", "BUTTON", "SEARCH", "TITLE_LEFT", "TITLE_CENTER", "NO_TOPBAR", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TopBarType extends Enum<TopBarType> {
    public static final TopBarType AVATAR = null;
    public static final TopBarType BUTTON = null;
    public static final TopBarType NO_TOPBAR = null;
    public static final TopBarType SEARCH = null;
    public static final TopBarType TITLE_CENTER = null;
    public static final TopBarType TITLE_LEFT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TopBarType[] f151353a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151354b = null;

    static {
        AVATAR = new TopBarType("AVATAR", 0);
        BUTTON = new TopBarType("BUTTON", 1);
        SEARCH = new TopBarType("SEARCH", 2);
        TITLE_LEFT = new TopBarType("TITLE_LEFT", 3);
        TITLE_CENTER = new TopBarType("TITLE_CENTER", 4);
        NO_TOPBAR = new TopBarType("NO_TOPBAR", 5);
        TopBarType[] r02 = a();
        f151353a = r02;
        f151354b = kotlin.enums.b.a(r02);
    }

    TopBarType(String r1, int r2) {
    }

    public static final /* synthetic */ TopBarType[] a() {
        return new TopBarType[]{AVATAR, BUTTON, SEARCH, TITLE_LEFT, TITLE_CENTER, NO_TOPBAR};
    }

    public static kotlin.enums.a getEntries() {
        return f151354b;
    }

    public static TopBarType valueOf(String r1) {
        return (TopBarType) Enum.valueOf(TopBarType.class, r1);
    }

    public static TopBarType[] values() {
        return (TopBarType[]) f151353a.clone();
    }
}
