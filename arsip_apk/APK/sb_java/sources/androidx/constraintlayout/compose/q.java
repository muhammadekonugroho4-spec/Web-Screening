package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.p;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes.dex */
public final class q implements p.a, p {

    /* renamed from: b, reason: collision with root package name */
    public final r f20953b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20954c;
    public final r d;

    static {
    }

    public /* synthetic */ q(float r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final androidx.constraintlayout.core.parser.c a() {
        if (this.f20954c.b() == true) goto L5;
    L8:
        androidx.constraintlayout.core.parser.f r02 = new androidx.constraintlayout.core.parser.f(new char[0]);
        if (this.f20954c.b() == true) goto L12;
        r02.L("min", this.f20954c.a());
    L12:
        if (this.d.b() == true) goto L14;
        r02.L(Constants.PRIORITY_MAX, this.d.a());
    L14:
        r02.L("value", this.f20953b.a());
        return r02;
    L5:
        if (this.d.b() == false) goto L8;
        return this.f20953b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(androidx.compose.ui.unit.i r4, String r5) {
        this.f20953b = new r(r4, r5, "base", null);
        Object[] r2 = 0 == true ? 1 : 0;
        Object[] r22 = 0 == true ? 1 : 0;
        this.f20954c = new r(r2, r22, "min", 0 == true ? 1 : 0);
        String r52 = Constants.PRIORITY_MAX;
        this.d = new r(0 == true ? 1 : 0, 0 == true ? 1 : 0, r52, 0 == true ? 1 : 0);
    }

    public q(float r2) {
        this(androidx.compose.ui.unit.i.d(r2), null);
    }

    public q(String r2) {
        this(null, r2);
    }
}
