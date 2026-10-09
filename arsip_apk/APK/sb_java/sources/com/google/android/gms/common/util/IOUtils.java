package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(ParcelFileDescriptor r02) {
        if (r02 == null) goto L8;
        r02.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(InputStream r2, OutputStream r3) throws IOException {
        return copyStream(r2, r3, false, 1024);
    }

    @KeepForSdk
    public static boolean isGzipByteBuffer(byte[] r3) {
        if (r3.length <= 1) goto L7;
        int r02 = r3[0] & UnsignedBytes.MAX_VALUE;
        if ((((r3[1] & UnsignedBytes.MAX_VALUE) << 8) | r02) != 35615) goto L7;
        return true;
    L7:
        return false;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(InputStream r1) throws IOException {
        return readInputStreamFully(r1, true);
    }

    @KeepForSdk
    @Deprecated
    public static byte[] toByteArray(InputStream r4) throws IOException {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        Preconditions.checkNotNull(r4);
        Preconditions.checkNotNull(r02);
        byte[] r1 = new byte[4096];
    L3:
        int r2 = r4.read(r1);
        if (r2 == (-1)) goto L6;
        r02.write(r1, 0, r2);
        goto L3
    L6:
        return r02.toByteArray();
    }

    @KeepForSdk
    public static void closeQuietly(Closeable r02) {
        if (r02 == null) goto L8;
        r02.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(InputStream r7, OutputStream r8, boolean r9, int r10) throws IOException {
        byte[] r02 = new byte[r10];
        long r1 = 0;
    L17:
        int r4 = r7.read(r02, 0, r10);     // Catch: Throwable -> L8
        if (r4 == (-1)) goto L10;
        r1 = r1 + r4;     // Catch: Throwable -> L8
        r8.write(r02, 0, r4);     // Catch: Throwable -> L8
        goto L17
    L10:
        if (r9 == false) goto L12;
        closeQuietly(r7);
        closeQuietly(r8);
    L12:
        return r1;
    L8:
        th = move-exception;
        if (r9 == false) goto L16;
        closeQuietly(r7);
        closeQuietly(r8);
    L16:
        throw th;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(InputStream r2, boolean r3) throws IOException {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        copyStream(r2, r02, r3, 1024);
        return r02.toByteArray();
    }
}
