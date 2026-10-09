package androidx.datastore.preferences.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f23710a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final e f23711b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f23712c = null;
    private int hash;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] r2, int r3, int r4) {
            super(r2);
            ByteString.e(r3, r3 + r4, r2.length);
            this.bytesOffset = r3;
            this.bytesLength = r4;
        }

        private void readObject(ObjectInputStream r2) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public int C() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte b(int r3) {
            ByteString.d(r3, size());
            return this.bytes[this.bytesOffset + r3];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public void j(byte[] r3, int r4, int r5, int r6) {
            System.arraycopy(this.bytes, C() + r4, r3, r5, r6);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte k(int r3) {
            return this.bytes[this.bytesOffset + r3];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.y(s());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public LeafByteString() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.o();
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] r1) {
            r1.getClass();
            this.bytes = r1;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void A(AbstractC3916f r4) {
            r4.a(this.bytes, C(), size());
        }

        public final boolean B(ByteString r6, int r7, int r8) {
            if (r8 > r6.size()) goto L21;
            int r02 = r7 + r8;
            if (r02 > r6.size()) goto L19;
            if ((r6 instanceof LiteralByteString) == false) goto L17;
            LiteralByteString r62 = (LiteralByteString) r6;
            byte[] r03 = this.bytes;
            byte[] r1 = r62.bytes;
            int r3 = C() + r8;
            int r82 = C();
            int r63 = r62.C() + r7;
        L9:
            if (r82 >= r3) goto L14;
            if (r03[r82] != r1[r63]) goto L12;
            r82 = r82 + 1;
            r63 = r63 + 1;
            goto L9
        L12:
            return false;
        L14:
            return true;
        L17:
            return r6.r(r7, r02).equals(r(0, r8));
        L19:
            throw new IllegalArgumentException("Ran off end of other: " + r7 + ", " + r8 + ", " + r6.size());
        L21:
            throw new IllegalArgumentException("Length too large: " + r8 + size());
        }

        public int C() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte b(int r2) {
            return this.bytes[r2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object r5) {
            if (r5 != this) goto L6;
            return true;
        L6:
            if ((r5 instanceof ByteString) == true) goto L9;
            return false;
        L9:
            if (size() == ((ByteString) r5).size()) goto L12;
            return false;
        L12:
            if (size() != 0) goto L15;
            return true;
        L15:
            if ((r5 instanceof LiteralByteString) == false) goto L24;
            LiteralByteString r52 = (LiteralByteString) r5;
            int r02 = q();
            int r1 = r52.q();
            if (r02 == 0) goto L22;
            if (r1 == 0) goto L22;
            if (r02 == r1) goto L22;
            return false;
        L22:
            return B(r52, 0, size());
        L24:
            return r5.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void j(byte[] r2, int r3, int r4, int r5) {
            System.arraycopy(this.bytes, r3, r2, r4, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte k(int r2) {
            return this.bytes[r2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean m() {
            int r02 = C();
            return Utf8.n(this.bytes, r02, size() + r02);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int p(int r3, int r4, int r5) {
            return AbstractC3930u.i(r3, this.bytes, C() + r4, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString r(int r4, int r5) {
            int r52 = ByteString.e(r4, r5, size());
            if (r52 != 0) goto L7;
            return ByteString.f23710a;
        L7:
            return new BoundedByteString(this.bytes, C() + r4, r52);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String v(Charset r5) {
            return new String(this.bytes, C(), size(), r5);
        }
    }

    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f23713a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23714b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteString f23715c;

        public a(ByteString r2) {
            this.f23715c = r2;
            this.f23713a = 0;
            this.f23714b = r2.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23713a >= this.f23714b) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte nextByte() {
            int r02 = this.f23713a;
            if (r02 >= this.f23714b) goto L7;
            this.f23713a = r02 + 1;
            return this.f23715c.k(r02);
        L7:
            throw new NoSuchElementException();
        }
    }

    public static class b implements Comparator {
        public b() {
        }

        public int a(ByteString r5, ByteString r6) {
            f r02 = r5.o();
            f r1 = r6.o();
        L4:
            if (r02.hasNext() == false) goto L11;
            if (r1.hasNext() == false) goto L11;
            int r2 = Integer.compare(ByteString.a(r02.nextByte()), ByteString.a(r1.nextByte()));
            if (r2 == 0) goto L4;
            return r2;
        L11:
            return Integer.compare(r5.size(), r6.size());
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((ByteString) r1, (ByteString) r2);
        }
    }

    public static abstract class c implements f {
        public c() {
        }

        public final Byte a() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements e {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] copyFrom(byte[] r1, int r2, int r3) {
            return Arrays.copyOfRange(r1, r2, r3 + r2);
        }

        public /* synthetic */ d(a r1) {
            this();
        }
    }

    public interface e {
        byte[] copyFrom(byte[] r1, int r2, int r3);
    }

    public interface f extends Iterator {
        byte nextByte();
    }

    public static final class g implements e {
        public g() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] copyFrom(byte[] r3, int r4, int r5) {
            byte[] r02 = new byte[r5];
            System.arraycopy(r3, r4, r02, 0, r5);
            return r02;
        }

        public /* synthetic */ g(a r1) {
            this();
        }
    }

    static {
        f23710a = new LiteralByteString(AbstractC3930u.f23885c);
        a r1 = null;
        if (AbstractC3914d.c() == false) goto L5;
        e r02 = new g(r1);
    L6:
        f23711b = r02;
        f23712c = new b();
        return;
    L5:
        r02 = new d(r1);
        goto L6
    }

    public ByteString() {
        this.hash = 0;
    }

    public static /* synthetic */ int a(byte r02) {
        return t(r02);
    }

    public static void d(int r3, int r4) {
        if (((r4 - (r3 + 1)) | r3) >= 0) goto L9;
        if (r3 >= 0) goto L8;
        throw new ArrayIndexOutOfBoundsException("Index < 0: " + r3);
    L8:
        throw new ArrayIndexOutOfBoundsException("Index > length: " + r3 + ", " + r4);
    }

    public static int e(int r3, int r4, int r5) {
        int r02 = r4 - r3;
        if ((((r3 | r4) | r02) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L11;
        if (r4 >= r3) goto L9;
        throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r3 + ", " + r4);
    L9:
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    L11:
        throw new IndexOutOfBoundsException("Beginning index: " + r3 + " < 0");
    L12:
        return r02;
    }

    public static ByteString f(byte[] r2) {
        return g(r2, 0, r2.length);
    }

    public static ByteString g(byte[] r2, int r3, int r4) {
        e(r3, r3 + r4, r2.length);
        return new LiteralByteString(f23711b.copyFrom(r2, r3, r4));
    }

    public static ByteString h(String r2) {
        return new LiteralByteString(r2.getBytes(AbstractC3930u.f23883a));
    }

    public static int t(byte r02) {
        return r02 & UnsignedBytes.MAX_VALUE;
    }

    public static ByteString y(byte[] r1) {
        return new LiteralByteString(r1);
    }

    public static ByteString z(byte[] r1, int r2, int r3) {
        return new BoundedByteString(r1, r2, r3);
    }

    public abstract void A(AbstractC3916f r1);

    public abstract byte b(int r1);

    public abstract boolean equals(Object r1);

    public final int hashCode() {
        int r02 = this.hash;
        if (r02 != 0) goto L8;
        int r03 = size();
        r02 = p(r03, 0, r03);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.hash = r02;
    L8:
        return r02;
    }

    public abstract void j(byte[] r1, int r2, int r3, int r4);

    public abstract byte k(int r1);

    public abstract boolean m();

    public f o() {
        return new a(this);
    }

    public abstract int p(int r1, int r2, int r3);

    public final int q() {
        return this.hash;
    }

    public abstract ByteString r(int r1, int r2);

    public final byte[] s() {
        int r02 = size();
        if (r02 == 0) goto L5;
        byte[] r1 = new byte[r02];
        j(r1, 0, 0, r02);
        return r1;
    L5:
        return AbstractC3930u.f23885c;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public final String u(Charset r2) {
        if (size() != 0) goto L7;
        return "";
    L7:
        return v(r2);
    }

    public abstract String v(Charset r1);

    public final String w() {
        return u(AbstractC3930u.f23883a);
    }
}
