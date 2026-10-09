package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;

/* loaded from: classes2.dex */
public final class WatchlistMainListErrorUIData {

    /* renamed from: a, reason: collision with root package name */
    public final Type f170873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170874b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainListErrorUIData$Type;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK", "SERVER", "CACHE", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Type extends Enum<Type> {
        public static final Type CACHE = null;
        public static final Type NETWORK = null;
        public static final Type SERVER = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f170875a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f170876b = null;

        static {
            NETWORK = new Type("NETWORK", 0);
            SERVER = new Type("SERVER", 1);
            CACHE = new Type("CACHE", 2);
            Type[] r02 = a();
            f170875a = r02;
            f170876b = kotlin.enums.b.a(r02);
        }

        Type(String r1, int r2) {
        }

        public static final /* synthetic */ Type[] a() {
            return new Type[]{NETWORK, SERVER, CACHE};
        }

        public static kotlin.enums.a getEntries() {
            return f170876b;
        }

        public static Type valueOf(String r1) {
            return (Type) Enum.valueOf(Type.class, r1);
        }

        public static Type[] values() {
            return (Type[]) f170875a.clone();
        }
    }

    static {
    }

    public WatchlistMainListErrorUIData(Type r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "type");
        this.f170873a = r2;
        this.f170874b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistMainListErrorUIData) == true) goto L8;
        return false;
    L8:
        WatchlistMainListErrorUIData r52 = (WatchlistMainListErrorUIData) r5;
        if (this.f170873a == r52.f170873a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170874b, r52.f170874b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f170873a.hashCode() * 31;
        String r1 = this.f170874b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "WatchlistMainListErrorUIData(type=" + this.f170873a + ", message=" + this.f170874b + ')';
    }
}
