package com.stockbit.android.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/android/model/ExodusErrorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MAINTENANCE", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ExodusErrorType extends Enum<ExodusErrorType> {
    public static final ExodusErrorType MAINTENANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExodusErrorType[] f47759a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f47760b = null;
    private final String value;

    static {
        MAINTENANCE = new ExodusErrorType("MAINTENANCE", 0, "MAINTENANCE");
        ExodusErrorType[] r02 = a();
        f47759a = r02;
        f47760b = b.a(r02);
    }

    ExodusErrorType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ExodusErrorType[] a() {
        return new ExodusErrorType[]{MAINTENANCE};
    }

    public static a getEntries() {
        return f47760b;
    }

    public static ExodusErrorType valueOf(String r1) {
        return (ExodusErrorType) Enum.valueOf(ExodusErrorType.class, r1);
    }

    public static ExodusErrorType[] values() {
        return (ExodusErrorType[]) f47759a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
