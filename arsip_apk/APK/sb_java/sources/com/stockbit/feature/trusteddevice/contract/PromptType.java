package com.stockbit.feature.trusteddevice.contract;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/feature/trusteddevice/contract/PromptType;", "", "trackingName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingName", "()Ljava/lang/String;", "UPDATE_TD", "NEW_LOGIN", "trusteddevice-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum PromptType extends Enum<PromptType> {
    public static final PromptType NEW_LOGIN = null;
    public static final PromptType UPDATE_TD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PromptType[] f117821a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f117822b = null;
    private final String trackingName;

    static {
        UPDATE_TD = new PromptType("UPDATE_TD", 0, "change TD");
        NEW_LOGIN = new PromptType("NEW_LOGIN", 1, FirebaseAnalytics.Event.LOGIN);
        PromptType[] r02 = a();
        f117821a = r02;
        f117822b = b.a(r02);
    }

    PromptType(String r1, int r2, String r3) {
        this.trackingName = r3;
    }

    public static final /* synthetic */ PromptType[] a() {
        return new PromptType[]{UPDATE_TD, NEW_LOGIN};
    }

    public static kotlin.enums.a getEntries() {
        return f117822b;
    }

    public static PromptType valueOf(String r1) {
        return (PromptType) Enum.valueOf(PromptType.class, r1);
    }

    public static PromptType[] values() {
        return (PromptType[]) f117821a.clone();
    }

    public final String getTrackingName() {
        return this.trackingName;
    }
}
