package com.koushikdutta.async;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.koushikdutta.async.util.ArrayDeque;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* loaded from: classes6.dex */
public class o {
    public static PriorityQueue d;

    /* renamed from: e, reason: collision with root package name */
    public static int f41593e;

    /* renamed from: f, reason: collision with root package name */
    public static int f41594f;

    /* renamed from: g, reason: collision with root package name */
    public static int f41595g;

    /* renamed from: h, reason: collision with root package name */
    public static int f41596h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f41597i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final ByteBuffer f41598j = null;

    /* renamed from: a, reason: collision with root package name */
    public ArrayDeque f41599a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f41600b;

    /* renamed from: c, reason: collision with root package name */
    public int f41601c;

    public static class a implements Comparator {
        public a() {
        }

        public int a(ByteBuffer r3, ByteBuffer r4) {
            if (r3.capacity() != r4.capacity()) goto L7;
            return 0;
        L7:
            if (r3.capacity() <= r4.capacity()) goto L10;
            return 1;
        L10:
            return -1;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((ByteBuffer) r1, (ByteBuffer) r2);
        }
    }

    static {
        d = new PriorityQueue(8, new a());
        f41593e = 1048576;
        f41594f = 262144;
        f41595g = 0;
        f41596h = 0;
        f41597i = new Object();
        f41598j = ByteBuffer.allocate(0);
    }

    public o() {
        this.f41599a = new ArrayDeque();
        this.f41600b = ByteOrder.BIG_ENDIAN;
        this.f41601c = 0;
    }

    public static void D(OutputStream r4, ByteBuffer r5) {
        if (r5.isDirect() == false) goto L5;
        byte[] r02 = new byte[r5.remaining()];
        int r1 = r5.remaining();
        r5.get(r02);
        int r52 = 0;
    L6:
        r4.write(r02, r52, r1);
        return;
    L5:
        r02 = r5.array();
        int r12 = r5.arrayOffset() + r5.position();
        r1 = r5.remaining();
        r52 = r12;
        goto L6
    }

    public static PriorityQueue o() {
        Looper r02 = Looper.getMainLooper();
        if (r02 == null) goto L9;
        if (Thread.currentThread() != r02.getThread()) goto L9;
        return null;
    L9:
        return d;
    }

    public static ByteBuffer s(int r5) {
        if (r5 > f41596h) goto L24;
        PriorityQueue r02 = o();
        if (r02 == null) goto L24;
        Object r1 = f41597i;
        monitor-enter(r1);
    L25:
    L13:
        th = move-exception;
        throw th;
    L9:
        if (r02.size() <= 0) goto L19;
        ByteBuffer r2 = (ByteBuffer) r02.remove();     // Catch: Throwable -> L13
        if (r02.size() != 0) goto L15;
        f41596h = 0;     // Catch: Throwable -> L13
    L15:
        f41595g -= r2.capacity();
        if (r2.capacity() < r5) goto L25;
        monitor-exit(r1);     // Catch: Throwable -> L13
        return r2;
    L19:
        monitor-exit(r1);     // Catch: Throwable -> L13
    L24:
        return ByteBuffer.allocate(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, r5));
    }

    public static void x(ByteBuffer r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.isDirect() == false) goto L7;
        return;
    L7:
        if (r4.arrayOffset() == 0) goto L9;
        return;
    L9:
        if (r4.array().length == r4.capacity()) goto L12;
        return;
    L12:
        if (r4.capacity() >= 8192) goto L15;
        return;
    L15:
        if (r4.capacity() > f41594f) goto L49;
        PriorityQueue r02 = o();
        if (r02 == null) goto L50;
        Object r1 = f41597i;
        monitor-enter(r1);
    L41:
    L29:
        th = move-exception;
        throw th;
    L23:
        if (f41595g <= f41593e) goto L32;
        if (r02.size() <= 0) goto L32;
        if (((ByteBuffer) r02.peek()).capacity() >= r4.capacity()) goto L32;
        f41595g -= ((ByteBuffer) r02.remove()).capacity();
    L32:
        if (f41595g <= f41593e) goto L35;
        monitor-exit(r1);     // Catch: Throwable -> L29
        return;
    L35:
        r4.position(0);     // Catch: Throwable -> L29
        r4.limit(r4.capacity());     // Catch: Throwable -> L29
        f41595g += r4.capacity();
        r02.add(r4);     // Catch: Throwable -> L29
        f41596h = Math.max(f41596h, r4.capacity());     // Catch: Throwable -> L29
        monitor-exit(r1);     // Catch: Throwable -> L29
        return;
    L50:
        return;
    }

    public ByteBuffer A() {
        ByteBuffer r02 = (ByteBuffer) this.f41599a.remove();
        this.f41601c -= r02.remaining();
        return r02;
    }

    public int B() {
        return this.f41599a.size();
    }

    public void C() {
        v(0);
    }

    public o a(ByteBuffer r4) {
        if (r4.remaining() > 0) goto L6;
        x(r4);
        return this;
    L6:
        d(r4.remaining());
        if (this.f41599a.size() <= 0) goto L12;
        ByteBuffer r02 = (ByteBuffer) this.f41599a.getLast();
        if ((r02.capacity() - r02.limit()) < r4.remaining()) goto L12;
        r02.mark();
        r02.position(r02.limit());
        r02.limit(r02.capacity());
        r02.put(r4);
        r02.limit(r02.position());
        r02.reset();
        x(r4);
        C();
        return this;
    L12:
        this.f41599a.add(r4);
        C();
        return this;
    }

    public o b(ByteBuffer... r4) {
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        a(r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return this;
    }

    public void c(ByteBuffer r4) {
        if (r4.remaining() > 0) goto L6;
        x(r4);
        return;
    L6:
        d(r4.remaining());
        if (this.f41599a.size() <= 0) goto L12;
        ByteBuffer r02 = (ByteBuffer) this.f41599a.getFirst();
        if (r02.position() < r4.remaining()) goto L12;
        r02.position(r02.position() - r4.remaining());
        r02.mark();
        r02.put(r4);
        r02.reset();
        x(r4);
        return;
    L12:
        this.f41599a.addFirst(r4);
    }

    public final void d(int r2) {
        if (z() < 0) goto L6;
        this.f41601c += r2;
        return;
    }

    public byte e() {
        byte r1 = v(1).get();
        this.f41601c--;
        return r1;
    }

    public void f(o r2) {
        g(r2, z());
    }

    public void g(o r6, int r7) {
        if (z() < r7) goto L16;
        int r1 = 0;
    L5:
        if (r1 >= r7) goto L13;
        ByteBuffer r2 = (ByteBuffer) this.f41599a.remove();
        int r3 = r2.remaining();
        if (r3 == 0) goto L8;
        int r32 = r3 + r1;
        if (r32 > r7) goto L11;
        r6.a(r2);
        r1 = r32;
        goto L5
    L11:
        int r12 = r7 - r1;
        ByteBuffer r33 = s(r12);
        r33.limit(r12);
        r2.get(r33.array(), 0, r12);
        r6.a(r33);
        this.f41599a.addFirst(r2);
        goto L13
    L8:
        x(r2);
    L13:
        this.f41601c -= r7;
        return;
    L16:
        throw new IllegalArgumentException("length");
    }

    public void h(byte[] r3) {
        i(r3, 0, r3.length);
    }

    public void i(byte[] r5, int r6, int r7) {
        if (z() < r7) goto L16;
        int r02 = r7;
    L5:
        if (r02 <= 0) goto L13;
        ByteBuffer r1 = (ByteBuffer) this.f41599a.peek();
        int r2 = Math.min(r1.remaining(), r02);
        if (r5 == null) goto L9;
        r1.get(r5, r6, r2);
    L10:
        r02 = r02 - r2;
        r6 = r6 + r2;
        if (r1.remaining() != 0) goto L5;
        ByteBuffer r22 = (ByteBuffer) this.f41599a.remove();
        x(r1);
        goto L5
    L9:
        r1.position(r1.position() + r2);
        goto L10
    L13:
        this.f41601c -= r7;
        return;
    L16:
        throw new IllegalArgumentException("length");
    }

    public ByteBuffer j() {
        if (z() == 0) goto L5;
        v(z());
        return A();
    L5:
        return f41598j;
    }

    public ByteBuffer[] k() {
        ByteBuffer[] r02 = new ByteBuffer[this.f41599a.size()];
        ByteBuffer[] r03 = (ByteBuffer[]) this.f41599a.toArray(r02);
        this.f41599a.clear();
        this.f41601c = 0;
        return r03;
    }

    public char l() {
        char r1 = (char) v(1).get();
        this.f41601c--;
        return r1;
    }

    public int m() {
        int r1 = v(4).getInt();
        this.f41601c -= 4;
        return r1;
    }

    public long n() {
        long r1 = v(8).getLong();
        this.f41601c -= 8;
        return r1;
    }

    public short p() {
        short r1 = v(2).getShort();
        this.f41601c -= 2;
        return r1;
    }

    public boolean q() {
        if (z() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean r() {
        if (this.f41601c != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public o t(ByteOrder r1) {
        this.f41600b = r1;
        return this;
    }

    public String u(Charset r8) {
        if (r8 != null) goto L4;
        r8 = com.koushikdutta.async.util.b.f41648b;
    L4:
        StringBuilder r02 = new StringBuilder();
        Iterator r1 = this.f41599a.iterator();
    L6:
        if (r1.hasNext() == false) goto L13;
        ByteBuffer r2 = (ByteBuffer) r1.next();
        if (r2.isDirect() == false) goto L10;
        byte[] r3 = new byte[r2.remaining()];
        int r4 = r2.remaining();
        r2.get(r3);
        int r22 = 0;
    L11:
        r02.append(new String(r3, r22, r4, r8));
        goto L6
    L10:
        r3 = r2.array();
        int r42 = r2.arrayOffset() + r2.position();
        r4 = r2.remaining();
        r22 = r42;
        goto L11
    L13:
        return r02.toString();
    }

    public final ByteBuffer v(int r8) {
        if (z() < r8) goto L29;
        ByteBuffer r02 = (ByteBuffer) this.f41599a.peek();
    L5:
        if (r02 == null) goto L9;
        if (r02.hasRemaining() == true) goto L9;
        x((ByteBuffer) this.f41599a.remove());
        r02 = (ByteBuffer) this.f41599a.peek();
    L9:
        if (r02 != null) goto L13;
        return f41598j;
    L13:
        if (r02.remaining() >= r8) goto L15;
        ByteBuffer r03 = s(r8);
        r03.limit(r8);
        byte[] r1 = r03.array();
        int r3 = 0;
    L17:
        ByteBuffer r4 = null;
    L18:
        if (r3 >= r8) goto L22;
        r4 = (ByteBuffer) this.f41599a.remove();
        int r5 = Math.min(r8 - r3, r4.remaining());
        r4.get(r1, r3, r5);
        r3 = r3 + r5;
        if (r4.remaining() != 0) goto L18;
        x(r4);
        goto L17
    L22:
        if (r4 != null) goto L24;
    L26:
        this.f41599a.addFirst(r03);
        return r03.order(this.f41600b);
    L24:
        if (r4.remaining() <= 0) goto L26;
        this.f41599a.addFirst(r4);
        goto L26
    L15:
        return r02.order(this.f41600b);
    L29:
        throw new IllegalArgumentException("count : " + z() + RemoteSettings.FORWARD_SLASH_STRING + r8);
    }

    public String w(Charset r1) {
        String r12 = u(r1);
        y();
        return r12;
    }

    public void y() {
    L3:
        if (this.f41599a.size() <= 0) goto L5;
        x((ByteBuffer) this.f41599a.remove());
        goto L3
    L5:
        this.f41601c = 0;
    }

    public int z() {
        return this.f41601c;
    }
}
