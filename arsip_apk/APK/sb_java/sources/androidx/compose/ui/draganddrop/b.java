package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.InterfaceC3552n0;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.unit.e f16885a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16886b;

    /* renamed from: c, reason: collision with root package name */
    public final l f16887c;

    static {
    }

    public /* synthetic */ b(androidx.compose.ui.unit.e r1, long r2, l r4, i r5) {
        this(r1, r2, r4);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas r13) {
        androidx.compose.ui.graphics.drawscope.a r02 = new androidx.compose.ui.graphics.drawscope.a();
        androidx.compose.ui.unit.e r1 = this.f16885a;
        long r2 = this.f16886b;
        LayoutDirection r4 = LayoutDirection.Ltr;
        InterfaceC3552n0 r132 = F.b(r13);
        l r5 = this.f16887c;
        a.C0121a r6 = r02.x();
        androidx.compose.ui.unit.e r7 = r6.a();
        LayoutDirection r8 = r6.b();
        InterfaceC3552n0 r9 = r6.c();
        long r10 = r6.d();
        a.C0121a r62 = r02.x();
        r62.j(r1);
        r62.k(r4);
        r62.i(r132);
        r62.l(r2);
        r132.v();
        r5.invoke(r02);
        r132.o();
        a.C0121a r133 = r02.x();
        r133.j(r7);
        r133.k(r8);
        r133.i(r9);
        r133.l(r10);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point r7, Point r8) {
        androidx.compose.ui.unit.e r02 = this.f16885a;
        r7.set(r02.B1(r02.M0(Float.intBitsToFloat((int) (this.f16886b >> 32)))), r02.B1(r02.M0(Float.intBitsToFloat((int) (this.f16886b & 4294967295L)))));
        r8.set(r7.x / 2, r7.y / 2);
    }

    public b(androidx.compose.ui.unit.e r1, long r2, l r4) {
        this.f16885a = r1;
        this.f16886b = r2;
        this.f16887c = r4;
    }
}
