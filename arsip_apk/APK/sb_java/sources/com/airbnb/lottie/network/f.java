package com.airbnb.lottie.network;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f31466a;

    public f(d r1) {
        this.f31466a = r1;
    }

    public static String b(String r3, FileExtension r4, boolean r5) {
        StringBuilder r02 = new StringBuilder();
        r02.append("lottie_cache_");
        r02.append(r3.replaceAll("\\W+", ""));
        if (r5 == false) goto L5;
        String r32 = r4.tempExtension();
    L6:
        r02.append(r32);
        return r02.toString();
    L5:
        r32 = r4.extension;
        goto L6
    }

    public Pair a(String r6) {
        File r1 = c(r6);     // Catch: FileNotFoundException -> L13
        if (r1 != null) goto L6;
        return null;
    L6:
        FileInputStream r2 = new FileInputStream(r1);     // Catch: FileNotFoundException -> L13
        if (r1.getAbsolutePath().endsWith(".zip") == false) goto L10;
        FileExtension r02 = FileExtension.ZIP;
    L11:
        com.airbnb.lottie.utils.d.a("Cache hit for " + r6 + " at " + r1.getAbsolutePath());
        return new Pair(r02, r2);
    L10:
        r02 = FileExtension.JSON;
    L13:
        return null;
    }

    public final File c(String r5) {
        File r02 = new File(d(), b(r5, FileExtension.JSON, false));
        if (r02.exists() == false) goto L5;
        return r02;
    L5:
        File r03 = new File(d(), b(r5, FileExtension.ZIP, false));
        if (r03.exists() == false) goto L8;
        return r03;
    L8:
        return null;
    }

    public final File d() {
        File r02 = this.f31466a.a();
        if (r02.isFile() == false) goto L6;
        r02.delete();
    L6:
        if (r02.exists() == true) goto L8;
        r02.mkdirs();
    L8:
        return r02;
    }

    public void e(String r4, FileExtension r5) {
        File r52 = new File(d(), b(r4, r5, true));
        File r02 = new File(r52.getAbsolutePath().replace(".temp", ""));
        boolean r42 = r52.renameTo(r02);
        com.airbnb.lottie.utils.d.a("Copying temp file to real file (" + r02 + ")");
        if (r42 == true) goto L6;
        com.airbnb.lottie.utils.d.c("Unable to rename cache file " + r52.getAbsolutePath() + " to " + r02.getAbsolutePath() + ".");
        return;
    }

    public File f(String r4, InputStream r5, FileExtension r6) {
        String r42 = b(r4, r6, true);
        File r62 = new File(d(), r42);
        FileOutputStream r43 = new FileOutputStream(r62);     // Catch: Throwable -> L15
        byte[] r02 = new byte[1024];     // Catch: Throwable -> L9
    L6:
        int r1 = r5.read(r02);     // Catch: Throwable -> L9
        if (r1 == (-1)) goto L11;
        r43.write(r02, 0, r1);     // Catch: Throwable -> L9
        goto L6
    L11:
        r43.flush();     // Catch: Throwable -> L9
        r43.close();     // Catch: Throwable -> L15
        r5.close();
        return r62;
    L9:
        th = move-exception;
        r43.close();     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r5.close();
        throw th;
    }
}
