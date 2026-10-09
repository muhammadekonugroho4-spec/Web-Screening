package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2092i {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.viewsintegration.f f3640b;

    public C2092i(TextView r3) {
        this.f3639a = r3;
        this.f3640b = new androidx.emoji2.viewsintegration.f(r3, false);
    }

    public InputFilter[] a(InputFilter[] r2) {
        return this.f3640b.a(r2);
    }

    public boolean b() {
        return this.f3640b.b();
    }

    public void c(AttributeSet r4, int r5) {
        TypedArray r42 = this.f3639a.getContext().obtainStyledAttributes(r4, androidx.appcompat.j.f2832i0, r5, 0);
        boolean r02 = true;
        if (r42.hasValue(androidx.appcompat.j.f2860w0) == false) goto L9;
        r02 = r42.getBoolean(androidx.appcompat.j.f2860w0, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        e(r02);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    public void d(boolean r2) {
        this.f3640b.c(r2);
    }

    public void e(boolean r2) {
        this.f3640b.d(r2);
    }

    public TransformationMethod f(TransformationMethod r2) {
        return this.f3640b.e(r2);
    }
}
