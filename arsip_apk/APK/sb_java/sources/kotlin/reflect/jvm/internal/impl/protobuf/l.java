package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
public class l extends d {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f179440b;

    /* renamed from: c, reason: collision with root package name */
    public int f179441c;

    public static /* synthetic */ class a {
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public int f179442a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179443b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f179444c;

        public /* synthetic */ b(l r1, a r2) {
            this(r1);
        }

        public Byte a() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f179442a >= this.f179443b) goto L6;
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
            byte[] r02 = this.f179444c.f179440b;     // Catch: ArrayIndexOutOfBoundsException -> L4
            int r1 = this.f179442a;     // Catch: ArrayIndexOutOfBoundsException -> L4
            this.f179442a = r1 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L4
            return r02[r1];
        L4:
            e = move-exception;
            throw new NoSuchElementException(e.getMessage());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b(l r2) {
            this.f179444c = r2;
            this.f179442a = 0;
            this.f179443b = r2.size();
        }
    }

    public l(byte[] r2) {
        this.f179441c = 0;
        this.f179440b = r2;
    }

    public static int z(int r2, byte[] r3, int r4, int r5) {
        int r02 = r4;
    L4:
        if (r02 >= (r4 + r5)) goto L6;
        r2 = (r2 * 31) + r3[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    public d.a A() {
        return new b(this, null);
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L9;
        return false;
    L9:
        if (size() == ((d) r5).size()) goto L12;
        return false;
    L12:
        if (size() != 0) goto L15;
        return true;
    L15:
        if ((r5 instanceof l) == false) goto L19;
        return w((l) r5, 0, size());
    L19:
        if ((r5 instanceof q) == true) goto L21;
        String r52 = String.valueOf(r5.getClass());
        StringBuilder r1 = new StringBuilder(r52.length() + 49);
        r1.append("Has a new type of ByteString been created? Found ");
        r1.append(r52);
        throw new IllegalArgumentException(r1.toString());
    L21:
        return r5.equals(this);
    }

    public int hashCode() {
        int r02 = this.f179441c;
        if (r02 != 0) goto L8;
        int r03 = size();
        r02 = o(r03, 0, r03);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.f179441c = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] r2, int r3, int r4, int r5) {
        System.arraycopy(this.f179440b, r3, r2, r4, r5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int k() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean l() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        int r02 = y();
        return t.f(this.f179440b, r02, size() + r02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int o(int r3, int r4, int r5) {
        return z(r3, this.f179440b, y() + r4, r5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int p(int r2, int r3, int r4) {
        int r02 = y() + r3;
        return t.g(r2, this.f179440b, r02, r4 + r02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int q() {
        return this.f179441c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String s(String r5) {
        return new String(this.f179440b, y(), size(), r5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f179440b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void v(OutputStream r3, int r4, int r5) {
        r3.write(this.f179440b, y() + r4, r5);
    }

    public boolean w(l r5, int r6, int r7) {
        if (r7 <= r5.size()) goto L5;
        int r62 = size();
        StringBuilder r02 = new StringBuilder(40);
        r02.append("Length too large: ");
        r02.append(r7);
        r02.append(r62);
        throw new IllegalArgumentException(r02.toString());
    L5:
        if ((r6 + r7) > r5.size()) goto L15;
        byte[] r03 = this.f179440b;
        byte[] r1 = r5.f179440b;
        int r2 = y() + r7;
        int r72 = y();
        int r52 = r5.y() + r6;
    L7:
        if (r72 >= r2) goto L13;
        if (r03[r72] != r1[r52]) goto L10;
        r72 = r72 + 1;
        r52 = r52 + 1;
        goto L7
    L10:
        return false;
    L13:
        return true;
    L15:
        int r53 = r5.size();
        StringBuilder r12 = new StringBuilder(59);
        r12.append("Ran off end of other: ");
        r12.append(r6);
        r12.append(", ");
        r12.append(r7);
        r12.append(", ");
        r12.append(r53);
        throw new IllegalArgumentException(r12.toString());
    }

    public int y() {
        return 0;
    }
}
