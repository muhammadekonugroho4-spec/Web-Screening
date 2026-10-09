package com.stockbit.usecase.brokerflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/brokerflow/model/BrokerNetColor;", "", "<init>", "(Ljava/lang/String;I)V", "Gray", "Green", "Red", "usecase-brokerflow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerNetColor extends Enum<BrokerNetColor> {
    public static final BrokerNetColor Gray = null;
    public static final BrokerNetColor Green = null;
    public static final BrokerNetColor Red = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerNetColor[] f154968a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154969b = null;

    static {
        Gray = new BrokerNetColor("Gray", 0);
        Green = new BrokerNetColor("Green", 1);
        Red = new BrokerNetColor("Red", 2);
        BrokerNetColor[] r02 = a();
        f154968a = r02;
        f154969b = kotlin.enums.b.a(r02);
    }

    BrokerNetColor(String r1, int r2) {
    }

    public static final /* synthetic */ BrokerNetColor[] a() {
        return new BrokerNetColor[]{Gray, Green, Red};
    }

    public static kotlin.enums.a getEntries() {
        return f154969b;
    }

    public static BrokerNetColor valueOf(String r1) {
        return (BrokerNetColor) Enum.valueOf(BrokerNetColor.class, r1);
    }

    public static BrokerNetColor[] values() {
        return (BrokerNetColor[]) f154968a.clone();
    }
}
