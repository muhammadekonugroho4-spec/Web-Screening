package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/skydoves/balloon/ArrowOrientationRules;", "", "(Ljava/lang/String;I)V", "ALIGN_ANCHOR", "ALIGN_FIXED", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum ArrowOrientationRules extends Enum<ArrowOrientationRules> {
    public static final ArrowOrientationRules ALIGN_ANCHOR = null;
    public static final ArrowOrientationRules ALIGN_FIXED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ArrowOrientationRules[] f43948a = null;

    static {
        ALIGN_ANCHOR = new ArrowOrientationRules("ALIGN_ANCHOR", 0);
        ALIGN_FIXED = new ArrowOrientationRules("ALIGN_FIXED", 1);
        f43948a = a();
    }

    ArrowOrientationRules(String r1, int r2) {
    }

    public static final /* synthetic */ ArrowOrientationRules[] a() {
        return new ArrowOrientationRules[]{ALIGN_ANCHOR, ALIGN_FIXED};
    }

    public static ArrowOrientationRules valueOf(String r1) {
        return (ArrowOrientationRules) Enum.valueOf(ArrowOrientationRules.class, r1);
    }

    public static ArrowOrientationRules[] values() {
        return (ArrowOrientationRules[]) f43948a.clone();
    }
}
