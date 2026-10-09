package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33031a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f33032b = null;

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] r1, int r2);

        short c();

        long skip(long r1);
    }

    public static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33033a;

        public a(ByteBuffer r2) {
            this.f33033a = r2;
            r2.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] r3, int r4) {
            int r42 = Math.min(r4, this.f33033a.remaining());
            if (r42 != 0) goto L6;
            return -1;
        L6:
            this.f33033a.get(r3, 0, r42);
            return r42;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            if (this.f33033a.remaining() < 1) goto L7;
            return (short) (this.f33033a.get() & UnsignedBytes.MAX_VALUE);
        L7:
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r3) {
            int r32 = (int) Math.min(this.f33033a.remaining(), r3);
            ByteBuffer r4 = this.f33033a;
            r4.position(r4.position() + r32);
            return r32;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33034a;

        public b(byte[] r2, int r3) {
            this.f33034a = (ByteBuffer) ByteBuffer.wrap(r2).order(ByteOrder.BIG_ENDIAN).limit(r3);
        }

        public short a(int r2) {
            if (c(r2, 2) == true) goto L5;
            return -1;
        L5:
            return this.f33034a.getShort(r2);
        }

        public int b(int r2) {
            if (c(r2, 4) == true) goto L5;
            return -1;
        L5:
            return this.f33034a.getInt(r2);
        }

        public final boolean c(int r2, int r3) {
            if ((this.f33034a.remaining() - r2) < r3) goto L6;
            return true;
        L6:
            return false;
        }

        public int d() {
            return this.f33034a.remaining();
        }

        public void e(ByteOrder r2) {
            this.f33034a.order(r2);
        }
    }

    public static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f33035a;

        public c(InputStream r1) {
            this.f33035a = r1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] r5, int r6) {
            int r02 = 0;
            int r1 = 0;
        L4:
            if (r02 >= r6) goto L8;
            r1 = this.f33035a.read(r5, r02, r6 - r02);
            if (r1 == (-1)) goto L8;
            r02 = r02 + r1;
        L8:
            if (r02 != 0) goto L13;
            if (r1 != (-1)) goto L13;
            throw new Reader.EndOfFileException();
        L13:
            return r02;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            int r02 = this.f33035a.read();
            if (r02 == (-1)) goto L7;
            return (short) r02;
        L7:
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r8) {
            if (r8 >= 0) goto L5;
            return 0;
        L5:
            long r2 = r8;
        L7:
            if (r2 <= 0) goto L16;
            long r4 = this.f33035a.skip(r2);
            if (r4 > 0) goto L10;
            if (this.f33035a.read() == (-1)) goto L16;
            r4 = 1;
        L10:
            r2 = r2 - r4;
        L16:
            return r8 - r2;
        }
    }

    static {
        f33031a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        f33032b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    public DefaultImageHeaderParser() {
    }

    public static int e(int r02, int r1) {
        return (r02 + 2) + (r1 * 12);
    }

    public static boolean h(int r2) {
        if ((r2 & 65496) != 65496) goto L5;
        return true;
    L5:
        if (r2 != 19789) goto L7;
        return true;
    L7:
        if (r2 == 18761) goto L14;
        return false;
    L14:
        return true;
    }

    public static int k(b r12) {
        short r1 = r12.a(6);
        if (r1 != 18761) goto L5;
        ByteOrder r13 = ByteOrder.LITTLE_ENDIAN;
    L12:
        r12.e(r13);
        int r14 = r12.b(10) + 6;
        short r02 = r12.a(r14);
        int r2 = 0;
    L13:
        if (r2 >= r02) goto L56;
        int r5 = e(r14, r2);
        short r6 = r12.a(r5);
        if (r6 != 274) goto L55;
        short r7 = r12.a(r5 + 2);
        if (r7 < 1) goto L53;
        if (r7 > 12) goto L53;
        int r8 = r12.b(r5 + 4);
        if (r8 >= 0) goto L28;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L55;
        Log.d("DfltImageHeaderParser", "Negative tiff component count");
        goto L55
    L28:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L30;
        Log.d("DfltImageHeaderParser", "Got tagIndex=" + r2 + " tagType=" + r6 + " formatCode=" + r7 + " componentCount=" + r8);
    L30:
        int r82 = r8 + f33032b[r7];
        if (r82 > 4) goto L33;
        int r52 = r5 + 8;
        if (r52 < 0) goto L50;
        if (r52 > r12.d()) goto L50;
        if (r82 < 0) goto L47;
        if ((r82 + r52) > r12.d()) goto L47;
        return r12.a(r52);
    L47:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L55;
        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + r6);
    L50:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L55;
        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + r52 + " tagType=" + r6);
        goto L55
    L33:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L55;
        Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + r7);
    L53:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L55;
        Log.d("DfltImageHeaderParser", "Got invalid format code = " + r7);
    L55:
        r2 = r2 + 1;
        goto L13
    L56:
        return -1;
    L5:
        if (r1 != 19789) goto L7;
        r13 = ByteOrder.BIG_ENDIAN;
        goto L12
    L7:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L9;
        Log.d("DfltImageHeaderParser", "Unknown endianness = " + r1);
    L9:
        r13 = ByteOrder.BIG_ENDIAN;
        goto L12
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(ByteBuffer r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        return f(new a((ByteBuffer) com.bumptech.glide.util.k.d(r2)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(r3));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream r2) {
        return g(new c((InputStream) com.bumptech.glide.util.k.d(r2)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        return f(new c((InputStream) com.bumptech.glide.util.k.d(r2)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(r3));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(ByteBuffer r2) {
        return g(new a((ByteBuffer) com.bumptech.glide.util.k.d(r2)));
    }

    public final int f(Reader r6, com.bumptech.glide.load.engine.bitmap_recycle.b r7) {
        int r1 = r6.a();     // Catch: Reader.EndOfFileException -> L23
        if (h(r1) == false) goto L7;
        int r12 = j(r6);     // Catch: Reader.EndOfFileException -> L23
        if (r12 == (-1)) goto L13;
        byte[] r2 = (byte[]) r7.c(r12, byte[].class);     // Catch: Reader.EndOfFileException -> L23
        int r62 = l(r6, r2, r12);     // Catch: Throwable -> L20
        r7.put(r2);     // Catch: Reader.EndOfFileException -> L23
        return r62;
    L20:
        th = move-exception;
        r7.put(r2);     // Catch: Reader.EndOfFileException -> L23
        throw th;     // Catch: Reader.EndOfFileException -> L23
    L13:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L15;
        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");     // Catch: Reader.EndOfFileException -> L23
    L15:
        return -1;
    L7:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L9;
        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + r1);     // Catch: Reader.EndOfFileException -> L23
    L9:
        return -1;
    L23:
        return -1;
    }

    public final ImageHeaderParser.ImageType g(Reader r6) {
        int r02 = r6.a();     // Catch: Reader.EndOfFileException -> L55
        if (r02 == 65496) goto L5;
        int r03 = (r02 << 8) | r6.c();     // Catch: Reader.EndOfFileException -> L55
        if (r03 == 4671814) goto L9;
        int r04 = (r03 << 8) | r6.c();     // Catch: Reader.EndOfFileException -> L55
        if (r04 != (-1991225785)) goto L22;
        r6.skip(21);     // Catch: Reader.EndOfFileException -> L55
        if (r6.c() < 3) goto L18;
        return ImageHeaderParser.ImageType.PNG_A;
    L18:
        return ImageHeaderParser.ImageType.PNG;
    L20:
        return ImageHeaderParser.ImageType.PNG;
    L22:
        if (r04 != 1380533830) goto L24;
        r6.skip(4);     // Catch: Reader.EndOfFileException -> L55
        if (((r6.a() << 16) | r6.a()) != 1464156752) goto L28;
        int r2 = (r6.a() << 16) | r6.a();     // Catch: Reader.EndOfFileException -> L55
        if ((r2 & (-256)) != 1448097792) goto L32;
        int r22 = r2 & Constants.MAX_HOST_LENGTH;     // Catch: Reader.EndOfFileException -> L55
        if (r22 != 88) goto L46;
        r6.skip(4);     // Catch: Reader.EndOfFileException -> L55
        short r62 = r6.c();     // Catch: Reader.EndOfFileException -> L55
        if ((r62 & 2) == 0) goto L40;
        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
    L40:
        if ((r62 & 16) == 0) goto L44;
        return ImageHeaderParser.ImageType.WEBP_A;
    L44:
        return ImageHeaderParser.ImageType.WEBP;
    L46:
        if (r22 != 76) goto L54;
        r6.skip(4);     // Catch: Reader.EndOfFileException -> L55
        if ((r6.c() & 8) == 0) goto L52;
        return ImageHeaderParser.ImageType.WEBP_A;
    L52:
        return ImageHeaderParser.ImageType.WEBP;
    L54:
        return ImageHeaderParser.ImageType.WEBP;
    L32:
        return ImageHeaderParser.ImageType.UNKNOWN;
    L28:
        return ImageHeaderParser.ImageType.UNKNOWN;
    L24:
        return m(r6, r04);
    L9:
        return ImageHeaderParser.ImageType.GIF;
    L5:
        return ImageHeaderParser.ImageType.JPEG;
    L56:
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final boolean i(byte[] r5, int r6) {
        if (r5 != null) goto L5;
    L7:
        boolean r62 = false;
    L8:
        if (r62 == false) goto L16;
        int r1 = 0;
    L10:
        byte[] r2 = f33031a;
        if (r1 >= r2.length) goto L16;
        if (r5[r1] != r2[r1]) goto L14;
        r1 = r1 + 1;
        goto L10
    L14:
        return false;
    L16:
        return r62;
    L5:
        if (r6 <= f33031a.length) goto L7;
        r62 = true;
        goto L8
    }

    public final int j(Reader r10) {
    L2:
        short r02 = r10.c();
        if (r02 != 255) goto L5;
        short r03 = r10.c();
        if (r03 == 218) goto L10;
        if (r03 == 217) goto L14;
        int r1 = r10.a() - 2;
        if (r03 == 225) goto L25;
        long r5 = r1;
        long r7 = r10.skip(r5);
        if (r7 == r5) goto L2;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L24;
        Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + r03 + ", wanted to skip: " + r1 + ", but actually skipped: " + r7);
    L24:
        return -1;
    L25:
        return r1;
    L14:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L16;
        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
    L16:
        return -1;
    L10:
        return -1;
    L5:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L7;
        Log.d("DfltImageHeaderParser", "Unknown segmentId=" + r02);
    L7:
        return -1;
    }

    public final int l(Reader r4, byte[] r5, int r6) {
        int r42 = r4.b(r5, r6);
        if (r42 == r6) goto L9;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L7;
        Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + r6 + ", actually read: " + r42);
    L7:
        return -1;
    L9:
        if (i(r5, r6) == false) goto L13;
        return k(new b(r5, r6));
    L13:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L15;
        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
    L15:
        return -1;
    }

    public final ImageHeaderParser.ImageType m(Reader r8, int r9) {
        if (((r8.a() << 16) | r8.a()) != 1718909296) goto L5;
        int r02 = (r8.a() << 16) | r8.a();
        if (r02 == 1635150195) goto L9;
        int r2 = 0;
        if (r02 != 1635150182) goto L13;
        boolean r03 = true;
    L14:
        r8.skip(4);
        int r92 = r9 - 16;
        if ((r92 % 4) == 0) goto L17;
    L26:
        if (r03 == false) goto L30;
        return ImageHeaderParser.ImageType.AVIF;
    L30:
        return ImageHeaderParser.ImageType.UNKNOWN;
    L17:
        if (r2 >= 5) goto L26;
        if (r92 <= 0) goto L26;
        int r5 = (r8.a() << 16) | r8.a();
        if (r5 == 1635150195) goto L22;
        if (r5 != 1635150182) goto L25;
        r03 = true;
    L25:
        r2 = r2 + 1;
        r92 = r92 - 4;
        goto L17
    L22:
        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
    L13:
        r03 = false;
        goto L14
    L9:
        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
    L5:
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
