package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = null;
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET = 0;
    private static final Class<?> FILE_OUTPUT_STREAM_CLASS = null;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    static {
        BUFFER = new ThreadLocal();
        Class<?> r02 = safeGetClass("java.io.FileOutputStream");
        FILE_OUTPUT_STREAM_CLASS = r02;
        CHANNEL_FIELD_OFFSET = getChannelFieldOffset(r02);
    }

    private ByteBufferWriter() {
    }

    public static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    private static byte[] getBuffer() {
        SoftReference<byte[]> r02 = BUFFER.get();
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.get();
    }

    private static long getChannelFieldOffset(Class<?> r2) {
        if (r2 != null) goto L10;
        return -1;
    L10:
        if (UnsafeUtil.hasUnsafeArrayOperations() == false) goto L12;
        return UnsafeUtil.objectFieldOffset(r2.getDeclaredField("channel"));
    L12:
        return -1;
    L13:
        return -1;
    }

    private static byte[] getOrCreateBuffer(int r2) {
        int r22 = Math.max(r2, 1024);
        byte[] r02 = getBuffer();
        if (r02 != null) goto L5;
    L8:
        byte[] r03 = new byte[r22];
        if (r22 > MAX_CACHED_BUFFER_SIZE) goto L11;
        setBuffer(r03);
    L11:
        return r03;
    L5:
        if (needToReallocate(r22, r02.length) == true) goto L8;
        return r02;
    }

    private static boolean needToReallocate(int r1, int r2) {
        if (r2 < r1) goto L4;
        return false;
    L4:
        if (r2 >= (r1 * 0.5f)) goto L9;
        return true;
    L9:
        return false;
    }

    private static Class<?> safeGetClass(String r02) {
        return Class.forName(r02);
    L4:
        return null;
    }

    private static void setBuffer(byte[] r2) {
        BUFFER.set(new SoftReference(r2));
    }

    public static void write(ByteBuffer r4, OutputStream r5) throws IOException {
        int r02 = r4.position();
    L6:
        th = move-exception;
        Java8Compatibility.position(r4, r02);
        throw th;
    L4:
        if (r4.hasArray() == false) goto L9;
        r5.write(r4.array(), r4.arrayOffset() + r4.position(), r4.remaining());     // Catch: Throwable -> L6
    L15:
        Java8Compatibility.position(r4, r02);
        return;
    L9:
        if (writeToChannel(r4, r5) == true) goto L15;
        byte[] r1 = getOrCreateBuffer(r4.remaining());     // Catch: Throwable -> L6
    L12:
        if (r4.hasRemaining() == false) goto L15;
        int r2 = Math.min(r4.remaining(), r1.length);     // Catch: Throwable -> L6
        r4.get(r1, 0, r2);     // Catch: Throwable -> L6
        r5.write(r1, 0, r2);     // Catch: Throwable -> L6
        goto L12
    }

    private static boolean writeToChannel(ByteBuffer r4, OutputStream r5) throws IOException {
        long r02 = CHANNEL_FIELD_OFFSET;
        if (r02 >= 0) goto L5;
        return false;
    L5:
        if (FILE_OUTPUT_STREAM_CLASS.isInstance(r5) == false) goto L16;
        WritableByteChannel r52 = (WritableByteChannel) UnsafeUtil.getObject(r5, r02);     // Catch: ClassCastException -> L8
    L9:
        if (r52 == null) goto L17;
        r52.write(r4);
        return true;
    L17:
        return false;
    L8:
        r52 = null;
        goto L9
    L16:
        return false;
    }
}
