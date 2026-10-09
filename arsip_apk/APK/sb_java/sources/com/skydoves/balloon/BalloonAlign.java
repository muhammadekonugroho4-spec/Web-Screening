package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/skydoves/balloon/BalloonAlign;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "START", "END", "TOP", "BOTTOM", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BalloonAlign extends Enum<BalloonAlign> {
    public static final BalloonAlign BOTTOM = null;
    public static final a Companion = null;
    public static final BalloonAlign END = null;
    public static final BalloonAlign START = null;
    public static final BalloonAlign TOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalloonAlign[] f44094a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        START = new BalloonAlign("START", 0);
        END = new BalloonAlign("END", 1);
        TOP = new BalloonAlign("TOP", 2);
        BOTTOM = new BalloonAlign("BOTTOM", 3);
        f44094a = a();
        Companion = new a(null);
    }

    BalloonAlign(String r1, int r2) {
    }

    public static final /* synthetic */ BalloonAlign[] a() {
        return new BalloonAlign[]{START, END, TOP, BOTTOM};
    }

    public static BalloonAlign valueOf(String r1) {
        return (BalloonAlign) Enum.valueOf(BalloonAlign.class, r1);
    }

    public static BalloonAlign[] values() {
        return (BalloonAlign[]) f44094a.clone();
    }
}
