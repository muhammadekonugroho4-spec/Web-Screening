package com.stockbit.usecase.fda.model.paywall;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/fda/model/paywall/PaywallUserType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NEW_USER", "OLD_USER", "usecase-fda"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PaywallUserType extends Enum<PaywallUserType> {
    public static final PaywallUserType NEW_USER = null;
    public static final PaywallUserType OLD_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PaywallUserType[] f157853a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157854b = null;
    private final String value;

    static {
        NEW_USER = new PaywallUserType("NEW_USER", 0, "New User");
        OLD_USER = new PaywallUserType("OLD_USER", 1, "Old User");
        PaywallUserType[] r02 = a();
        f157853a = r02;
        f157854b = b.a(r02);
    }

    PaywallUserType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PaywallUserType[] a() {
        return new PaywallUserType[]{NEW_USER, OLD_USER};
    }

    public static kotlin.enums.a getEntries() {
        return f157854b;
    }

    public static PaywallUserType valueOf(String r1) {
        return (PaywallUserType) Enum.valueOf(PaywallUserType.class, r1);
    }

    public static PaywallUserType[] values() {
        return (PaywallUserType[]) f157853a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
