package com.stockbit.lib.hammock;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/lib/hammock/HammockWsChannel;", "", "<init>", "(Ljava/lang/String;I)V", "FINANCIAL", "TRADING", "SOCIAL", "hammock-no-op_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum HammockWsChannel extends Enum<HammockWsChannel> {
    public static final HammockWsChannel FINANCIAL = null;
    public static final HammockWsChannel SOCIAL = null;
    public static final HammockWsChannel TRADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HammockWsChannel[] f120156a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120157b = null;

    static {
        FINANCIAL = new HammockWsChannel("FINANCIAL", 0);
        TRADING = new HammockWsChannel("TRADING", 1);
        SOCIAL = new HammockWsChannel("SOCIAL", 2);
        HammockWsChannel[] r02 = a();
        f120156a = r02;
        f120157b = kotlin.enums.b.a(r02);
    }

    HammockWsChannel(String r1, int r2) {
    }

    public static final /* synthetic */ HammockWsChannel[] a() {
        return new HammockWsChannel[]{FINANCIAL, TRADING, SOCIAL};
    }

    public static kotlin.enums.a getEntries() {
        return f120157b;
    }

    public static HammockWsChannel valueOf(String r1) {
        return (HammockWsChannel) Enum.valueOf(HammockWsChannel.class, r1);
    }

    public static HammockWsChannel[] values() {
        return (HammockWsChannel[]) f120156a.clone();
    }
}
