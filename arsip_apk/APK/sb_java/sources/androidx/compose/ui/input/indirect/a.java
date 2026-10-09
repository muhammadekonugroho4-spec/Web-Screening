package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f17908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17910c;
    public final MotionEvent d;

    static {
    }

    public /* synthetic */ a(List r1, int r2, int r3, MotionEvent r4, i r5) {
        this(r1, r2, r3, r4);
    }

    @Override // androidx.compose.ui.input.indirect.c
    public int a() {
        return this.f17910c;
    }

    @Override // androidx.compose.ui.input.indirect.c
    public List b() {
        return this.f17908a;
    }

    public final MotionEvent c() {
        return this.d;
    }

    public a(List r1, int r2, int r3, MotionEvent r4) {
        this.f17908a = r1;
        this.f17909b = r2;
        this.f17910c = r3;
        this.d = r4;
        if (b().isEmpty() == true) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("changes cannot be empty");
    }
}
