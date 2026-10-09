package androidx.paging;

import androidx.paging.PagingSource;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final List f26702a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f26703b;

    /* renamed from: c, reason: collision with root package name */
    public final G f26704c;
    public final int d;

    public K(List r2, Integer r3, G r4, int r5) {
        kotlin.jvm.internal.p.l(r2, "pages");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_CONFIG);
        this.f26702a = r2;
        this.f26703b = r3;
        this.f26704c = r4;
        this.d = r5;
    }

    public static final /* synthetic */ int a(K r02) {
        return r02.d;
    }

    public final Object b(int r6) {
        List r02 = this.f26702a;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L56;
        if (((PagingSource.b.c) r03.next()).b().isEmpty() == true) goto L9;
        int r62 = r6 - a(this);
        int r04 = 0;
    L14:
        if (r04 >= AbstractC11777v.q(f())) goto L18;
        if (r62 <= AbstractC11777v.q(((PagingSource.b.c) f().get(r04)).b())) goto L18;
        r62 = r62 - ((PagingSource.b.c) f().get(r04)).b().size();
        r04 = r04 + 1;
    L18:
        Iterator r1 = this.f26702a.iterator();
    L20:
        if (r1.hasNext() == false) goto L42;
        PagingSource.b.c r2 = (PagingSource.b.c) r1.next();
        if (r2.b().isEmpty() == true) goto L20;
        List r12 = this.f26702a;
        ListIterator r13 = r12.listIterator(r12.size());
    L25:
        if (r13.hasPrevious() == false) goto L40;
        PagingSource.b.c r3 = (PagingSource.b.c) r13.previous();
        if (r3.b().isEmpty() == true) goto L25;
        if (r62 >= 0) goto L32;
        return kotlin.collections.F.t0(r2.b());
    L32:
        if (r04 != AbstractC11777v.q(this.f26702a)) goto L38;
        if (r62 <= AbstractC11777v.q(((PagingSource.b.c) kotlin.collections.F.F0(this.f26702a)).b())) goto L38;
        return kotlin.collections.F.F0(r3.b());
    L38:
        return ((PagingSource.b.c) this.f26702a.get(r04)).b().get(r62);
    L40:
        throw new NoSuchElementException("List contains no element matching the predicate.");
    L42:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L56:
        return null;
    L5:
        if (r02.isEmpty() == false) goto L7;
        return null;
    }

    public final PagingSource.b.c c(int r3) {
        List r02 = this.f26702a;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L30;
        if (((PagingSource.b.c) r03.next()).b().isEmpty() == true) goto L9;
        int r32 = r3 - a(this);
        int r04 = 0;
    L14:
        if (r04 >= AbstractC11777v.q(f())) goto L18;
        if (r32 <= AbstractC11777v.q(((PagingSource.b.c) f().get(r04)).b())) goto L18;
        r32 = r32 - ((PagingSource.b.c) f().get(r04)).b().size();
        r04 = r04 + 1;
    L18:
        if (r32 >= 0) goto L22;
        return (PagingSource.b.c) kotlin.collections.F.t0(this.f26702a);
    L22:
        return (PagingSource.b.c) this.f26702a.get(r04);
    L30:
        return null;
    L5:
        if (r02.isEmpty() == false) goto L7;
        return null;
    }

    public final Integer d() {
        return this.f26703b;
    }

    public final G e() {
        return this.f26704c;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof K) == false) goto L14;
        K r32 = (K) r3;
        if (kotlin.jvm.internal.p.g(this.f26702a, r32.f26702a) == true) goto L7;
        return false;
    L7:
        if (kotlin.jvm.internal.p.g(this.f26703b, r32.f26703b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f26704c, r32.f26704c) == true) goto L11;
        return false;
    L11:
        if (this.d != r32.d) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public final List f() {
        return this.f26702a;
    }

    public int hashCode() {
        int r02 = this.f26702a.hashCode();
        Integer r1 = this.f26703b;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return ((r02 + r12) + this.f26704c.hashCode()) + Integer.hashCode(this.d);
    L5:
        r12 = 0;
        goto L7
    }

    public String toString() {
        return "PagingState(pages=" + this.f26702a + ", anchorPosition=" + this.f26703b + ", config=" + this.f26704c + ", leadingPlaceholderCount=" + this.d + ')';
    }
}
