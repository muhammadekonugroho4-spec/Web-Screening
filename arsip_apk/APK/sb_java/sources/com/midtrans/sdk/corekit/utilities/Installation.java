package com.midtrans.sdk.corekit.utilities;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/* loaded from: classes6.dex */
public class Installation {
    private static final String INSTALLATION = "INSTALLATION";
    private static String sID;

    static {
    }

    public Installation() {
    }

    public static synchronized String id(Context r3) {
        monitor-enter(Installation.class);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (sID != null) goto L18;
        File r1 = new File(r3.getFilesDir(), INSTALLATION);     // Catch: Throwable -> L10
    L12:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L10
    L8:
        if (r1.exists() == true) goto L14;
        writeInstallationFile(r1);     // Catch: Throwable -> L10 Exception -> L12
    L14:
        sID = readInstallationFile(r1);     // Catch: Throwable -> L10 Exception -> L12
    L18:
        String r32 = sID;     // Catch: Throwable -> L10
        monitor-exit(Installation.class);
        return r32;
    }

    private static String readInstallationFile(File r3) throws IOException {
        RandomAccessFile r02 = new RandomAccessFile(r3, "r");
        byte[] r32 = new byte[(int) r02.length()];
        r02.readFully(r32);
        r02.close();
        return new String(r32);
    }

    private static void writeInstallationFile(File r1) throws IOException {
        FileOutputStream r02 = new FileOutputStream(r1);
        r02.write(UUID.randomUUID().toString().getBytes());
        r02.close();
    }
}
