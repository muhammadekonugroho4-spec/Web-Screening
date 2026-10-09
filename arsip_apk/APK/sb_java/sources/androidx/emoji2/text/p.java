package androidx.emoji2.text;

import android.content.res.AssetManager;
import com.gojek.ojosdk.exif.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public abstract class p {

    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f24106a;

        public a(ByteBuffer r2) {
            this.f24106a = r2;
            r2.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.p.d
        public void a(int r3) {
            ByteBuffer r02 = this.f24106a;
            r02.position(r02.position() + r3);
        }

        @Override // androidx.emoji2.text.p.d
        public int b() {
            return this.f24106a.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public long c() {
            return p.e(this.f24106a.getInt());
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.f24106a.position();
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() {
            return p.f(this.f24106a.getShort());
        }
    }

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f24107a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f24108b;

        /* renamed from: c, reason: collision with root package name */
        public final InputStream f24109c;
        public long d;

        public b(InputStream r3) {
            this.d = 0;
            this.f24109c = r3;
            byte[] r32 = new byte[4];
            this.f24107a = r32;
            ByteBuffer r33 = ByteBuffer.wrap(r32);
            this.f24108b = r33;
            r33.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.p.d
        public void a(int r6) {
        L2:
            if (r6 <= 0) goto L8;
            int r02 = (int) this.f24109c.skip(r6);
            if (r02 < 1) goto L7;
            r6 = r6 - r02;
            this.d += r02;
            goto L2
        L7:
            throw new IOException("Skip didn't move at least 1 byte forward");
        }

        @Override // androidx.emoji2.text.p.d
        public int b() {
            this.f24108b.position(0);
            d(4);
            return this.f24108b.getInt();
        }

        @Override // androidx.emoji2.text.p.d
        public long c() {
            this.f24108b.position(0);
            d(4);
            return p.e(this.f24108b.getInt());
        }

        public final void d(int r5) {
            if (this.f24109c.read(this.f24107a, 0, r5) != r5) goto L7;
            this.d += r5;
            return;
        L7:
            throw new IOException("read failed");
        }

        @Override // androidx.emoji2.text.p.d
        public long getPosition() {
            return this.d;
        }

        @Override // androidx.emoji2.text.p.d
        public int readUnsignedShort() {
            this.f24108b.position(0);
            d(2);
            return p.f(this.f24108b.getShort());
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f24110a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24111b;

        public c(long r1, long r3) {
            this.f24110a = r1;
            this.f24111b = r3;
        }

        public long a() {
            return this.f24111b;
        }

        public long b() {
            return this.f24110a;
        }
    }

    public interface d {
        void a(int r1);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static c a(d r12) {
        r12.a(4);
        int r1 = r12.readUnsignedShort();
        if (r1 > 100) goto L28;
        r12.a(6);
        int r2 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r1) goto L11;
        int r7 = r12.b();
        r12.a(4);
        long r8 = r12.c();
        r12.a(4);
        if (1835365473 == r7) goto L13;
        r4 = r4 + 1;
    L13:
        if (r8 == (-1)) goto L26;
        r12.a((int) (r8 - r12.getPosition()));
        r12.a(12);
        long r02 = r12.c();
    L16:
        if (r2 >= r02) goto L26;
        int r42 = r12.b();
        long r5 = r12.c();
        long r10 = r12.c();
        if (1164798569 == r42) goto L24;
        if (1701669481 == r42) goto L24;
        r2 = r2 + 1;
    L24:
        return new c(r5 + r8, r10);
    L26:
        throw new IOException("Cannot read metadata.");
    L11:
        r8 = -1;
        goto L13
    L28:
        throw new IOException("Cannot read metadata.");
    }

    public static androidx.emoji2.text.flatbuffer.b b(AssetManager r02, String r1) {
        InputStream r03 = r02.open(r1);
        androidx.emoji2.text.flatbuffer.b r12 = c(r03);     // Catch: Throwable -> L7
        if (r03 == null) goto L6;
        r03.close();
    L6:
        return r12;
    L7:
        th = move-exception;
        if (r03 != null) goto L14;
    L13:
        throw th;
    L14:
        r03.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public static androidx.emoji2.text.flatbuffer.b c(InputStream r6) {
        b r02 = new b(r6);
        c r1 = a(r02);
        r02.a((int) (r1.b() - r02.getPosition()));
        ByteBuffer r03 = ByteBuffer.allocate((int) r1.a());
        int r62 = r6.read(r03.array());
        if (r62 != r1.a()) goto L7;
        return androidx.emoji2.text.flatbuffer.b.h(r03);
    L7:
        throw new IOException("Needed " + r1.a() + " bytes, got " + r62);
    }

    public static androidx.emoji2.text.flatbuffer.b d(ByteBuffer r2) {
        ByteBuffer r22 = r2.duplicate();
        r22.position((int) a(new a(r22)).b());
        return androidx.emoji2.text.flatbuffer.b.h(r22);
    }

    public static long e(int r4) {
        return r4 & 4294967295L;
    }

    public static int f(short r1) {
        return r1 & ExifInterface.ColorSpace.UNCALIBRATED;
    }
}
