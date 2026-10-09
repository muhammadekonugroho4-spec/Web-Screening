package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class k extends m implements Iterable, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17831a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17832b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17833c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17834e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17835f;

    /* renamed from: g, reason: collision with root package name */
    public final float f17836g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17837h;

    /* renamed from: i, reason: collision with root package name */
    public final List f17838i;

    /* renamed from: j, reason: collision with root package name */
    public final List f17839j;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f17840a;

        public a(k r1) {
            this.f17840a = k.a(r1).iterator();
        }

        public m a() {
            return (m) this.f17840a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17840a.hasNext();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
    }

    public k(String r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, List r10, List r11) {
        super(null);
        this.f17831a = r2;
        this.f17832b = r3;
        this.f17833c = r4;
        this.d = r5;
        this.f17834e = r6;
        this.f17835f = r7;
        this.f17836g = r8;
        this.f17837h = r9;
        this.f17838i = r10;
        this.f17839j = r11;
    }

    public static final /* synthetic */ List a(k r02) {
        return r02.f17839j;
    }

    public final m b(int r2) {
        return (m) this.f17839j.get(r2);
    }

    public final List d() {
        return this.f17838i;
    }

    public final String e() {
        return this.f17831a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L34:
        return false;
    L8:
        if ((r5 instanceof k) == false) goto L34;
        k r52 = (k) r5;
        if (p.g(this.f17831a, r52.f17831a) == true) goto L14;
        return false;
    L14:
        if (this.f17832b != r52.f17832b) goto L34;
        if (this.f17833c != r52.f17833c) goto L34;
        if (this.d != r52.d) goto L34;
        if (this.f17834e != r52.f17834e) goto L34;
        if (this.f17835f != r52.f17835f) goto L34;
        if (this.f17836g != r52.f17836g) goto L34;
        if (this.f17837h != r52.f17837h) goto L34;
        if (p.g(this.f17838i, r52.f17838i) == true) goto L31;
        return false;
    L31:
        if (p.g(this.f17839j, r52.f17839j) == true) goto L33;
        return false;
    L33:
        return true;
    }

    public final float f() {
        return this.f17833c;
    }

    public final float g() {
        return this.d;
    }

    public final int getSize() {
        return this.f17839j.size();
    }

    public final float h() {
        return this.f17832b;
    }

    public int hashCode() {
        return (((((((((((((((((this.f17831a.hashCode() * 31) + Float.hashCode(this.f17832b)) * 31) + Float.hashCode(this.f17833c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f17834e)) * 31) + Float.hashCode(this.f17835f)) * 31) + Float.hashCode(this.f17836g)) * 31) + Float.hashCode(this.f17837h)) * 31) + this.f17838i.hashCode()) * 31) + this.f17839j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final float j() {
        return this.f17834e;
    }

    public final float l() {
        return this.f17835f;
    }

    public final float m() {
        return this.f17836g;
    }

    public final float n() {
        return this.f17837h;
    }
}
