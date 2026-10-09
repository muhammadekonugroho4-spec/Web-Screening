package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f24128a;

    /* renamed from: b, reason: collision with root package name */
    public int f24129b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f24130c;
    public final g d;

    public a(EditText r2, boolean r3) {
        this.f24128a = Integer.MAX_VALUE;
        this.f24129b = 0;
        androidx.core.util.h.h(r2, "editText cannot be null");
        this.f24130c = r2;
        g r02 = new g(r2, r3);
        this.d = r02;
        r2.addTextChangedListener(r02);
        r2.setEditableFactory(b.getInstance());
    }

    public KeyListener a(KeyListener r2) {
        if ((r2 instanceof e) == false) goto L5;
        return r2;
    L5:
        if (r2 != null) goto L9;
        return null;
    L9:
        if ((r2 instanceof NumberKeyListener) == false) goto L12;
        return r2;
    L12:
        return new e(r2);
    }

    public boolean b() {
        return this.d.b();
    }

    public InputConnection c(InputConnection r3, EditorInfo r4) {
        if (r3 != null) goto L6;
        return null;
    L6:
        if ((r3 instanceof c) == false) goto L9;
        return r3;
    L9:
        return new c(this.f24130c, r3, r4);
    }

    public void d(boolean r2) {
        this.d.d(r2);
    }
}
