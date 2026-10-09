package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.gojek.ojosdk.exif.ExifInterface;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f24156A = null;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f24157B = null;

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f24158C = null;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f24159D = null;

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f24160E = null;

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f24161F = null;

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f24162G = null;

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f24163H = null;

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f24164I = null;

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f24165J = null;

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f24166K = null;

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f24167L = null;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f24168M = null;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f24169N = null;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f24170O = null;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f24171P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f24172Q = null;

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f24173R = null;

    /* renamed from: S, reason: collision with root package name */
    public static final byte[] f24174S = null;

    /* renamed from: T, reason: collision with root package name */
    public static final byte[] f24175T = null;

    /* renamed from: U, reason: collision with root package name */
    public static final byte[] f24176U = null;

    /* renamed from: V, reason: collision with root package name */
    public static final SimpleDateFormat f24177V = null;

    /* renamed from: W, reason: collision with root package name */
    public static final SimpleDateFormat f24178W = null;

    /* renamed from: X, reason: collision with root package name */
    public static final String[] f24179X = null;

    /* renamed from: Y, reason: collision with root package name */
    public static final int[] f24180Y = null;

    /* renamed from: Z, reason: collision with root package name */
    public static final byte[] f24181Z = null;

    /* renamed from: a0, reason: collision with root package name */
    public static final e[] f24182a0 = null;

    /* renamed from: b0, reason: collision with root package name */
    public static final e[] f24183b0 = null;

    /* renamed from: c0, reason: collision with root package name */
    public static final e[] f24184c0 = null;

    /* renamed from: d0, reason: collision with root package name */
    public static final e[] f24185d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    public static final e[] f24186e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    public static final e f24187f0 = null;

    /* renamed from: g0, reason: collision with root package name */
    public static final e[] f24188g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    public static final e[] f24189h0 = null;

    /* renamed from: i0, reason: collision with root package name */
    public static final e[] f24190i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public static final e[] f24191j0 = null;

    /* renamed from: k0, reason: collision with root package name */
    public static final e[][] f24192k0 = null;

    /* renamed from: l0, reason: collision with root package name */
    public static final e[] f24193l0 = null;

    /* renamed from: m0, reason: collision with root package name */
    public static final HashMap[] f24194m0 = null;

    /* renamed from: n0, reason: collision with root package name */
    public static final HashMap[] f24195n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    public static final Set f24196o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    public static final HashMap f24197p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    public static final Charset f24198q0 = null;

    /* renamed from: r0, reason: collision with root package name */
    public static final byte[] f24199r0 = null;

    /* renamed from: s0, reason: collision with root package name */
    public static final byte[] f24200s0 = null;

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f24201t0 = null;

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f24202u0 = null;

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f24203v0 = null;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f24204w = false;

    /* renamed from: w0, reason: collision with root package name */
    public static final Pattern f24205w0 = null;

    /* renamed from: x, reason: collision with root package name */
    public static final List f24206x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final List f24207y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f24208z = null;

    /* renamed from: a, reason: collision with root package name */
    public String f24209a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f24210b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f24211c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24212e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap[] f24213f;

    /* renamed from: g, reason: collision with root package name */
    public Set f24214g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f24215h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24216i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24217j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24218k;

    /* renamed from: l, reason: collision with root package name */
    public int f24219l;

    /* renamed from: m, reason: collision with root package name */
    public int f24220m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f24221n;

    /* renamed from: o, reason: collision with root package name */
    public int f24222o;

    /* renamed from: p, reason: collision with root package name */
    public int f24223p;

    /* renamed from: q, reason: collision with root package name */
    public int f24224q;

    /* renamed from: r, reason: collision with root package name */
    public int f24225r;

    /* renamed from: s, reason: collision with root package name */
    public int f24226s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24227t;

    /* renamed from: u, reason: collision with root package name */
    public d f24228u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24229v;

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    public class C0197a extends MediaDataSource implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public long f24230a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f24231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f24232c;

        public C0197a(a r1, g r2) {
            this.f24232c = r1;
            this.f24231b = r2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long r7, byte[] r9, int r10, int r11) {
            if (r11 != 0) goto L6;
            return 0;
        L6:
            if (r7 >= 0) goto L26;
            return -1;
        L26:
            long r4 = this.f24230a;     // Catch: IOException -> L25
            if (r4 == r7) goto L17;
            if (r4 >= 0) goto L13;
        L15:
            this.f24231b.t(r7);     // Catch: IOException -> L25
            this.f24230a = r7;     // Catch: IOException -> L25
            goto L17
        L13:
            if (r7 < (r4 + this.f24231b.available())) goto L15;
            return -1;
        L17:
            if (r11 <= this.f24231b.available()) goto L19;
            r11 = this.f24231b.available();     // Catch: IOException -> L25
        L19:
            int r72 = this.f24231b.read(r9, r10, r11);     // Catch: IOException -> L25
            if (r72 < 0) goto L23;
            this.f24230a += r72;
            return r72;
        L23:
            this.f24230a = -1;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f24233a;

        /* renamed from: b, reason: collision with root package name */
        public int f24234b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f24235c;
        public byte[] d;

        /* renamed from: e, reason: collision with root package name */
        public int f24236e;

        public b(byte[] r3) {
            this(new ByteArrayInputStream(r3), ByteOrder.BIG_ENDIAN);
            this.f24236e = r3.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f24233a.available();
        }

        public int c() {
            return this.f24236e;
        }

        public int f() {
            return this.f24234b;
        }

        public byte[] i() {
            byte[] r02 = new byte[1024];
            int r1 = 0;
        L4:
            if (r1 != r02.length) goto L6;
            r02 = Arrays.copyOf(r02, r02.length * 2);
        L6:
            int r2 = this.f24233a.read(r02, r1, r02.length - r1);
            if (r2 == (-1)) goto L10;
            r1 = r1 + r2;
            this.f24234b += r2;
            goto L4
        L10:
            return Arrays.copyOf(r02, r1);
        }

        public long k() {
            return readInt() & 4294967295L;
        }

        public void l(ByteOrder r1) {
            this.f24235c = r1;
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void n(int r7) {
            int r1 = 0;
        L3:
            if (r1 >= r7) goto L15;
            int r3 = r7 - r1;
            int r2 = (int) this.f24233a.skip(r3);
            if (r2 > 0) goto L14;
            if (this.d != null) goto L9;
            this.d = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        L9:
            r2 = this.f24233a.read(this.d, 0, Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, r3));
            if (r2 != (-1)) goto L14;
            throw new EOFException("Reached EOF while skipping " + r7 + " bytes.");
        L14:
            r1 = r1 + r2;
            goto L3
        L15:
            this.f24234b += r1;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f24234b++;
            return this.f24233a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f24234b++;
            return this.f24233a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f24234b++;
            int r02 = this.f24233a.read();
            if (r02 < 0) goto L7;
            return (byte) r02;
        L7:
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f24234b += 2;
            return this.f24233a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r2, int r3, int r4) {
            this.f24234b += r4;
            this.f24233a.readFully(r2, r3, r4);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f24234b += 4;
            int r02 = this.f24233a.read();
            int r1 = this.f24233a.read();
            int r2 = this.f24233a.read();
            int r3 = this.f24233a.read();
            if ((((r02 | r1) | r2) | r3) < 0) goto L15;
            ByteOrder r4 = this.f24235c;
            if (r4 != ByteOrder.LITTLE_ENDIAN) goto L9;
            return (((r3 << 24) + (r2 << 16)) + (r1 << 8)) + r02;
        L9:
            if (r4 != ByteOrder.BIG_ENDIAN) goto L13;
            return (((r02 << 24) + (r1 << 16)) + (r2 << 8)) + r3;
        L13:
            throw new IOException("Invalid byte order: " + this.f24235c);
        L15:
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f24234b += 8;
            int r1 = this.f24233a.read();
            int r3 = this.f24233a.read();
            int r4 = this.f24233a.read();
            int r5 = this.f24233a.read();
            int r6 = this.f24233a.read();
            int r7 = this.f24233a.read();
            int r8 = this.f24233a.read();
            int r9 = this.f24233a.read();
            if ((((((((r1 | r3) | r4) | r5) | r6) | r7) | r8) | r9) < 0) goto L15;
            ByteOrder r10 = this.f24235c;
            if (r10 != ByteOrder.LITTLE_ENDIAN) goto L9;
            return (((((((r9 << 56) + (r8 << 48)) + (r7 << 40)) + (r6 << 32)) + (r5 << 24)) + (r4 << 16)) + (r3 << 8)) + r1;
        L9:
            if (r10 != ByteOrder.BIG_ENDIAN) goto L13;
            return (((((((r1 << 56) + (r3 << 48)) + (r4 << 40)) + (r5 << 32)) + (r6 << 24)) + (r7 << 16)) + (r8 << 8)) + r9;
        L13:
            throw new IOException("Invalid byte order: " + this.f24235c);
        L15:
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f24234b += 2;
            int r02 = this.f24233a.read();
            int r1 = this.f24233a.read();
            if ((r02 | r1) < 0) goto L15;
            ByteOrder r2 = this.f24235c;
            if (r2 != ByteOrder.LITTLE_ENDIAN) goto L9;
            return (short) ((r1 << 8) + r02);
        L9:
            if (r2 != ByteOrder.BIG_ENDIAN) goto L13;
            return (short) ((r02 << 8) + r1);
        L13:
            throw new IOException("Invalid byte order: " + this.f24235c);
        L15:
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f24234b += 2;
            return this.f24233a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f24234b++;
            return this.f24233a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f24234b += 2;
            int r02 = this.f24233a.read();
            int r1 = this.f24233a.read();
            if ((r02 | r1) < 0) goto L15;
            ByteOrder r2 = this.f24235c;
            if (r2 != ByteOrder.LITTLE_ENDIAN) goto L9;
            return (r1 << 8) + r02;
        L9:
            if (r2 != ByteOrder.BIG_ENDIAN) goto L13;
            return (r02 << 8) + r1;
        L13:
            throw new IOException("Invalid byte order: " + this.f24235c);
        L15:
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int r2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream r2) {
            this(r2, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
            int r22 = this.f24233a.read(r2, r3, r4);
            this.f24234b += r22;
            return r22;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3) {
            this.f24234b += r3.length;
            this.f24233a.readFully(r3);
        }

        public b(InputStream r3, ByteOrder r4) {
            DataInputStream r02 = new DataInputStream(r3);
            this.f24233a = r02;
            r02.mark(0);
            this.f24234b = 0;
            this.f24235c = r4;
            if ((r3 instanceof b) == false) goto L5;
            int r32 = ((b) r3).c();
        L6:
            this.f24236e = r32;
            return;
        L5:
            r32 = -1;
            goto L6
        }
    }

    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final DataOutputStream f24237a;

        /* renamed from: b, reason: collision with root package name */
        public ByteOrder f24238b;

        public c(OutputStream r2, ByteOrder r3) {
            super(r2);
            this.f24237a = new DataOutputStream(r2);
            this.f24238b = r3;
        }

        public void c(ByteOrder r1) {
            this.f24238b = r1;
        }

        public void f(int r2) {
            this.f24237a.write(r2);
        }

        public void i(int r3) {
            ByteOrder r02 = this.f24238b;
            if (r02 != ByteOrder.LITTLE_ENDIAN) goto L7;
            this.f24237a.write(r3 & Constants.MAX_HOST_LENGTH);
            this.f24237a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write((r3 >>> 16) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write((r3 >>> 24) & Constants.MAX_HOST_LENGTH);
            return;
        L7:
            if (r02 != ByteOrder.BIG_ENDIAN) goto L10;
            this.f24237a.write((r3 >>> 24) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write((r3 >>> 16) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write(r3 & Constants.MAX_HOST_LENGTH);
            return;
        }

        public void k(short r3) {
            ByteOrder r02 = this.f24238b;
            if (r02 != ByteOrder.LITTLE_ENDIAN) goto L7;
            this.f24237a.write(r3 & 255);
            this.f24237a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
            return;
        L7:
            if (r02 != ByteOrder.BIG_ENDIAN) goto L10;
            this.f24237a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
            this.f24237a.write(r3 & 255);
            return;
        }

        public void l(long r3) {
            if (r3 > 4294967295L) goto L7;
            i((int) r3);
            return;
        L7:
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }

        public void n(int r2) {
            if (r2 > 65535) goto L7;
            k((short) r2);
            return;
        L7:
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2) {
            this.f24237a.write(r2);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
            this.f24237a.write(r2, r3, r4);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f24239a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24240b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24241c;
        public final byte[] d;

        public d(int r7, int r8, byte[] r9) {
            this(r7, r8, -1, r9);
        }

        public static d a(String r5) {
            if (r5.length() == 1) goto L5;
        L10:
            byte[] r52 = r5.getBytes(a.b());
            return new d(1, r52.length, r52);
        L5:
            if (r5.charAt(0) < '0') goto L10;
            if (r5.charAt(0) > '1') goto L10;
            return new d(1, 1, new byte[]{(byte) (r5.charAt(0) - '0')});
        }

        public static d b(double[] r5, ByteOrder r6) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[12] * r5.length]);
            r02.order(r6);
            int r62 = r5.length;
            int r2 = 0;
        L3:
            if (r2 >= r62) goto L6;
            r02.putDouble(r5[r2]);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(12, r5.length, r02.array());
        }

        public static d c(int[] r4, ByteOrder r5) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[9] * r4.length]);
            r02.order(r5);
            int r52 = r4.length;
            int r2 = 0;
        L3:
            if (r2 >= r52) goto L6;
            r02.putInt(r4[r2]);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(9, r4.length, r02.array());
        }

        public static d d(f[] r6, ByteOrder r7) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[10] * r6.length]);
            r02.order(r7);
            int r72 = r6.length;
            int r2 = 0;
        L3:
            if (r2 >= r72) goto L6;
            f r3 = r6[r2];
            r02.putInt((int) r3.f24245a);
            r02.putInt((int) r3.f24246b);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(10, r6.length, r02.array());
        }

        public static d e(String r3) {
            byte[] r32 = (r3 + 0).getBytes(a.b());
            return new d(2, r32.length, r32);
        }

        public static d f(long r2, ByteOrder r4) {
            return g(new long[]{r2}, r4);
        }

        public static d g(long[] r5, ByteOrder r6) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[4] * r5.length]);
            r02.order(r6);
            int r62 = r5.length;
            int r2 = 0;
        L3:
            if (r2 >= r62) goto L6;
            r02.putInt((int) r5[r2]);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(4, r5.length, r02.array());
        }

        public static d h(f r02, ByteOrder r1) {
            return i(new f[]{r02}, r1);
        }

        public static d i(f[] r6, ByteOrder r7) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[5] * r6.length]);
            r02.order(r7);
            int r72 = r6.length;
            int r2 = 0;
        L3:
            if (r2 >= r72) goto L6;
            f r3 = r6[r2];
            r02.putInt((int) r3.f24245a);
            r02.putInt((int) r3.f24246b);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(5, r6.length, r02.array());
        }

        public static d j(int r02, ByteOrder r1) {
            return k(new int[]{r02}, r1);
        }

        public static d k(int[] r4, ByteOrder r5) {
            ByteBuffer r02 = ByteBuffer.wrap(new byte[a.a()[3] * r4.length]);
            r02.order(r5);
            int r52 = r4.length;
            int r2 = 0;
        L3:
            if (r2 >= r52) goto L6;
            r02.putShort((short) r4[r2]);
            r2 = r2 + 1;
            goto L3
        L6:
            return new d(3, r4.length, r02.array());
        }

        public double l(ByteOrder r5) {
            Object r52 = o(r5);
            if (r52 == null) goto L43;
            if ((r52 instanceof String) == false) goto L9;
            return Double.parseDouble((String) r52);
        L9:
            if ((r52 instanceof long[]) == false) goto L17;
            if (((long[]) r52).length != 1) goto L15;
            return r5[0];
        L15:
            throw new NumberFormatException("There are more than one component");
        L17:
            if ((r52 instanceof int[]) == false) goto L25;
            if (((int[]) r52).length != 1) goto L23;
            return r5[0];
        L23:
            throw new NumberFormatException("There are more than one component");
        L25:
            if ((r52 instanceof double[]) == false) goto L33;
            double[] r53 = (double[]) r52;
            if (r53.length != 1) goto L31;
            return r53[0];
        L31:
            throw new NumberFormatException("There are more than one component");
        L33:
            if ((r52 instanceof f[]) == false) goto L41;
            f[] r54 = (f[]) r52;
            if (r54.length != 1) goto L39;
            return r54[0].a();
        L39:
            throw new NumberFormatException("There are more than one component");
        L41:
            throw new NumberFormatException("Couldn't find a double value");
        L43:
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder r5) {
            Object r52 = o(r5);
            if (r52 == null) goto L27;
            if ((r52 instanceof String) == false) goto L9;
            return Integer.parseInt((String) r52);
        L9:
            if ((r52 instanceof long[]) == false) goto L17;
            long[] r53 = (long[]) r52;
            if (r53.length != 1) goto L15;
            return (int) r53[0];
        L15:
            throw new NumberFormatException("There are more than one component");
        L17:
            if ((r52 instanceof int[]) == false) goto L25;
            int[] r54 = (int[]) r52;
            if (r54.length != 1) goto L23;
            return r54[0];
        L23:
            throw new NumberFormatException("There are more than one component");
        L25:
            throw new NumberFormatException("Couldn't find a integer value");
        L27:
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder r8) {
            Object r82 = o(r8);
            if (r82 != null) goto L6;
            return null;
        L6:
            if ((r82 instanceof String) == true) goto L8;
            StringBuilder r1 = new StringBuilder();
            int r4 = 0;
            if ((r82 instanceof long[]) == false) goto L20;
            long[] r83 = (long[]) r82;
        L13:
            if (r4 >= r83.length) goto L18;
            r1.append(r83[r4]);
            r4 = r4 + 1;
            if (r4 == r83.length) goto L13;
            r1.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            goto L13
        L18:
            return r1.toString();
        L20:
            if ((r82 instanceof int[]) == false) goto L30;
            int[] r84 = (int[]) r82;
        L23:
            if (r4 >= r84.length) goto L28;
            r1.append(r84[r4]);
            r4 = r4 + 1;
            if (r4 == r84.length) goto L23;
            r1.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            goto L23
        L28:
            return r1.toString();
        L30:
            if ((r82 instanceof double[]) == false) goto L40;
            double[] r85 = (double[]) r82;
        L33:
            if (r4 >= r85.length) goto L38;
            r1.append(r85[r4]);
            r4 = r4 + 1;
            if (r4 == r85.length) goto L33;
            r1.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            goto L33
        L38:
            return r1.toString();
        L40:
            if ((r82 instanceof f[]) == false) goto L49;
            f[] r86 = (f[]) r82;
        L43:
            if (r4 >= r86.length) goto L48;
            r1.append(r86[r4].f24245a);
            r1.append('/');
            r1.append(r86[r4].f24246b);
            r4 = r4 + 1;
            if (r4 == r86.length) goto L43;
            r1.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            goto L43
        L48:
            return r1.toString();
        L49:
            return null;
        L8:
            return (String) r82;
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0032: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0031 */
        public Object o(ByteOrder r14) {
            int r02 = 0;
            InputStream r4 = null;
            b r5 = new b(this.d);     // Catch: Throwable -> L139 IOException -> L141
            r5.l(r14);     // Catch: Throwable -> L16 IOException -> L18
            switch(this.f24239a) {
                case 1: goto L122;
                case 2: goto L96;
                case 3: goto L85;
                case 4: goto L75;
                case 5: goto L65;
                case 6: goto L122;
                case 7: goto L96;
                case 8: goto L55;
                case 9: goto L45;
                case 10: goto L35;
                case 11: goto L25;
                case 12: goto L11;
                default: goto L156;
            };
        L11:
            double[] r142 = new double[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L13:
            if (r02 >= this.f24240b) goto L180;
            r142[r02] = r5.readDouble();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L13
        L180:
            r5.close();     // Catch: IOException -> L22
            return r142;
        L22:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r142;
        L25:
            double[] r143 = new double[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L27:
            if (r02 >= this.f24240b) goto L158;
            r143[r02] = r5.readFloat();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L27
        L158:
            r5.close();     // Catch: IOException -> L32
            return r143;
        L32:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r143;
        L35:
            f[] r144 = new f[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L37:
            if (r02 >= this.f24240b) goto L184;
            r144[r02] = new f(r5.readInt(), r5.readInt(), null);     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L37
        L184:
            r5.close();     // Catch: IOException -> L42
            return r144;
        L42:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r144;
        L45:
            int[] r145 = new int[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L47:
            if (r02 >= this.f24240b) goto L164;
            r145[r02] = r5.readInt();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L47
        L164:
            r5.close();     // Catch: IOException -> L52
            return r145;
        L52:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r145;
        L55:
            int[] r146 = new int[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L57:
            if (r02 >= this.f24240b) goto L169;
            r146[r02] = r5.readShort();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L57
        L169:
            r5.close();     // Catch: IOException -> L62
            return r146;
        L62:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r146;
        L65:
            f[] r147 = new f[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L67:
            if (r02 >= this.f24240b) goto L167;
            r147[r02] = new f(r5.k(), r5.k(), null);     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L67
        L167:
            r5.close();     // Catch: IOException -> L72
            return r147;
        L72:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r147;
        L75:
            long[] r148 = new long[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L77:
            if (r02 >= this.f24240b) goto L174;
            r148[r02] = r5.k();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L77
        L174:
            r5.close();     // Catch: IOException -> L82
            return r148;
        L82:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r148;
        L85:
            int[] r149 = new int[this.f24240b];     // Catch: Throwable -> L16 IOException -> L18
        L87:
            if (r02 >= this.f24240b) goto L178;
            r149[r02] = r5.readUnsignedShort();     // Catch: Throwable -> L16 IOException -> L18
            r02 = r02 + 1;
            goto L87
        L178:
            r5.close();     // Catch: IOException -> L92
            return r149;
        L92:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r149;
        L122:
            byte[] r1410 = this.d;     // Catch: Throwable -> L16 IOException -> L18
            if (r1410.length != 1) goto L133;
            byte r6 = r1410[0];     // Catch: Throwable -> L16 IOException -> L18
            if (r6 < 0) goto L133;
            if (r6 > 1) goto L133;
            String r1411 = new String(new char[]{(char) (r6 + 48)});     // Catch: Throwable -> L16 IOException -> L18
            r5.close();     // Catch: IOException -> L130
            return r1411;
        L130:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r1411;
        L133:
            String r1 = new String(r1410, a.b());     // Catch: Throwable -> L16 IOException -> L18
            r5.close();     // Catch: IOException -> L136
            return r1;
        L136:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r1;
        L156:
            r5.close();     // Catch: IOException -> L8
            return null;
        L8:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return null;
        L96:
            if (this.f24240b < a.d().length) goto L105;
            int r1412 = 0;
        L99:
            if (r1412 >= a.d().length) goto L104;
            if (this.d[r1412] != a.d()[r1412]) goto L105;
            r1412 = r1412 + 1;     // Catch: Throwable -> L16 IOException -> L18
            goto L99
        L104:
            r02 = a.d().length;     // Catch: Throwable -> L16 IOException -> L18
        L105:
            StringBuilder r1413 = new StringBuilder();     // Catch: Throwable -> L16 IOException -> L18
        L107:
            if (r02 >= this.f24240b) goto L116;
            byte r62 = this.d[r02];     // Catch: Throwable -> L16 IOException -> L18
            if (r62 == 0) goto L116;
            if (r62 < 32) goto L114;
            r1413.append((char) r62);     // Catch: Throwable -> L16 IOException -> L18
        L115:
            r02 = r02 + 1;     // Catch: Throwable -> L16 IOException -> L18
            goto L107
        L114:
            r1413.append('?');     // Catch: Throwable -> L16 IOException -> L18
        L116:
            String r1414 = r1413.toString();     // Catch: Throwable -> L16 IOException -> L18
            r5.close();     // Catch: IOException -> L119
            return r1414;
        L119:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            return r1414;
        L18:
            e = move-exception;
            IOException r1415 = e;
        L143:
            Log.w("ExifInterface", "IOException occurred during reading a value", r1415);     // Catch: Throwable -> L16
            if (r5 != null) goto L182;
        L149:
            return null;
        L182:
            r5.close();     // Catch: IOException -> L147
        L147:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            goto L149
        L16:
            th = move-exception;
            Throwable r1416 = th;
            r4 = r5;
        L150:
            if (r4 == null) goto L193;
            r4.close();     // Catch: IOException -> L153
            throw r1416;
        L153:
            e = move-exception;
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
            throw r1416;
        L193:
            throw r1416;
        L141:
            e = move-exception;
            r1415 = e;
            r5 = null;
        L139:
            th = move-exception;
            r1416 = th;
            goto L150
        }

        public int p() {
            return a.a()[this.f24239a] * this.f24240b;
        }

        public String toString() {
            return "(" + a.c()[this.f24239a] + ", data length:" + this.d.length + ")";
        }

        public d(int r1, int r2, long r3, byte[] r5) {
            this.f24239a = r1;
            this.f24240b = r2;
            this.f24241c = r3;
            this.d = r5;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f24242a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24243b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24244c;
        public final int d;

        public e(String r1, int r2, int r3) {
            this.f24243b = r1;
            this.f24242a = r2;
            this.f24244c = r3;
            this.d = -1;
        }

        public boolean a(int r5) {
            int r02 = this.f24244c;
            if (r02 == 7) goto L30;
            if (r5 == 7) goto L30;
            if (r02 == r5) goto L30;
            int r2 = this.d;
            if (r2 == r5) goto L30;
            if (r02 == 4) goto L14;
            if (r2 == 4) goto L14;
        L17:
            if (r02 == 9) goto L20;
            if (r2 == 9) goto L20;
        L23:
            if (r02 == 12) goto L26;
            if (r2 == 12) goto L26;
            return false;
        L26:
            if (r5 != 11) goto L31;
            return true;
        L31:
            return false;
        L20:
            if (r5 != 8) goto L23;
            return true;
        L14:
            if (r5 != 3) goto L17;
            return true;
        L30:
            return true;
        }

        public e(String r1, int r2, int r3, int r4) {
            this.f24243b = r1;
            this.f24242a = r2;
            this.f24244c = r3;
            this.d = r4;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f24245a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24246b;

        public /* synthetic */ f(long r1, long r3, C0197a r5) {
            this(r1, r3);
        }

        public static f b(double r23) {
            long r3 = 1;
            if (r23 >= 9.223372036854776E18d) goto L17;
            if (r23 <= (-9.223372036854776E18d)) goto L17;
            double r5 = Math.abs(r23);
            long r9 = 0;
            long r11 = 1;
            double r15 = r5;
            long r13 = 0;
        L8:
            double r19 = r15 % 1.0d;
            long r02 = (long) (r15 - r19);
            long r132 = r13 + (r02 * r3);
            long r03 = (r02 * r9) + r11;
            r15 = 1.0d / r19;
            long r17 = r3;
            if (Math.abs(r5 - (r132 / r03)) <= (1.0E-8d * r5)) goto L11;
            r11 = r9;
            r3 = r132;
            r13 = r17;
            r9 = r03;
            goto L8
        L11:
            if (r23 >= 0.0d) goto L14;
            r132 = -r132;
        L14:
            return new f(r132, r03);
        L17:
            if (r23 <= 0.0d) goto L19;
            long r1 = Long.MAX_VALUE;
        L21:
            return new f(r1, 1);
        L19:
            r1 = Long.MIN_VALUE;
            goto L21
        }

        public double a() {
            return this.f24245a / this.f24246b;
        }

        public String toString() {
            return this.f24245a + RemoteSettings.FORWARD_SLASH_STRING + this.f24246b;
        }

        public f(long r4, long r6) {
            if (r6 != 0) goto L6;
            this.f24245a = 0;
            this.f24246b = 1;
            return;
        L6:
            this.f24245a = r4;
            this.f24246b = r6;
        }
    }

    public static class g extends b {
        public g(byte[] r2) {
            super(r2);
            this.f24233a.mark(Integer.MAX_VALUE);
        }

        public void t(long r4) {
            int r02 = this.f24234b;
            if (r02 <= r4) goto L5;
            this.f24234b = 0;
            this.f24233a.reset();
        L6:
            n((int) r4);
            return;
        L5:
            r4 = r4 - r02;
            goto L6
        }

        public g(InputStream r2) {
            super(r2);
            if (r2.markSupported() == false) goto L7;
            this.f24233a.mark(Integer.MAX_VALUE);
            return;
        L7:
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static {
        f24204w = Log.isLoggable("ExifInterface", 3);
        f24206x = Arrays.asList(new Integer[]{1, 6, 3, 8});
        f24207y = Arrays.asList(new Integer[]{2, 7, 4, 5});
        f24208z = new int[]{8, 8, 8};
        f24156A = new int[]{4};
        f24157B = new int[]{8};
        f24158C = new byte[]{-1, -40, -1};
        f24159D = new byte[]{102, 116, 121, 112};
        f24160E = new byte[]{109, 105, 102, 49};
        f24161F = new byte[]{104, 101, 105, 99};
        f24162G = new byte[]{97, 118, 105, 102};
        f24163H = new byte[]{97, 118, 105, 115};
        f24164I = new byte[]{79, 76, 89, 77, 80, 0};
        f24165J = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f24166K = new byte[]{-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
        f24167L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f24168M = new byte[]{82, 73, 70, 70};
        f24169N = new byte[]{87, 69, 66, 80};
        f24170O = new byte[]{69, 88, 73, 70};
        f24171P = new byte[]{-99, 1, 42};
        f24172Q = "VP8X".getBytes(Charset.defaultCharset());
        f24173R = "VP8L".getBytes(Charset.defaultCharset());
        f24174S = "VP8 ".getBytes(Charset.defaultCharset());
        f24175T = "ANIM".getBytes(Charset.defaultCharset());
        f24176U = "ANMF".getBytes(Charset.defaultCharset());
        f24179X = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f24180Y = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f24181Z = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        e[] r67 = {new e("NewSubfileType", 254, 4), new e("SubfileType", Constants.MAX_HOST_LENGTH, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", Constants.FROZEN_FRAME_TIME, 1)};
        f24182a0 = r67;
        e[] r68 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f24183b0 = r68;
        e[] r69 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f24184c0 = r69;
        e[] r70 = {new e("InteroperabilityIndex", 1, 2)};
        f24185d0 = r70;
        e[] r71 = {new e("NewSubfileType", 254, 4), new e("SubfileType", Constants.MAX_HOST_LENGTH, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f24186e0 = r71;
        f24187f0 = new e("StripOffsets", 273, 3);
        e[] r73 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f24188g0 = r73;
        e[] r74 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f24189h0 = r74;
        e[] r75 = {new e("AspectFrame", 4371, 3)};
        f24190i0 = r75;
        e[] r76 = {new e("ColorSpace", 55, 3)};
        f24191j0 = r76;
        e[][] r1 = {r67, r68, r69, r70, r71, r67, r73, r74, r75, r76};
        f24192k0 = r1;
        f24193l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f24194m0 = new HashMap[r1.length];
        f24195n0 = new HashMap[r1.length];
        f24196o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance"})));
        f24197p0 = new HashMap();
        Charset r02 = Charset.forName("US-ASCII");
        f24198q0 = r02;
        f24199r0 = "Exif\u0000\u0000".getBytes(r02);
        f24200s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(r02);
        Locale r12 = Locale.US;
        SimpleDateFormat r03 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", r12);
        f24177V = r03;
        r03.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat r04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", r12);
        f24178W = r04;
        r04.setTimeZone(TimeZone.getTimeZone("UTC"));
        int r122 = 0;
    L3:
        e[][] r05 = f24192k0;
        if (r122 >= r05.length) goto L9;
        f24194m0[r122] = new HashMap();
        f24195n0[r122] = new HashMap();
        e[] r06 = r05[r122];
        int r13 = r06.length;
        int r4 = 0;
    L6:
        if (r4 >= r13) goto L8;
        e r5 = r06[r4];
        f24194m0[r122].put(Integer.valueOf(r5.f24242a), r5);
        f24195n0[r122].put(r5.f24243b, r5);
        r4 = r4 + 1;
        goto L6
    L8:
        r122 = r122 + 1;
        goto L3
    L9:
        HashMap r07 = f24197p0;
        e[] r14 = f24193l0;
        r07.put(Integer.valueOf(r14[0].f24242a), 5);
        r07.put(Integer.valueOf(r14[1].f24242a), 1);
        r07.put(Integer.valueOf(r14[2].f24242a), 2);
        r07.put(Integer.valueOf(r14[3].f24242a), 3);
        r07.put(Integer.valueOf(r14[4].f24242a), 7);
        r07.put(Integer.valueOf(r14[5].f24242a), 8);
        f24201t0 = Pattern.compile(".*[1-9].*");
        f24202u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        f24203v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        f24205w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public a(String r3) {
        e[][] r02 = f24192k0;
        this.f24213f = new HashMap[r02.length];
        this.f24214g = new HashSet(r02.length);
        this.f24215h = ByteOrder.BIG_ENDIAN;
        if (r3 == null) goto L7;
        G(r3);
        return;
    L7:
        throw new NullPointerException("filename cannot be null");
    }

    public static int C(int r1) {
        if (r1 != 4) goto L5;
        return 3;
    L5:
        if (r1 != 9) goto L7;
        return 2;
    L7:
        if (r1 != 15) goto L9;
        return 2;
    L9:
        if (r1 != 12) goto L11;
        return 2;
    L11:
        if (r1 == 13) goto L20;
        return 1;
    L20:
        return 2;
    }

    public static Pair D(String r10) {
        int r3 = 1;
        if (r10.contains(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA) == false) goto L35;
        String[] r102 = r10.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        Pair r02 = D(r102[0]);
        if (((Integer) r02.first).intValue() != 2) goto L8;
        return r02;
    L8:
        if (r3 >= r102.length) goto L33;
        Pair r1 = D(r102[r3]);
        if (((Integer) r1.first).equals(r02.first) == false) goto L12;
    L15:
        int r2 = ((Integer) r02.first).intValue();
    L17:
        if (((Integer) r02.second).intValue() != (-1)) goto L19;
    L23:
        int r12 = -1;
    L24:
        if (r2 != (-1)) goto L28;
        if (r12 != (-1)) goto L28;
        return new Pair(2, -1);
    L28:
        if (r2 != (-1)) goto L30;
        r02 = new Pair(Integer.valueOf(r12), -1);
    L32:
        r3 = r3 + 1;
        goto L8
    L30:
        if (r12 != (-1)) goto L32;
        r02 = new Pair(Integer.valueOf(r2), -1);
        goto L32
    L19:
        if (((Integer) r1.first).equals(r02.second) == false) goto L21;
    L22:
        r12 = ((Integer) r02.second).intValue();
        goto L24
    L21:
        if (((Integer) r1.second).equals(r02.second) == false) goto L23;
    L12:
        if (((Integer) r1.second).equals(r02.first) == true) goto L15;
        r2 = -1;
        goto L17
    L33:
        return r02;
    L35:
        if (r10.contains(RemoteSettings.FORWARD_SLASH_STRING) == false) goto L73;
        String[] r103 = r10.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (r103.length != 2) goto L55;
        long r03 = (long) Double.parseDouble(r103[0]);     // Catch: NumberFormatException -> L71
        long r22 = (long) Double.parseDouble(r103[1]);     // Catch: NumberFormatException -> L71
        if (r03 < 0) goto L53;
        if (r22 < 0) goto L53;
        if (r03 > 2147483647L) goto L51;
        if (r22 > 2147483647L) goto L51;
        return new Pair(10, 5);
    L51:
        return new Pair(5, -1);
    L53:
        return new Pair(10, -1);
    L55:
        return new Pair(2, -1);
    L73:
        long r04 = Long.parseLong(r10);     // Catch: NumberFormatException -> L67
        if (r04 >= 0) goto L59;
    L62:
        if (r04 >= 0) goto L66;
        return new Pair(9, -1);
    L66:
        return new Pair(4, -1);
    L59:
        if (r04 > 65535) goto L62;
        return new Pair(3, 4);
    L67:
        Double.parseDouble(r10);     // Catch: NumberFormatException -> L69
        return new Pair(12, -1);
    L70:
        return new Pair(2, -1);
    }

    public static boolean J(byte[] r4) {
        int r1 = 0;
    L3:
        byte[] r2 = f24158C;
        if (r1 >= r2.length) goto L9;
        if (r4[r1] != r2[r1]) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return false;
    L9:
        return true;
    }

    public static boolean O(FileDescriptor r3) {
        Os.lseek(r3, 0, OsConstants.SEEK_CUR);     // Catch: Exception -> L5
        return true;
    L6:
        if (f24204w == false) goto L12;
        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
        return false;
    L12:
        return false;
    }

    public static boolean Q(int r1) {
        if (r1 != 4) goto L5;
        return true;
    L5:
        if (r1 != 13) goto L7;
        return true;
    L7:
        if (r1 == 14) goto L14;
        return false;
    L14:
        return true;
    }

    public static /* synthetic */ int[] a() {
        return f24180Y;
    }

    public static /* synthetic */ Charset b() {
        return f24198q0;
    }

    public static /* synthetic */ String[] c() {
        return f24179X;
    }

    public static /* synthetic */ byte[] d() {
        return f24181Z;
    }

    public static double g(String r11, String r12) {
        String[] r112 = r11.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);     // Catch: Throwable -> L18
        String[] r3 = r112[0].split(RemoteSettings.FORWARD_SLASH_STRING, -1);     // Catch: Throwable -> L18
        double r4 = Double.parseDouble(r3[0].trim()) / Double.parseDouble(r3[1].trim());     // Catch: Throwable -> L18
        String[] r32 = r112[1].split(RemoteSettings.FORWARD_SLASH_STRING, -1);     // Catch: Throwable -> L18
        double r7 = Double.parseDouble(r32[0].trim()) / Double.parseDouble(r32[1].trim());     // Catch: Throwable -> L18
        String[] r113 = r112[2].split(RemoteSettings.FORWARD_SLASH_STRING, -1);     // Catch: Throwable -> L18
        double r42 = (r4 + (r7 / 60.0d)) + ((Double.parseDouble(r113[0].trim()) / Double.parseDouble(r113[1].trim())) / 3600.0d);     // Catch: Throwable -> L18
        if (r12.equals(ExifInterface.GpsLatitudeRef.SOUTH) == true) goto L17;
        if (r12.equals(ExifInterface.GpsLongitudeRef.WEST) == true) goto L17;
        if (r12.equals("N") == false) goto L11;
    L15:
        return r42;
    L11:
        if (r12.equals(ExifInterface.GpsLongitudeRef.EAST) == true) goto L15;
        throw new IllegalArgumentException();     // Catch: Throwable -> L18
    L17:
        return -r42;
    L18:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static boolean l0(int r1) {
        if (r1 != 4) goto L5;
        return false;
    L5:
        if (r1 != 9) goto L7;
        return false;
    L7:
        if (r1 != 13) goto L9;
        return false;
    L9:
        if (r1 == 14) goto L17;
        return true;
    L17:
        return false;
    }

    public static void n0(CRC32 r1, int r2) {
        r1.update(r2 >>> 24);
        r1.update(r2 >>> 16);
        r1.update(r2 >>> 8);
        r1.update(r2);
    }

    public byte[] A() {
        InputStream r2 = null;
        if (this.f24216i == true) goto L5;
        return null;
    L5:
        byte[] r1 = this.f24221n;
        if (r1 == null) goto L59;
        return r1;
    L59:
        InputStream r12 = this.f24211c;     // Catch: Throwable -> L25 Exception -> L27
        if (r12 == null) goto L23;
    L17:
        e = move-exception;
        Exception e2 = e;
        FileDescriptor r3 = null;
    L45:
        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e2);     // Catch: Throwable -> L37
        androidx.exifinterface.media.b.b(r12);
        if (r3 == null) goto L49;
        androidx.exifinterface.media.b.a(r3);
    L49:
        return null;
    L37:
        th = th;
    L16:
        r2 = r12;
    L50:
        androidx.exifinterface.media.b.b(r2);
        if (r3 == null) goto L53;
        androidx.exifinterface.media.b.a(r3);
    L53:
        throw th;
    L14:
        th = th;
        r3 = null;
        goto L16
    L11:
        if (r12.markSupported() == false) goto L19;
        r12.reset();     // Catch: Throwable -> L14 Exception -> L17
    L13:
        r3 = null;
    L54:
        b r4 = new b(r12);     // Catch: Throwable -> L37 Exception -> L39
        r4.n(this.f24219l + this.f24223p);     // Catch: Throwable -> L37 Exception -> L39
        byte[] r5 = new byte[this.f24220m];     // Catch: Throwable -> L37 Exception -> L39
        r4.readFully(r5);     // Catch: Throwable -> L37 Exception -> L39
        this.f24221n = r5;     // Catch: Throwable -> L37 Exception -> L39
        androidx.exifinterface.media.b.b(r12);
        if (r3 == null) goto L36;
        androidx.exifinterface.media.b.a(r3);
    L36:
        return r5;
    L39:
        e2 = e;
        goto L45
    L19:
        Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");     // Catch: Throwable -> L14 Exception -> L17
        androidx.exifinterface.media.b.b(r12);
        return null;
    L23:
        if (this.f24209a == null) goto L29;
        r12 = new FileInputStream(this.f24209a);     // Catch: Throwable -> L25 Exception -> L27
        goto L13
    L29:
        FileDescriptor r13 = Os.dup(this.f24210b);     // Catch: Throwable -> L25 Exception -> L27
        Os.lseek(r13, 0, OsConstants.SEEK_SET);     // Catch: Throwable -> L41 Exception -> L43
        r3 = r13;
        r12 = new FileInputStream(r13);     // Catch: Throwable -> L41 Exception -> L43
        goto L54
    L43:
        e = move-exception;
        e2 = e;
        r3 = r13;
        r12 = null;
    L41:
        th = th;
        r3 = r13;
    L27:
        e = move-exception;
        r12 = null;
        e2 = e;
        r3 = null;
    L25:
        th = th;
        r3 = null;
        goto L50
    }

    public final void B(b r6) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "getWebpAttributes starting with: " + r6);
    L5:
        r6.l(ByteOrder.LITTLE_ENDIAN);
        r6.n(f24168M.length);
        int r02 = r6.readInt() + 8;
        byte[] r1 = f24169N;
        r6.n(r1.length);
        int r12 = r1.length + 8;
    L28:
        byte[] r2 = new byte[4];     // Catch: EOFException -> L12
        r6.readFully(r2);     // Catch: EOFException -> L12
        int r3 = r6.readInt();     // Catch: EOFException -> L12
        int r13 = r12 + 8;     // Catch: EOFException -> L12
        if (Arrays.equals(f24170O, r2) == true) goto L9;
        if ((r3 % 2) != 1) goto L19;
        r3 = r3 + 1;     // Catch: EOFException -> L12
    L19:
        r12 = r13 + r3;     // Catch: EOFException -> L12
        if (r12 == r02) goto L21;
        if (r12 > r02) goto L25;
        r6.n(r3);     // Catch: EOFException -> L12
        goto L28
    L25:
        throw new IOException("Encountered WebP file with invalid chunk size");     // Catch: EOFException -> L12
    L21:
        return;
    L9:
        byte[] r03 = new byte[r3];     // Catch: EOFException -> L12
        r6.readFully(r03);     // Catch: EOFException -> L12
        byte[] r62 = f24199r0;     // Catch: EOFException -> L12
        if (androidx.exifinterface.media.b.f(r03, r62) == false) goto L14;
        r03 = Arrays.copyOfRange(r03, r62.length, r3);     // Catch: EOFException -> L12
    L14:
        this.f24223p = r13;     // Catch: EOFException -> L12
        X(r03, 0);     // Catch: EOFException -> L12
        k0(new b(r03));     // Catch: EOFException -> L12
        return;
    L12:
        e = move-exception;
        throw new IOException("Encountered corrupt WebP file.", e);
    }

    public final void E(b r4, HashMap r5) {
        d r02 = (d) r5.get("JPEGInterchangeFormat");
        d r52 = (d) r5.get("JPEGInterchangeFormatLength");
        if (r02 == null) goto L22;
        if (r52 == null) goto L23;
        int r03 = r02.m(this.f24215h);
        int r53 = r52.m(this.f24215h);
        if (this.d != 7) goto L8;
        r03 = r03 + this.f24224q;
    L8:
        if (r03 <= 0) goto L19;
        if (r53 <= 0) goto L19;
        this.f24216i = true;
        if (this.f24209a == null) goto L13;
    L17:
        this.f24219l = r03;
        this.f24220m = r53;
        goto L19
    L13:
        if (this.f24211c != null) goto L17;
        if (this.f24210b != null) goto L17;
        byte[] r1 = new byte[r53];
        r4.n(r03);
        r4.readFully(r1);
        this.f24221n = r1;
    L19:
        if (f24204w == false) goto L24;
        Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + r03 + ", length: " + r53);
        return;
    L24:
        return;
    L23:
        return;
    }

    public final void F(b r20, HashMap r21) {
        d r4 = (d) r21.get("StripOffsets");
        d r2 = (d) r21.get("StripByteCounts");
        if (r4 == null) goto L57;
        if (r2 == null) goto L58;
        long[] r42 = androidx.exifinterface.media.b.c(r4.o(this.f24215h));
        long[] r22 = androidx.exifinterface.media.b.c(r2.o(this.f24215h));
        if (r42 != null) goto L8;
    L48:
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        return;
    L8:
        if (r42.length == 0) goto L48;
        if (r22 != null) goto L12;
    L46:
        Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        return;
    L12:
        if (r22.length == 0) goto L46;
        if (r42.length == r22.length) goto L18;
        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        return;
    L18:
        int r6 = r22.length;
        long r8 = 0;
        int r10 = 0;
    L19:
        if (r10 >= r6) goto L21;
        r8 = r8 + r22[r10];
        r10 = r10 + 1;
        goto L19
    L21:
        int r62 = (int) r8;
        byte[] r82 = new byte[r62];
        int r9 = 1;
        this.f24218k = true;
        this.f24217j = true;
        this.f24216i = true;
        int r102 = 0;
        int r11 = 0;
        int r12 = 0;
    L23:
        if (r102 >= r42.length) goto L42;
        int r13 = (int) r42[r102];
        int r14 = (int) r22[r102];
        if (r102 >= (r42.length - r9)) goto L29;
        int r16 = r102;
        if ((r13 + r14) == r42[r16 + 1]) goto L30;
        this.f24218k = false;
    L30:
        int r132 = r13 - r11;
        if (r132 < 0) goto L32;
        r20.n(r132);     // Catch: EOFException -> L40
        int r112 = r11 + r132;
        byte[] r92 = new byte[r14];
        r20.readFully(r92);     // Catch: EOFException -> L38
        r11 = r112 + r14;
        System.arraycopy(r92, 0, r82, r12, r14);
        r12 = r12 + r14;
        r102 = r16 + 1;
        r9 = 1;
    L38:
        Log.d("ExifInterface", "Failed to read " + r14 + " bytes.");
        return;
    L40:
        Log.d("ExifInterface", "Failed to skip " + r132 + " bytes.");
        return;
    L32:
        Log.d("ExifInterface", "Invalid strip offset value");
        return;
    L29:
        r16 = r102;
        goto L30
    L42:
        this.f24221n = r82;
        if (this.f24218k == false) goto L59;
        this.f24219l = (int) r42[0];
        this.f24220m = r62;
        return;
    L59:
        return;
    L58:
        return;
    }

    public final void G(String r3) {
        if (r3 == null) goto L18;
        FileInputStream r02 = null;
        this.f24211c = null;
        this.f24209a = r3;
        FileInputStream r1 = new FileInputStream(r3);     // Catch: Throwable -> L14
    L8:
        th = th;
        r02 = r1;
    L15:
        androidx.exifinterface.media.b.b(r02);
        throw th;
    L6:
        if (O(r1.getFD()) == false) goto L10;
        this.f24210b = r1.getFD();     // Catch: Throwable -> L8
    L11:
        T(r1);     // Catch: Throwable -> L8
        androidx.exifinterface.media.b.b(r1);
        return;
    L10:
        this.f24210b = null;     // Catch: Throwable -> L8
    L14:
        th = th;
        goto L15
    L18:
        throw new NullPointerException("filename cannot be null");
    }

    public boolean H() {
        int r02 = m("Orientation", 1);
        if (r02 != 2) goto L5;
    L12:
        return true;
    L5:
        if (r02 == 7) goto L12;
        if (r02 == 4) goto L12;
        if (r02 == 5) goto L12;
        return false;
    }

    public final int I(byte[] r15) {
        b r1 = null;
        b r2 = new b(r15);     // Catch: Throwable -> L58 Exception -> L60
        long r3 = r2.readInt();     // Catch: Throwable -> L15 Exception -> L17
        byte[] r5 = new byte[4];     // Catch: Throwable -> L15 Exception -> L17
        r2.readFully(r5);     // Catch: Throwable -> L15 Exception -> L17
        if (Arrays.equals(r5, f24159D) == true) goto L9;
        r2.close();
        return 0;
    L9:
        if (r3 != 1) goto L19;
        r3 = r2.readLong();     // Catch: Throwable -> L15 Exception -> L17
        long r10 = 16;
        if (r3 >= 16) goto L21;
        r2.close();
        return 0;
    L21:
        if (r3 > r15.length) goto L23;
    L24:
        long r32 = r3 - r10;
        if (r32 >= 8) goto L28;
        r2.close();
        return 0;
    L28:
        byte[] r152 = new byte[4];     // Catch: Throwable -> L15 Exception -> L17
        long r7 = 0;
        boolean r12 = false;
        boolean r9 = false;
        boolean r102 = false;
    L29:
    L31:
        if (r7 >= (r32 / 4)) goto L57;
        r2.readFully(r152);     // Catch: Throwable -> L15 Exception -> L17 EOFException -> L55
        if (r7 == 1) goto L54;
        if (Arrays.equals(r152, f24160E) == false) goto L40;
        r12 = true;
    L47:
        if (r12 == false) goto L54;
        if (r9 == true) goto L49;
        if (r102 == false) goto L54;
        r2.close();
        return 15;
    L49:
        r2.close();
        return 12;
    L40:
        if (Arrays.equals(r152, f24161F) == false) goto L43;
        r9 = true;
        goto L47
    L43:
        if (Arrays.equals(r152, f24162G) == false) goto L45;
    L46:
        r102 = true;
        goto L47
    L45:
        if (Arrays.equals(r152, f24163H) == false) goto L47;
    L54:
        r7 = r7 + 1;
    L55:
        r2.close();
        return 0;
    L57:
        r2.close();
    L66:
        return 0;
    L23:
        r3 = r15.length;     // Catch: Throwable -> L15 Exception -> L17
        goto L24
    L19:
        r10 = 8;
    L17:
        e = e;
        r1 = r2;
    L62:
        if (f24204w == false) goto L64;
        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);     // Catch: Throwable -> L58
    L64:
        if (r1 == null) goto L66;
        r1.close();
    L15:
        th = th;
        r1 = r2;
    L67:
        if (r1 == null) goto L69;
        r1.close();
    L69:
        throw th;
    L60:
        e = e;
    L58:
        th = th;
        goto L67
    }

    public final boolean K(byte[] r4) {
        boolean r02 = false;
        b r1 = null;
        b r2 = new b(r4);     // Catch: Throwable -> L15 Exception -> L22
        ByteOrder r42 = W(r2);     // Catch: Throwable -> L12 Exception -> L14
        this.f24215h = r42;     // Catch: Throwable -> L12 Exception -> L14
        r2.l(r42);     // Catch: Throwable -> L12 Exception -> L14
        short r43 = r2.readShort();     // Catch: Throwable -> L12 Exception -> L14
    L6:
        if (r43 != 20306) goto L8;
    L9:
        r02 = true;
    L10:
        r2.close();
        return r02;
    L8:
        if (r43 != 21330) goto L10;
    L14:
        r1 = r2;
    L12:
        th = th;
        r1 = r2;
    L16:
        if (r1 == null) goto L18;
        r1.close();
    L18:
        throw th;
    L15:
        th = th;
    L19:
        if (r1 == null) goto L21;
        r1.close();
    L21:
        return false;
    }

    public final boolean L(byte[] r5) {
        int r1 = 0;
    L3:
        byte[] r2 = f24166K;
        if (r1 >= r2.length) goto L9;
        if (r5[r1] != r2[r1]) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return false;
    L9:
        return true;
    }

    public final boolean M(byte[] r6) {
        byte[] r02 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int r2 = 0;
    L4:
        if (r2 >= r02.length) goto L9;
        if (r6[r2] != r02[r2]) goto L7;
        r2 = r2 + 1;
        goto L4
    L7:
        return false;
    L9:
        return true;
    }

    public final boolean N(byte[] r4) {
        boolean r02 = false;
        b r1 = null;
        b r2 = new b(r4);     // Catch: Throwable -> L13 Exception -> L20
        ByteOrder r42 = W(r2);     // Catch: Throwable -> L10 Exception -> L12
        this.f24215h = r42;     // Catch: Throwable -> L10 Exception -> L12
        r2.l(r42);     // Catch: Throwable -> L10 Exception -> L12
    L6:
        if (r2.readShort() != 85) goto L8;
        r02 = true;
    L8:
        r2.close();
        return r02;
    L12:
        r1 = r2;
    L10:
        th = th;
        r1 = r2;
    L14:
        if (r1 == null) goto L16;
        r1.close();
    L16:
        throw th;
    L13:
        th = th;
    L17:
        if (r1 == null) goto L19;
        r1.close();
    L19:
        return false;
    }

    public final boolean P(HashMap r6) {
        d r02 = (d) r6.get("BitsPerSample");
        if (r02 == null) goto L21;
        int[] r03 = (int[]) r02.o(this.f24215h);
        int[] r1 = f24208z;
        if (Arrays.equals(r1, r03) == false) goto L8;
        return true;
    L8:
        if (this.d != 3) goto L21;
        d r62 = (d) r6.get("PhotometricInterpretation");
        if (r62 == null) goto L21;
        int r63 = r62.m(this.f24215h);
        if (r63 != 1) goto L16;
        if (Arrays.equals(r03, f24157B) == false) goto L16;
    L19:
        return true;
    L16:
        if (r63 != 6) goto L21;
        if (Arrays.equals(r03, r1) == true) goto L19;
    L21:
        if (f24204w == false) goto L25;
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    L25:
        return false;
    }

    public final boolean R(HashMap r3) {
        d r02 = (d) r3.get("ImageLength");
        d r32 = (d) r3.get("ImageWidth");
        if (r02 == null) goto L10;
        if (r32 == null) goto L12;
        int r03 = r02.m(this.f24215h);
        int r33 = r32.m(this.f24215h);
        if (r03 > 512) goto L13;
        if (r33 > 512) goto L14;
        return true;
    L14:
        return false;
    L13:
        return false;
    L12:
        return false;
    L10:
        return false;
    }

    public final boolean S(byte[] r5) {
        int r1 = 0;
    L3:
        byte[] r2 = f24168M;
        if (r1 >= r2.length) goto L9;
        if (r5[r1] != r2[r1]) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return false;
    L9:
        int r12 = 0;
    L10:
        byte[] r22 = f24169N;
        if (r12 >= r22.length) goto L16;
        if (r5[(f24168M.length + r12) + 4] != r22[r12]) goto L14;
        r12 = r12 + 1;
        goto L10
    L14:
        return false;
    L16:
        return true;
    }

    public final void T(InputStream r5) {
        int r1 = 0;
    L66:
    L6:
        th = move-exception;
        e();
        if (f24204w == false) goto L65;
        V();
    L65:
        throw th;
    L10:
        e = e;
    L55:
        boolean r02 = f24204w;     // Catch: Throwable -> L6
        if (r02 == false) goto L58;
        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);     // Catch: Throwable -> L6
    L58:
        e();
        if (r02 == false) goto L70;
        V();
        return;
    L70:
        return;
    L8:
        e = e;
        goto L55
    L4:
        if (r1 >= f24192k0.length) goto L13;
        this.f24213f[r1] = new HashMap();     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        r1 = r1 + 1;     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L66
    L13:
        if (this.f24212e == true) goto L16;
        BufferedInputStream r12 = new BufferedInputStream(r5, 5000);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        this.d = r(r12);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        r5 = r12;
    L16:
        if (l0(this.d) == false) goto L39;
        g r03 = new g(r5);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        if (this.f24212e == true) goto L20;
        int r52 = this.d;     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        if (r52 != 12) goto L28;
    L37:
        o(r03, r52);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
    L38:
        r03.t(this.f24223p);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        k0(r03);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
    L51:
        e();
        if (f24204w == false) goto L69;
        V();
        return;
    L69:
        return;
    L28:
        if (r52 == 15) goto L37;
        if (r52 != 7) goto L34;
        s(r03);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L38
    L34:
        if (r52 != 10) goto L36;
        x(r03);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L38
    L36:
        v(r03);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L38
    L20:
        if (y(r03) == true) goto L38;
        e();
        if (f24204w == false) goto L68;
        V();
        return;
    L68:
        return;
    L39:
        b r13 = new b(r5);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        int r53 = this.d;     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        if (r53 != 4) goto L43;
        p(r13, 0, 0);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L51
    L43:
        if (r53 != 13) goto L46;
        t(r13);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L51
    L46:
        if (r53 != 9) goto L49;
        u(r13);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L51
    L49:
        if (r53 != 14) goto L51;
        B(r13);     // Catch: Throwable -> L6 UnsupportedOperationException -> L8 IOException -> L10
        goto L51
    }

    public final void U(b r4) {
        ByteOrder r02 = W(r4);
        this.f24215h = r02;
        r4.l(r02);
        int r03 = r4.readUnsignedShort();
        int r1 = this.d;
        if (r1 != 7) goto L5;
    L11:
        int r04 = r4.readInt();
        if (r04 < 8) goto L18;
        int r05 = r04 - 8;
        if (r05 <= 0) goto L19;
        r4.n(r05);
        return;
    L19:
        return;
    L18:
        throw new IOException("Invalid first Ifd offset: " + r04);
    L5:
        if (r1 == 10) goto L11;
        if (r03 == 42) goto L11;
        throw new IOException("Invalid start code: " + Integer.toHexString(r03));
    }

    public final void V() {
        int r02 = 0;
    L4:
        if (r02 >= this.f24213f.length) goto L10;
        Log.d("ExifInterface", "The size of tag group[" + r02 + "]: " + this.f24213f[r02].size());
        Iterator r1 = this.f24213f[r02].entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        Map.Entry r3 = (Map.Entry) r1.next();
        d r4 = (d) r3.getValue();
        Log.d("ExifInterface", "tagName: " + ((String) r3.getKey()) + ", tagType: " + r4.toString() + ", tagValue: '" + r4.n(this.f24215h) + "'");
        goto L7
    L9:
        r02 = r02 + 1;
        goto L4
    }

    public final ByteOrder W(b r4) {
        short r42 = r4.readShort();
        if (r42 == 18761) goto L14;
        if (r42 != 19789) goto L12;
        if (f24204w == false) goto L10;
        Log.d("ExifInterface", "readExifSegment: Byte Align MM");
    L10:
        return ByteOrder.BIG_ENDIAN;
    L12:
        throw new IOException("Invalid byte order: " + Integer.toHexString(r42));
    L14:
        if (f24204w == false) goto L17;
        Log.d("ExifInterface", "readExifSegment: Byte Align II");
    L17:
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void X(byte[] r2, int r3) {
        g r02 = new g(r2);
        U(r02);
        Y(r02, r3);
    }

    public final void Y(g r26, int r27) {
        int r2 = r27;
        this.f24214g.add(Integer.valueOf(r26.f()));
        short r3 = r26.readShort();
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "numberOfDirectoryEntry: " + r3);
    L5:
        if (r3 <= 0) goto L151;
        short r6 = 0;
    L8:
        if (r6 >= r3) goto L122;
        int r10 = r26.readUnsignedShort();
        int r11 = r26.readUnsignedShort();
        int r14 = r26.readInt();
        long r12 = r26.f() + 4;
        e r4 = (e) f24194m0[r2].get(Integer.valueOf(r10));
        boolean r7 = f24204w;
        if (r7 == false) goto L17;
        Integer r8 = Integer.valueOf(r2);
        long r20 = 4;
        Integer r15 = Integer.valueOf(r10);
        int r16 = 4;
        if (r4 == null) goto L15;
        String r9 = r4.f24243b;
    L14:
        short r22 = r3;
        short r23 = r6;
        Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", new Object[]{r8, r15, r9, Integer.valueOf(r11), Integer.valueOf(r14)}));
    L19:
        if (r4 != null) goto L23;
        if (r7 == false) goto L22;
        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + r10);
    L22:
        e r24 = r4;
    L44:
        long r82 = 0;
    L41:
        boolean r32 = false;
    L45:
        if (r32 == true) goto L48;
        r26.t(r12);
    L121:
        r6 = (short) (r23 + 1);
        r2 = r27;
        r3 = r22;
        goto L8
    L48:
        if (r82 <= r20) goto L65;
        int r33 = r26.readInt();
        if (r7 == false) goto L53;
        Log.d("ExifInterface", "seek to data offset: " + r33);
    L53:
        if (this.d != 7) goto L63;
        e r62 = r24;
        boolean r17 = r7;
        if ("MakerNote".equals(r62.f24243b) == false) goto L59;
        this.f24224q = r33;
    L57:
        int r21 = r10;
        int r202 = r14;
    L64:
        r26.t(r33);
    L66:
        Integer r25 = (Integer) f24197p0.get(Integer.valueOf(r21));
        if (r17 == false) goto L70;
        Log.d("ExifInterface", "nextIfdType: " + r25 + " byteCount: " + r82);
    L70:
        if (r25 == null) goto L104;
        if (r11 != 3) goto L73;
        int r34 = r26.readUnsignedShort();
    L81:
        long r35 = r34;
    L85:
        if (r17 == false) goto L88;
        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", new Object[]{Long.valueOf(r35), r62.f24243b}));
    L88:
        if (r35 > 0) goto L90;
    L98:
        if (r17 == false) goto L103;
        String r28 = "Skip jump into the IFD since its offset is invalid: " + r35;
        if (r26.c() == (-1)) goto L102;
        r28 = r28 + " (total length: " + r26.c() + ")";
    L102:
        Log.d("ExifInterface", r28);
    L103:
        r26.t(r12);
        goto L121
    L90:
        if (r26.c() == (-1)) goto L94;
        if (r35 >= r26.c()) goto L98;
    L94:
        if (this.f24214g.contains(Integer.valueOf((int) r35)) == true) goto L96;
        r26.t(r35);
        Y(r26, r25.intValue());
        goto L103
    L96:
        if (r17 == false) goto L103;
        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + r25 + " (at " + r35 + ")");
        goto L103
    L73:
        if (r11 == r16) goto L83;
        if (r11 != 8) goto L76;
        r34 = r26.readShort();
        goto L81
    L76:
        if (r11 != 9) goto L78;
    L80:
        r34 = r26.readInt();
        goto L81
    L78:
        if (r11 == 13) goto L80;
        r35 = -1;
        goto L85
    L83:
        r35 = r26.k();
        goto L85
    L104:
        int r29 = r26.f() + this.f24223p;
        byte[] r83 = new byte[(int) r82];
        r26.readFully(r83);
        int r13 = r11;
        d r122 = new d(r13, r202, r29, r83);
        this.f24213f[r27].put(r62.f24243b, r122);
        if ("DNGVersion".equals(r62.f24243b) == false) goto L108;
        this.d = 3;
    L108:
        if ("Make".equals(r62.f24243b) == true) goto L112;
        if ("Model".equals(r62.f24243b) == true) goto L112;
    L114:
        if ("Compression".equals(r62.f24243b) == false) goto L119;
        if (r122.m(this.f24215h) != 65535) goto L119;
    L117:
        this.d = 8;
    L119:
        if (r26.f() == r12) goto L121;
        r26.t(r12);
    L112:
        if (r122.n(this.f24215h).contains("PENTAX") == true) goto L117;
    L59:
        if (r2 != 6) goto L57;
        if ("ThumbnailImage".equals(r62.f24243b) == false) goto L57;
        this.f24225r = r33;
        this.f24226s = r14;
        d r72 = d.j(6, this.f24215h);
        r202 = r14;
        d r210 = d.f(this.f24225r, this.f24215h);
        r21 = r10;
        d r102 = d.f(this.f24226s, this.f24215h);
        this.f24213f[r16].put("Compression", r72);
        this.f24213f[r16].put("JPEGInterchangeFormat", r210);
        this.f24213f[r16].put("JPEGInterchangeFormatLength", r102);
        goto L64
    L63:
        r17 = r7;
        r21 = r10;
        r202 = r14;
        r62 = r24;
        goto L64
    L65:
        r17 = r7;
        r21 = r10;
        r202 = r14;
        r62 = r24;
        goto L66
    L23:
        if (r11 > 0) goto L25;
    L26:
        r24 = r4;
        if (r7 == false) goto L44;
        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + r11);
        goto L44
    L25:
        if (r11 >= f24180Y.length) goto L26;
        if (r4.a(r11) == true) goto L31;
        if (r7 == false) goto L22;
        Log.d("ExifInterface", "Skip the tag entry since data format (" + f24179X[r11] + ") is unexpected for tag: " + r4.f24243b);
        goto L22
    L31:
        if (r11 != 7) goto L33;
        r11 = r4.f24244c;
    L33:
        r24 = r4;
        r82 = r14 * r6[r11];
        if (r82 >= 0) goto L36;
    L39:
        if (r7 == false) goto L41;
        Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + r14);
        goto L41
    L36:
        if (r82 > 2147483647L) goto L39;
        r32 = true;
        goto L45
    L15:
        r9 = null;
        goto L14
    L17:
        r22 = r3;
        r23 = r6;
        r20 = 4;
        r16 = 4;
        goto L19
    L122:
        int r211 = r26.readInt();
        boolean r36 = f24204w;
        if (r36 == false) goto L125;
        Log.d("ExifInterface", String.format("nextIfdOffset: %d", new Object[]{Integer.valueOf(r211)}));
    L125:
        long r63 = r211;
        if (r63 > 0) goto L128;
        if (r36 == false) goto L150;
        Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + r211);
        return;
    L150:
        return;
    L128:
        if (this.f24214g.contains(Integer.valueOf(r211)) == true) goto L137;
        r26.t(r63);
        if (this.f24213f[4].isEmpty() == false) goto L134;
        Y(r26, 4);
        return;
    L134:
        if (this.f24213f[5].isEmpty() == false) goto L148;
        Y(r26, 5);
        return;
    L148:
        return;
    L137:
        if (r36 == false) goto L149;
        Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + r211);
        return;
    L149:
        return;
    }

    public final void Z(String r3) {
        int r02 = 0;
    L4:
        if (r02 >= f24192k0.length) goto L6;
        this.f24213f[r02].remove(r3);
        r02 = r02 + 1;
        goto L4
    }

    public final void a0(int r3, String r4, String r5) {
        if (this.f24213f[r3].isEmpty() == false) goto L5;
        return;
    L5:
        if (this.f24213f[r3].get(r4) == null) goto L9;
        HashMap r02 = this.f24213f[r3];
        r02.put(r5, (d) r02.get(r4));
        this.f24213f[r3].remove(r4);
        return;
    }

    public final void b0(g r5, int r6) {
        d r02 = (d) this.f24213f[r6].get("ImageLength");
        d r1 = (d) this.f24213f[r6].get("ImageWidth");
        if (r02 == null) goto L5;
        if (r1 == null) goto L5;
        return;
    L5:
        d r03 = (d) this.f24213f[r6].get("JPEGInterchangeFormat");
        d r12 = (d) this.f24213f[r6].get("JPEGInterchangeFormatLength");
        if (r03 == null) goto L11;
        if (r12 == null) goto L12;
        int r13 = r03.m(this.f24215h);
        int r04 = r03.m(this.f24215h);
        r5.t(r13);
        byte[] r05 = new byte[r04];
        r5.readFully(r05);
        p(new b(r05), r13, r6);
        return;
    L12:
        return;
    }

    public void c0() {
        if (Q(this.d) == false) goto L108;
        if (this.f24210b != null) goto L12;
        if (this.f24209a != null) goto L12;
        throw new IOException("ExifInterface does not support saving attributes for the current input.");
    L12:
        if (this.f24216i == true) goto L14;
    L20:
        this.f24227t = true;
        this.f24221n = z();
        InputStream r1 = null;
        File r2 = File.createTempFile("temp", "tmp");     // Catch: Throwable -> L24 Exception -> L26
        if (this.f24209a == null) goto L28;
        FileInputStream r3 = new FileInputStream(this.f24209a);     // Catch: Throwable -> L24 Exception -> L26
    L123:
        FileOutputStream r6 = new FileOutputStream(r2);     // Catch: Throwable -> L98 Exception -> L100
    L127:
        androidx.exifinterface.media.b.d(r3, r6);     // Catch: Throwable -> L94 Exception -> L96
        androidx.exifinterface.media.b.b(r3);
        androidx.exifinterface.media.b.b(r6);
        FileInputStream r62 = new FileInputStream(r2);     // Catch: Throwable -> L36 Exception -> L65
    L38:
        e = e;
        FileOutputStream r9 = null;
        r1 = r62;
    L40:
        Exception r63 = e;
        FileOutputStream r7 = r9;
    L129:
        InputStream r10 = new FileInputStream(r2);     // Catch: Throwable -> L80 Exception -> L82
    L74:
        Exception e2 = e;
    L118:
    L86:
        th = move-exception;
        th = th;
    L73:
        r1 = r10;
    L88:
        androidx.exifinterface.media.b.b(r1);     // Catch: Throwable -> L47
        androidx.exifinterface.media.b.b(r7);     // Catch: Throwable -> L47
        throw th;     // Catch: Throwable -> L47
    L85:
        throw new IOException("Failed to save new file. Original file is stored in " + r2.getAbsolutePath(), e2);     // Catch: Throwable -> L86
    L72:
        th = th;
        goto L73
    L69:
        if (this.f24209a == null) goto L76;
        FileOutputStream r12 = new FileOutputStream(this.f24209a);     // Catch: Throwable -> L72 Exception -> L74
    L71:
        r7 = r12;
        androidx.exifinterface.media.b.d(r10, r7);     // Catch: Throwable -> L72 Exception -> L74
        androidx.exifinterface.media.b.b(r10);     // Catch: Throwable -> L47
        androidx.exifinterface.media.b.b(r7);     // Catch: Throwable -> L47
        throw new IOException("Failed to save new file", r63);     // Catch: Throwable -> L47
    L76:
        Os.lseek(this.f24210b, 0, OsConstants.SEEK_SET);     // Catch: Throwable -> L72 Exception -> L74
        r12 = new FileOutputStream(this.f24210b);     // Catch: Throwable -> L72 Exception -> L74
        goto L71
    L82:
        e = move-exception;
        r10 = r1;
        e2 = e;
    L80:
        th = th;
        goto L88
    L34:
        if (this.f24209a == null) goto L41;
        r7 = new FileOutputStream(this.f24209a);     // Catch: Throwable -> L36 Exception -> L38
    L115:
        BufferedInputStream r8 = new BufferedInputStream(r62);     // Catch: Throwable -> L36 Exception -> L63
    L120:
        BufferedOutputStream r92 = new BufferedOutputStream(r7);     // Catch: Throwable -> L59 Exception -> L61
        int r102 = this.d;     // Catch: Throwable -> L47 Exception -> L49
        if (r102 != 4) goto L52;
        d0(r8, r92);     // Catch: Throwable -> L47 Exception -> L49
    L57:
        androidx.exifinterface.media.b.b(r8);
        androidx.exifinterface.media.b.b(r92);
        r2.delete();
        this.f24221n = null;
        return;
    L52:
        if (r102 != 13) goto L55;
        e0(r8, r92);     // Catch: Throwable -> L47 Exception -> L49
        goto L57
    L55:
        if (r102 != 14) goto L57;
        f0(r8, r92);     // Catch: Throwable -> L47 Exception -> L49
    L49:
        e = move-exception;
        r63 = e;
        r1 = r62;
        goto L129
    L61:
        e = move-exception;
        r1 = r62;
        r63 = e;
    L59:
        th = th;
        Closeable r93 = null;
    L48:
        r1 = r8;
    L90:
        androidx.exifinterface.media.b.b(r1);
        androidx.exifinterface.media.b.b(r93);
        if (0 != 0) goto L93;
        r2.delete();
    L93:
        throw th;
    L63:
        e = move-exception;
        r1 = r62;
        r63 = e;
        goto L129
    L41:
        Os.lseek(this.f24210b, 0, OsConstants.SEEK_SET);     // Catch: Throwable -> L36 Exception -> L38
        r7 = new FileOutputStream(this.f24210b);     // Catch: Throwable -> L36 Exception -> L38
    L36:
        th = th;
        r93 = null;
    L65:
        e = e;
        r9 = null;
    L47:
        th = th;
        goto L48
    L96:
        e = e;
    L97:
        r1 = r3;
    L111:
    L104:
        th = th;
    L105:
        androidx.exifinterface.media.b.b(r1);
        androidx.exifinterface.media.b.b(r6);
        throw th;
    L103:
        throw new IOException("Failed to copy original file to temp file", e);     // Catch: Throwable -> L104
    L94:
        th = th;
    L95:
        r1 = r3;
    L100:
        e = e;
        r6 = null;
    L98:
        th = th;
        r6 = null;
        goto L95
    L28:
        Os.lseek(this.f24210b, 0, OsConstants.SEEK_SET);     // Catch: Throwable -> L24 Exception -> L26
        r3 = new FileInputStream(this.f24210b);     // Catch: Throwable -> L24 Exception -> L26
    L26:
        e = e;
        r6 = null;
    L24:
        th = th;
        r6 = null;
        goto L105
    L14:
        if (this.f24217j == false) goto L20;
        if (this.f24218k == true) goto L20;
        throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
    L108:
        throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
    }

    public final void d0(InputStream r13, OutputStream r14) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + r13 + ", outputStream: " + r14 + ")");
    L5:
        b r02 = new b(r13);
        c r132 = new c(r14, ByteOrder.BIG_ENDIAN);
        if (r02.readByte() != (-1)) goto L62;
        r132.f(-1);
        if (r02.readByte() != (-40)) goto L60;
        r132.f(-40);
        r132.f(-1);
        r132.f(-31);
        this.f24223p = q0(r132);
        if (this.f24228u == null) goto L12;
        r132.write(-1);
        r132.f(-31);
        byte[] r3 = f24200s0;
        r132.n((r3.length + 2) + this.f24228u.d.length);
        r132.write(r3);
        r132.write(this.f24228u.d);
        this.f24229v = true;
    L12:
        byte[] r4 = new byte[4096];
    L14:
        if (r02.readByte() != (-1)) goto L58;
    L15:
        byte r5 = r02.readByte();
        if (r5 == (-1)) goto L15;
        if (r5 == (-39)) goto L55;
        if (r5 == (-38)) goto L55;
        if (r5 != (-31)) goto L23;
        int r8 = r02.readUnsignedShort();
        int r9 = r8 - 2;
        if (r9 < 0) goto L54;
        byte[] r6 = f24200s0;
        if (r9 < r6.length) goto L36;
        byte[] r10 = new byte[r6.length];
    L40:
        if (r10 == null) goto L46;
        r02.readFully(r10);
        if (androidx.exifinterface.media.b.f(r10, f24199r0) == true) goto L45;
        if (androidx.exifinterface.media.b.f(r10, r6) == false) goto L46;
    L45:
        r02.n(r9 - r10.length);
    L46:
        r132.f(-1);
        r132.f(r5);
        r132.n(r8);
        if (r10 == null) goto L49;
        r9 = r9 - r10.length;
        r132.write(r10);
    L49:
        if (r9 <= 0) goto L14;
        int r52 = r02.read(r4, 0, Math.min(r9, 4096));
        if (r52 < 0) goto L14;
        r132.write(r4, 0, r52);
        r9 = r9 - r52;
        goto L49
    L36:
        byte[] r102 = f24199r0;
        if (r9 < r102.length) goto L39;
        r10 = new byte[r102.length];
        goto L40
    L39:
        r10 = null;
        goto L40
    L54:
        throw new IOException("Invalid length");
    L23:
        r132.f(-1);
        r132.f(r5);
        int r53 = r02.readUnsignedShort();
        r132.n(r53);
        int r54 = r53 - 2;
        if (r54 < 0) goto L30;
    L25:
        if (r54 <= 0) goto L14;
        int r62 = r02.read(r4, 0, Math.min(r54, 4096));
        if (r62 < 0) goto L14;
        r132.write(r4, 0, r62);
        r54 = r54 - r62;
        goto L25
    L30:
        throw new IOException("Invalid length");
    L55:
        r132.f(-1);
        r132.f(r5);
        androidx.exifinterface.media.b.d(r02, r132);
        return;
    L58:
        throw new IOException("Invalid marker");
    L60:
        throw new IOException("Invalid marker");
    L62:
        throw new IOException("Invalid marker");
    }

    public final void e() {
        String r02 = k("DateTimeOriginal");
        if (r02 == null) goto L8;
        if (k("DateTime") != null) goto L8;
        this.f24213f[0].put("DateTime", d.e(r02));
    L8:
        if (k("ImageWidth") != null) goto L11;
        this.f24213f[0].put("ImageWidth", d.f(0, this.f24215h));
    L11:
        if (k("ImageLength") != null) goto L14;
        this.f24213f[0].put("ImageLength", d.f(0, this.f24215h));
    L14:
        if (k("Orientation") != null) goto L17;
        this.f24213f[0].put("Orientation", d.f(0, this.f24215h));
    L17:
        if (k("LightSource") != null) goto L20;
        this.f24213f[1].put("LightSource", d.f(0, this.f24215h));
        return;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:10:0x0044). Please report as a decompilation issue!!! */
    public final void e0(InputStream r9, OutputStream r10) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + r9 + ", outputStream: " + r10 + ")");
    L5:
        b r02 = new b(r9);
        c r92 = new c(r10, ByteOrder.BIG_ENDIAN);
        androidx.exifinterface.media.b.e(r02, r92, f24166K.length);
        boolean r1 = true;
        if (this.f24228u == null) goto L8;
    L9:
        boolean r102 = true;
    L10:
        if (r1 == true) goto L15;
        if (r102 == true) goto L15;
        androidx.exifinterface.media.b.d(r02, r92);
        return;
    L15:
        int r3 = r02.readInt();
        int r4 = r02.readInt();
        if (r4 == 1229472850) goto L17;
        if (r4 != 1700284774) goto L31;
        if (r1 == false) goto L31;
        r0(r92);
        r02.n(r3 + 4);
        r1 = false;
    L31:
        if (r4 != 1767135348) goto L41;
        byte[] r5 = f24167L;
        if (r3 < r5.length) goto L41;
        int r6 = r5.length;
        byte[] r7 = new byte[r6];
        r02.readFully(r7);
        int r62 = (r3 - r6) + 4;
        if (Arrays.equals(r7, r5) == true) goto L37;
        r92.i(r3);
        r92.i(r4);
        r92.write(r7);
        androidx.exifinterface.media.b.e(r02, r92, r62);
        goto L10
    L37:
        if (this.f24228u == null) goto L39;
        s0(r92);
    L39:
        r02.n(r62);
    L25:
        r102 = false;
    L41:
        r92.i(r3);
        r92.i(r4);
        androidx.exifinterface.media.b.e(r02, r92, r3 + 4);
        goto L10
    L17:
        r92.i(r3);
        r92.i(r4);
        androidx.exifinterface.media.b.e(r02, r92, r3 + 4);
        if (this.f24223p != 0) goto L21;
        r0(r92);
        r1 = false;
    L21:
        if (this.f24228u == null) goto L10;
        if (this.f24229v == true) goto L10;
        s0(r92);
        goto L25
    L8:
        if (this.f24229v == false) goto L25;
        goto L9
    }

    public final String f(double r9) {
        long r02 = (long) r9;
        double r92 = r9 - r02;
        long r4 = (long) (r92 * 60.0d);
        return r02 + "/1," + r4 + "/1," + Math.round(((r92 - (r4 / 60.0d)) * 3600.0d) * 1.0E7d) + "/10000000";
    }

    public final void f0(InputStream r22, OutputStream r23) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + r22 + ", outputStream: " + r23 + ")");
    L5:
        ByteOrder r4 = ByteOrder.LITTLE_ENDIAN;
        b r3 = new b(r22, r4);
        c r02 = new c(r23, r4);
        byte[] r2 = f24168M;
        androidx.exifinterface.media.b.e(r3, r02, r2.length);
        int r5 = r3.readInt();
        byte[] r6 = f24169N;
        r3.n(r6.length);
        ByteArrayOutputStream r7 = null;
        ByteArrayOutputStream r8 = new ByteArrayOutputStream();     // Catch: Throwable -> L86 Exception -> L88
        c r9 = new c(r8, r4);     // Catch: Throwable -> L15 Exception -> L17
        int r42 = this.f24223p;     // Catch: Throwable -> L15 Exception -> L17
        if (r42 == 0) goto L19;
        androidx.exifinterface.media.b.e(r3, r9, (r42 - ((r2.length + 4) + r6.length)) - 8);     // Catch: Throwable -> L15 Exception -> L17
        r3.n(4);     // Catch: Throwable -> L15 Exception -> L17
        int r24 = r3.readInt();     // Catch: Throwable -> L15 Exception -> L17
        if ((r24 % 2) == 0) goto L12;
        r24 = r24 + 1;     // Catch: Throwable -> L15 Exception -> L17
    L12:
        r3.n(r24);     // Catch: Throwable -> L15 Exception -> L17
        int r25 = q0(r9);     // Catch: Throwable -> L15 Exception -> L17
    L14:
        int r16 = -1;
    L80:
        androidx.exifinterface.media.b.e(r3, r9, (r5 + 8) - r3.f());     // Catch: Throwable -> L15 Exception -> L17
        int r43 = r8.size();     // Catch: Throwable -> L15 Exception -> L17
        byte[] r52 = f24169N;     // Catch: Throwable -> L15 Exception -> L17
        r02.i(r43 + r52.length);     // Catch: Throwable -> L15 Exception -> L17
        r02.write(r52);     // Catch: Throwable -> L15 Exception -> L17
        if (r25 == r16) goto L83;
        this.f24223p = r02.f24237a.size() + r25;     // Catch: Throwable -> L15 Exception -> L17
    L83:
        r8.writeTo(r02);     // Catch: Throwable -> L15 Exception -> L17
        androidx.exifinterface.media.b.d(r3, r02);     // Catch: Throwable -> L15 Exception -> L17
        androidx.exifinterface.media.b.b(r8);
        return;
    L19:
        byte[] r26 = new byte[4];     // Catch: Throwable -> L15 Exception -> L17
        r3.readFully(r26);     // Catch: Throwable -> L15 Exception -> L17
        byte[] r44 = f24172Q;     // Catch: Throwable -> L15 Exception -> L17
        boolean r13 = false;
        boolean r14 = true;
        if (Arrays.equals(r26, r44) == false) goto L39;
        int r27 = r3.readInt();     // Catch: Throwable -> L15 Exception -> L17
        if ((r27 % 2) != 1) goto L24;
        int r62 = r27 + 1;     // Catch: Throwable -> L15 Exception -> L17
    L25:
        byte[] r63 = new byte[r62];     // Catch: Throwable -> L15 Exception -> L17
        r3.readFully(r63);     // Catch: Throwable -> L15 Exception -> L17
        byte r15 = (byte) (r63[0] | 8);     // Catch: Throwable -> L15 Exception -> L17
        r63[0] = r15;     // Catch: Throwable -> L15 Exception -> L17
        if (((r15 >> 1) & 1) != 1) goto L28;
        r13 = true;
    L28:
        r9.write(r44);     // Catch: Throwable -> L15 Exception -> L17
        r9.i(r27);     // Catch: Throwable -> L15 Exception -> L17
        r9.write(r63);     // Catch: Throwable -> L15 Exception -> L17
        if (r13 == false) goto L38;
        h(r3, r9, f24175T, null);     // Catch: Throwable -> L15 Exception -> L17
    L31:
        byte[] r28 = new byte[4];     // Catch: Throwable -> L15 Exception -> L17
        r3.readFully(r28);     // Catch: Throwable -> L15 Exception -> L17 EOFException -> L34
        boolean r45 = !Arrays.equals(r28, f24176U);
    L35:
        if (r45 == true) goto L36;
        i(r3, r9, r28);     // Catch: Throwable -> L15 Exception -> L17
        goto L31
    L36:
        r25 = q0(r9);     // Catch: Throwable -> L15 Exception -> L17
    L34:
        r45 = true;
        goto L35
    L38:
        h(r3, r9, f24174S, f24173R);     // Catch: Throwable -> L15 Exception -> L17
        r25 = q0(r9);     // Catch: Throwable -> L15 Exception -> L17
        goto L14
    L24:
        r62 = r27;
        goto L25
    L39:
        byte[] r64 = f24174S;     // Catch: Throwable -> L15 Exception -> L17
        if (Arrays.equals(r26, r64) == false) goto L42;
    L45:
        int r72 = r3.readInt();     // Catch: Throwable -> L15 Exception -> L17
        if ((r72 % 2) != 1) goto L49;
        int r152 = r72 + 1;     // Catch: Throwable -> L15 Exception -> L17
    L50:
        byte[] r12 = new byte[3];     // Catch: Throwable -> L15 Exception -> L17
        if (Arrays.equals(r26, r64) == false) goto L57;
        r3.readFully(r12);     // Catch: Throwable -> L15 Exception -> L17
        byte[] r11 = new byte[3];     // Catch: Throwable -> L15 Exception -> L17
        r3.readFully(r11);     // Catch: Throwable -> L15 Exception -> L17
        if (Arrays.equals(f24171P, r11) == false) goto L56;
        int r112 = r3.readInt();     // Catch: Throwable -> L15 Exception -> L17
        r16 = -1;
        int r10 = (r112 >> 16) & 16383;     // Catch: Throwable -> L15 Exception -> L17
        int r20 = r152 - 10;
        int r153 = r112 & 16383;     // Catch: Throwable -> L15 Exception -> L17
        r14 = false;
    L69:
        r9.write(r44);     // Catch: Throwable -> L15 Exception -> L17
        r9.i(10);     // Catch: Throwable -> L15 Exception -> L17
        byte[] r46 = new byte[10];     // Catch: Throwable -> L15 Exception -> L17
        if (r14 == false) goto L72;
        r46[0] = (byte) (r46[0] | Ascii.DLE);     // Catch: Throwable -> L15 Exception -> L17
    L72:
        r46[0] = (byte) (r46[0] | 8);     // Catch: Throwable -> L15 Exception -> L17
        int r154 = r153 - 1;
        int r102 = r10 - 1;
        r46[4] = (byte) r154;     // Catch: Throwable -> L15 Exception -> L17
        r46[5] = (byte) (r154 >> 8);     // Catch: Throwable -> L15 Exception -> L17
        r46[6] = (byte) (r154 >> 16);     // Catch: Throwable -> L15 Exception -> L17
        r46[7] = (byte) r102;     // Catch: Throwable -> L15 Exception -> L17
        r46[8] = (byte) (r102 >> 8);     // Catch: Throwable -> L15 Exception -> L17
        r46[9] = (byte) (r102 >> 16);     // Catch: Throwable -> L15 Exception -> L17
        r9.write(r46);     // Catch: Throwable -> L15 Exception -> L17
        r9.write(r26);     // Catch: Throwable -> L15 Exception -> L17
        r9.i(r72);     // Catch: Throwable -> L15 Exception -> L17
        if (Arrays.equals(r26, r64) == false) goto L77;
        r9.write(r12);     // Catch: Throwable -> L15 Exception -> L17
        r9.write(f24171P);     // Catch: Throwable -> L15 Exception -> L17
        r9.i(r112);     // Catch: Throwable -> L15 Exception -> L17
    L79:
        androidx.exifinterface.media.b.e(r3, r9, r20);     // Catch: Throwable -> L15 Exception -> L17
        r25 = q0(r9);     // Catch: Throwable -> L15 Exception -> L17
        goto L80
    L77:
        if (Arrays.equals(r26, f24173R) == false) goto L79;
        r9.write(47);     // Catch: Throwable -> L15 Exception -> L17
        r9.i(r112);     // Catch: Throwable -> L15 Exception -> L17
        goto L79
    L56:
        throw new IOException("Error checking VP8 signature");     // Catch: Throwable -> L15 Exception -> L17
    L57:
        r16 = -1;
        if (Arrays.equals(r26, f24173R) == true) goto L60;
        r20 = r152;
        r10 = 0;
        r112 = 0;
        r14 = false;
        r153 = 0;
        goto L69
    L60:
        if (r3.readByte() != 47) goto L67;
        r112 = r3.readInt();     // Catch: Throwable -> L15 Exception -> L17
        int r103 = (r112 & 16383) + 1;     // Catch: Throwable -> L15 Exception -> L17
        int r18 = ((r112 & 268419072) >>> 14) + 1;     // Catch: Throwable -> L15 Exception -> L17
        if ((r112 & 268435456) != 0) goto L65;
        r14 = false;
    L65:
        r20 = r152 - 5;
        r153 = r103;
        r10 = r18;
        goto L69
    L67:
        throw new IOException("Error checking VP8L signature");     // Catch: Throwable -> L15 Exception -> L17
    L49:
        r152 = r72;
        goto L50
    L42:
        if (Arrays.equals(r26, f24173R) == true) goto L45;
        r25 = -1;
    L17:
        e = e;
    L90:
        throw new IOException("Failed to save WebP file", e);     // Catch: Throwable -> L86
    L15:
        th = th;
        r7 = r8;
    L91:
        androidx.exifinterface.media.b.b(r7);
        throw th;
    L86:
        th = th;
    L88:
        e = e;
        goto L90
    }

    public void g0(double r3) {
        if (r3 < 0.0d) goto L5;
        String r02 = "0";
    L6:
        h0("GPSAltitude", f.b(Math.abs(r3)).toString());
        h0("GPSAltitudeRef", r02);
        return;
    L5:
        r02 = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
        goto L6
    }

    public final void h(b r3, c r4, byte[] r5, byte[] r6) {
    L2:
        byte[] r02 = new byte[4];
        r3.readFully(r02);
        i(r3, r4, r02);
        if (Arrays.equals(r02, r5) == true) goto L7;
        if (r6 == null) goto L2;
        if (Arrays.equals(r02, r6) == false) goto L2;
        return;
    }

    public void h0(String r24, String r25) {
        String r1 = r24;
        String r2 = r25;
        if (r1 == null) goto L147;
        if ("ISOSpeedRatings".equals(r1) == true) goto L7;
    L10:
        int r5 = 2;
        String r6 = RemoteSettings.FORWARD_SLASH_STRING;
        int r7 = 1;
        if (r2 != null) goto L13;
    L42:
        int r10 = 0;
        if ("Xmp".equals(r1) == true) goto L45;
    L63:
        int r3 = 0;
    L65:
        if (r3 >= f24192k0.length) goto L145;
        if (r3 == 4) goto L69;
    L71:
        e r8 = (e) f24195n0[r3].get(r1);
        if (r8 != null) goto L73;
    L70:
        String r22 = r6;
        int r242 = r7;
        int r20 = r10;
    L144:
        r3 = r3 + 1;
        r7 = r242;
        r10 = r20;
        r6 = r22;
        r5 = 2;
        goto L65
    L73:
        if (r2 != null) goto L75;
        this.f24213f[r3].remove(r1);
        goto L70
    L75:
        Pair r9 = D(r2);
        if (r8.f24244c != ((Integer) r9.first).intValue()) goto L78;
    L105:
        int r82 = r8.f24244c;
    L107:
        switch(r82) {
            case 1: goto L143;
            case 2: goto L142;
            case 3: goto L137;
            case 4: goto L132;
            case 5: goto L127;
            case 6: goto L109;
            case 7: goto L142;
            case 8: goto L109;
            case 9: goto L122;
            case 10: goto L116;
            case 11: goto L109;
            case 12: goto L111;
            default: goto L109;
        };
    L111:
        String[] r83 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        double[] r92 = new double[r83.length];
        int r11 = r10;
    L113:
        if (r11 >= r83.length) goto L115;
        r92[r11] = Double.parseDouble(r83[r11]);
        r11 = r11 + 1;
        goto L113
    L115:
        this.f24213f[r3].put(r1, d.b(r92, this.f24215h));
        goto L70
    L116:
        String[] r84 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        f[] r93 = new f[r84.length];
        int r112 = r10;
    L118:
        if (r112 >= r84.length) goto L120;
        String[] r12 = r84[r112].split(r6, -1);
        int r243 = r7;
        int r21 = r112;
        r93[r21] = new f((long) Double.parseDouble(r12[r10]), (long) Double.parseDouble(r12[r243]), null);
        r112 = r21 + 1;
        r7 = r243;
        r84 = r84;
        r10 = r10;
        goto L118
    L120:
        r242 = r7;
        r20 = r10;
        this.f24213f[r3].put(r1, d.d(r93, this.f24215h));
    L121:
        r22 = r6;
        goto L144
    L122:
        r242 = r7;
        r20 = r10;
        String[] r72 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        int[] r85 = new int[r72.length];
        int r94 = r20;
    L124:
        if (r94 >= r72.length) goto L126;
        r85[r94] = Integer.parseInt(r72[r94]);
        r94 = r94 + 1;
        goto L124
    L126:
        this.f24213f[r3].put(r1, d.c(r85, this.f24215h));
        goto L121
    L127:
        r242 = r7;
        r20 = r10;
        String[] r73 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        f[] r86 = new f[r73.length];
        int r95 = r20;
    L129:
        if (r95 >= r73.length) goto L131;
        String[] r102 = r73[r95].split(r6, -1);
        r86[r95] = new f((long) Double.parseDouble(r102[r20]), (long) Double.parseDouble(r102[r242]), null);
        r95 = r95 + 1;
        r6 = r6;
        goto L129
    L131:
        r22 = r6;
        this.f24213f[r3].put(r1, d.i(r86, this.f24215h));
        goto L144
    L132:
        r22 = r6;
        r242 = r7;
        r20 = r10;
        String[] r52 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        long[] r62 = new long[r52.length];
        int r74 = r20;
    L134:
        if (r74 >= r52.length) goto L136;
        r62[r74] = Long.parseLong(r52[r74]);
        r74 = r74 + 1;
        goto L134
    L136:
        this.f24213f[r3].put(r1, d.g(r62, this.f24215h));
        goto L144
    L137:
        r22 = r6;
        r242 = r7;
        r20 = r10;
        String[] r53 = r2.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, -1);
        int[] r63 = new int[r53.length];
        int r75 = r20;
    L139:
        if (r75 >= r53.length) goto L141;
        r63[r75] = Integer.parseInt(r53[r75]);
        r75 = r75 + 1;
        goto L139
    L141:
        this.f24213f[r3].put(r1, d.k(r63, this.f24215h));
        goto L144
    L142:
        r22 = r6;
        r242 = r7;
        r20 = r10;
        this.f24213f[r3].put(r1, d.e(r2));
        goto L144
    L143:
        r22 = r6;
        r242 = r7;
        r20 = r10;
        this.f24213f[r3].put(r1, d.a(r2));
        goto L144
    L109:
        if (f24204w == false) goto L70;
        Log.d("ExifInterface", "Data format isn't one of expected formats: " + r82);
        goto L70
    L78:
        if (r8.f24244c == ((Integer) r9.second).intValue()) goto L105;
        int r113 = r8.d;
        if (r113 != (-1)) goto L83;
    L87:
        int r114 = r8.f24244c;
        if (r114 != r7) goto L90;
    L104:
        r82 = r114;
        goto L107
    L90:
        if (r114 == 7) goto L104;
        if (r114 == r5) goto L104;
        if (f24204w == false) goto L70;
        StringBuilder r115 = new StringBuilder();
        r115.append("Given tag (");
        r115.append(r1);
        r115.append(") value didn't match with one of expected formats: ");
        String[] r122 = f24179X;
        r115.append(r122[r8.f24244c]);
        String r16 = "";
        if (r8.d != (-1)) goto L98;
        String r87 = "";
    L99:
        r115.append(r87);
        r115.append(" (guess: ");
        r115.append(r122[((Integer) r9.first).intValue()]);
        if (((Integer) r9.second).intValue() == (-1)) goto L103;
        r16 = ", " + r122[((Integer) r9.second).intValue()];
    L103:
        r115.append(r16);
        r115.append(")");
        Log.d("ExifInterface", r115.toString());
        goto L70
    L98:
        r87 = ", " + r122[r8.d];
        goto L99
    L83:
        if (r113 != ((Integer) r9.first).intValue()) goto L85;
    L86:
        r82 = r8.d;
        goto L107
    L85:
        if (r8.d != ((Integer) r9.second).intValue()) goto L87;
    L69:
        if (this.f24216i == true) goto L71;
    L145:
        return;
    L45:
        if (this.f24213f[0].containsKey("Xmp") == false) goto L47;
    L50:
        boolean r88 = true;
    L51:
        int r96 = C(this.d);
        if (r96 == 2) goto L54;
    L56:
        if (r96 != 3) goto L63;
        if (r88 == true) goto L63;
    L58:
        if (r2 == null) goto L60;
        d r13 = d.a(r2);
    L61:
        this.f24228u = r13;
        return;
    L60:
        r13 = null;
        goto L61
    L54:
        if (this.f24228u != null) goto L58;
        if (r88 == false) goto L58;
    L47:
        if (this.f24213f[5].containsKey("Xmp") == true) goto L50;
        r88 = false;
        goto L51
    L13:
        if (f24196o0.contains(r1) == false) goto L21;
        if (r2.contains(RemoteSettings.FORWARD_SLASH_STRING) == true) goto L21;
        r2 = f.b(Double.parseDouble(r2)).toString();     // Catch: NumberFormatException -> L18
    L18:
        Log.w("ExifInterface", "Invalid value for " + r1 + " : " + r2);
        return;
    L21:
        if (r1.equals("GPSTimeStamp") == false) goto L28;
        Matcher r89 = f24202u0.matcher(r2);
        if (r89.find() == true) goto L26;
        Log.w("ExifInterface", "Invalid value for " + r1 + " : " + r2);
        return;
    L26:
        r2 = Integer.parseInt(r89.group(1)) + "/1," + Integer.parseInt(r89.group(2)) + "/1," + Integer.parseInt(r89.group(3)) + "/1";
        goto L42
    L28:
        if ("DateTime".equals(r1) == false) goto L30;
    L33:
        boolean r810 = f24203v0.matcher(r2).find();
        boolean r116 = f24205w0.matcher(r2).find();
        if (r2.length() != 19) goto L40;
        if (r810 == true) goto L38;
        if (r116 == false) goto L40;
    L38:
        if (r116 == false) goto L42;
        r2 = r2.replaceAll("-", ":");
    L40:
        Log.w("ExifInterface", "Invalid value for " + r1 + " : " + r2);
        return;
    L30:
        if ("DateTimeOriginal".equals(r1) == true) goto L33;
        if ("DateTimeDigitized".equals(r1) == false) goto L42;
    L7:
        if (f24204w == false) goto L9;
        Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
    L9:
        r1 = "PhotographicSensitivity";
        goto L10
    L147:
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void i(b r3, c r4, byte[] r5) {
        int r02 = r3.readInt();
        r4.write(r5);
        r4.i(r02);
        if ((r02 % 2) != 1) goto L5;
        r02 = r02 + 1;
    L5:
        androidx.exifinterface.media.b.e(r3, r4, r02);
    }

    public void i0(Location r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        h0("GPSProcessingMethod", r5.getProvider());
        j0(r5.getLatitude(), r5.getLongitude());
        g0(r5.getAltitude());
        h0("GPSSpeedRef", ExifInterface.GpsSpeedRef.KILOMETERS);
        h0("GPSSpeed", f.b((r5.getSpeed() * TimeUnit.HOURS.toSeconds(1)) / 1000.0f).toString());
        String[] r52 = f24177V.format(new Date(r5.getTime())).split("\\s+", -1);
        h0("GPSDateStamp", r52[0]);
        h0("GPSTimeStamp", r52[1]);
    }

    public double j(double r7) {
        double r02 = l("GPSAltitude", -1.0d);
        int r3 = -1;
        int r2 = m("GPSAltitudeRef", -1);
        if (r02 < 0.0d) goto L11;
        if (r2 < 0) goto L11;
        if (r2 == 1) goto L10;
        r3 = 1;
    L10:
        return r02 * r3;
    L11:
        return r7;
    }

    public void j0(double r5, double r7) {
        if (r5 < (-90.0d)) goto L27;
        if (r5 > 90.0d) goto L27;
        if (Double.isNaN(r5) == true) goto L27;
        if (r7 < (-180.0d)) goto L25;
        if (r7 > 180.0d) goto L25;
        if (Double.isNaN(r7) == true) goto L25;
        if (r5 < 0.0d) goto L17;
        String r2 = "N";
    L18:
        h0("GPSLatitudeRef", r2);
        h0("GPSLatitude", f(Math.abs(r5)));
        if (r7 < 0.0d) goto L21;
        String r52 = ExifInterface.GpsLongitudeRef.EAST;
    L22:
        h0("GPSLongitudeRef", r52);
        h0("GPSLongitude", f(Math.abs(r7)));
        return;
    L21:
        r52 = ExifInterface.GpsLongitudeRef.WEST;
        goto L22
    L17:
        r2 = ExifInterface.GpsLatitudeRef.SOUTH;
    L25:
        throw new IllegalArgumentException("Longitude value " + r7 + " is not valid.");
    L27:
        throw new IllegalArgumentException("Latitude value " + r5 + " is not valid.");
    }

    public String k(String r6) {
        if (r6 == null) goto L31;
        d r02 = n(r6);
        if (r02 != null) goto L7;
        return null;
    L7:
        if (r6.equals("GPSTimeStamp") == false) goto L24;
        int r62 = r02.f24239a;
        if (r62 != 5) goto L11;
    L14:
        f[] r63 = (f[]) r02.o(this.f24215h);
        if (r63 != null) goto L17;
    L21:
        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(r63));
        return null;
    L17:
        if (r63.length != 3) goto L21;
        f r03 = r63[0];
        Integer r04 = Integer.valueOf((int) (r03.f24245a / r03.f24246b));
        f r1 = r63[1];
        Integer r12 = Integer.valueOf((int) (r1.f24245a / r1.f24246b));
        f r64 = r63[2];
        return String.format("%02d:%02d:%02d", new Object[]{r04, r12, Integer.valueOf((int) (r64.f24245a / r64.f24246b))});
    L11:
        if (r62 == 10) goto L14;
        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + r02.f24239a);
        return null;
    L24:
        if (f24196o0.contains(r6) == false) goto L29;
        return Double.toString(r02.l(this.f24215h));
    L27:
        return null;
    L29:
        return r02.n(this.f24215h);
    L31:
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void k0(b r5) {
        HashMap r02 = this.f24213f[4];
        d r1 = (d) r02.get("Compression");
        if (r1 == null) goto L16;
        int r12 = r1.m(this.f24215h);
        this.f24222o = r12;
        if (r12 == 1) goto L13;
        if (r12 != 6) goto L8;
        E(r5, r02);
        return;
    L8:
        if (r12 == 7) goto L13;
        return;
    L13:
        if (P(r02) == false) goto L18;
        F(r5, r02);
        return;
    L18:
        return;
    L16:
        this.f24222o = 6;
        E(r5, r02);
    }

    public double l(String r2, double r3) {
        if (r2 == null) goto L10;
        d r22 = n(r2);
        if (r22 != null) goto L12;
    L8:
        return r3;
    L12:
        return r22.l(this.f24215h);
    L10:
        throw new NullPointerException("tag shouldn't be null");
    }

    public int m(String r2, int r3) {
        if (r2 == null) goto L10;
        d r22 = n(r2);
        if (r22 != null) goto L12;
    L8:
        return r3;
    L12:
        return r22.m(this.f24215h);
    L10:
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void m0(int r7, int r8) {
        if (this.f24213f[r7].isEmpty() == true) goto L28;
        if (this.f24213f[r8].isEmpty() == true) goto L28;
        d r02 = (d) this.f24213f[r7].get("ImageLength");
        d r3 = (d) this.f24213f[r7].get("ImageWidth");
        d r2 = (d) this.f24213f[r8].get("ImageLength");
        d r4 = (d) this.f24213f[r8].get("ImageWidth");
        if (r02 == null) goto L24;
        if (r3 == null) goto L24;
        if (r2 == null) goto L20;
        if (r4 == null) goto L20;
        int r03 = r02.m(this.f24215h);
        int r1 = r3.m(this.f24215h);
        int r22 = r2.m(this.f24215h);
        int r32 = r4.m(this.f24215h);
        if (r03 >= r22) goto L31;
        if (r1 >= r32) goto L32;
        HashMap[] r04 = this.f24213f;
        HashMap r12 = r04[r7];
        r04[r7] = r04[r8];
        r04[r8] = r12;
        return;
    L32:
        return;
    L31:
        return;
    L20:
        if (f24204w == false) goto L33;
        Log.d("ExifInterface", "Second image does not contain valid size information");
        return;
    L33:
        return;
    L24:
        if (f24204w == false) goto L34;
        Log.d("ExifInterface", "First image does not contain valid size information");
        return;
    L34:
        return;
    L28:
        if (f24204w == false) goto L35;
        Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        return;
    }

    public final d n(String r4) {
        if (r4 == null) goto L31;
        if ("ISOSpeedRatings".equals(r4) == false) goto L10;
        if (f24204w == false) goto L8;
        Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
    L8:
        r4 = "PhotographicSensitivity";
    L10:
        if ("Xmp".equals(r4) == true) goto L12;
    L16:
        int r1 = 0;
    L18:
        if (r1 >= f24192k0.length) goto L24;
        d r2 = (d) this.f24213f[r1].get(r4);
        if (r2 != null) goto L21;
        r1 = r1 + 1;
        goto L18
    L21:
        return r2;
    L24:
        if ("Xmp".equals(r4) == false) goto L28;
        d r42 = this.f24228u;
        if (r42 == null) goto L34;
        return r42;
    L34:
        return null;
    L28:
        return null;
    L12:
        if (C(this.d) != 2) goto L16;
        d r12 = this.f24228u;
        if (r12 == null) goto L16;
        return r12;
    L31:
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void o(g r14, int r15) {
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 28) goto L65;
        if (r15 != 15) goto L10;
        if (r1 >= 31) goto L10;
        throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
    L10:
        MediaMetadataRetriever r152 = new MediaMetadataRetriever();
        b.a.a(r152, new C0197a(this, r14));     // Catch: Throwable -> L14 RuntimeException -> L16
        String r12 = r152.extractMetadata(33);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r2 = r152.extractMetadata(34);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r4 = r152.extractMetadata(26);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r5 = r152.extractMetadata(17);     // Catch: Throwable -> L14 RuntimeException -> L16
        if ("yes".equals(r4) == false) goto L19;
        String r02 = r152.extractMetadata(29);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r42 = r152.extractMetadata(30);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r3 = r152.extractMetadata(31);     // Catch: Throwable -> L14 RuntimeException -> L16
    L23:
        if (r02 == null) goto L25;
        this.f24213f[0].put("ImageWidth", d.j(Integer.parseInt(r02), this.f24215h));     // Catch: Throwable -> L14 RuntimeException -> L16
    L25:
        if (r42 == null) goto L28;
        this.f24213f[0].put("ImageLength", d.j(Integer.parseInt(r42), this.f24215h));     // Catch: Throwable -> L14 RuntimeException -> L16
    L28:
        if (r3 == null) goto L40;
        int r8 = Integer.parseInt(r3);     // Catch: Throwable -> L14 RuntimeException -> L16
        if (r8 != 90) goto L32;
        int r82 = 6;
    L39:
        this.f24213f[0].put("Orientation", d.j(r82, this.f24215h));     // Catch: Throwable -> L14 RuntimeException -> L16
        goto L40
    L32:
        if (r8 != 180) goto L34;
        r82 = 3;
        goto L39
    L34:
        if (r8 == 270) goto L36;
        r82 = 1;
        goto L39
    L36:
        r82 = 8;
    L40:
        if (r12 == null) goto L51;
        if (r2 == null) goto L51;
        int r13 = Integer.parseInt(r12);     // Catch: Throwable -> L14 RuntimeException -> L16
        int r22 = Integer.parseInt(r2);     // Catch: Throwable -> L14 RuntimeException -> L16
        if (r22 <= 6) goto L50;
        r14.t(r13);     // Catch: Throwable -> L14 RuntimeException -> L16
        byte[] r83 = new byte[6];     // Catch: Throwable -> L14 RuntimeException -> L16
        r14.readFully(r83);     // Catch: Throwable -> L14 RuntimeException -> L16
        int r16 = r13 + 6;     // Catch: Throwable -> L14 RuntimeException -> L16
        int r23 = r22 - 6;
        if (Arrays.equals(r83, f24199r0) == false) goto L48;
        byte[] r24 = new byte[r23];     // Catch: Throwable -> L14 RuntimeException -> L16
        r14.readFully(r24);     // Catch: Throwable -> L14 RuntimeException -> L16
        this.f24223p = r16;     // Catch: Throwable -> L14 RuntimeException -> L16
        X(r24, 0);     // Catch: Throwable -> L14 RuntimeException -> L16
        goto L51
    L48:
        throw new IOException("Invalid identifier");     // Catch: Throwable -> L14 RuntimeException -> L16
    L50:
        throw new IOException("Invalid exif length");     // Catch: Throwable -> L14 RuntimeException -> L16
    L51:
        String r17 = r152.extractMetadata(41);     // Catch: Throwable -> L14 RuntimeException -> L16
        String r25 = r152.extractMetadata(42);     // Catch: Throwable -> L14 RuntimeException -> L16
        if (r17 == null) goto L56;
        if (r25 == null) goto L56;
        int r18 = Integer.parseInt(r17);     // Catch: Throwable -> L14 RuntimeException -> L16
        int r9 = Integer.parseInt(r25);     // Catch: Throwable -> L14 RuntimeException -> L16
        long r10 = r18;
        r14.t(r10);     // Catch: Throwable -> L14 RuntimeException -> L16
        byte[] r122 = new byte[r9];     // Catch: Throwable -> L14 RuntimeException -> L16
        r14.readFully(r122);     // Catch: Throwable -> L14 RuntimeException -> L16
        this.f24228u = new d(1, r9, r10, r122);     // Catch: Throwable -> L14 RuntimeException -> L16
        this.f24229v = true;     // Catch: Throwable -> L14 RuntimeException -> L16
    L56:
        if (f24204w == false) goto L69;
        Log.d("ExifInterface", "Heif meta: " + r02 + "x" + r42 + ", rotation " + r3);     // Catch: Throwable -> L14 RuntimeException -> L16
    L69:
        r152.release();     // Catch: IOException -> L66
        return;
    L73:
        return;
    L19:
        if ("yes".equals(r5) == false) goto L21;
        r02 = r152.extractMetadata(18);     // Catch: Throwable -> L14 RuntimeException -> L16
        r42 = r152.extractMetadata(19);     // Catch: Throwable -> L14 RuntimeException -> L16
        r3 = r152.extractMetadata(24);     // Catch: Throwable -> L14 RuntimeException -> L16
        goto L23
    L21:
        r02 = null;
        r3 = null;
        r42 = null;
    L14:
        th = move-exception;
        r152.release();     // Catch: IOException -> L67
        throw th;
    L74:
        throw th;
    L16:
        e = move-exception;
        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);     // Catch: Throwable -> L14
    L65:
        throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
    }

    public final void o0(g r10, int r11) {
        d r02 = (d) this.f24213f[r11].get("DefaultCropSize");
        d r1 = (d) this.f24213f[r11].get("SensorTopBorder");
        d r2 = (d) this.f24213f[r11].get("SensorLeftBorder");
        d r3 = (d) this.f24213f[r11].get("SensorBottomBorder");
        d r4 = (d) this.f24213f[r11].get("SensorRightBorder");
        if (r02 != null) goto L5;
        if (r1 == null) goto L33;
        if (r2 == null) goto L33;
        if (r3 == null) goto L33;
        if (r4 == null) goto L33;
        int r102 = r1.m(this.f24215h);
        int r03 = r3.m(this.f24215h);
        int r12 = r4.m(this.f24215h);
        int r22 = r2.m(this.f24215h);
        if (r03 <= r102) goto L35;
        if (r12 <= r22) goto L36;
        d r103 = d.j(r03 - r102, this.f24215h);
        d r04 = d.j(r12 - r22, this.f24215h);
        this.f24213f[r11].put("ImageLength", r103);
        this.f24213f[r11].put("ImageWidth", r04);
        return;
    L36:
        return;
    L35:
        return;
    L33:
        b0(r10, r11);
        return;
    L5:
        if (r02.f24239a != 5) goto L14;
        f[] r104 = (f[]) r02.o(this.f24215h);
        if (r104 != null) goto L9;
    L12:
        Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r104));
        return;
    L9:
        if (r104.length != 2) goto L12;
        d r05 = d.h(r104[0], this.f24215h);
        d r105 = d.h(r104[1], this.f24215h);
    L20:
        this.f24213f[r11].put("ImageWidth", r05);
        this.f24213f[r11].put("ImageLength", r105);
        return;
    L14:
        int[] r106 = (int[]) r02.o(this.f24215h);
        if (r106 != null) goto L17;
    L22:
        Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r106));
        return;
    L17:
        if (r106.length != 2) goto L22;
        r05 = d.j(r106[0], this.f24215h);
        r105 = d.j(r106[1], this.f24215h);
        goto L20
    }

    public final void p(b r20, int r21, int r22) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "getJpegAttributes starting with: " + r20);
    L5:
        r20.l(ByteOrder.BIG_ENDIAN);
        byte r3 = r20.readByte();
        if (r3 != (-1)) goto L70;
        if (r20.readByte() != (-40)) goto L68;
        int r32 = 2;
    L10:
        byte r5 = r20.readByte();
        if (r5 != (-1)) goto L66;
    L12:
        int r52 = r32 + 1;
        byte r7 = r20.readByte();
        if (r7 != (-1)) goto L14;
        r32 = r52;
        goto L12
    L14:
        boolean r53 = f24204w;
        if (r53 == false) goto L18;
        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(r7 & UnsignedBytes.MAX_VALUE));
    L18:
        if (r7 == (-39)) goto L62;
        if (r7 == (-38)) goto L62;
        int r8 = r20.readUnsignedShort();
        int r9 = r8 - 2;
        int r33 = r32 + 4;
        if (r53 == false) goto L26;
        Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(r7 & UnsignedBytes.MAX_VALUE) + " (length: " + r8 + ")");
    L26:
        if (r9 < 0) goto L61;
        if (r7 != (-31)) goto L30;
        byte[] r72 = new byte[r9];
        r20.readFully(r72);
        int r82 = r33 + r9;
        byte[] r10 = f24199r0;
        if (androidx.exifinterface.media.b.f(r72, r10) == false) goto L52;
        byte[] r73 = Arrays.copyOfRange(r72, r10.length, r9);
        this.f24223p = (r21 + r33) + r10.length;
        X(r73, r22);
        k0(new b(r73));
    L55:
        r33 = r82;
    L48:
        r9 = 0;
    L56:
        if (r9 < 0) goto L59;
        r20.n(r9);
        r32 = r33 + r9;
        goto L10
    L59:
        throw new IOException("Invalid length");
    L52:
        byte[] r102 = f24200s0;
        if (androidx.exifinterface.media.b.f(r72, r102) == false) goto L55;
        int r34 = r33 + r102.length;
        byte[] r74 = Arrays.copyOfRange(r72, r102.length, r9);
        this.f24228u = new d(1, r74.length, r34, r74);
        this.f24229v = true;
        goto L55
    L30:
        if (r7 == (-2)) goto L45;
        switch(r7) {
            case -64: goto L36;
            case -63: goto L36;
            case -62: goto L36;
            case -61: goto L36;
            default: goto L32;
        };
    L32:
        switch(r7) {
            case -59: goto L36;
            case -58: goto L36;
            case -57: goto L36;
            default: goto L33;
        };
    L33:
        switch(r7) {
            case -55: goto L36;
            case -54: goto L36;
            case -53: goto L36;
            default: goto L34;
        };
    L34:
        switch(r7) {
            case -51: goto L36;
            case -50: goto L36;
            case -49: goto L36;
            default: goto L56;
        };
    L36:
        r20.n(1);
        HashMap r75 = this.f24213f[r22];
        if (r22 == 4) goto L39;
        String r103 = "ImageLength";
    L40:
        r75.put(r103, d.f(r20.readUnsignedShort(), this.f24215h));
        HashMap r76 = this.f24213f[r22];
        if (r22 == 4) goto L43;
        String r92 = "ImageWidth";
    L44:
        r76.put(r92, d.f(r20.readUnsignedShort(), this.f24215h));
        r9 = r8 - 7;
        goto L56
    L43:
        r92 = "ThumbnailImageWidth";
        goto L44
    L39:
        r103 = "ThumbnailImageLength";
        goto L40
    L45:
        byte[] r77 = new byte[r9];
        r20.readFully(r77);
        if (k("UserComment") != null) goto L48;
        this.f24213f[1].put("UserComment", d.e(new String(r77, f24198q0)));
        goto L48
    L61:
        throw new IOException("Invalid length");
    L62:
        r20.l(this.f24215h);
        return;
    L66:
        throw new IOException("Invalid marker:" + Integer.toHexString(r5 & UnsignedBytes.MAX_VALUE));
    L68:
        throw new IOException("Invalid marker: " + Integer.toHexString(r3 & UnsignedBytes.MAX_VALUE));
    L70:
        throw new IOException("Invalid marker: " + Integer.toHexString(r3 & UnsignedBytes.MAX_VALUE));
    }

    public final void p0() {
        m0(0, 5);
        m0(0, 4);
        m0(5, 4);
        d r3 = (d) this.f24213f[1].get("PixelXDimension");
        d r4 = (d) this.f24213f[1].get("PixelYDimension");
        if (r3 == null) goto L7;
        if (r4 == null) goto L7;
        this.f24213f[0].put("ImageWidth", r3);
        this.f24213f[0].put("ImageLength", r4);
    L7:
        if (this.f24213f[4].isEmpty() == false) goto L12;
        if (R(this.f24213f[5]) == false) goto L12;
        HashMap[] r32 = this.f24213f;
        r32[4] = r32[5];
        r32[5] = new HashMap();
    L12:
        if (R(this.f24213f[4]) == true) goto L14;
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    L14:
        a0(0, "ThumbnailOrientation", "Orientation");
        a0(0, "ThumbnailImageLength", "ImageLength");
        a0(0, "ThumbnailImageWidth", "ImageWidth");
        a0(5, "ThumbnailOrientation", "Orientation");
        a0(5, "ThumbnailImageLength", "ImageLength");
        a0(5, "ThumbnailImageWidth", "ImageWidth");
        a0(4, "Orientation", "ThumbnailOrientation");
        a0(4, "ImageLength", "ThumbnailImageLength");
        a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public double[] q() {
        String r02 = k("GPSLatitude");
        String r1 = k("GPSLatitudeRef");
        String r2 = k("GPSLongitude");
        String r3 = k("GPSLongitudeRef");
        if (r02 == null) goto L14;
        if (r1 == null) goto L15;
        if (r2 == null) goto L16;
        if (r3 == null) goto L17;
        return new double[]{g(r02, r1), g(r2, r3)};
    L9:
        Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{r02, r1, r2, r3}));
        return null;
    L17:
        return null;
    L16:
        return null;
    L15:
        return null;
    L14:
        return null;
    }

    public final int q0(c r19) {
        e[][] r2 = f24192k0;
        int[] r3 = new int[r2.length];
        int[] r22 = new int[r2.length];
        e[] r4 = f24193l0;
        int r5 = r4.length;
        int r7 = 0;
    L3:
        if (r7 >= r5) goto L6;
        Z(r4[r7].f24243b);
        r7 = r7 + 1;
        goto L3
    L6:
        if (this.f24216i == true) goto L8;
    L11:
        int r42 = 0;
    L13:
        if (r42 >= f24192k0.length) goto L21;
        Iterator r10 = this.f24213f[r42].entrySet().iterator();
    L16:
        if (r10.hasNext() == false) goto L20;
        if (((Map.Entry) r10.next()).getValue() != null) goto L16;
        r10.remove();
        goto L16
    L20:
        r42 = r42 + 1;
        goto L13
    L21:
        long r11 = 0;
        if (this.f24213f[1].isEmpty() == true) goto L25;
        this.f24213f[0].put(f24193l0[1].f24243b, d.f(0, this.f24215h));
    L25:
        if (this.f24213f[2].isEmpty() == true) goto L28;
        this.f24213f[0].put(f24193l0[2].f24243b, d.f(0, this.f24215h));
    L28:
        if (this.f24213f[3].isEmpty() == true) goto L30;
        char r16 = 2;
        this.f24213f[1].put(f24193l0[3].f24243b, d.f(0, this.f24215h));
    L32:
        if (this.f24216i == true) goto L34;
    L36:
        char r17 = 3;
    L38:
        int r43 = 0;
    L40:
        if (r43 >= f24192k0.length) goto L48;
        Iterator r52 = this.f24213f[r43].entrySet().iterator();
        int r72 = 0;
    L43:
        if (r52.hasNext() == false) goto L47;
        int r14 = ((d) ((Map.Entry) r52.next()).getValue()).p();
        if (r14 <= 4) goto L43;
        r72 = r72 + r14;
        goto L43
    L47:
        r22[r43] = r22[r43] + r72;
        r43 = r43 + 1;
        goto L40
    L48:
        int r44 = 8;
        int r53 = 0;
    L50:
        if (r53 >= f24192k0.length) goto L56;
        if (this.f24213f[r53].isEmpty() == true) goto L54;
        r3[r53] = r44;
        r44 = r44 + (((this.f24213f[r53].size() * 12) + 6) + r22[r53]);
    L54:
        r53 = r53 + 1;
        goto L50
    L56:
        if (this.f24216i == false) goto L63;
        if (this.f24217j == false) goto L60;
        this.f24213f[4].put("StripOffsets", d.j(r44, this.f24215h));
    L61:
        this.f24219l = r44;
        r44 = r44 + this.f24220m;
        goto L63
    L60:
        this.f24213f[4].put("JPEGInterchangeFormat", d.f(r44, this.f24215h));
    L63:
        if (this.d != 4) goto L66;
        r44 = r44 + 8;
    L66:
        if (f24204w == false) goto L72;
        int r54 = 0;
    L69:
        if (r54 >= f24192k0.length) goto L72;
        Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(r54), Integer.valueOf(r3[r54]), Integer.valueOf(this.f24213f[r54].size()), Integer.valueOf(r22[r54]), Integer.valueOf(r44)}));
        r54 = r54 + 1;
    L72:
        if (this.f24213f[1].isEmpty() == true) goto L75;
        this.f24213f[0].put(f24193l0[1].f24243b, d.f(r3[1], this.f24215h));
    L75:
        if (this.f24213f[r16].isEmpty() == true) goto L78;
        this.f24213f[0].put(f24193l0[r16].f24243b, d.f(r3[r16], this.f24215h));
    L78:
        if (this.f24213f[r17].isEmpty() == true) goto L80;
        this.f24213f[1].put(f24193l0[r17].f24243b, d.f(r3[r17], this.f24215h));
    L80:
        int r23 = this.d;
        if (r23 == 4) goto L89;
        if (r23 == 13) goto L87;
        if (r23 != 14) goto L91;
        r19.write(f24170O);
        r19.i(r44);
    L91:
        int r24 = r19.f24237a.size();
        if (this.f24215h != ByteOrder.BIG_ENDIAN) goto L94;
        short r73 = 19789;
    L95:
        r19.k(r73);
        r19.c(this.f24215h);
        r19.n(42);
        r19.l(8);
        int r74 = 0;
    L97:
        if (r74 >= f24192k0.length) goto L125;
        if (this.f24213f[r74].isEmpty() == true) goto L122;
        r19.n(this.f24213f[r74].size());
        int r8 = ((r3[r74] + 2) + (this.f24213f[r74].size() * 12)) + 4;
        Iterator r9 = this.f24213f[r74].entrySet().iterator();
    L102:
        if (r9.hasNext() == false) goto L111;
        Map.Entry r142 = (Map.Entry) r9.next();
        int r102 = ((e) f24195n0[r74].get(r142.getKey())).f24242a;
        d r143 = (d) r142.getValue();
        int r15 = r143.p();
        r19.n(r102);
        r19.n(r143.f24239a);
        r19.i(r143.f24240b);
        if (r15 <= 4) goto L106;
        r19.l(r8);
        r8 = r8 + r15;
        goto L102
    L106:
        r19.write(r143.d);
        if (r15 >= 4) goto L102;
    L108:
        if (r15 >= 4) goto L102;
        r19.f(0);
        r15 = r15 + 1;
        goto L108
    L111:
        if (r74 == 0) goto L113;
    L115:
        long r82 = 0;
        r19.l(0);
    L116:
        Iterator r103 = this.f24213f[r74].entrySet().iterator();
    L118:
        if (r103.hasNext() == false) goto L123;
        byte[] r112 = ((d) ((Map.Entry) r103.next()).getValue()).d;
        if (r112.length <= 4) goto L118;
        r19.write(r112, 0, r112.length);
    L123:
        r74 = r74 + 1;
        r11 = r82;
        goto L97
    L113:
        if (this.f24213f[4].isEmpty() == true) goto L115;
        r19.l(r3[4]);
        r82 = 0;
        goto L116
    L122:
        r82 = r11;
        goto L123
    L125:
        if (this.f24216i == false) goto L128;
        r19.write(A());
    L128:
        if (this.d == 14) goto L130;
    L132:
        r19.c(ByteOrder.BIG_ENDIAN);
        return r24;
    L130:
        if ((r44 % 2) != 1) goto L132;
        r19.f(0);
        goto L132
    L94:
        r73 = 18761;
        goto L95
    L87:
        r19.i(r44);
        r19.i(1700284774);
        goto L91
    L89:
        if (r44 > 65535) goto L135;
        r19.n(r44);
        r19.write(f24199r0);
        goto L91
    L135:
        throw new IllegalStateException("Size of exif data (" + r44 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
    L34:
        if (this.f24217j == false) goto L37;
        this.f24213f[4].put("StripOffsets", d.j(0, this.f24215h));
        this.f24213f[4].put("StripByteCounts", d.j(this.f24220m, this.f24215h));
        goto L36
    L37:
        this.f24213f[4].put("JPEGInterchangeFormat", d.f(0, this.f24215h));
        r17 = 3;
        this.f24213f[4].put("JPEGInterchangeFormatLength", d.f(this.f24220m, this.f24215h));
        goto L38
    L30:
        r16 = 2;
        goto L32
    L8:
        if (this.f24217j == false) goto L10;
        Z("StripOffsets");
        Z("StripByteCounts");
        goto L11
    L10:
        Z("JPEGInterchangeFormat");
        Z("JPEGInterchangeFormatLength");
        goto L11
    }

    public final int r(BufferedInputStream r2) {
        r2.mark(5000);
        byte[] r02 = new byte[5000];
        r2.read(r02);
        r2.reset();
        if (J(r02) == false) goto L7;
        return 4;
    L7:
        if (M(r02) == false) goto L10;
        return 9;
    L10:
        int r22 = I(r02);
        if (r22 == 0) goto L14;
        return r22;
    L14:
        if (K(r02) == false) goto L18;
        return 7;
    L18:
        if (N(r02) == false) goto L22;
        return 10;
    L22:
        if (L(r02) == false) goto L26;
        return 13;
    L26:
        if (S(r02) == false) goto L29;
        return 14;
    L29:
        return 0;
    }

    public final void r0(c r5) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        int r1 = q0(new c(r02, ByteOrder.BIG_ENDIAN));
        this.f24223p = r5.f24237a.size() + r1;
        byte[] r03 = r02.toByteArray();
        r5.write(r03);
        CRC32 r12 = new CRC32();
        r12.update(r03, 4, r03.length - 4);
        r5.i((int) r12.getValue());
    }

    public final void s(g r6) {
        v(r6);
        d r62 = (d) this.f24213f[1].get("MakerNote");
        if (r62 == null) goto L32;
        g r1 = new g(r62.d);
        r1.l(this.f24215h);
        byte[] r63 = f24164I;
        byte[] r2 = new byte[r63.length];
        r1.readFully(r2);
        r1.t(0);
        byte[] r3 = f24165J;
        byte[] r4 = new byte[r3.length];
        r1.readFully(r4);
        if (Arrays.equals(r2, r63) == false) goto L8;
        r1.t(8);
    L10:
        Y(r1, 6);
        d r64 = (d) this.f24213f[7].get("PreviewImageStart");
        d r12 = (d) this.f24213f[7].get("PreviewImageLength");
        if (r64 == null) goto L14;
        if (r12 == null) goto L14;
        this.f24213f[5].put("JPEGInterchangeFormat", r64);
        this.f24213f[5].put("JPEGInterchangeFormatLength", r12);
    L14:
        d r65 = (d) this.f24213f[8].get("AspectFrame");
        if (r65 == null) goto L33;
        int[] r66 = (int[]) r65.o(this.f24215h);
        if (r66 != null) goto L19;
    L30:
        Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(r66));
        return;
    L19:
        if (r66.length != 4) goto L30;
        int r13 = r66[2];
        int r32 = r66[0];
        if (r13 <= r32) goto L34;
        int r42 = r66[3];
        int r67 = r66[1];
        if (r42 <= r67) goto L35;
        int r14 = (r13 - r32) + 1;
        int r43 = (r42 - r67) + 1;
        if (r14 >= r43) goto L28;
        int r15 = r14 + r43;
        r43 = r15 - r43;
        r14 = r15 - r43;
    L28:
        d r68 = d.j(r14, this.f24215h);
        d r02 = d.j(r43, this.f24215h);
        this.f24213f[0].put("ImageWidth", r68);
        this.f24213f[0].put("ImageLength", r02);
        return;
    L35:
        return;
    L34:
        return;
    L33:
        return;
    L8:
        if (Arrays.equals(r4, r3) == false) goto L10;
        r1.t(12);
        goto L10
    }

    public final void s0(c r3) {
        r3.i(this.f24228u.d.length + 22);
        CRC32 r02 = new CRC32();
        r3.i(1767135348);
        n0(r02, 1767135348);
        byte[] r1 = f24167L;
        r3.write(r1);
        r02.update(r1);
        r3.write(this.f24228u.d);
        r02.update(this.f24228u.d);
        r3.i((int) r02.getValue());
        this.f24229v = true;
    }

    public final void t(b r18) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "getPngAttributes starting with: " + r18);
    L5:
        r18.l(ByteOrder.BIG_ENDIAN);
        int r2 = r18.f();
        r18.n(f24166K.length);
        boolean r4 = false;
        boolean r5 = false;
    L6:
        if (r4 == false) goto L41;
        if (r5 == false) goto L41;
    L19:
        this.f24229v = r5;     // Catch: EOFException -> L15
        return;
    L41:
        int r6 = r18.readInt();     // Catch: EOFException -> L15
        int r7 = r18.readInt();     // Catch: EOFException -> L15
        int r8 = (r18.f() + r6) + 4;     // Catch: EOFException -> L15
        if ((r18.f() - r2) != 16) goto L18;
        if (r7 == 1229472850) goto L18;
        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");     // Catch: EOFException -> L15
    L18:
        if (r7 == 1229278788) goto L19;
        if (r7 != 1700284774) goto L30;
        if (r4 == true) goto L30;
        this.f24223p = r18.f() - r2;     // Catch: EOFException -> L15
        byte[] r42 = new byte[r6];     // Catch: EOFException -> L15
        r18.readFully(r42);     // Catch: EOFException -> L15
        int r62 = r18.readInt();     // Catch: EOFException -> L15
        CRC32 r9 = new CRC32();     // Catch: EOFException -> L15
        n0(r9, r7);     // Catch: EOFException -> L15
        r9.update(r42);     // Catch: EOFException -> L15
        if (((int) r9.getValue()) != r62) goto L28;
        X(r42, 0);     // Catch: EOFException -> L15
        p0();     // Catch: EOFException -> L15
        k0(new b(r42));     // Catch: EOFException -> L15
        r4 = true;
    L37:
        r18.n(r8 - r18.f());     // Catch: EOFException -> L15
        goto L6
    L28:
        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + r62 + ", calculated CRC value: " + r9.getValue());     // Catch: EOFException -> L15
    L30:
        if (r7 != 1767135348) goto L37;
        if (r5 == true) goto L37;
        byte[] r72 = f24167L;     // Catch: EOFException -> L15
        if (r6 < r72.length) goto L37;
        int r92 = r72.length;     // Catch: EOFException -> L15
        byte[] r11 = new byte[r92];     // Catch: EOFException -> L15
        r18.readFully(r11);     // Catch: EOFException -> L15
        if (Arrays.equals(r11, r72) == false) goto L37;
        int r52 = r18.f() - r2;     // Catch: EOFException -> L15
        int r13 = r6 - r92;     // Catch: EOFException -> L15
        byte[] r63 = new byte[r13];     // Catch: EOFException -> L15
        r18.readFully(r63);     // Catch: EOFException -> L15
        this.f24228u = new d(1, r13, r52, r63);     // Catch: EOFException -> L15
        r5 = true;
    L15:
        e = move-exception;
        throw new IOException("Encountered corrupt PNG file.", e);
    }

    public final void u(b r8) {
        boolean r02 = f24204w;
        if (r02 == false) goto L5;
        Log.d("ExifInterface", "getRafAttributes starting with: " + r8);
    L5:
        r8.n(84);
        byte[] r3 = new byte[4];
        byte[] r4 = new byte[4];
        byte[] r2 = new byte[4];
        r8.readFully(r3);
        r8.readFully(r4);
        r8.readFully(r2);
        int r32 = ByteBuffer.wrap(r3).getInt();
        int r42 = ByteBuffer.wrap(r4).getInt();
        int r22 = ByteBuffer.wrap(r2).getInt();
        byte[] r43 = new byte[r42];
        r8.n(r32 - r8.f());
        r8.readFully(r43);
        p(new b(r43), r32, 5);
        r8.n(r22 - r8.f());
        r8.l(ByteOrder.BIG_ENDIAN);
        int r23 = r8.readInt();
        if (r02 == false) goto L8;
        Log.d("ExifInterface", "numberOfDirectoryEntry: " + r23);
    L8:
        int r33 = 0;
    L9:
        if (r33 >= r23) goto L20;
        int r44 = r8.readUnsignedShort();
        int r5 = r8.readUnsignedShort();
        if (r44 == f24187f0.f24242a) goto L12;
        r8.n(r5);
        r33 = r33 + 1;
        goto L9
    L12:
        short r24 = r8.readShort();
        short r82 = r8.readShort();
        d r34 = d.j(r24, this.f24215h);
        d r45 = d.j(r82, this.f24215h);
        this.f24213f[0].put("ImageLength", r34);
        this.f24213f[0].put("ImageWidth", r45);
        if (f24204w == false) goto L17;
        Log.d("ExifInterface", "Updated to length: " + r24 + ", width: " + r82);
        return;
    L17:
        return;
    }

    public final void v(g r4) {
        U(r4);
        Y(r4, 0);
        o0(r4, 0);
        o0(r4, 5);
        o0(r4, 4);
        p0();
        if (this.d != 8) goto L10;
        d r42 = (d) this.f24213f[1].get("MakerNote");
        if (r42 == null) goto L11;
        g r1 = new g(r42.d);
        r1.l(this.f24215h);
        r1.n(6);
        Y(r1, 9);
        d r43 = (d) this.f24213f[9].get("ColorSpace");
        if (r43 == null) goto L12;
        this.f24213f[1].put("ColorSpace", r43);
        return;
    L12:
        return;
    L11:
        return;
    }

    public int w() {
        switch(m("Orientation", 1)) {
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            case 7: goto L6;
            case 8: goto L8;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 90;
    L8:
        return SubsamplingScaleImageView.ORIENTATION_270;
    L10:
        return SubsamplingScaleImageView.ORIENTATION_180;
    }

    public final void x(g r5) {
        if (f24204w == false) goto L5;
        Log.d("ExifInterface", "getRw2Attributes starting with: " + r5);
    L5:
        v(r5);
        d r52 = (d) this.f24213f[0].get("JpgFromRaw");
        if (r52 == null) goto L8;
        p(new b(r52.d), (int) r52.f24241c, 5);
    L8:
        d r53 = (d) this.f24213f[0].get("ISO");
        d r02 = (d) this.f24213f[1].get("PhotographicSensitivity");
        if (r53 == null) goto L13;
        if (r02 != null) goto L14;
        this.f24213f[1].put("PhotographicSensitivity", r53);
        return;
    L14:
        return;
    }

    public final boolean y(g r4) {
        byte[] r02 = f24199r0;
        byte[] r1 = new byte[r02.length];
        r4.readFully(r1);
        if (Arrays.equals(r1, r02) == true) goto L6;
        Log.w("ExifInterface", "Given data is not EXIF-only.");
        return false;
    L6:
        byte[] r42 = r4.i();
        this.f24223p = r02.length;
        X(r42, 0);
        return true;
    }

    public byte[] z() {
        int r02 = this.f24222o;
        if (r02 == 6) goto L10;
        if (r02 == 7) goto L10;
        return null;
    L10:
        return A();
    }

    public a(InputStream r2) {
        this(r2, 0);
    }

    public a(InputStream r3, int r4) {
        e[][] r02 = f24192k0;
        this.f24213f = new HashMap[r02.length];
        this.f24214g = new HashSet(r02.length);
        this.f24215h = ByteOrder.BIG_ENDIAN;
        if (r3 == null) goto L23;
        this.f24209a = null;
        boolean r1 = true;
        if (r4 == 1) goto L8;
        r1 = false;
    L8:
        this.f24212e = r1;
        if (r1 == false) goto L12;
        this.f24211c = null;
        this.f24210b = null;
    L20:
        T(r3);
        return;
    L12:
        if ((r3 instanceof AssetManager.AssetInputStream) == false) goto L15;
        this.f24211c = (AssetManager.AssetInputStream) r3;
        this.f24210b = null;
        goto L20
    L15:
        if ((r3 instanceof FileInputStream) == false) goto L19;
        FileInputStream r42 = (FileInputStream) r3;
        if (O(r42.getFD()) == false) goto L19;
        this.f24211c = null;
        this.f24210b = r42.getFD();
    L19:
        this.f24211c = null;
        this.f24210b = null;
        goto L20
    L23:
        throw new NullPointerException("inputStream cannot be null");
    }
}
