package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class b {

    public static class a {
        public static void a(MediaMetadataRetriever r02, MediaDataSource r1) {
            r02.setDataSource(r1);
        }
    }

    public static void a(FileDescriptor r2) {
        Os.close(r2);     // Catch: ErrnoException -> L4
        return;
    L4:
        e = move-exception;
        Log.e("ExifInterfaceUtils", "Error closing fd.", e);
    }

    public static void b(Closeable r02) {
        if (r02 != null) goto L9;
        return;
    L9:
        r02.close();     // Catch: RuntimeException -> L5 Exception -> L8
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static long[] c(Object r4) {
        if ((r4 instanceof int[]) == false) goto L10;
        int[] r42 = (int[]) r4;
        long[] r02 = new long[r42.length];
        int r1 = 0;
    L6:
        if (r1 >= r42.length) goto L8;
        r02[r1] = r42[r1];
        r1 = r1 + 1;
        goto L6
    L8:
        return r02;
    L10:
        if ((r4 instanceof long[]) == true) goto L12;
        return null;
    L12:
        return (long[]) r4;
    }

    public static int d(InputStream r5, OutputStream r6) {
        byte[] r02 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int r2 = 0;
    L3:
        int r3 = r5.read(r02);
        if (r3 == (-1)) goto L6;
        r2 = r2 + r3;
        r6.write(r02, 0, r3);
        goto L3
    L6:
        return r2;
    }

    public static void e(InputStream r5, OutputStream r6, int r7) {
        byte[] r1 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
    L3:
        if (r7 <= 0) goto L9;
        int r2 = Math.min(r7, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int r4 = r5.read(r1, 0, r2);
        if (r4 != r2) goto L8;
        r7 = r7 - r4;
        r6.write(r1, 0, r4);
        goto L3
    L8:
        throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
    }

    public static boolean f(byte[] r4, byte[] r5) {
        if (r4 == null) goto L18;
        if (r5 == null) goto L18;
        if (r4.length >= r5.length) goto L9;
        return false;
    L9:
        int r1 = 0;
    L11:
        if (r1 >= r5.length) goto L16;
        if (r4[r1] != r5[r1]) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return false;
    }
}
