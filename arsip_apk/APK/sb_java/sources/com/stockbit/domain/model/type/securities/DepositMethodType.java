package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/securities/DepositMethodType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MOBILE_BANKING", "INTERNET_BANKING", "ATM", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum DepositMethodType extends Enum<DepositMethodType> {
    public static final DepositMethodType ATM = null;
    public static final a Companion = null;
    public static final DepositMethodType INTERNET_BANKING = null;
    public static final DepositMethodType MOBILE_BANKING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DepositMethodType[] f86421a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86422b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        MOBILE_BANKING = new DepositMethodType("MOBILE_BANKING", 0, "Mobile Banking");
        INTERNET_BANKING = new DepositMethodType("INTERNET_BANKING", 1, "Internet Banking");
        ATM = new DepositMethodType("ATM", 2, "ATM");
        DepositMethodType[] r02 = a();
        f86421a = r02;
        f86422b = b.a(r02);
        Companion = new a(null);
    }

    DepositMethodType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ DepositMethodType[] a() {
        return new DepositMethodType[]{MOBILE_BANKING, INTERNET_BANKING, ATM};
    }

    public static kotlin.enums.a getEntries() {
        return f86422b;
    }

    public static DepositMethodType valueOf(String r1) {
        return (DepositMethodType) Enum.valueOf(DepositMethodType.class, r1);
    }

    public static DepositMethodType[] values() {
        return (DepositMethodType[]) f86421a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
