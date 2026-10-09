package com.stockbit.domain.model.type.screener;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/screener/ScreenerUniverseType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WATCHLIST", "SECTOR", "INDEX", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ScreenerUniverseType extends Enum<ScreenerUniverseType> {
    public static final a Companion = null;
    public static final ScreenerUniverseType INDEX = null;
    public static final ScreenerUniverseType SECTOR = null;
    public static final ScreenerUniverseType WATCHLIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScreenerUniverseType[] f86404a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86405b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ScreenerUniverseType a(int r6) {
            ScreenerUniverseType[] r02 = ScreenerUniverseType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ScreenerUniverseType r3 = r02[r2];
            if (r3.getValue() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return ScreenerUniverseType.SECTOR;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        WATCHLIST = new ScreenerUniverseType("WATCHLIST", 0, 1);
        SECTOR = new ScreenerUniverseType("SECTOR", 1, 2);
        INDEX = new ScreenerUniverseType("INDEX", 2, 3);
        ScreenerUniverseType[] r02 = a();
        f86404a = r02;
        f86405b = b.a(r02);
        Companion = new a(null);
    }

    ScreenerUniverseType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ScreenerUniverseType[] a() {
        return new ScreenerUniverseType[]{WATCHLIST, SECTOR, INDEX};
    }

    public static kotlin.enums.a getEntries() {
        return f86405b;
    }

    public static ScreenerUniverseType valueOf(String r1) {
        return (ScreenerUniverseType) Enum.valueOf(ScreenerUniverseType.class, r1);
    }

    public static ScreenerUniverseType[] values() {
        return (ScreenerUniverseType[]) f86404a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
