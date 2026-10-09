package com.stockbit.usecase.securities.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/MatchingPendingNegoActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_TARGET_APPROVE_MATCHING_PENDING", "ACTION_TARGET_REJECT_MATCHING_PENDING", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MatchingPendingNegoActionType extends Enum<MatchingPendingNegoActionType> {
    public static final MatchingPendingNegoActionType ACTION_TARGET_APPROVE_MATCHING_PENDING = null;
    public static final MatchingPendingNegoActionType ACTION_TARGET_REJECT_MATCHING_PENDING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MatchingPendingNegoActionType[] f161897a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f161898b = null;

    static {
        ACTION_TARGET_APPROVE_MATCHING_PENDING = new MatchingPendingNegoActionType("ACTION_TARGET_APPROVE_MATCHING_PENDING", 0);
        ACTION_TARGET_REJECT_MATCHING_PENDING = new MatchingPendingNegoActionType("ACTION_TARGET_REJECT_MATCHING_PENDING", 1);
        MatchingPendingNegoActionType[] r02 = a();
        f161897a = r02;
        f161898b = b.a(r02);
    }

    MatchingPendingNegoActionType(String r1, int r2) {
    }

    public static final /* synthetic */ MatchingPendingNegoActionType[] a() {
        return new MatchingPendingNegoActionType[]{ACTION_TARGET_APPROVE_MATCHING_PENDING, ACTION_TARGET_REJECT_MATCHING_PENDING};
    }

    public static a getEntries() {
        return f161898b;
    }

    public static MatchingPendingNegoActionType valueOf(String r1) {
        return (MatchingPendingNegoActionType) Enum.valueOf(MatchingPendingNegoActionType.class, r1);
    }

    public static MatchingPendingNegoActionType[] values() {
        return (MatchingPendingNegoActionType[]) f161897a.clone();
    }
}
