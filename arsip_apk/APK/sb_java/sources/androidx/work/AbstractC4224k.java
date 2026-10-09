package androidx.work;

/* renamed from: androidx.work.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4224k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29620a = null;

    static {
        String r02 = r.i("InputMerger");
        kotlin.jvm.internal.p.k(r02, "tagWithPrefix(\"InputMerger\")");
        f29620a = r02;
    }

    public static final AbstractC4184i a(String r6) {
        kotlin.jvm.internal.p.l(r6, "className");
        Object r1 = Class.forName(r6).getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L5
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type androidx.work.InputMerger");     // Catch: Exception -> L5
        return (AbstractC4184i) r1;
    L5:
        e = move-exception;
        r.e().d(f29620a, "Trouble instantiating " + r6, e);
        return null;
    }
}
