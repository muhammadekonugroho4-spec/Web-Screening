package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public interface e extends Iterable, kotlin.jvm.internal.markers.a {

    /* renamed from: w0, reason: collision with root package name */
    public static final a f178052w0 = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f178053a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final e f178054b = null;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.e$a$a, reason: collision with other inner class name */
        public static final class C1879a implements e {
            public C1879a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public boolean A1(kotlin.reflect.jvm.internal.impl.name.c r1) {
                return b.b(this, r1);
            }

            public Void a(kotlin.reflect.jvm.internal.impl.name.c r2) {
                p.l(r2, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public /* bridge */ /* synthetic */ c i(kotlin.reflect.jvm.internal.impl.name.c r1) {
                return (c) a(r1);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC11777v.o().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        static {
            f178053a = new a();
            f178054b = new C1879a();
        }

        public a() {
        }

        public final e a(List r2) {
            p.l(r2, "annotations");
            if (r2.isEmpty() == false) goto L7;
            return f178054b;
        L7:
            return new f(r2);
        }

        public final e b() {
            return f178054b;
        }
    }

    public static final class b {
        public static c a(e r2, kotlin.reflect.jvm.internal.impl.name.c r3) {
            p.l(r3, "fqName");
            Iterator r22 = r2.iterator();
        L4:
            if (r22.hasNext() == false) goto L8;
            Object r02 = r22.next();
            if (p.g(((c) r02).d(), r3) == false) goto L4;
        L10:
            return (c) r02;
        L8:
            r02 = null;
            goto L10
        }

        public static boolean b(e r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
            p.l(r2, "fqName");
            if (r1.i(r2) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        f178052w0 = a.f178053a;
    }

    boolean A1(kotlin.reflect.jvm.internal.impl.name.c r1);

    c i(kotlin.reflect.jvm.internal.impl.name.c r1);

    boolean isEmpty();
}
