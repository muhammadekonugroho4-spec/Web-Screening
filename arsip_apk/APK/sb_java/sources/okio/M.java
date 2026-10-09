package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.C11850c;

/* loaded from: classes3.dex */
public abstract class M {
    public static final byte[] a(String r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        byte[] r12 = r1.getBytes(C11850c.f180362b);
        kotlin.jvm.internal.p.k(r12, "getBytes(...)");
        return r12;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        return new String(r2, C11850c.f180362b);
    }
}
