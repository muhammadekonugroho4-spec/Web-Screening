package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/type/GiphyType;", "", "<init>", "(Ljava/lang/String;I)V", "GIF", "STICKER", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum GiphyType extends Enum<GiphyType> {
    public static final GiphyType GIF = null;
    public static final GiphyType STICKER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GiphyType[] f87646a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f87647b = null;

    static {
        GIF = new GiphyType("GIF", 0);
        STICKER = new GiphyType("STICKER", 1);
        GiphyType[] r02 = a();
        f87646a = r02;
        f87647b = b.a(r02);
    }

    GiphyType(String r1, int r2) {
    }

    public static final /* synthetic */ GiphyType[] a() {
        return new GiphyType[]{GIF, STICKER};
    }

    public static a getEntries() {
        return f87647b;
    }

    public static GiphyType valueOf(String r1) {
        return (GiphyType) Enum.valueOf(GiphyType.class, r1);
    }

    public static GiphyType[] values() {
        return (GiphyType[]) f87646a.clone();
    }
}
