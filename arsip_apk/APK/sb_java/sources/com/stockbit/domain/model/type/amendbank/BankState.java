package com.stockbit.domain.model.type.amendbank;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/type/amendbank/BankState;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFICATION", "ACTIVE", "SWITCH_BANK", "ADD_BANK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BankState extends Enum<BankState> {
    public static final BankState ACTIVE = null;
    public static final BankState ADD_BANK = null;
    public static final BankState SWITCH_BANK = null;
    public static final BankState VERIFICATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BankState[] f86286a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86287b = null;

    static {
        VERIFICATION = new BankState("VERIFICATION", 0);
        ACTIVE = new BankState("ACTIVE", 1);
        SWITCH_BANK = new BankState("SWITCH_BANK", 2);
        ADD_BANK = new BankState("ADD_BANK", 3);
        BankState[] r02 = a();
        f86286a = r02;
        f86287b = b.a(r02);
    }

    BankState(String r1, int r2) {
    }

    public static final /* synthetic */ BankState[] a() {
        return new BankState[]{VERIFICATION, ACTIVE, SWITCH_BANK, ADD_BANK};
    }

    public static a getEntries() {
        return f86287b;
    }

    public static BankState valueOf(String r1) {
        return (BankState) Enum.valueOf(BankState.class, r1);
    }

    public static BankState[] values() {
        return (BankState[]) f86286a.clone();
    }
}
