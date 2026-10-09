package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22909a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    public class C0164a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f22910a;

        public C0164a(c r1) {
            this.f22910a = r1;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int r2, CharSequence r3) {
            this.f22910a.a(r2, r3);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f22910a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int r2, CharSequence r3) {
            this.f22910a.c(r2, r3);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult r3) {
            this.f22910a.d(new d(a.g(b.b(r3))));
        }
    }

    public static class b {
        public static void a(Object r02, Object r1, CancellationSignal r2, int r3, Object r4, Handler r5) {
            ((FingerprintManager) r02).authenticate((FingerprintManager.CryptoObject) r1, r2, r3, (FingerprintManager.AuthenticationCallback) r4, r5);
        }

        public static FingerprintManager.CryptoObject b(Object r02) {
            return ((FingerprintManager.AuthenticationResult) r02).getCryptoObject();
        }

        public static FingerprintManager c(Context r2) {
            if (r2.getPackageManager().hasSystemFeature("android.hardware.fingerprint") == true) goto L5;
            return null;
        L5:
            return (FingerprintManager) r2.getSystemService(FingerprintManager.class);
        }

        public static boolean d(Object r02) {
            return ((FingerprintManager) r02).hasEnrolledFingerprints();
        }

        public static boolean e(Object r02) {
            return ((FingerprintManager) r02).isHardwareDetected();
        }

        public static e f(Object r2) {
            FingerprintManager.CryptoObject r22 = (FingerprintManager.CryptoObject) r2;
            if (r22 != null) goto L6;
            return null;
        L6:
            if (r22.getCipher() == null) goto L10;
            return new e(r22.getCipher());
        L10:
            if (r22.getSignature() == null) goto L14;
            return new e(r22.getSignature());
        L14:
            if (r22.getMac() != null) goto L16;
            return null;
        L16:
            return new e(r22.getMac());
        }

        public static FingerprintManager.CryptoObject g(e r2) {
            if (r2 != null) goto L6;
            return null;
        L6:
            if (r2.a() == null) goto L10;
            return new FingerprintManager.CryptoObject(r2.a());
        L10:
            if (r2.c() == null) goto L14;
            return new FingerprintManager.CryptoObject(r2.c());
        L14:
            if (r2.b() != null) goto L16;
            return null;
        L16:
            return new FingerprintManager.CryptoObject(r2.b());
        }
    }

    public static abstract class c {
        public c() {
        }

        public abstract void a(int r1, CharSequence r2);

        public abstract void b();

        public abstract void c(int r1, CharSequence r2);

        public abstract void d(d r1);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final e f22911a;

        public d(e r1) {
            this.f22911a = r1;
        }

        public e a() {
            return this.f22911a;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f22912a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f22913b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f22914c;

        public e(Signature r1) {
            this.f22912a = r1;
            this.f22913b = null;
            this.f22914c = null;
        }

        public Cipher a() {
            return this.f22913b;
        }

        public Mac b() {
            return this.f22914c;
        }

        public Signature c() {
            return this.f22912a;
        }

        public e(Cipher r1) {
            this.f22913b = r1;
            this.f22912a = null;
            this.f22914c = null;
        }

        public e(Mac r1) {
            this.f22914c = r1;
            this.f22913b = null;
            this.f22912a = null;
        }
    }

    public a(Context r1) {
        this.f22909a = r1;
    }

    public static a c(Context r1) {
        return new a(r1);
    }

    public static FingerprintManager d(Context r02) {
        return b.c(r02);
    }

    public static e g(FingerprintManager.CryptoObject r02) {
        return b.f(r02);
    }

    public static FingerprintManager.AuthenticationCallback h(c r1) {
        return new C0164a(r1);
    }

    public static FingerprintManager.CryptoObject i(e r02) {
        return b.g(r02);
    }

    public void a(e r8, int r9, CancellationSignal r10, c r11, Handler r12) {
        FingerprintManager r1 = d(this.f22909a);
        if (r1 == null) goto L6;
        b.a(r1, i(r8), r10, r9, h(r11), r12);
        return;
    }

    public void b(e r7, int r8, androidx.core.os.e r9, c r10, Handler r11) {
        if (r9 == null) goto L5;
        CancellationSignal r92 = (CancellationSignal) r9.b();
    L6:
        a(r7, r8, r92, r10, r11);
        return;
    L5:
        r92 = null;
        goto L6
    }

    public boolean e() {
        FingerprintManager r02 = d(this.f22909a);
        if (r02 != null) goto L5;
        return false;
    L5:
        if (b.d(r02) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean f() {
        FingerprintManager r02 = d(this.f22909a);
        if (r02 != null) goto L5;
        return false;
    L5:
        if (b.e(r02) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
