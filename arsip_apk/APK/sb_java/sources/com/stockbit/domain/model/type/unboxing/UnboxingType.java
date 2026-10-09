package com.stockbit.domain.model.type.unboxing;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/type/unboxing/UnboxingType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "ARTICLE", "SHARE", "VOLUME", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnboxingType extends Enum<UnboxingType> {
    public static final UnboxingType ARTICLE = null;
    public static final UnboxingType GENERAL = null;
    public static final UnboxingType SHARE = null;
    public static final UnboxingType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnboxingType[] f86536a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86537b = null;

    static {
        GENERAL = new UnboxingType("GENERAL", 0);
        ARTICLE = new UnboxingType("ARTICLE", 1);
        SHARE = new UnboxingType("SHARE", 2);
        VOLUME = new UnboxingType("VOLUME", 3);
        UnboxingType[] r02 = a();
        f86536a = r02;
        f86537b = b.a(r02);
    }

    UnboxingType(String r1, int r2) {
    }

    public static final /* synthetic */ UnboxingType[] a() {
        return new UnboxingType[]{GENERAL, ARTICLE, SHARE, VOLUME};
    }

    public static a getEntries() {
        return f86537b;
    }

    public static UnboxingType valueOf(String r1) {
        return (UnboxingType) Enum.valueOf(UnboxingType.class, r1);
    }

    public static UnboxingType[] values() {
        return (UnboxingType[]) f86536a.clone();
    }
}
