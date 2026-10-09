package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/type/BalanceScopeType;", "", "<init>", "(Ljava/lang/String;I)V", "BALANCE_SCOPE_ALL_RELATED_ACCOUNT", "BALANCE_SCOPE_SELECTED_ACCOUNT", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BalanceScopeType extends Enum<BalanceScopeType> {
    public static final BalanceScopeType BALANCE_SCOPE_ALL_RELATED_ACCOUNT = null;
    public static final BalanceScopeType BALANCE_SCOPE_SELECTED_ACCOUNT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalanceScopeType[] f87638a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f87639b = null;

    static {
        BALANCE_SCOPE_ALL_RELATED_ACCOUNT = new BalanceScopeType("BALANCE_SCOPE_ALL_RELATED_ACCOUNT", 0);
        BALANCE_SCOPE_SELECTED_ACCOUNT = new BalanceScopeType("BALANCE_SCOPE_SELECTED_ACCOUNT", 1);
        BalanceScopeType[] r02 = a();
        f87638a = r02;
        f87639b = b.a(r02);
    }

    BalanceScopeType(String r1, int r2) {
    }

    public static final /* synthetic */ BalanceScopeType[] a() {
        return new BalanceScopeType[]{BALANCE_SCOPE_ALL_RELATED_ACCOUNT, BALANCE_SCOPE_SELECTED_ACCOUNT};
    }

    public static a getEntries() {
        return f87639b;
    }

    public static BalanceScopeType valueOf(String r1) {
        return (BalanceScopeType) Enum.valueOf(BalanceScopeType.class, r1);
    }

    public static BalanceScopeType[] values() {
        return (BalanceScopeType[]) f87638a.clone();
    }
}
