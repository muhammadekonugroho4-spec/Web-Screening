package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.concurrent.futures.b f27147a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f27148b = null;

    /* renamed from: c, reason: collision with root package name */
    public static c f27149c;

    public static class a {
        public static PackageInfo a(PackageManager r2, Context r3) {
            return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27150a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27151b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27152c;
        public final long d;

        public b(int r1, int r2, long r3, long r5) {
            this.f27150a = r1;
            this.f27151b = r2;
            this.f27152c = r3;
            this.d = r5;
        }

        public static b a(File r9) {
            DataInputStream r1 = new DataInputStream(new FileInputStream(r9));
            b r2 = new b(r1.readInt(), r1.readInt(), r1.readLong(), r1.readLong());     // Catch: Throwable -> L6
            r1.close();
            return r2;
        L6:
            th = move-exception;
            r1.close();     // Catch: Throwable -> L10
            throw th;
        L10:
            th = move-exception;
            th.addSuppressed(th);
            throw th;
        }

        public void b(File r4) {
            r4.delete();
            DataOutputStream r02 = new DataOutputStream(new FileOutputStream(r4));
            r02.writeInt(this.f27150a);     // Catch: Throwable -> L6
            r02.writeInt(this.f27151b);     // Catch: Throwable -> L6
            r02.writeLong(this.f27152c);     // Catch: Throwable -> L6
            r02.writeLong(this.d);     // Catch: Throwable -> L6
            r02.close();
            return;
        L6:
            th = move-exception;
            r02.close();     // Catch: Throwable -> L9
        L11:
            throw th;
        L9:
            th = move-exception;
            th.addSuppressed(th);
            goto L11
        }

        public boolean equals(Object r7) {
            if (this != r7) goto L6;
            return true;
        L6:
            if (r7 != null) goto L8;
        L19:
            return false;
        L8:
            if ((r7 instanceof b) == false) goto L19;
            b r72 = (b) r7;
            if (this.f27151b != r72.f27151b) goto L19;
            if (this.f27152c != r72.f27152c) goto L19;
            if (this.f27150a != r72.f27150a) goto L19;
            if (this.d != r72.d) goto L19;
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f27151b), Long.valueOf(this.f27152c), Integer.valueOf(this.f27150a), Long.valueOf(this.d)});
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f27153a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27154b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27155c;
        public final boolean d;

        public c(int r1, boolean r2, boolean r3, boolean r4) {
            this.f27153a = r1;
            this.f27155c = r3;
            this.f27154b = r2;
            this.d = r4;
        }
    }

    static {
        f27147a = androidx.concurrent.futures.b.j();
        f27148b = new Object();
        f27149c = null;
    }

    public static long a(Context r3) {
        PackageManager r02 = r3.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return a.a(r02, r3).lastUpdateTime;
    L7:
        return r02.getPackageInfo(r3.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int r1, boolean r2, boolean r3, boolean r4) {
        c r02 = new c(r1, r2, r3, r4);
        f27149c = r02;
        f27147a.set(r02);
        return f27149c;
    }

    public static c c(Context r19, boolean r20) {
        if (r20 == true) goto L6;
        c r02 = f27149c;
        if (r02 == null) goto L6;
        return r02;
    L6:
        Object r1 = f27148b;
        monitor-enter(r1);
        if (r20 == false) goto L107;
    L15:
        int r5 = 0;
        AssetFileDescriptor r6 = r19.getAssets().openFd("dexopt/baseline.prof");     // Catch: Throwable -> L13 IOException -> L32
        if (r6.getLength() <= 0) goto L21;
        boolean r03 = true;
    L22:
        r6.close();     // Catch: Throwable -> L13 IOException -> L32
    L33:
        int r62 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L13
        if (r62 >= 28) goto L36;
    L98:
        c r04 = b(262144, false, false, r03);     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return r04;
    L36:
        if (r62 == 30) goto L98;
        File r63 = new File(new File("/data/misc/profiles/ref/", r19.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r7 = r63.length();     // Catch: Throwable -> L13
        if (r63.exists() == true) goto L41;
    L43:
        boolean r64 = false;
    L44:
        File r9 = new File(new File("/data/misc/profiles/cur/0/", r19.getPackageName()), "primary.prof");     // Catch: Throwable -> L13
        long r17 = r9.length();     // Catch: Throwable -> L13
        if (r9.exists() == true) goto L47;
    L49:
        boolean r2 = false;
    L108:
        long r15 = a(r19);     // Catch: Throwable -> L13 PackageManager.NameNotFoundException -> L95
        File r3 = new File(r19.getFilesDir(), "profileInstalled");     // Catch: Throwable -> L13
        if (r3.exists() == true) goto L113;
        b r92 = null;
    L61:
        if (r92 != null) goto L63;
    L68:
        if (r03 == true) goto L70;
        r5 = 327680;
    L74:
        if (r20 == false) goto L78;
        if (r2 == false) goto L78;
        if (r5 == 1) goto L78;
        r5 = 2;
    L78:
        if (r92 != null) goto L80;
    L85:
        int r14 = r5;
        b r12 = new b(1, r14, r15, r17);     // Catch: Throwable -> L13
        if (r92 != null) goto L88;
    L103:
        r12.b(r3);     // Catch: Throwable -> L13 IOException -> L91
    L92:
        c r05 = b(r14, r64, r2, r03);     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        return r05;
    L91:
        r14 = 196608;
        goto L92
    L88:
        if (r92.equals(r12) == true) goto L92;
    L80:
        if (r92.f27151b != 2) goto L85;
        if (r5 != 1) goto L85;
        if (r7 >= r92.d) goto L85;
        r5 = 3;
        goto L85
    L70:
        if (r64 == false) goto L72;
        r5 = 1;
        goto L74
    L72:
        if (r2 == false) goto L74;
        r5 = 2;
        goto L74
    L63:
        if (r92.f27152c != r15) goto L68;
        int r11 = r92.f27151b;     // Catch: Throwable -> L13
        if (r11 == 2) goto L68;
        r5 = r11;
        goto L74
    L113:
        r92 = b.a(r3);     // Catch: Throwable -> L13 IOException -> L55
    L58:
        return b(131072, r64, r2, r03);
    L13:
        th = move-exception;
        throw th;
    L97:
        return b(65536, r64, r2, r03);
    L47:
        if (r17 <= 0) goto L49;
        r2 = true;
        goto L108
    L41:
        if (r7 <= 0) goto L43;
        r64 = true;
        goto L44
    L21:
        r03 = false;
    L24:
        th = move-exception;
        if (r6 == null) goto L115;
        r6.close();     // Catch: Throwable -> L29
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13 IOException -> L32
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L115:
        throw th;     // Catch: Throwable -> L13 IOException -> L32
    L32:
        r03 = false;
        goto L33
    L107:
        c r06 = f27149c;     // Catch: Throwable -> L13
        if (r06 == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L13
        return r06;
    }
}
