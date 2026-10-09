package com.stockbit.usecase.trading.contract.entity;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/trading/contract/entity/PhotoFileType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "KTP", "SELFIE", "usecase-trading-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PhotoFileType extends Enum<PhotoFileType> {
    public static final PhotoFileType KTP = null;
    public static final PhotoFileType SELFIE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PhotoFileType[] f163320a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163321b = null;
    private final String value;

    static {
        KTP = new PhotoFileType("KTP", 0, "FILE_TYPE_KTP");
        SELFIE = new PhotoFileType("SELFIE", 1, "FILE_TYPE_SELFIE");
        PhotoFileType[] r02 = a();
        f163320a = r02;
        f163321b = kotlin.enums.b.a(r02);
    }

    PhotoFileType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PhotoFileType[] a() {
        return new PhotoFileType[]{KTP, SELFIE};
    }

    public static kotlin.enums.a getEntries() {
        return f163321b;
    }

    public static PhotoFileType valueOf(String r1) {
        return (PhotoFileType) Enum.valueOf(PhotoFileType.class, r1);
    }

    public static PhotoFileType[] values() {
        return (PhotoFileType[]) f163320a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
