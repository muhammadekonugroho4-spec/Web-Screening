package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2091h {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.viewsintegration.a f3638b;

    public C2091h(EditText r3) {
        this.f3637a = r3;
        this.f3638b = new androidx.emoji2.viewsintegration.a(r3, false);
    }

    public KeyListener a(KeyListener r2) {
        if (b(r2) == true) goto L5;
        return r2;
    L5:
        return this.f3638b.a(r2);
    }

    public boolean b(KeyListener r1) {
        return !(r1 instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f3638b.b();
    }

    public void d(AttributeSet r4, int r5) {
        TypedArray r42 = this.f3637a.getContext().obtainStyledAttributes(r4, androidx.appcompat.j.f2832i0, r5, 0);
        boolean r02 = true;
        if (r42.hasValue(androidx.appcompat.j.f2860w0) == false) goto L9;
        r02 = r42.getBoolean(androidx.appcompat.j.f2860w0, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        f(r02);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    public InputConnection e(InputConnection r2, EditorInfo r3) {
        return this.f3638b.c(r2, r3);
    }

    public void f(boolean r2) {
        this.f3638b.d(r2);
    }
}
