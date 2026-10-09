package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final c f23133a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f23134a;

        public a(View r1) {
            this.f23134a = r1;
        }

        public static /* synthetic */ void c(View r2) {
            ((InputMethodManager) r2.getContext().getSystemService("input_method")).showSoftInput(r2, 0);
        }

        @Override // androidx.core.view.S.c
        public void a() {
            View r02 = this.f23134a;
            if (r02 == null) goto L6;
            ((InputMethodManager) r02.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f23134a.getWindowToken(), 0);
            return;
        }

        @Override // androidx.core.view.S.c
        public void b() {
            final View r02 = this.f23134a;
            if (r02 != null) goto L6;
            return;
        L6:
            if (r02.isInEditMode() == false) goto L8;
        L11:
            r02.requestFocus();
        L12:
            if (r02 != null) goto L14;
            r02 = this.f23134a.getRootView().findViewById(R.id.content);
        L14:
            if (r02 != null) goto L16;
            return;
        L16:
            if (r02.hasWindowFocus() == false) goto L20;
            r02.post(new Q(r02));
            return;
        L20:
            return;
        L8:
            if (r02.onCheckIsTextEditor() == true) goto L11;
            r02 = r02.getRootView().findFocus();
            goto L12
        }
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f23135b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f23136c;

        public b(View r1) {
            super(r1);
            this.f23135b = r1;
        }

        public static /* synthetic */ void d(AtomicBoolean r02, WindowInsetsController r1, int r2) {
            if ((r2 & 8) == 0) goto L5;
            boolean r12 = true;
        L6:
            r02.set(r12);
            return;
        L5:
            r12 = false;
            goto L6
        }

        @Override // androidx.core.view.S.a, androidx.core.view.S.c
        public void a() {
            WindowInsetsController r02 = this.f23136c;
            if (r02 != null) goto L9;
            View r03 = this.f23135b;
            if (r03 == null) goto L8;
            r02 = T.a(r03);
            goto L9
        L8:
            r02 = null;
        L9:
            if (r02 == null) goto L17;
            final AtomicBoolean r1 = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener r3 = new Z(r1);
            W.a(r02, r3);
            if (r1.get() == true) goto L15;
            View r12 = this.f23135b;
            if (r12 == null) goto L15;
            ((InputMethodManager) r12.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f23135b.getWindowToken(), 0);
        L15:
            X.a(r02, r3);
            Y.a(r02, U.a());
            return;
        L17:
            super.a();
        }

        @Override // androidx.core.view.S.a, androidx.core.view.S.c
        public void b() {
            View r02 = this.f23135b;
            if (r02 != null) goto L5;
        L7:
            WindowInsetsController r03 = this.f23136c;
            if (r03 != null) goto L14;
            View r04 = this.f23135b;
            if (r04 == null) goto L13;
            r03 = T.a(r04);
            goto L14
        L13:
            r03 = null;
        L14:
            if (r03 == null) goto L16;
            V.a(r03, U.a());
        L16:
            super.b();
            return;
        L5:
            if (Build.VERSION.SDK_INT >= 33) goto L7;
            ((InputMethodManager) r02.getContext().getSystemService("input_method")).isActive();
            goto L7
        }

        public b(WindowInsetsController r2) {
            super(null);
            this.f23136c = r2;
        }
    }

    public static class c {
        public c() {
        }

        public abstract void a();

        public abstract void b();
    }

    public S(View r3) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        this.f23133a = new b(r3);
        return;
    L6:
        this.f23133a = new a(r3);
    }

    public void a() {
        this.f23133a.a();
    }

    public void b() {
        this.f23133a.b();
    }

    public S(WindowInsetsController r2) {
        this.f23133a = new b(r2);
    }
}
