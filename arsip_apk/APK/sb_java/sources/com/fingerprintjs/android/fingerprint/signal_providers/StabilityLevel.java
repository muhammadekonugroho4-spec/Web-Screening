package com.fingerprintjs.android.fingerprint.signal_providers;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "", "(Ljava/lang/String;I)V", "atLeastAsStableAs", "", "other", "atLeastAsStableAs$fingerprint_release", "STABLE", "OPTIMAL", "UNIQUE", "fingerprint_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public enum StabilityLevel extends Enum<StabilityLevel> {
    public static final StabilityLevel OPTIMAL = null;
    public static final StabilityLevel STABLE = null;
    public static final StabilityLevel UNIQUE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StabilityLevel[] f37322a = null;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37323a = null;

        static {
            int[] r02 = new int[StabilityLevel.values().length];
            r02[StabilityLevel.STABLE.ordinal()] = 1;
            r02[StabilityLevel.OPTIMAL.ordinal()] = 2;
            r02[StabilityLevel.UNIQUE.ordinal()] = 3;
            f37323a = r02;
        }
    }

    static {
        STABLE = new StabilityLevel("STABLE", 0);
        OPTIMAL = new StabilityLevel("OPTIMAL", 1);
        UNIQUE = new StabilityLevel("UNIQUE", 2);
        f37322a = a();
    }

    StabilityLevel(String r1, int r2) {
    }

    public static final /* synthetic */ StabilityLevel[] a() {
        return new StabilityLevel[]{STABLE, OPTIMAL, UNIQUE};
    }

    public static StabilityLevel valueOf(String r1) {
        return (StabilityLevel) Enum.valueOf(StabilityLevel.class, r1);
    }

    public static StabilityLevel[] values() {
        return (StabilityLevel[]) f37322a.clone();
    }

    public final boolean atLeastAsStableAs$fingerprint_release(StabilityLevel r7) {
        p.l(r7, "other");
        int[] r02 = a.f37323a;
        int r1 = r02[ordinal()];
        if (r1 != 1) goto L5;
        return true;
    L5:
        if (r1 == 2) goto L17;
        if (r1 != 3) goto L16;
        int r72 = r02[r7.ordinal()];
        if (r72 == 1) goto L14;
        if (r72 == 2) goto L14;
        if (r72 != 3) goto L13;
        return true;
    L13:
        throw new NoWhenBranchMatchedException();
    L14:
        return false;
    L16:
        throw new NoWhenBranchMatchedException();
    L17:
        int r73 = r02[r7.ordinal()];
        if (r73 == 1) goto L25;
        if (r73 == 2) goto L24;
        if (r73 == 3) goto L24;
        throw new NoWhenBranchMatchedException();
    L24:
        return true;
    L25:
        return false;
    }
}
