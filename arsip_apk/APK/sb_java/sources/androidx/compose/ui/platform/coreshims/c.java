package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.m;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19314a;

    /* renamed from: b, reason: collision with root package name */
    public final View f19315b;

    public static class a {
        public static AutofillId a(ContentCaptureSession r02, AutofillId r1, long r2) {
            return r02.newAutofillId(r1, r2);
        }

        public static ViewStructure b(ContentCaptureSession r02, AutofillId r1, long r2) {
            return r02.newVirtualViewStructure(r1, r2);
        }

        public static void c(ContentCaptureSession r02, ViewStructure r1) {
            r02.notifyViewAppeared(r1);
        }

        public static void d(ContentCaptureSession r02, AutofillId r1) {
            r02.notifyViewDisappeared(r1);
        }

        public static void e(ContentCaptureSession r02, AutofillId r1, CharSequence r2) {
            r02.notifyViewTextChanged(r1, r2);
        }

        public static void f(ContentCaptureSession r02, AutofillId r1, long[] r2) {
            r02.notifyViewsDisappeared(r1, r2);
        }
    }

    public c(ContentCaptureSession r1, View r2) {
        this.f19314a = r1;
        this.f19315b = r2;
    }

    public static c f(ContentCaptureSession r1, View r2) {
        return new c(r1, r2);
    }

    @Override // androidx.compose.ui.contentcapture.m
    public AutofillId a(long r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        ContentCaptureSession r02 = b.a(this.f19314a);
        androidx.compose.ui.platform.coreshims.a r1 = d.a(this.f19315b);
        Objects.requireNonNull(r1);
        return a.a(r02, r1.a(), r3);
    L6:
        return null;
    }

    @Override // androidx.compose.ui.contentcapture.m
    public void b(AutofillId r3, CharSequence r4) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.e(b.a(this.f19314a), r3, r4);
        return;
    }

    @Override // androidx.compose.ui.contentcapture.m
    public e c(AutofillId r3, long r4) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return null;
    L5:
        return e.i(a.b(b.a(this.f19314a), r3, r4));
    }

    @Override // androidx.compose.ui.contentcapture.m
    public void d(AutofillId r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.d(b.a(this.f19314a), r3);
        return;
    }

    @Override // androidx.compose.ui.contentcapture.m
    public void e(ViewStructure r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.c(b.a(this.f19314a), r3);
        return;
    }

    @Override // androidx.compose.ui.contentcapture.m
    public void flush() {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        ContentCaptureSession r02 = b.a(this.f19314a);
        androidx.compose.ui.platform.coreshims.a r1 = d.a(this.f19315b);
        Objects.requireNonNull(r1);
        a.f(r02, r1.a(), new long[]{Long.MIN_VALUE});
        return;
    }
}
