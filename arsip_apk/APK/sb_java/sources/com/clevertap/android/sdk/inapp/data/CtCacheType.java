package com.clevertap.android.sdk.inapp.data;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "GIF", "FILES", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CtCacheType extends Enum<CtCacheType> {
    public static final CtCacheType FILES = null;
    public static final CtCacheType GIF = null;
    public static final CtCacheType IMAGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CtCacheType[] f34132a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34133b = null;

    static {
        IMAGE = new CtCacheType("IMAGE", 0);
        GIF = new CtCacheType("GIF", 1);
        FILES = new CtCacheType("FILES", 2);
        CtCacheType[] r02 = a();
        f34132a = r02;
        f34133b = b.a(r02);
    }

    CtCacheType(String r1, int r2) {
    }

    public static final /* synthetic */ CtCacheType[] a() {
        return new CtCacheType[]{IMAGE, GIF, FILES};
    }

    public static kotlin.enums.a getEntries() {
        return f34133b;
    }

    public static CtCacheType valueOf(String r1) {
        return (CtCacheType) Enum.valueOf(CtCacheType.class, r1);
    }

    public static CtCacheType[] values() {
        return (CtCacheType[]) f34132a.clone();
    }
}
