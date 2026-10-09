package androidx.work.impl;

/* loaded from: classes4.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29166a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f29167b = null;

    static {
        String r02 = androidx.work.r.i("WrkDbPathHelper");
        kotlin.jvm.internal.p.k(r02, "tagWithPrefix(\"WrkDbPathHelper\")");
        f29166a = r02;
        f29167b = new String[]{"-journal", "-shm", "-wal"};
    }

    public static final /* synthetic */ String[] a() {
        return f29167b;
    }

    public static final /* synthetic */ String b() {
        return f29166a;
    }
}
