package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
public class c extends l {
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f179404e;

    public static /* synthetic */ class a {
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public int f179405a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179406b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f179407c;

        public /* synthetic */ b(c r1, a r2) {
            this(r1);
        }

        public Byte a() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f179405a >= this.f179406b) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            int r02 = this.f179405a;
            if (r02 >= this.f179406b) goto L7;
            byte[] r1 = this.f179407c.f179440b;
            this.f179405a = r02 + 1;
            return r1[r02];
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b(c r2) {
            this.f179407c = r2;
            int r02 = r2.y();
            this.f179405a = r02;
            this.f179406b = r02 + r2.size();
        }
    }

    public c(byte[] r5, int r6, int r7) {
        super(r5);
        if (r6 < 0) goto L13;
        if (r7 >= 0) goto L6;
        StringBuilder r72 = new StringBuilder(29);
        r72.append("Length too small: ");
        r72.append(r6);
        throw new IllegalArgumentException(r72.toString());
    L6:
        if ((r6 + r7) > r5.length) goto L9;
        this.d = r6;
        this.f179404e = r7;
        return;
    L9:
        StringBuilder r02 = new StringBuilder(48);
        r02.append("Offset+Length too large: ");
        r02.append(r6);
        r02.append("+");
        r02.append(r7);
        throw new IllegalArgumentException(r02.toString());
    L13:
        StringBuilder r73 = new StringBuilder(29);
        r73.append("Offset too small: ");
        r73.append(r6);
        throw new IllegalArgumentException(r73.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d.a A() {
        return new b(this, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l, kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] r3, int r4, int r5, int r6) {
        System.arraycopy(this.f179440b, y() + r4, r3, r5, r6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f179404e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public int y() {
        return this.d;
    }
}
