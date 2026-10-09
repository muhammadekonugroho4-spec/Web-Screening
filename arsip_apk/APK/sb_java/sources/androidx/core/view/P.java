package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes4.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    public final d f23130a;

    public static /* synthetic */ class a {
    }

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f23131a;

        public b(View r1) {
            this.f23131a = ScrollFeedbackProvider.createProvider(r1);
        }

        @Override // androidx.core.view.P.d
        public void a(int r2, int r3, int r4, boolean r5) {
            this.f23131a.onScrollLimit(r2, r3, r4, r5);
        }

        @Override // androidx.core.view.P.d
        public void b(int r2, int r3, int r4, int r5) {
            this.f23131a.onScrollProgress(r2, r3, r4, r5);
        }
    }

    public static class c implements d {
        public c() {
        }

        @Override // androidx.core.view.P.d
        public void a(int r1, int r2, int r3, boolean r4) {
        }

        @Override // androidx.core.view.P.d
        public void b(int r1, int r2, int r3, int r4) {
        }

        public /* synthetic */ c(a r1) {
            this();
        }
    }

    public interface d {
        void a(int r1, int r2, int r3, boolean r4);

        void b(int r1, int r2, int r3, int r4);
    }

    public P(View r3) {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        this.f23130a = new b(r3);
        return;
    L6:
        this.f23130a = new c(null);
    }

    public static P a(View r1) {
        return new P(r1);
    }

    public void b(int r2, int r3, int r4, boolean r5) {
        this.f23130a.a(r2, r3, r4, r5);
    }

    public void c(int r2, int r3, int r4, int r5) {
        this.f23130a.b(r2, r3, r4, r5);
    }
}
