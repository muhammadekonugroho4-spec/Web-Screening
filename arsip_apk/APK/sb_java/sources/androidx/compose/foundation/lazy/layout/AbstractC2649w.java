package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC2628l;

/* renamed from: androidx.compose.foundation.lazy.layout.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2649w {

    /* renamed from: androidx.compose.foundation.lazy.layout.w$a */
    public interface a {

        /* renamed from: androidx.compose.foundation.lazy.layout.w$a$a, reason: collision with other inner class name */
        public static final class C0077a implements kotlin.jvm.functions.l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0077a f8824a = null;

            static {
                f8824a = new C0077a();
            }

            public C0077a() {
            }

            public final Void a(int r1) {
                return null;
            }

            @Override // kotlin.jvm.functions.l
            public /* bridge */ /* synthetic */ Object invoke(Object r1) {
                return a(((Number) r1).intValue());
            }
        }

        kotlin.jvm.functions.l getKey();

        default kotlin.jvm.functions.l getType() {
            return C0077a.f8824a;
        }
    }

    static {
    }

    public AbstractC2649w() {
    }

    public final Object h(int r3) {
        InterfaceC2628l.a r02 = i().get(r3);
        int r32 = r3 - r02.b();
        return ((a) r02.c()).getType().invoke(Integer.valueOf(r32));
    }

    public abstract InterfaceC2628l i();

    public final int j() {
        return i().getSize();
    }

    public final Object k(int r3) {
        InterfaceC2628l.a r02 = i().get(r3);
        int r1 = r3 - r02.b();
        kotlin.jvm.functions.l r03 = ((a) r02.c()).getKey();
        if (r03 == null) goto L9;
        Object r04 = r03.invoke(Integer.valueOf(r1));
        if (r04 == null) goto L9;
        return r04;
    L9:
        return D0.a(r3);
    }
}
