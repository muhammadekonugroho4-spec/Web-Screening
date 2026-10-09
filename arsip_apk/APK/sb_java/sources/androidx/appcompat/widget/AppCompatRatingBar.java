package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C2095l f3288a;

    public AppCompatRatingBar(Context r2) {
        this(r2, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int r2, int r3) {
        monitor-enter(this);
        super.onMeasure(r2, r3);     // Catch: Throwable -> L7
        Bitmap r32 = this.f3288a.b();     // Catch: Throwable -> L7
        if (r32 == null) goto L9;
        setMeasuredDimension(View.resolveSizeAndState(r32.getWidth() * getNumStars(), r2, 0), getMeasuredHeight());     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public AppCompatRatingBar(Context r2, AttributeSet r3) {
        this(r2, r3, androidx.appcompat.a.f2294O);
    }

    public AppCompatRatingBar(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        I.a(this, getContext());
        C2095l r12 = new C2095l(this);
        this.f3288a = r12;
        r12.c(r2, r3);
    }
}
