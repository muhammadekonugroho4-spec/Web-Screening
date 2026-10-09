package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final c f27139a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final c f27140b = null;

    public class a implements c {
        public a() {
        }

        @Override // androidx.profileinstaller.g.c
        public void a(int r1, Object r2) {
        }

        @Override // androidx.profileinstaller.g.c
        public void b(int r1, Object r2) {
        }
    }

    public class b implements c {
        public b() {
        }

        @Override // androidx.profileinstaller.g.c
        public void a(int r4, Object r5) {
            switch(r4) {
                case 1: goto L13;
                case 2: goto L12;
                case 3: goto L11;
                case 4: goto L10;
                case 5: goto L9;
                case 6: goto L8;
                case 7: goto L7;
                case 8: goto L6;
                case 9: goto L3;
                case 10: goto L5;
                case 11: goto L4;
                default: goto L3;
            };
        L3:
            String r02 = "";
        L15:
            if (r4 != 6) goto L17;
        L22:
            Log.e("ProfileInstaller", r02, (Throwable) r5);
            return;
        L17:
            if (r4 == 7) goto L22;
            if (r4 == 8) goto L22;
            Log.d("ProfileInstaller", r02);
            return;
        L4:
            r02 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
            goto L15
        L5:
            r02 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
            goto L15
        L6:
            r02 = "RESULT_PARSE_EXCEPTION";
            goto L15
        L7:
            r02 = "RESULT_IO_EXCEPTION";
            goto L15
        L8:
            r02 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
            goto L15
        L9:
            r02 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
            goto L15
        L10:
            r02 = "RESULT_NOT_WRITABLE";
            goto L15
        L11:
            r02 = "RESULT_UNSUPPORTED_ART_VERSION";
            goto L15
        L12:
            r02 = "RESULT_ALREADY_INSTALLED";
            goto L15
        L13:
            r02 = "RESULT_INSTALL_SUCCESS";
            goto L15
        }

        @Override // androidx.profileinstaller.g.c
        public void b(int r1, Object r2) {
            if (r1 != 1) goto L5;
            String r12 = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
        L18:
            Log.d("ProfileInstaller", r12);
            return;
        L5:
            if (r1 != 2) goto L7;
            r12 = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            goto L18
        L7:
            if (r1 != 3) goto L9;
            r12 = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            goto L18
        L9:
            if (r1 != 4) goto L11;
            r12 = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            goto L18
        L11:
            if (r1 == 5) goto L13;
            r12 = "";
            goto L18
        L13:
            r12 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            goto L18
        }
    }

    public interface c {
        void a(int r1, Object r2);

        void b(int r1, Object r2);
    }

    static {
        f27139a = new a();
        f27140b = new b();
    }

    public static /* synthetic */ void a(c r02, int r1, Object r2) {
        r02.a(r1, r2);
    }

    public static boolean b(File r2) {
        return new File(r2, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context r1, Executor r2, c r3) {
        b(r1.getFilesDir());
        f(r2, r3, 11, null);
    }

    public static boolean d(PackageInfo r4, File r5, c r6) {
        File r02 = new File(r5, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean r1 = false;
        if (r02.exists() == true) goto L21;
        return false;
    L21:
        DataInputStream r52 = new DataInputStream(new FileInputStream(r02));     // Catch: IOException -> L20
        long r2 = r52.readLong();     // Catch: Throwable -> L14
        r52.close();     // Catch: IOException -> L20
        if (r2 != r4.lastUpdateTime) goto L11;
        r1 = true;
    L11:
        if (r1 == false) goto L13;
        r6.a(2, null);
    L13:
        return r1;
    L14:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L17
    L19:
        throw th;     // Catch: IOException -> L20
    L17:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L20
    L20:
        return false;
    }

    public static void e(PackageInfo r2, File r3) {
        DataOutputStream r32 = new DataOutputStream(new FileOutputStream(new File(r3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));     // Catch: IOException -> L13
        r32.writeLong(r2.lastUpdateTime);     // Catch: Throwable -> L7
        r32.close();     // Catch: IOException -> L13
        return;
    L7:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L13
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L13
    }

    public static void f(Executor r1, final c r2, final int r3, final Object r4) {
        r1.execute(new f(r2, r3, r4));
    }

    public static boolean g(AssetManager r8, String r9, PackageInfo r10, File r11, String r12, Executor r13, c r14) {
        androidx.profileinstaller.c r02 = new androidx.profileinstaller.c(r8, r13, r14, r12, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", r9), "primary.prof"));
        if (r02.e() == true) goto L6;
        return false;
    L6:
        boolean r82 = r02.h().l().m();
        if (r82 == false) goto L9;
        e(r10, r11);
    L9:
        return r82;
    }

    public static void h(Context r2) {
        i(r2, new androidx.privacysandbox.ads.adservices.measurement.m(), f27139a);
    }

    public static void i(Context r1, Executor r2, c r3) {
        j(r1, r2, r3, false);
    }

    public static void j(Context r9, Executor r10, c r11, boolean r12) {
        Context r02 = r9.getApplicationContext();
        String r2 = r02.getPackageName();
        ApplicationInfo r1 = r02.getApplicationInfo();
        AssetManager r03 = r02.getAssets();
        String r5 = new File(r1.sourceDir).getName();
        boolean r8 = false;
        PackageInfo r3 = r9.getPackageManager().getPackageInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L17
        File r4 = r9.getFilesDir();
        if (r12 == false) goto L7;
    L11:
        Log.d("ProfileInstaller", "Installing profile for " + r9.getPackageName());
        if (g(r03, r2, r3, r4, r5, r10, r11) == false) goto L15;
        if (r12 == false) goto L15;
        r8 = true;
    L15:
        l.c(r9, r8);
        return;
    L7:
        if (d(r3, r4, r11) == false) goto L11;
        Log.d("ProfileInstaller", "Skipping profile installation for " + r9.getPackageName());
        l.c(r9, false);
        return;
    L17:
        e = move-exception;
        r11.a(7, e);
        l.c(r9, false);
    }

    public static void k(Context r3, Executor r4, c r5) {
        String r02 = r3.getApplicationContext().getPackageName();
        PackageInfo r03 = r3.getPackageManager().getPackageInfo(r02, 0);     // Catch: PackageManager.NameNotFoundException -> L6
        e(r03, r3.getFilesDir());
        f(r4, r5, 10, null);
        return;
    L6:
        e = move-exception;
        f(r4, r5, 7, e);
    }
}
