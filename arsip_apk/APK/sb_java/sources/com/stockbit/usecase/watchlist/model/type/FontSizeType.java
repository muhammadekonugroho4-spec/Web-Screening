package com.stockbit.usecase.watchlist.model.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/watchlist/model/type/FontSizeType;", "", "value", "", "param", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getParam", "()Ljava/lang/String;", "SMALL", "DEFAULT", "LARGE", "EXTRA_LARGE", "Companion", "usecase-watchlist"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum FontSizeType extends Enum<FontSizeType> {
    public static final a Companion = null;
    public static final FontSizeType DEFAULT = null;
    public static final FontSizeType EXTRA_LARGE = null;
    public static final FontSizeType LARGE = null;
    public static final FontSizeType SMALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FontSizeType[] f164572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164573b = null;
    private final String param;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final FontSizeType a(int r6) {
            FontSizeType[] r02 = FontSizeType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            FontSizeType r3 = r02[r2];
            if (r3.getValue() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return FontSizeType.DEFAULT;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SMALL = new FontSizeType("SMALL", 0, 0, "Small");
        DEFAULT = new FontSizeType("DEFAULT", 1, 1, "Default");
        LARGE = new FontSizeType("LARGE", 2, 2, "Large");
        EXTRA_LARGE = new FontSizeType("EXTRA_LARGE", 3, 3, "Extra Large");
        FontSizeType[] r02 = a();
        f164572a = r02;
        f164573b = b.a(r02);
        Companion = new a(null);
    }

    FontSizeType(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.param = r4;
    }

    public static final /* synthetic */ FontSizeType[] a() {
        return new FontSizeType[]{SMALL, DEFAULT, LARGE, EXTRA_LARGE};
    }

    public static kotlin.enums.a getEntries() {
        return f164573b;
    }

    public static FontSizeType valueOf(String r1) {
        return (FontSizeType) Enum.valueOf(FontSizeType.class, r1);
    }

    public static FontSizeType[] values() {
        return (FontSizeType[]) f164572a.clone();
    }

    public final String getParam() {
        return this.param;
    }

    public final int getValue() {
        return this.value;
    }
}
