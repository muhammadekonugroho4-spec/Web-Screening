package androidx.work;

/* renamed from: androidx.work.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4223j {
    public AbstractC4223j() {
    }

    public abstract AbstractC4184i a(String r1);

    public final AbstractC4184i b(String r2) {
        kotlin.jvm.internal.p.l(r2, "className");
        AbstractC4184i r02 = a(r2);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return AbstractC4224k.a(r2);
    }
}
