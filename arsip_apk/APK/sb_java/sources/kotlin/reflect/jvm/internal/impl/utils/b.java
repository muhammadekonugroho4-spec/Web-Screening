package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.l;

/* loaded from: classes3.dex */
public abstract class b {

    public static class a extends AbstractC1921b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f180249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f180250b;

        public a(l r1, boolean[] r2) {
            this.f180249a = r1;
            this.f180250b = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        public /* bridge */ /* synthetic */ Object a() {
            return d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        public boolean b(Object r3) {
            if (((Boolean) this.f180249a.invoke(r3)).booleanValue() == false) goto L6;
            this.f180250b[0] = true;
        L6:
            return !this.f180250b[0];
        }

        public Boolean d() {
            return Boolean.valueOf(this.f180250b[0]);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1921b implements d {
        public AbstractC1921b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
        public void c(Object r1) {
        }
    }

    public interface c {
        Iterable a(Object r1);
    }

    public interface d {
        Object a();

        boolean b(Object r1);

        void c(Object r1);
    }

    public interface e {
        boolean a(Object r1);
    }

    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Set f180251a;

        public f() {
            this(new HashSet());
        }

        public static /* synthetic */ void b(int r2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean a(Object r2) {
            return this.f180251a.add(r2);
        }

        public f(Set r2) {
            if (r2 != null) goto L4;
            b(0);
        L4:
            this.f180251a = r2;
        }
    }

    public static /* synthetic */ void a(int r3) {
        Object[] r02 = new Object[3];
        switch(r3) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L4;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L4;
            case 8: goto L10;
            case 9: goto L7;
            case 10: goto L6;
            case 11: goto L10;
            case 12: goto L9;
            case 13: goto L8;
            case 14: goto L6;
            case 15: goto L10;
            case 16: goto L9;
            case 17: goto L4;
            case 18: goto L10;
            case 19: goto L9;
            case 20: goto L4;
            case 21: goto L10;
            case 22: goto L5;
            case 23: goto L10;
            case 24: goto L9;
            case 25: goto L8;
            default: goto L4;
        };
    L4:
        r02[0] = "nodes";
    L11:
        r02[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch(r3) {
            case 7: goto L17;
            case 8: goto L17;
            case 9: goto L17;
            case 10: goto L16;
            case 11: goto L16;
            case 12: goto L16;
            case 13: goto L16;
            case 14: goto L16;
            case 15: goto L16;
            case 16: goto L16;
            case 17: goto L15;
            case 18: goto L15;
            case 19: goto L15;
            case 20: goto L15;
            case 21: goto L15;
            case 22: goto L14;
            case 23: goto L14;
            case 24: goto L14;
            case 25: goto L14;
            default: goto L13;
        };
    L13:
        r02[2] = "dfs";
    L19:
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", r02));
    L14:
        r02[2] = "doDfs";
        goto L19
    L15:
        r02[2] = "topologicalOrder";
        goto L19
    L16:
        r02[2] = "dfsFromNode";
        goto L19
    L17:
        r02[2] = "ifAny";
        goto L19
    L5:
        r02[0] = "current";
        goto L11
    L6:
        r02[0] = "node";
        goto L11
    L7:
        r02[0] = "predicate";
        goto L11
    L8:
        r02[0] = "handler";
        goto L11
    L9:
        r02[0] = "visited";
        goto L11
    L10:
        r02[0] = "neighbors";
        goto L11
    }

    public static Object b(Collection r1, c r2, d r3) {
        if (r1 != null) goto L4;
        a(4);
    L4:
        if (r2 != null) goto L6;
        a(5);
    L6:
        if (r3 != null) goto L9;
        a(6);
    L9:
        return c(r1, r2, new f(), r3);
    }

    public static Object c(Collection r1, c r2, e r3, d r4) {
        if (r1 != null) goto L4;
        a(0);
    L4:
        if (r2 != null) goto L6;
        a(1);
    L6:
        if (r3 != null) goto L8;
        a(2);
    L8:
        if (r4 != null) goto L10;
        a(3);
    L10:
        Iterator r12 = r1.iterator();
    L12:
        if (r12.hasNext() == false) goto L15;
        d(r12.next(), r2, r3, r4);
        goto L12
    L15:
        return r4.a();
    }

    public static void d(Object r2, c r3, e r4, d r5) {
        if (r2 != null) goto L4;
        a(22);
    L4:
        if (r3 != null) goto L6;
        a(23);
    L6:
        if (r4 != null) goto L8;
        a(24);
    L8:
        if (r5 != null) goto L11;
        a(25);
    L11:
        if (r4.a(r2) == true) goto L14;
        return;
    L14:
        if (r5.b(r2) == true) goto L16;
        return;
    L16:
        Iterator r02 = r3.a(r2).iterator();
    L18:
        if (r02.hasNext() == false) goto L20;
        d(r02.next(), r3, r4, r5);
        goto L18
    L20:
        r5.c(r2);
    }

    public static Boolean e(Collection r2, c r3, l r4) {
        if (r2 != null) goto L4;
        a(7);
    L4:
        if (r3 != null) goto L6;
        a(8);
    L6:
        if (r4 != null) goto L9;
        a(9);
    L9:
        return (Boolean) b(r2, r3, new a(r4, new boolean[1]));
    }
}
