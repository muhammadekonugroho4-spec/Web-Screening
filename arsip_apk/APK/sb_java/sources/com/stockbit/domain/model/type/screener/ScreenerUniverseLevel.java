package com.stockbit.domain.model.type.screener;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/screener/ScreenerUniverseLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PARENT", "CHILD", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ScreenerUniverseLevel extends Enum<ScreenerUniverseLevel> {
    public static final ScreenerUniverseLevel CHILD = null;
    public static final a Companion = null;
    public static final ScreenerUniverseLevel PARENT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScreenerUniverseLevel[] f86402a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86403b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ScreenerUniverseLevel a(int r6) {
            ScreenerUniverseLevel[] r02 = ScreenerUniverseLevel.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ScreenerUniverseLevel r3 = r02[r2];
            if (r3.getValue() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return ScreenerUniverseLevel.PARENT;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        PARENT = new ScreenerUniverseLevel("PARENT", 0, 1);
        CHILD = new ScreenerUniverseLevel("CHILD", 1, 2);
        ScreenerUniverseLevel[] r02 = a();
        f86402a = r02;
        f86403b = b.a(r02);
        Companion = new a(null);
    }

    ScreenerUniverseLevel(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ScreenerUniverseLevel[] a() {
        return new ScreenerUniverseLevel[]{PARENT, CHILD};
    }

    public static kotlin.enums.a getEntries() {
        return f86403b;
    }

    public static ScreenerUniverseLevel valueOf(String r1) {
        return (ScreenerUniverseLevel) Enum.valueOf(ScreenerUniverseLevel.class, r1);
    }

    public static ScreenerUniverseLevel[] values() {
        return (ScreenerUniverseLevel[]) f86402a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
