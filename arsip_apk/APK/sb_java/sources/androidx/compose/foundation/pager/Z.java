package androidx.compose.foundation.pager;

/* loaded from: classes.dex */
public interface Z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9066a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9067a = null;

        static {
            f9067a = new a();
        }

        public a() {
        }

        public final Z a(int r3) {
            if (r3 < 0) goto L4;
            boolean r02 = true;
        L5:
            if (r02 == true) goto L8;
            androidx.compose.foundation.internal.e.a("pages should be greater than or equal to 0. You have used " + r3 + '.');
        L8:
            return new a0(r3);
        L4:
            r02 = false;
            goto L5
        }
    }

    static {
        f9066a = a.f9067a;
    }

    int a(int r1, int r2, float r3, int r4, int r5);
}
