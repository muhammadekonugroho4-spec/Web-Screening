package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public long f23359a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23361c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f23362e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f23363f;

    public ContentLoadingProgressBar(Context r2) {
        this(r2, null);
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar r3) {
        r3.f23361c = false;
        if (r3.d == true) goto L6;
        r3.f23359a = System.currentTimeMillis();
        r3.setVisibility(0);
        return;
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar r2) {
        r2.f23360b = false;
        r2.f23359a = -1;
        r2.setVisibility(8);
    }

    public final void c() {
        removeCallbacks(this.f23362e);
        removeCallbacks(this.f23363f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public ContentLoadingProgressBar(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f23359a = -1;
        this.f23360b = false;
        this.f23361c = false;
        this.d = false;
        this.f23362e = new d(this);
        this.f23363f = new e(this);
    }
}
