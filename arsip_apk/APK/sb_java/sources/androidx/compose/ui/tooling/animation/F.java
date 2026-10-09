package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.collections.a0;

/* loaded from: classes.dex */
public final class F implements ComposeAnimation {

    /* renamed from: e, reason: collision with root package name */
    public static final a f20436e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20437f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f20438g;

    /* renamed from: a, reason: collision with root package name */
    public final String f20439a;

    /* renamed from: b, reason: collision with root package name */
    public final ComposeAnimationType f20440b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20441c;
    public final Set d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final F a(String r3) {
            kotlin.jvm.internal.i r1 = null;
            if (b() == true) goto L5;
            return null;
        L5:
            return new F(r3, r1);
        }

        public final boolean b() {
            return F.a();
        }

        public a() {
        }
    }

    static {
        f20436e = new a(null);
        f20437f = 8;
        ComposeAnimationType[] r02 = ComposeAnimationType.values();
        int r1 = r02.length;
        boolean r2 = false;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (kotlin.jvm.internal.p.g(r02[r3].name(), "UNSUPPORTED") == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        r2 = true;
    L8:
        f20438g = r2;
    }

    public /* synthetic */ F(String r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final /* synthetic */ boolean a() {
        return f20438g;
    }

    public F(String r1) {
        this.f20439a = r1;
        this.f20440b = ComposeAnimationType.UNSUPPORTED;
        this.f20441c = 0;
        this.d = a0.e();
    }
}
