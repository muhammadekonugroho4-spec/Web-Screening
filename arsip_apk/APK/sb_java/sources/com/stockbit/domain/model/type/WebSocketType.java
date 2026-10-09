package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/type/WebSocketType;", "", "<init>", "(Ljava/lang/String;I)V", "STREAM", "RESEARCH", "STREAM_COMPANY_PRICE", "ALL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum WebSocketType extends Enum<WebSocketType> {
    public static final WebSocketType ALL = null;
    public static final WebSocketType RESEARCH = null;
    public static final WebSocketType STREAM = null;
    public static final WebSocketType STREAM_COMPANY_PRICE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WebSocketType[] f86274a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86275b = null;

    static {
        STREAM = new WebSocketType("STREAM", 0);
        RESEARCH = new WebSocketType("RESEARCH", 1);
        STREAM_COMPANY_PRICE = new WebSocketType("STREAM_COMPANY_PRICE", 2);
        ALL = new WebSocketType("ALL", 3);
        WebSocketType[] r02 = a();
        f86274a = r02;
        f86275b = kotlin.enums.b.a(r02);
    }

    WebSocketType(String r1, int r2) {
    }

    public static final /* synthetic */ WebSocketType[] a() {
        return new WebSocketType[]{STREAM, RESEARCH, STREAM_COMPANY_PRICE, ALL};
    }

    public static kotlin.enums.a getEntries() {
        return f86275b;
    }

    public static WebSocketType valueOf(String r1) {
        return (WebSocketType) Enum.valueOf(WebSocketType.class, r1);
    }

    public static WebSocketType[] values() {
        return (WebSocketType[]) f86274a.clone();
    }
}
