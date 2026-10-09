package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/skydoves/balloon/BalloonCenterAlign;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "START", "END", "TOP", "BOTTOM", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BalloonCenterAlign extends Enum<BalloonCenterAlign> {
    public static final BalloonCenterAlign BOTTOM = null;
    public static final a Companion = null;
    public static final BalloonCenterAlign END = null;
    public static final BalloonCenterAlign START = null;
    public static final BalloonCenterAlign TOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalloonCenterAlign[] f44096a = null;

    public static final class a {

        /* renamed from: com.skydoves.balloon.BalloonCenterAlign$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0502a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44097a = null;

            static {
                int[] r02 = new int[BalloonCenterAlign.values().length];
                r02[BalloonCenterAlign.START.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
            L9:
                r02[BalloonCenterAlign.END.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L5:
                f44097a = r02;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final BalloonCenterAlign a(BalloonCenterAlign r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "<this>");
            if (r3 == false) goto L9;
            int r32 = C0502a.f44097a[r2.ordinal()];
            if (r32 == 1) goto L13;
            if (r32 != 2) goto L9;
            return BalloonCenterAlign.START;
        L13:
            return BalloonCenterAlign.END;
        L9:
            return r2;
        }

        public a() {
        }
    }

    static {
        START = new BalloonCenterAlign("START", 0);
        END = new BalloonCenterAlign("END", 1);
        TOP = new BalloonCenterAlign("TOP", 2);
        BOTTOM = new BalloonCenterAlign("BOTTOM", 3);
        f44096a = a();
        Companion = new a(null);
    }

    BalloonCenterAlign(String r1, int r2) {
    }

    public static final /* synthetic */ BalloonCenterAlign[] a() {
        return new BalloonCenterAlign[]{START, END, TOP, BOTTOM};
    }

    public static BalloonCenterAlign valueOf(String r1) {
        return (BalloonCenterAlign) Enum.valueOf(BalloonCenterAlign.class, r1);
    }

    public static BalloonCenterAlign[] values() {
        return (BalloonCenterAlign[]) f44096a.clone();
    }
}
