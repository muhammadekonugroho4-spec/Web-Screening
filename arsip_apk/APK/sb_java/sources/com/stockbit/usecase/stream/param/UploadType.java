package com.stockbit.usecase.stream.param;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/stream/param/UploadType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "DOCS", "usecase-stream"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum UploadType extends Enum<UploadType> {
    public static final UploadType DOCS = null;
    public static final UploadType IMAGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UploadType[] f163068a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f163069b = null;

    static {
        IMAGE = new UploadType("IMAGE", 0);
        DOCS = new UploadType("DOCS", 1);
        UploadType[] r02 = a();
        f163068a = r02;
        f163069b = b.a(r02);
    }

    UploadType(String r1, int r2) {
    }

    public static final /* synthetic */ UploadType[] a() {
        return new UploadType[]{IMAGE, DOCS};
    }

    public static a getEntries() {
        return f163069b;
    }

    public static UploadType valueOf(String r1) {
        return (UploadType) Enum.valueOf(UploadType.class, r1);
    }

    public static UploadType[] values() {
        return (UploadType[]) f163068a.clone();
    }
}
