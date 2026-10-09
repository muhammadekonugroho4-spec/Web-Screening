package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public static final d f179408a = null;

    public interface a extends Iterator {
        byte nextByte();
    }

    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f179409f = null;

        /* renamed from: a, reason: collision with root package name */
        public final int f179410a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f179411b;

        /* renamed from: c, reason: collision with root package name */
        public int f179412c;
        public byte[] d;

        /* renamed from: e, reason: collision with root package name */
        public int f179413e;

        static {
            f179409f = new byte[0];
        }

        public b(int r2) {
            if (r2 < 0) goto L7;
            this.f179410a = r2;
            this.f179411b = new ArrayList();
            this.d = new byte[r2];
            return;
        L7:
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final byte[] c(byte[] r3, int r4) {
            byte[] r02 = new byte[r4];
            System.arraycopy(r3, 0, r02, 0, Math.min(r3.length, r4));
            return r02;
        }

        public final void f(int r4) {
            this.f179411b.add(new l(this.d));
            int r02 = this.f179412c + this.d.length;
            this.f179412c = r02;
            this.d = new byte[Math.max(this.f179410a, Math.max(r4, r02 >>> 1))];
            this.f179413e = 0;
        }

        public final void i() {
            int r02 = this.f179413e;
            byte[] r1 = this.d;
            if (r02 >= r1.length) goto L6;
            if (r02 <= 0) goto L7;
            this.f179411b.add(new l(c(r1, r02)));
        L7:
            this.f179412c += this.f179413e;
            this.f179413e = 0;
            return;
        L6:
            this.f179411b.add(new l(this.d));
            this.d = f179409f;
            goto L7
        }

        public synchronized int k() {
            monitor-enter(this);
            int r02 = this.f179412c + this.f179413e;
            monitor-exit(this);
            return r02;
        L7:
            th = move-exception;
            throw th;
        }

        public synchronized d l() {
            monitor-enter(this);
            i();     // Catch: Throwable -> L6
            d r02 = d.d(this.f179411b);     // Catch: Throwable -> L6
            monitor-exit(this);
            return r02;
        L6:
            th = move-exception;
            throw th;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(k())});
        }

        @Override // java.io.OutputStream
        public synchronized void write(int r4) {
            monitor-enter(this);
        L6:
            th = move-exception;
            throw th;
        L4:
            if (this.f179413e != this.d.length) goto L8;
            f(1);     // Catch: Throwable -> L6
        L8:
            byte[] r02 = this.d;     // Catch: Throwable -> L6
            int r1 = this.f179413e;     // Catch: Throwable -> L6
            this.f179413e = r1 + 1;     // Catch: Throwable -> L6
            r02[r1] = (byte) r4;     // Catch: Throwable -> L6
            monitor-exit(this);
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] r4, int r5, int r6) {
            monitor-enter(this);
            byte[] r02 = this.d;     // Catch: Throwable -> L6
            int r1 = r02.length;     // Catch: Throwable -> L6
            int r2 = this.f179413e;     // Catch: Throwable -> L6
            if (r6 > (r1 - r2)) goto L8;
            System.arraycopy(r4, r5, r02, r2, r6);     // Catch: Throwable -> L6
            this.f179413e += r6;
        L9:
            monitor-exit(this);
            return;
        L8:
            int r12 = r02.length - r2;     // Catch: Throwable -> L6
            System.arraycopy(r4, r5, r02, r2, r12);     // Catch: Throwable -> L6
            int r62 = r6 - r12;     // Catch: Throwable -> L6
            f(r62);     // Catch: Throwable -> L6
            System.arraycopy(r4, r5 + r12, this.d, 0, r62);     // Catch: Throwable -> L6
            this.f179413e = r62;     // Catch: Throwable -> L6
        L6:
            th = move-exception;
            throw th;
        }
    }

    static {
        f179408a = new l(new byte[0]);
    }

    public d() {
    }

    public static d a(Iterator r2, int r3) {
        if (r3 == 1) goto L5;
        int r02 = r3 >>> 1;
        return a(r2, r02).b(a(r2, r3 - r02));
    L5:
        return (d) r2.next();
    }

    public static d d(Iterable r2) {
        if ((r2 instanceof Collection) == true) goto L8;
        Collection r02 = new ArrayList();
        Iterator r22 = r2.iterator();
    L6:
        if (r22.hasNext() == false) goto L10;
        r02.add((d) r22.next());
    L10:
        if (r02.isEmpty() == false) goto L14;
        return f179408a;
    L14:
        return a(r02.iterator(), r02.size());
    L8:
        r02 = (Collection) r2;
        goto L10
    }

    public static d e(byte[] r2) {
        return f(r2, 0, r2.length);
    }

    public static d f(byte[] r2, int r3, int r4) {
        byte[] r02 = new byte[r4];
        System.arraycopy(r2, r3, r02, 0, r4);
        return new l(r02);
    }

    public static d g(String r2) {
        return new l(r2.getBytes("UTF-8"));
    L4:
        e = move-exception;
        throw new RuntimeException("UTF-8 not supported?", e);
    }

    public static b n() {
        return new b(128);
    }

    public d b(d r7) {
        int r02 = size();
        int r1 = r7.size();
        if ((r02 + r1) < 2147483647L) goto L5;
        StringBuilder r2 = new StringBuilder(53);
        r2.append("ByteString would be too long: ");
        r2.append(r02);
        r2.append("+");
        r2.append(r1);
        throw new IllegalArgumentException(r2.toString());
    L5:
        return q.A(this, r7);
    }

    public void h(byte[] r4, int r5, int r6, int r7) {
        if (r5 < 0) goto L21;
        if (r6 < 0) goto L19;
        if (r7 < 0) goto L17;
        int r02 = r5 + r7;
        if (r02 > size()) goto L15;
        int r03 = r6 + r7;
        if (r03 > r4.length) goto L13;
        if (r7 <= 0) goto L23;
        j(r4, r5, r6, r7);
        return;
    L23:
        return;
    L13:
        StringBuilder r52 = new StringBuilder(34);
        r52.append("Target end offset < 0: ");
        r52.append(r03);
        throw new IndexOutOfBoundsException(r52.toString());
    L15:
        StringBuilder r53 = new StringBuilder(34);
        r53.append("Source end offset < 0: ");
        r53.append(r02);
        throw new IndexOutOfBoundsException(r53.toString());
    L17:
        StringBuilder r54 = new StringBuilder(23);
        r54.append("Length < 0: ");
        r54.append(r7);
        throw new IndexOutOfBoundsException(r54.toString());
    L19:
        StringBuilder r55 = new StringBuilder(30);
        r55.append("Target offset < 0: ");
        r55.append(r6);
        throw new IndexOutOfBoundsException(r55.toString());
    L21:
        StringBuilder r62 = new StringBuilder(30);
        r62.append("Source offset < 0: ");
        r62.append(r5);
        throw new IndexOutOfBoundsException(r62.toString());
    }

    public boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract void j(byte[] r1, int r2, int r3, int r4);

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract int o(int r1, int r2, int r3);

    public abstract int p(int r1, int r2, int r3);

    public abstract int q();

    public byte[] r() {
        int r02 = size();
        if (r02 == 0) goto L5;
        byte[] r1 = new byte[r02];
        j(r1, 0, 0, r02);
        return r1;
    L5:
        return h.f179435a;
    }

    public abstract String s(String r1);

    public abstract int size();

    public String t() {
        return s("UTF-8");
    L4:
        e = move-exception;
        throw new RuntimeException("UTF-8 not supported?", e);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public void u(OutputStream r3, int r4, int r5) {
        if (r4 < 0) goto L13;
        if (r5 < 0) goto L11;
        int r02 = r4 + r5;
        if (r02 > size()) goto L9;
        if (r5 <= 0) goto L15;
        v(r3, r4, r5);
        return;
    L15:
        return;
    L9:
        StringBuilder r42 = new StringBuilder(39);
        r42.append("Source end offset exceeded: ");
        r42.append(r02);
        throw new IndexOutOfBoundsException(r42.toString());
    L11:
        StringBuilder r43 = new StringBuilder(23);
        r43.append("Length < 0: ");
        r43.append(r5);
        throw new IndexOutOfBoundsException(r43.toString());
    L13:
        StringBuilder r52 = new StringBuilder(30);
        r52.append("Source offset < 0: ");
        r52.append(r4);
        throw new IndexOutOfBoundsException(r52.toString());
    }

    public abstract void v(OutputStream r1, int r2, int r3);
}
