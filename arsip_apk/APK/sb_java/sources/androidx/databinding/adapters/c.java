package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f23589a = null;

    static {
        f23589a = new SparseArray();
    }

    public static Object a(View r1, Object r2, int r3) {
        Object r02 = r1.getTag(r3);
        r1.setTag(r3, r2);
        return r02;
    }
}
