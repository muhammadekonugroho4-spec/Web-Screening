package org.koin.core.definition;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/core/definition/Kind;", "", "(Ljava/lang/String;I)V", "Singleton", "Factory", "Scoped", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum Kind extends Enum<Kind> {
    public static final Kind Factory = null;
    public static final Kind Scoped = null;
    public static final Kind Singleton = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Kind[] f182567a = null;

    static {
        Singleton = new Kind("Singleton", 0);
        Factory = new Kind("Factory", 1);
        Scoped = new Kind("Scoped", 2);
        f182567a = a();
    }

    Kind(String r1, int r2) {
    }

    public static final /* synthetic */ Kind[] a() {
        return new Kind[]{Singleton, Factory, Scoped};
    }

    public static Kind valueOf(String r1) {
        return (Kind) Enum.valueOf(Kind.class, r1);
    }

    public static Kind[] values() {
        return (Kind[]) f182567a.clone();
    }
}
