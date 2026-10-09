package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11853f implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f180380f = null;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f180381a;

    /* renamed from: b, reason: collision with root package name */
    public int f180382b;

    /* renamed from: c, reason: collision with root package name */
    public int f180383c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f180384e;

    /* renamed from: kotlin.text.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f180380f = new a(null);
    }

    public C11853f(CharSequence r2) {
        kotlin.jvm.internal.p.l(r2, "string");
        this.f180381a = r2;
    }

    public String a() {
        if (hasNext() == false) goto L7;
        this.f180382b = 0;
        int r02 = this.d;
        int r1 = this.f180383c;
        this.f180383c = this.f180384e + r02;
        return this.f180381a.subSequence(r1, r02).toString();
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int r02 = this.f180382b;
        if (r02 == 0) goto L7;
        if (r02 != 1) goto L6;
        return true;
    L6:
        return false;
    L7:
        int r3 = 2;
        if (this.f180384e >= 0) goto L11;
        this.f180382b = 2;
        return false;
    L11:
        int r03 = this.f180381a.length();
        int r1 = this.f180383c;
        int r4 = this.f180381a.length();
    L12:
        if (r1 >= r4) goto L25;
        char r5 = this.f180381a.charAt(r1);
        if (r5 == '\n') goto L17;
        if (r5 == '\r') goto L17;
        r1 = r1 + 1;
    L17:
        if (r5 != '\r') goto L23;
        int r04 = r1 + 1;
        if (r04 >= this.f180381a.length()) goto L23;
        if (this.f180381a.charAt(r04) != '\n') goto L23;
    L24:
        r03 = r1;
    L26:
        this.f180382b = 1;
        this.f180384e = r3;
        this.d = r03;
        return true;
    L23:
        r3 = 1;
        goto L24
    L25:
        r3 = -1;
        goto L26
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
