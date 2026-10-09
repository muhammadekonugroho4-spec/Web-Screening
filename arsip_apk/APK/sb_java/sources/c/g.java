package c;

import g.EnumC11423b;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29756a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29758c;

    public g(boolean r3, boolean r4, boolean r5, int r6) {
        if ((r6 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r6 & 2) == 0) goto L8;
        r4 = false;
    L8:
        EnumC11423b r02 = EnumC11423b.f174266c;
        if ((r6 & 256) == 0) goto L11;
        r5 = false;
    L11:
        p.l(r02, "healthDeletionMode");
        this.f29756a = r3;
        this.f29757b = r4;
        this.f29758c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f29756a == r52.f29756a) goto L12;
        return false;
    L12:
        if (this.f29757b == r52.f29757b) goto L15;
        return false;
    L15:
        if (this.f29758c == r52.f29758c) goto L17;
        return false;
    L17:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean r02 = this.f29756a;
        int r1 = 1;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r04 = r03 * 31;
        ?? r2 = this.f29757b;
        int r22 = r2;
        if (r2 == 0) goto L8;
        r22 = 1;
    L8:
        int r23 = (EnumC11423b.f174266c.hashCode() + ((((r04 + r22) * 961) + 1) * 31)) * 923521;
        boolean r05 = this.f29758c;
        if (r05 == true) goto L13;
        r1 = r05 ? 1 : 0;
    L13:
        return r23 + r1;
    }

    public final String toString() {
        return "CSRemoteConfig(isForegroundEventFlushEnabled=" + this.f29756a + ", ignoreBatteryLvlOnFlush=" + this.f29757b + ", batchFlushedEvents=false, checkVersionOnHealthDeletion=true, healthDeletionMode=" + EnumC11423b.f174266c + ", useUSLocale=false, sendBackgroundEventsViaHttp=false, sendForegroundEventsViaHttp=false, enableOkHttpSocket=" + this.f29758c + ')';
    }
}
