package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.compose.ui.text.android.AbstractC3706a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19786a = null;

    /* renamed from: androidx.compose.ui.text.android.selection.a$a, reason: collision with other inner class name */
    public static final class C0132a extends SegmentFinder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f19787a;

        public C0132a(f r1) {
            this.f19787a = r1;
        }

        public int nextEndBoundary(int r2) {
            return this.f19787a.d(r2);
        }

        public int nextStartBoundary(int r2) {
            return this.f19787a.b(r2);
        }

        public int previousEndBoundary(int r2) {
            return this.f19787a.a(r2);
        }

        public int previousStartBoundary(int r2) {
            return this.f19787a.c(r2);
        }
    }

    static {
        f19786a = new a();
    }

    public a() {
    }

    public final SegmentFinder a(f r2) {
        return AbstractC3706a.a(new C0132a(r2));
    }
}
