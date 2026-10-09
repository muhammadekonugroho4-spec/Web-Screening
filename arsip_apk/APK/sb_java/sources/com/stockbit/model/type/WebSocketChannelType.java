package com.stockbit.model.type;

import com.gojek.ojosdk.exif.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/model/type/WebSocketChannelType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "STREAM", "COMPANY_PRICE", "ORDERBOOK", "HOTLIST", "MESSAGE", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum WebSocketChannelType extends Enum<WebSocketChannelType> {
    public static final WebSocketChannelType COMPANY_PRICE = null;
    public static final a Companion = null;
    public static final WebSocketChannelType HOTLIST = null;
    public static final WebSocketChannelType MESSAGE = null;
    public static final WebSocketChannelType ORDERBOOK = null;
    public static final WebSocketChannelType STREAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WebSocketChannelType[] f122226a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122227b = null;
    private final String code;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STREAM = new WebSocketChannelType("STREAM", 0, ExifInterface.GpsLatitudeRef.SOUTH);
        COMPANY_PRICE = new WebSocketChannelType("COMPANY_PRICE", 1, "C");
        ORDERBOOK = new WebSocketChannelType("ORDERBOOK", 2, "O");
        HOTLIST = new WebSocketChannelType("HOTLIST", 3, "H2");
        MESSAGE = new WebSocketChannelType("MESSAGE", 4, "M");
        WebSocketChannelType[] r02 = a();
        f122226a = r02;
        f122227b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    WebSocketChannelType(String r1, int r2, String r3) {
        this.code = r3;
    }

    public static final /* synthetic */ WebSocketChannelType[] a() {
        return new WebSocketChannelType[]{STREAM, COMPANY_PRICE, ORDERBOOK, HOTLIST, MESSAGE};
    }

    public static kotlin.enums.a getEntries() {
        return f122227b;
    }

    public static WebSocketChannelType valueOf(String r1) {
        return (WebSocketChannelType) Enum.valueOf(WebSocketChannelType.class, r1);
    }

    public static WebSocketChannelType[] values() {
        return (WebSocketChannelType[]) f122226a.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
