package com.stockbit.feature.margintrading.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/margintrading/model/SignatureState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "LOADING", "margintrading_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum SignatureState extends Enum<SignatureState> {
    public static final SignatureState DISABLED = null;
    public static final SignatureState ENABLED = null;
    public static final SignatureState LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SignatureState[] f99402a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f99403b = null;

    static {
        ENABLED = new SignatureState("ENABLED", 0);
        DISABLED = new SignatureState("DISABLED", 1);
        LOADING = new SignatureState("LOADING", 2);
        SignatureState[] r02 = a();
        f99402a = r02;
        f99403b = b.a(r02);
    }

    SignatureState(String r1, int r2) {
    }

    public static final /* synthetic */ SignatureState[] a() {
        return new SignatureState[]{ENABLED, DISABLED, LOADING};
    }

    public static a getEntries() {
        return f99403b;
    }

    public static SignatureState valueOf(String r1) {
        return (SignatureState) Enum.valueOf(SignatureState.class, r1);
    }

    public static SignatureState[] values() {
        return (SignatureState[]) f99402a.clone();
    }
}
