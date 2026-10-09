package io.sentry.android.replay;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public volatile ReplayState f175927a;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175928a = null;

        static {
            int[] r02 = new int[ReplayState.values().length];
            r02[ReplayState.INITIAL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L19:
            r02[ReplayState.STARTED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L27:
            r02[ReplayState.RESUMED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L21:
            r02[ReplayState.PAUSED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L23:
            r02[ReplayState.STOPPED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L17:
            r02[ReplayState.CLOSED.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L9:
            f175928a = r02;
        }
    }

    static {
    }

    public k() {
        this.f175927a = ReplayState.INITIAL;
    }

    public final ReplayState a() {
        return this.f175927a;
    }

    public final boolean b(ReplayState r4) {
        kotlin.jvm.internal.p.l(r4, "newState");
        ReplayState r02 = this.f175927a;
        switch(a.f175928a[r02.ordinal()]) {
            case 1: goto L42;
            case 2: goto L33;
            case 3: goto L24;
            case 4: goto L15;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    L8:
        if (r4 != ReplayState.STARTED) goto L10;
    L13:
        return true;
    L10:
        if (r4 == ReplayState.CLOSED) goto L13;
        return false;
    L15:
        if (r4 != ReplayState.RESUMED) goto L17;
    L22:
        return true;
    L17:
        if (r4 == ReplayState.STOPPED) goto L22;
        if (r4 == ReplayState.CLOSED) goto L22;
        return false;
    L24:
        if (r4 != ReplayState.PAUSED) goto L26;
    L31:
        return true;
    L26:
        if (r4 == ReplayState.STOPPED) goto L31;
        if (r4 == ReplayState.CLOSED) goto L31;
        return false;
    L33:
        if (r4 != ReplayState.PAUSED) goto L35;
    L40:
        return true;
    L35:
        if (r4 == ReplayState.STOPPED) goto L40;
        if (r4 == ReplayState.CLOSED) goto L40;
        return false;
    L42:
        if (r4 != ReplayState.STARTED) goto L44;
    L47:
        return true;
    L44:
        if (r4 == ReplayState.CLOSED) goto L47;
        return false;
    }

    public final boolean c() {
        if (this.f175927a != ReplayState.STARTED) goto L5;
        return true;
    L5:
        if (this.f175927a == ReplayState.RESUMED) goto L11;
        return false;
    L11:
        return true;
    }

    public final void d(ReplayState r2) {
        kotlin.jvm.internal.p.l(r2, "<set-?>");
        this.f175927a = r2;
    }
}
