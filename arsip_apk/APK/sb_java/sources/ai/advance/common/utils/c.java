package ai.advance.common.utils;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(Context r02, String r1) {
        r02.deleteFile(r1);
    }

    public static String b(Context r5, String r6) {
        ByteArrayOutputStream r02 = null;
        FileInputStream r52 = r5.openFileInput(r6);     // Catch: Throwable -> L18 Exception -> L25
        ByteArrayOutputStream r62 = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, r52.available()));     // Catch: Throwable -> L16 Exception -> L39
        byte[] r1 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];     // Catch: Throwable -> L9 Exception -> L37
    L6:
        int r2 = r52.read(r1);     // Catch: Throwable -> L9 Exception -> L37
        if (r2 < 0) goto L11;
        r62.write(r1, 0, r2);     // Catch: Throwable -> L9 Exception -> L37
        goto L6
    L11:
        String r22 = new String(Base64.decode(r62.toByteArray(), 0));     // Catch: Throwable -> L9 Exception -> L37
        r52.close();     // Catch: Exception -> L32
    L46:
        r62.close();     // Catch: Exception -> L33
    L61:
        return r22;
    L9:
        th = move-exception;
        r02 = r62;
        Throwable th = th;
    L20:
        if (r52 != null) goto L44;
    L22:
        if (r02 == null) goto L59;
        r02.close();     // Catch: Exception -> L36
        throw th;
    L60:
        throw th;
    L59:
        throw th;
    L44:
        r52.close();     // Catch: Exception -> L35
    L27:
        if (r52 != null) goto L48;
    L29:
        if (r62 == null) goto L62;
        r62.close();     // Catch: Exception -> L34
        return null;
    L63:
        return null;
    L62:
        return null;
    L48:
        r52.close();     // Catch: Exception -> L38
        goto L29
    L16:
        th = th;
    L26:
        r62 = null;
        goto L27
    L25:
        r52 = null;
    L18:
        th = move-exception;
        th = th;
        r52 = null;
        goto L20
    }

    public static void c(Context r1, String r2, String r3) {
        if (r1 == null) goto L8;
        byte[] r32 = Base64.encode(r3.getBytes(), 0);     // Catch: Exception -> L5
        a(r1, r2);     // Catch: Exception -> L5
        r1.openFileOutput(r2, 0).write(r32);     // Catch: Exception -> L5
        return;
    L9:
        return;
    }
}
