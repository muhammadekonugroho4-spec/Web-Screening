package androidx.arch.core.internal;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f3703a;

    /* renamed from: b, reason: collision with root package name */
    public c f3704b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3705c;
    public int d;

    public static class a extends e {
        public a(c r1, c r2) {
            super(r1, r2);
        }

        @Override // androidx.arch.core.internal.b.e
        public c b(c r1) {
            return r1.d;
        }

        @Override // androidx.arch.core.internal.b.e
        public c c(c r1) {
            return r1.f3708c;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    public static class C0031b extends e {
        public C0031b(c r1, c r2) {
            super(r1, r2);
        }

        @Override // androidx.arch.core.internal.b.e
        public c b(c r1) {
            return r1.f3708c;
        }

        @Override // androidx.arch.core.internal.b.e
        public c c(c r1) {
            return r1.d;
        }
    }

    public static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3706a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f3707b;

        /* renamed from: c, reason: collision with root package name */
        public c f3708c;
        public c d;

        public c(Object r1, Object r2) {
            this.f3706a = r1;
            this.f3707b = r2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object r5) {
            if (r5 != this) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f3706a.equals(r52.f3706a) == true) goto L11;
        L13:
            return false;
        L11:
            if (this.f3707b.equals(r52.f3707b) == false) goto L13;
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f3706a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f3707b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f3706a.hashCode() ^ this.f3707b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object r2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3706a + ContainerUtils.KEY_VALUE_DELIMITER + this.f3707b;
        }
    }

    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f3709a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3710b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f3711c;

        public d(b r1) {
            this.f3711c = r1;
            this.f3710b = true;
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(c r2) {
            c r02 = this.f3709a;
            if (r2 != r02) goto L10;
            c r22 = r02.d;
            this.f3709a = r22;
            if (r22 != null) goto L7;
            boolean r23 = true;
        L8:
            this.f3710b = r23;
            return;
        L7:
            r23 = false;
            goto L8
        }

        public Map.Entry b() {
            if (this.f3710b == false) goto L5;
            this.f3710b = false;
            this.f3709a = this.f3711c.f3703a;
        L11:
            return this.f3709a;
        L5:
            c r02 = this.f3709a;
            if (r02 == null) goto L8;
            c r03 = r02.f3708c;
        L9:
            this.f3709a = r03;
            goto L11
        L8:
            r03 = null;
            goto L9
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3710b == true) goto L5;
            c r02 = this.f3709a;
            if (r02 != null) goto L11;
        L13:
            return false;
        L11:
            if (r02.f3708c == null) goto L13;
            return true;
        L5:
            if (this.f3711c.f3703a == null) goto L7;
            return true;
        L7:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }
    }

    public static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f3712a;

        /* renamed from: b, reason: collision with root package name */
        public c f3713b;

        public e(c r1, c r2) {
            this.f3712a = r2;
            this.f3713b = r1;
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(c r2) {
            if (this.f3712a == r2) goto L5;
        L7:
            c r02 = this.f3712a;
            if (r02 != r2) goto L11;
            this.f3712a = b(r02);
        L11:
            if (this.f3713b != r2) goto L14;
            this.f3713b = e();
            return;
        L14:
            return;
        L5:
            if (r2 != this.f3713b) goto L7;
            this.f3713b = null;
            this.f3712a = null;
            goto L7
        }

        public abstract c b(c r1);

        public abstract c c(c r1);

        public Map.Entry d() {
            c r02 = this.f3713b;
            this.f3713b = e();
            return r02;
        }

        public final c e() {
            c r02 = this.f3713b;
            c r1 = this.f3712a;
            if (r02 == r1) goto L8;
            if (r1 != null) goto L7;
            return null;
        L7:
            return c(r02);
        L8:
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3713b == null) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return d();
        }
    }

    public static abstract class f {
        public f() {
        }

        public abstract void a(c r1);
    }

    public b() {
        this.f3705c = new WeakHashMap();
        this.d = 0;
    }

    public Map.Entry a() {
        return this.f3703a;
    }

    public c b(Object r3) {
        c r02 = this.f3703a;
    L3:
        if (r02 == null) goto L8;
        if (r02.f3706a.equals(r3) == true) goto L8;
        r02 = r02.f3708c;
    L8:
        return r02;
    }

    public d d() {
        d r02 = new d(this);
        this.f3705c.put(r02, Boolean.FALSE);
        return r02;
    }

    public Iterator descendingIterator() {
        C0031b r02 = new C0031b(this.f3704b, this.f3703a);
        this.f3705c.put(r02, Boolean.FALSE);
        return r02;
    }

    public Map.Entry e() {
        return this.f3704b;
    }

    public boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof b) == true) goto L8;
        return false;
    L8:
        b r62 = (b) r6;
        if (size() == r62.size()) goto L11;
        return false;
    L11:
        Iterator r1 = iterator();
        Iterator r63 = r62.iterator();
    L13:
        if (r1.hasNext() == false) goto L24;
        if (r63.hasNext() == false) goto L24;
        Map.Entry r3 = (Map.Entry) r1.next();
        Object r4 = r63.next();
        if (r3 != null) goto L19;
        if (r4 == null) goto L19;
    L22:
        return false;
    L19:
        if (r3 == null) goto L13;
        if (r3.equals(r4) == true) goto L13;
    L24:
        if (r1.hasNext() == false) goto L26;
    L28:
        return false;
    L26:
        if (r63.hasNext() == true) goto L28;
        return true;
    }

    public c f(Object r2, Object r3) {
        c r02 = new c(r2, r3);
        this.d++;
        c r22 = this.f3704b;
        if (r22 != null) goto L6;
        this.f3703a = r02;
        this.f3704b = r02;
        return r02;
    L6:
        r22.f3708c = r02;
        r02.d = r22;
        this.f3704b = r02;
        return r02;
    }

    public Object g(Object r2, Object r3) {
        c r02 = b(r2);
        if (r02 != null) goto L5;
        f(r2, r3);
        return null;
    L5:
        return r02.f3707b;
    }

    public Object h(Object r4) {
        c r42 = b(r4);
        if (r42 != null) goto L5;
        return null;
    L5:
        this.d--;
        if (this.f3705c.isEmpty() == true) goto L11;
        Iterator r1 = this.f3705c.keySet().iterator();
    L9:
        if (r1.hasNext() == false) goto L11;
        ((f) r1.next()).a(r42);
    L11:
        c r12 = r42.d;
        if (r12 == null) goto L14;
        r12.f3708c = r42.f3708c;
    L15:
        c r2 = r42.f3708c;
        if (r2 == null) goto L18;
        r2.d = r12;
    L19:
        r42.f3708c = null;
        r42.d = null;
        return r42.f3707b;
    L18:
        this.f3704b = r12;
        goto L19
    L14:
        this.f3703a = r42.f3708c;
        goto L15
    }

    public int hashCode() {
        Iterator r02 = iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L6;
        r1 = r1 + ((Map.Entry) r02.next()).hashCode();
        goto L4
    L6:
        return r1;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a r02 = new a(this.f3703a, this.f3704b);
        this.f3705c.put(r02, Boolean.FALSE);
        return r02;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(Constants.AES_PREFIX);
        Iterator r1 = iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        r02.append(((Map.Entry) r1.next()).toString());
        if (r1.hasNext() == false) goto L4;
        r02.append(", ");
        goto L4
    L8:
        r02.append(Constants.AES_SUFFIX);
        return r02.toString();
    }
}
