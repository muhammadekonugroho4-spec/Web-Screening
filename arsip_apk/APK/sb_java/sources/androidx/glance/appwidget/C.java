package androidx.glance.appwidget;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC11778w;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: e, reason: collision with root package name */
    public static final b f24771e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24772f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final C f24773g = null;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24774a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteViews[] f24775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24776c;
    public final int d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24777a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f24778b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24779c;
        public int d;

        static {
        }

        public a() {
            this.f24777a = new ArrayList();
            this.f24778b = new ArrayList();
        }

        public final a a(long r2, RemoteViews r4) {
            this.f24777a.add(Long.valueOf(r2));
            this.f24778b.add(r4);
            return this;
        }

        public final C b() {
            if (this.d >= 1) goto L10;
            ArrayList r02 = this.f24778b;
            ArrayList r2 = new ArrayList(AbstractC11778w.z(r02, 10));
            Iterator r03 = r02.iterator();
        L6:
            if (r03.hasNext() == false) goto L8;
            r2.add(Integer.valueOf(((RemoteViews) r03.next()).getLayoutId()));
            goto L6
        L8:
            this.d = kotlin.collections.F.j0(r2).size();
        L10:
            return new C(kotlin.collections.F.A1(this.f24777a), (RemoteViews[]) this.f24778b.toArray(new RemoteViews[0]), this.f24779c, Math.max(this.d, 1), null);
        }

        public final a c(boolean r1) {
            this.f24779c = r1;
            return this;
        }

        public final a d(int r1) {
            this.d = r1;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C a() {
            return C.a();
        }

        public b() {
        }
    }

    static {
        f24771e = new b(null);
        f24772f = 8;
        f24773g = new C(new long[0], new RemoteViews[0], false, 1);
    }

    public /* synthetic */ C(long[] r1, RemoteViews[] r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    public static final /* synthetic */ C a() {
        return f24773g;
    }

    public final int b() {
        return this.f24774a.length;
    }

    public final long c(int r4) {
        return this.f24774a[r4];
    }

    public final RemoteViews d(int r2) {
        return this.f24775b[r2];
    }

    public final int e() {
        return this.d;
    }

    public final boolean f() {
        return this.f24776c;
    }

    public C(long[] r2, RemoteViews[] r3, boolean r4, int r5) {
        this.f24774a = r2;
        this.f24775b = r3;
        this.f24776c = r4;
        this.d = r5;
        if (r2.length != r3.length) goto L17;
        if (r5 < 1) goto L15;
        ArrayList r22 = new ArrayList(r3.length);
        int r42 = r3.length;
        int r52 = 0;
    L7:
        if (r52 >= r42) goto L9;
        r22.add(Integer.valueOf(r3[r52].getLayoutId()));
        r52 = r52 + 1;
        goto L7
    L9:
        int r23 = kotlin.collections.F.j0(r22).size();
        if (r23 > this.d) goto L13;
        return;
    L13:
        throw new IllegalArgumentException(("View type count is set to " + this.d + ", but the collection contains " + r23 + " different layout ids").toString());
    L15:
        throw new IllegalArgumentException("View type count must be >= 1");
    L17:
        throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
    }
}
