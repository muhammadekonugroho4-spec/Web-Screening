package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;

/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public RenderEffect f17370a;

    static {
    }

    public /* synthetic */ h1(kotlin.jvm.internal.i r1) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect r02 = this.f17370a;
        if (r02 != null) goto L6;
        RenderEffect r03 = b();
        this.f17370a = r03;
        return r03;
    L6:
        return r02;
    }

    public abstract RenderEffect b();

    public h1() {
    }
}
