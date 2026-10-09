package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.W;
import androidx.camera.core.impl.D0;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5679a = null;

    static {
        f5679a = new HashSet(Arrays.asList(new String[]{"A24", "BEYOND0", "BEYOND2"}));
    }

    public IncorrectJpegMetadataQuirk() {
    }

    public static boolean f() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (f5679a.contains(Build.DEVICE.toUpperCase(Locale.US)) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean h() {
        return f();
    }

    public final boolean d(byte[] r5) {
        int r1 = 2;
    L4:
        if ((r1 + 4) > r5.length) goto L14;
        byte r2 = r5[r1];
        if (r2 != (-1)) goto L21;
        if (r2 != (-1)) goto L13;
        if (r5[r1 + 1] != (-38)) goto L13;
        return true;
    L13:
        r1 = r1 + ((((r5[r1 + 2] & UnsignedBytes.MAX_VALUE) << 8) | (r5[r1 + 3] & UnsignedBytes.MAX_VALUE)) + 2);
        goto L4
    L21:
        return false;
    L14:
        return false;
    }

    public final int e(byte[] r5) {
        int r02 = 2;
    L3:
        int r1 = r02 + 1;
        if (r1 > r5.length) goto L5;
        if (r5[r02] != (-1)) goto L11;
        if (r5[r1] != (-40)) goto L11;
        return r02;
    L11:
        r02 = r1;
        goto L3
    L5:
        return -1;
    }

    public byte[] g(W r4) {
        int r02 = 0;
        ByteBuffer r42 = r4.S()[0].g();
        byte[] r1 = new byte[r42.capacity()];
        r42.rewind();
        r42.get(r1);
        if (d(r1) == true) goto L9;
        r02 = e(r1);
        if (r02 != (-1)) goto L9;
        return r1;
    L9:
        return Arrays.copyOfRange(r1, r02, r42.limit());
    }
}
