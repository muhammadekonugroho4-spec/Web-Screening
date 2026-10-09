package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/UploadImageType;", "", "string", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "TYPE_UNSPECIFIED", "TYPE_KTP", "TYPE_SELFIE", "TYPE_LIVENESS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UploadImageType extends Enum<UploadImageType> {
    public static final UploadImageType TYPE_KTP = null;
    public static final UploadImageType TYPE_LIVENESS = null;
    public static final UploadImageType TYPE_SELFIE = null;
    public static final UploadImageType TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UploadImageType[] f86262a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86263b = null;
    private final String string;

    static {
        TYPE_UNSPECIFIED = new UploadImageType("TYPE_UNSPECIFIED", 0, "TYPE_UNSPECIFIED");
        TYPE_KTP = new UploadImageType("TYPE_KTP", 1, "TYPE_KTP");
        TYPE_SELFIE = new UploadImageType("TYPE_SELFIE", 2, "TYPE_SELFIE");
        TYPE_LIVENESS = new UploadImageType("TYPE_LIVENESS", 3, "TYPE_LIVENESS");
        UploadImageType[] r02 = a();
        f86262a = r02;
        f86263b = kotlin.enums.b.a(r02);
    }

    UploadImageType(String r1, int r2, String r3) {
        this.string = r3;
    }

    public static final /* synthetic */ UploadImageType[] a() {
        return new UploadImageType[]{TYPE_UNSPECIFIED, TYPE_KTP, TYPE_SELFIE, TYPE_LIVENESS};
    }

    public static kotlin.enums.a getEntries() {
        return f86263b;
    }

    public static UploadImageType valueOf(String r1) {
        return (UploadImageType) Enum.valueOf(UploadImageType.class, r1);
    }

    public static UploadImageType[] values() {
        return (UploadImageType[]) f86262a.clone();
    }

    public final String getString() {
        return this.string;
    }
}
