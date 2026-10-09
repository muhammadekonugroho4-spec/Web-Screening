package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/LocalImageSource;", "", "<init>", "(Ljava/lang/String;I)V", "GALLERY", "CAMERA", "NONE", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LocalImageSource extends Enum<LocalImageSource> {
    public static final LocalImageSource CAMERA = null;
    public static final LocalImageSource GALLERY = null;
    public static final LocalImageSource NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LocalImageSource[] f86207a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86208b = null;

    static {
        GALLERY = new LocalImageSource("GALLERY", 0);
        CAMERA = new LocalImageSource("CAMERA", 1);
        NONE = new LocalImageSource("NONE", 2);
        LocalImageSource[] r02 = a();
        f86207a = r02;
        f86208b = kotlin.enums.b.a(r02);
    }

    LocalImageSource(String r1, int r2) {
    }

    public static final /* synthetic */ LocalImageSource[] a() {
        return new LocalImageSource[]{GALLERY, CAMERA, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f86208b;
    }

    public static LocalImageSource valueOf(String r1) {
        return (LocalImageSource) Enum.valueOf(LocalImageSource.class, r1);
    }

    public static LocalImageSource[] values() {
        return (LocalImageSource[]) f86207a.clone();
    }
}
