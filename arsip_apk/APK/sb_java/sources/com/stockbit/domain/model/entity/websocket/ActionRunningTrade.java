package com.stockbit.domain.model.entity.websocket;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/entity/websocket/ActionRunningTrade;", "", "value", "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getText", "()Ljava/lang/String;", "BUY", "SELL", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ActionRunningTrade extends Enum<ActionRunningTrade> {
    public static final ActionRunningTrade BUY = null;
    public static final a Companion = null;
    public static final ActionRunningTrade SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ActionRunningTrade[] f83891a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83892b = null;
    private final String text;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ActionRunningTrade a(int r6) {
            ActionRunningTrade[] r02 = ActionRunningTrade.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ActionRunningTrade r3 = r02[r2];
            if (r3.getValue() == r6) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L8:
            return null;
        }

        public a() {
        }
    }

    static {
        BUY = new ActionRunningTrade("BUY", 0, 1, "Buy");
        SELL = new ActionRunningTrade("SELL", 1, 2, "Sell");
        ActionRunningTrade[] r02 = a();
        f83891a = r02;
        f83892b = b.a(r02);
        Companion = new a(null);
    }

    ActionRunningTrade(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.text = r4;
    }

    public static final /* synthetic */ ActionRunningTrade[] a() {
        return new ActionRunningTrade[]{BUY, SELL};
    }

    public static kotlin.enums.a getEntries() {
        return f83892b;
    }

    public static ActionRunningTrade valueOf(String r1) {
        return (ActionRunningTrade) Enum.valueOf(ActionRunningTrade.class, r1);
    }

    public static ActionRunningTrade[] values() {
        return (ActionRunningTrade[]) f83891a.clone();
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
