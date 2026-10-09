package com.stockbit.remote.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/remote/utils/AcceptLanguageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INDONESIA", "ENGLISH", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum AcceptLanguageType extends Enum<AcceptLanguageType> {
    public static final AcceptLanguageType ENGLISH = null;
    public static final AcceptLanguageType INDONESIA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AcceptLanguageType[] f129536a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f129537b = null;
    private final String value;

    static {
        INDONESIA = new AcceptLanguageType("INDONESIA", 0, "ID");
        ENGLISH = new AcceptLanguageType("ENGLISH", 1, "EN");
        AcceptLanguageType[] r02 = a();
        f129536a = r02;
        f129537b = kotlin.enums.b.a(r02);
    }

    AcceptLanguageType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ AcceptLanguageType[] a() {
        return new AcceptLanguageType[]{INDONESIA, ENGLISH};
    }

    public static kotlin.enums.a getEntries() {
        return f129537b;
    }

    public static AcceptLanguageType valueOf(String r1) {
        return (AcceptLanguageType) Enum.valueOf(AcceptLanguageType.class, r1);
    }

    public static AcceptLanguageType[] values() {
        return (AcceptLanguageType[]) f129536a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
