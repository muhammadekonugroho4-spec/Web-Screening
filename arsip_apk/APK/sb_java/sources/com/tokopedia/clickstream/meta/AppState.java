package com.tokopedia.clickstream.meta;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum AppState extends Enum<AppState> implements Internal.EnumLite {
    public static final AppState APP_STATE_BACKGROUND = null;
    public static final int APP_STATE_BACKGROUND_VALUE = 2;
    public static final AppState APP_STATE_FOREGROUND = null;
    public static final int APP_STATE_FOREGROUND_VALUE = 1;
    public static final AppState APP_STATE_UNSPECIFIED = null;
    public static final int APP_STATE_UNSPECIFIED_VALUE = 0;
    public static final AppState UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f173797a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AppState[] f173798b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f173799a = null;

        static {
            f173799a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (AppState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        AppState r02 = new AppState("APP_STATE_UNSPECIFIED", 0, 0);
        APP_STATE_UNSPECIFIED = r02;
        AppState r1 = new AppState("APP_STATE_FOREGROUND", 1, 1);
        APP_STATE_FOREGROUND = r1;
        AppState r2 = new AppState("APP_STATE_BACKGROUND", 2, 2);
        APP_STATE_BACKGROUND = r2;
        AppState r3 = new AppState("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        f173798b = new AppState[]{r02, r1, r2, r3};
        f173797a = new a();
    }

    AppState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static AppState forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return APP_STATE_BACKGROUND;
    L12:
        return APP_STATE_FOREGROUND;
    L14:
        return APP_STATE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<AppState> internalGetValueMap() {
        return f173797a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f173799a;
    }

    public static AppState valueOf(String r1) {
        return (AppState) Enum.valueOf(AppState.class, r1);
    }

    public static AppState[] values() {
        return (AppState[]) f173798b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AppState valueOf(int r02) {
        return forNumber(r02);
    }
}
