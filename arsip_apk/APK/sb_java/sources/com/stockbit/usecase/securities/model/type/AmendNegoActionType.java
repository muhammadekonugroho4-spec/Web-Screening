package com.stockbit.usecase.securities.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/AmendNegoActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_TARGET_CANCEL_ORDER", "ACTION_TARGET_ABORT_CANCEL_ORDER", "ACTION_TARGET_APPROVE_CANCEL_ORDER", "ACTION_TARGET_REJECT_CANCEL_ORDER", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum AmendNegoActionType extends Enum<AmendNegoActionType> {
    public static final AmendNegoActionType ACTION_TARGET_ABORT_CANCEL_ORDER = null;
    public static final AmendNegoActionType ACTION_TARGET_APPROVE_CANCEL_ORDER = null;
    public static final AmendNegoActionType ACTION_TARGET_CANCEL_ORDER = null;
    public static final AmendNegoActionType ACTION_TARGET_REJECT_CANCEL_ORDER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AmendNegoActionType[] f161893a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f161894b = null;

    static {
        ACTION_TARGET_CANCEL_ORDER = new AmendNegoActionType("ACTION_TARGET_CANCEL_ORDER", 0);
        ACTION_TARGET_ABORT_CANCEL_ORDER = new AmendNegoActionType("ACTION_TARGET_ABORT_CANCEL_ORDER", 1);
        ACTION_TARGET_APPROVE_CANCEL_ORDER = new AmendNegoActionType("ACTION_TARGET_APPROVE_CANCEL_ORDER", 2);
        ACTION_TARGET_REJECT_CANCEL_ORDER = new AmendNegoActionType("ACTION_TARGET_REJECT_CANCEL_ORDER", 3);
        AmendNegoActionType[] r02 = a();
        f161893a = r02;
        f161894b = b.a(r02);
    }

    AmendNegoActionType(String r1, int r2) {
    }

    public static final /* synthetic */ AmendNegoActionType[] a() {
        return new AmendNegoActionType[]{ACTION_TARGET_CANCEL_ORDER, ACTION_TARGET_ABORT_CANCEL_ORDER, ACTION_TARGET_APPROVE_CANCEL_ORDER, ACTION_TARGET_REJECT_CANCEL_ORDER};
    }

    public static a getEntries() {
        return f161894b;
    }

    public static AmendNegoActionType valueOf(String r1) {
        return (AmendNegoActionType) Enum.valueOf(AmendNegoActionType.class, r1);
    }

    public static AmendNegoActionType[] values() {
        return (AmendNegoActionType[]) f161893a.clone();
    }
}
