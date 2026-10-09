package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5520a;

    public d() {
        this(false);
    }

    public int a(Size r5, Size r6) {
        int r52 = Long.signum((r5.getWidth() * r5.getHeight()) - (r6.getWidth() * r6.getHeight()));
        if (this.f5520a == true) goto L5;
        return r52;
    L5:
        return r52 * (-1);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
        return a((Size) r1, (Size) r2);
    }

    public d(boolean r1) {
        this.f5520a = r1;
    }
}
