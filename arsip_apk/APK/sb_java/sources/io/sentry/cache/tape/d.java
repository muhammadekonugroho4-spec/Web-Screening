package io.sentry.cache.tape;

import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d implements Closeable, Iterable, AutoCloseable {

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f176139m = null;

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f176140a;

    /* renamed from: b, reason: collision with root package name */
    public final File f176141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f176142c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public int f176143e;

    /* renamed from: f, reason: collision with root package name */
    public b f176144f;

    /* renamed from: g, reason: collision with root package name */
    public b f176145g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f176146h;

    /* renamed from: i, reason: collision with root package name */
    public int f176147i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f176148j;

    /* renamed from: k, reason: collision with root package name */
    public final int f176149k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f176150l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final File f176151a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f176152b;

        /* renamed from: c, reason: collision with root package name */
        public int f176153c;

        public a(File r2) {
            this.f176152b = true;
            this.f176153c = -1;
            if (r2 == null) goto L7;
            this.f176151a = r2;
            return;
        L7:
            throw new NullPointerException("file == null");
        }

        public d a() {
            RandomAccessFile r02 = d.u(this.f176151a);
            return new d(this.f176151a, r02, this.f176152b, this.f176153c);
        L5:
            th = move-exception;
            r02.close();
            throw th;
        }

        public a b(int r1) {
            this.f176153c = r1;
            return this;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f176154c = null;

        /* renamed from: a, reason: collision with root package name */
        public final long f176155a;

        /* renamed from: b, reason: collision with root package name */
        public final int f176156b;

        static {
            f176154c = new b(0, 0);
        }

        public b(long r1, int r3) {
            this.f176155a = r1;
            this.f176156b = r3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f176155a + ", length=" + this.f176156b + Constants.AES_SUFFIX;
        }
    }

    public final class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f176157a;

        /* renamed from: b, reason: collision with root package name */
        public long f176158b;

        /* renamed from: c, reason: collision with root package name */
        public int f176159c;
        public final /* synthetic */ d d;

        public c(d r3) {
            this.d = r3;
            this.f176157a = 0;
            this.f176158b = r3.f176144f.f176155a;
            this.f176159c = r3.f176147i;
        }

        public final void a() {
            if (this.d.f176147i != this.f176159c) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException();
        }

        public byte[] b() {
            if (this.d.f176150l == true) goto L29;
            a();
            if (this.d.isEmpty() == true) goto L27;
            int r02 = this.f176157a;
            d r1 = this.d;
            if (r02 >= r1.f176143e) goto L25;
            b r03 = r1.O(this.f176158b);     // Catch: IOException -> L12 OutOfMemoryError -> L16
            byte[] r5 = new byte[r03.f176156b];     // Catch: IOException -> L12 OutOfMemoryError -> L16
            long r3 = this.d.I1(r03.f176155a + 4);     // Catch: IOException -> L12 OutOfMemoryError -> L16
            this.f176158b = r3;     // Catch: IOException -> L12 OutOfMemoryError -> L16
            if (this.d.b1(r3, r5, 0, r03.f176156b) == true) goto L14;
            this.f176157a = this.d.f176143e;     // Catch: IOException -> L12 OutOfMemoryError -> L16
            return d.f();
        L14:
            this.f176158b = this.d.I1((r03.f176155a + 4) + r03.f176156b);     // Catch: IOException -> L12 OutOfMemoryError -> L16
            this.f176157a++;
            return r5;
        L12:
            e = move-exception;
            throw ((Error) d.t(e));
        L16:
            d.k(this.d);     // Catch: IOException -> L19
            this.f176157a = this.d.f176143e;     // Catch: IOException -> L19
            return d.f();
        L19:
            e = move-exception;
            throw ((Error) d.t(e));
        L25:
            throw new NoSuchElementException();
        L27:
            throw new NoSuchElementException();
        L29:
            throw new IllegalStateException("closed");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.d.f176150l == true) goto L11;
            a();
            if (this.f176157a == this.d.f176143e) goto L8;
            return true;
        L8:
            return false;
        L11:
            throw new IllegalStateException("closed");
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (this.d.isEmpty() == true) goto L15;
            if (this.f176157a != 1) goto L13;
            this.d.v0();     // Catch: IOException -> L9
            this.f176159c = this.d.f176147i;
            this.f176157a--;
            return;
        L9:
            e = move-exception;
            throw ((Error) d.t(e));
        L13:
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        L15:
            throw new NoSuchElementException();
        }
    }

    static {
        f176139m = new byte[4096];
    }

    public d(File r2, RandomAccessFile r3, boolean r4, int r5) {
        this.f176142c = 32;
        this.f176146h = new byte[32];
        this.f176147i = 0;
        this.f176141b = r2;
        this.f176140a = r3;
        this.f176148j = r4;
        this.f176149k = r5;
        W();
    }

    public static RandomAccessFile E(File r2) {
        return new RandomAccessFile(r2, "rwd");
    }

    public static void K1(byte[] r2, int r3, int r4) {
        r2[r3] = (byte) (r4 >> 24);
        r2[r3 + 1] = (byte) (r4 >> 16);
        r2[r3 + 2] = (byte) (r4 >> 8);
        r2[r3 + 3] = (byte) r4;
    }

    public static void L1(byte[] r3, int r4, long r5) {
        r3[r4] = (byte) (r5 >> 56);
        r3[r4 + 1] = (byte) (r5 >> 48);
        r3[r4 + 2] = (byte) (r5 >> 40);
        r3[r4 + 3] = (byte) (r5 >> 32);
        r3[r4 + 4] = (byte) (r5 >> 24);
        r3[r4 + 5] = (byte) (r5 >> 16);
        r3[r4 + 6] = (byte) (r5 >> 8);
        r3[r4 + 7] = (byte) r5;
    }

    public static int Z(byte[] r2, int r3) {
        return ((((r2[r3] & UnsignedBytes.MAX_VALUE) << 24) + ((r2[r3 + 1] & UnsignedBytes.MAX_VALUE) << 16)) + ((r2[r3 + 2] & UnsignedBytes.MAX_VALUE) << 8)) + (r2[r3 + 3] & UnsignedBytes.MAX_VALUE);
    }

    public static long d0(byte[] r7, int r8) {
        return ((((((((r7[r8] & 255) << 56) + ((r7[r8 + 1] & 255) << 48)) + ((r7[r8 + 2] & 255) << 40)) + ((r7[r8 + 3] & 255) << 32)) + ((r7[r8 + 4] & 255) << 24)) + ((r7[r8 + 5] & 255) << 16)) + ((r7[r8 + 6] & 255) << 8)) + (r7[r8 + 7] & 255);
    }

    public static /* synthetic */ byte[] f() {
        return f176139m;
    }

    public static /* synthetic */ void k(d r02) {
        r02.z0();
    }

    public static Throwable t(Throwable r02) {
        throw r02;
    }

    public static RandomAccessFile u(File r6) {
        if (r6.exists() == true) goto L15;
        File r02 = new File(r6.getPath() + ".tmp");
        RandomAccessFile r1 = E(r02);
        r1.setLength(4096);     // Catch: Throwable -> L11
        r1.seek(0);     // Catch: Throwable -> L11
        r1.writeInt(-2147483647);     // Catch: Throwable -> L11
        r1.writeLong(4096);     // Catch: Throwable -> L11
        r1.close();
        if (r02.renameTo(r6) == true) goto L15;
        throw new IOException("Rename failed!");
    L11:
        th = move-exception;
        r1.close();
        throw th;
    L15:
        return E(r6);
    }

    public boolean B() {
        if (this.f176149k != (-1)) goto L6;
        return false;
    L6:
        if (size() != this.f176149k) goto L9;
        return true;
    L9:
        return false;
    }

    public final void E1(long r2) {
        this.f176140a.setLength(r2);
        this.f176140a.getChannel().force(true);
    }

    public final void H0(long r7, long r9) {
        long r1 = r7;
    L4:
        if (r9 <= 0) goto L6;
        byte[] r3 = f176139m;
        int r5 = (int) Math.min(r9, r3.length);
        f1(r1, r3, 0, r5);
        long r72 = r5;
        r9 = r9 - r72;
        r1 = r1 + r72;
        goto L4
    }

    public final long H1() {
        if (this.f176143e != 0) goto L5;
        return 32;
    L5:
        long r3 = this.f176145g.f176155a;
        long r5 = this.f176144f.f176155a;
        if (r3 < r5) goto L10;
        return (((r3 - r5) + 4) + r0.f176156b) + 32;
    L10:
        return (((r3 + 4) + r0.f176156b) + this.d) - r5;
    }

    public long I1(long r5) {
        long r02 = this.d;
        if (r5 >= r02) goto L6;
        return r5;
    L6:
        return (r5 + 32) - r02;
    }

    public final void J1(long r4, int r6, long r7, long r9) {
        this.f176140a.seek(0);
        K1(this.f176146h, 0, -2147483647);
        L1(this.f176146h, 4, r4);
        K1(this.f176146h, 12, r6);
        L1(this.f176146h, 16, r7);
        L1(this.f176146h, 24, r9);
        this.f176140a.write(this.f176146h, 0, 32);
    }

    public b O(long r7) {
        if (r7 != 0) goto L7;
        return b.f176154c;
    L7:
        if (b1(r7, this.f176146h, 0, 4) == true) goto L11;
        return b.f176154c;
    L11:
        return new b(r7, Z(this.f176146h, 0));
    }

    public final void W() {
        this.f176140a.seek(0);
        this.f176140a.readFully(this.f176146h);
        this.d = d0(this.f176146h, 4);
        this.f176143e = Z(this.f176146h, 12);
        long r02 = d0(this.f176146h, 16);
        long r2 = d0(this.f176146h, 24);
        if (this.d > this.f176140a.length()) goto L11;
        if (this.d <= 32) goto L9;
        this.f176144f = O(r02);
        this.f176145g = O(r2);
        return;
    L9:
        throw new IOException("File is corrupt; length stored in header (" + this.d + ") is invalid.");
    L11:
        throw new IOException("File is truncated. Expected length: " + this.d + ", Actual length: " + this.f176140a.length());
    }

    public boolean b1(long r5, byte[] r7, int r8, int r9) {
        long r52 = I1(r5);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        long r02 = r9 + r52;     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        long r2 = this.d;     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        if (r02 > r2) goto L7;
        this.f176140a.seek(r52);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        this.f176140a.readFully(r7, r8, r9);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        return true;
    L7:
        int r03 = (int) (r2 - r52);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        this.f176140a.seek(r52);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        this.f176140a.readFully(r7, r8, r03);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        this.f176140a.seek(32);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        this.f176140a.readFully(r7, r8 + r03, r9 - r03);     // Catch: IOException -> L5 Throwable -> L10 EOFException -> L12
        return true;
    L12:
        z0();
        return false;
    L5:
        e = move-exception;
        throw e;
    L10:
        z0();
        return false;
    }

    public void clear() {
        if (this.f176150l == true) goto L13;
        J1(4096, 0, 0, 0);
        if (this.f176148j == false) goto L7;
        this.f176140a.seek(32);
        this.f176140a.write(f176139m, 0, 4064);
    L7:
        this.f176143e = 0;
        b r02 = b.f176154c;
        this.f176144f = r02;
        this.f176145g = r02;
        if (this.d <= 4096) goto L10;
        E1(4096);
    L10:
        this.d = 4096;
        this.f176147i++;
        return;
    L13:
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f176150l = true;
        this.f176140a.close();
    }

    public final void f1(long r5, byte[] r7, int r8, int r9) {
        long r52 = I1(r5);
        long r02 = r9 + r52;
        long r2 = this.d;
        if (r02 > r2) goto L6;
        this.f176140a.seek(r52);
        this.f176140a.write(r7, r8, r9);
        return;
    L6:
        int r03 = (int) (r2 - r52);
        this.f176140a.seek(r52);
        this.f176140a.write(r7, r8, r03);
        this.f176140a.seek(32);
        this.f176140a.write(r7, r8 + r03, r9 - r03);
    }

    public final long g0() {
        return this.d - H1();
    }

    public boolean isEmpty() {
        if (this.f176143e != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c(this);
    }

    public void l(byte[] r13, int r14, int r15) {
        if (r13 == null) goto L30;
        if ((r14 | r15) < 0) goto L28;
        if (r15 > (r13.length - r14)) goto L28;
        if (this.f176150l == true) goto L26;
        if (B() == false) goto L12;
        v0();
    L12:
        n(r15);
        boolean r8 = isEmpty();
        if (r8 == false) goto L15;
        long r1 = 32;
    L16:
        b r11 = new b(r1, r15);
        K1(this.f176146h, 0, r15);
        f1(r11.f176155a, this.f176146h, 0, 4);
        f1(r11.f176155a + 4, r13, r14, r15);
        if (r8 == false) goto L20;
        long r12 = r11.f176155a;
    L21:
        J1(this.d, this.f176143e + 1, r12, r11.f176155a);
        this.f176145g = r11;
        this.f176143e++;
        this.f176147i++;
        if (r8 == false) goto L31;
        this.f176144f = r11;
        return;
    L31:
        return;
    L20:
        r12 = this.f176144f.f176155a;
        goto L21
    L15:
        r1 = I1((this.f176145g.f176155a + 4) + r1.f176156b);
        goto L16
    L26:
        throw new IllegalStateException("closed");
    L28:
        throw new IndexOutOfBoundsException();
    L30:
        throw new NullPointerException("data == null");
    }

    public final void n(long r20) {
        long r3 = r20 + 4;
        long r5 = g0();
        if (r5 >= r3) goto L27;
        long r7 = this.d;
    L6:
        r5 = r5 + r7;
        r7 = r7 << 1;
        if (r5 < r3) goto L6;
        E1(r7);
        long r1 = I1((this.f176145g.f176155a + 4) + r3.f176156b);
        if (r1 > this.f176144f.f176155a) goto L15;
        FileChannel r11 = this.f176140a.getChannel();
        r11.position(this.d);
        long r14 = r1 - 32;
        if (r11.transferTo(32, r14, r11) != r14) goto L14;
    L16:
        long r12 = this.f176145g.f176155a;
        long r4 = this.f176144f.f176155a;
        if (r12 >= r4) goto L19;
        long r112 = (this.d + r12) - 32;
        J1(r7, this.f176143e, r4, r112);
        this.f176145g = new b(r112, this.f176145g.f176156b);
        long r72 = r7;
    L20:
        this.d = r72;
        if (this.f176148j == false) goto L26;
        H0(32, r14);
        return;
    L26:
        return;
    L19:
        J1(r7, this.f176143e, r4, r12);
        r72 = r7;
        goto L20
    L14:
        throw new AssertionError("Copied insufficient number of bytes!");
    L15:
        r14 = 0;
        goto L16
    }

    public int size() {
        return this.f176143e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f176141b + ", zero=" + this.f176148j + ", length=" + this.d + ", size=" + this.f176143e + ", first=" + this.f176144f + ", last=" + this.f176145g + '}';
    }

    public void v0() {
        y0(1);
    }

    public void y0(int r14) {
        if (r14 < 0) goto L28;
        if (r14 != 0) goto L6;
        return;
    L6:
        if (r14 != this.f176143e) goto L10;
        clear();
        return;
    L10:
        if (isEmpty() == true) goto L26;
        if (r14 > this.f176143e) goto L24;
        b r1 = this.f176144f;
        long r8 = r1.f176155a;
        int r10 = r1.f176156b;
        long r11 = 0;
        int r7 = 0;
        long r4 = r8;
    L14:
        if (r7 >= r14) goto L19;
        r11 = r11 + (r10 + 4);
        long r12 = I1((r4 + 4) + r10);
        if (b1(r12, this.f176146h, 0, 4) == false) goto L33;
        r10 = Z(this.f176146h, 0);
        r7 = r7 + 1;
        r4 = r12;
        goto L14
    L33:
        return;
    L19:
        J1(this.d, this.f176143e - r14, r4, this.f176145g.f176155a);
        this.f176143e -= r14;
        this.f176147i++;
        this.f176144f = new b(r4, r10);
        if (this.f176148j == false) goto L31;
        H0(r8, r11);
        return;
    L31:
        return;
    L24:
        throw new IllegalArgumentException("Cannot remove more elements (" + r14 + ") than present in queue (" + this.f176143e + ").");
    L26:
        throw new NoSuchElementException();
    L28:
        throw new IllegalArgumentException("Cannot remove negative (" + r14 + ") number of elements.");
    }

    public final void z0() {
        this.f176140a.close();
        this.f176141b.delete();
        this.f176140a = u(this.f176141b);
        W();
    }
}
