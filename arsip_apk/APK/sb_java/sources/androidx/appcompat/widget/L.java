package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class L extends F {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3395b;

    public L(Context r1, Resources r2) {
        super(r2);
        this.f3395b = new WeakReference(r1);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int r4) {
        Drawable r02 = a(r4);
        Context r1 = (Context) this.f3395b.get();
        if (r02 == null) goto L6;
        if (r1 == null) goto L6;
        E.g().w(r1, r4, r02);
    L6:
        return r02;
    }
}
