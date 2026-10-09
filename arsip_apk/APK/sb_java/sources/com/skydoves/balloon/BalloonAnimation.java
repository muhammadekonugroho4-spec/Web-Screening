package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/skydoves/balloon/BalloonAnimation;", "", "(Ljava/lang/String;I)V", "NONE", "ELASTIC", "FADE", "CIRCULAR", "OVERSHOOT", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BalloonAnimation extends Enum<BalloonAnimation> {
    public static final BalloonAnimation CIRCULAR = null;
    public static final BalloonAnimation ELASTIC = null;
    public static final BalloonAnimation FADE = null;
    public static final BalloonAnimation NONE = null;
    public static final BalloonAnimation OVERSHOOT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalloonAnimation[] f44095a = null;

    static {
        NONE = new BalloonAnimation("NONE", 0);
        ELASTIC = new BalloonAnimation("ELASTIC", 1);
        FADE = new BalloonAnimation("FADE", 2);
        CIRCULAR = new BalloonAnimation("CIRCULAR", 3);
        OVERSHOOT = new BalloonAnimation("OVERSHOOT", 4);
        f44095a = a();
    }

    BalloonAnimation(String r1, int r2) {
    }

    public static final /* synthetic */ BalloonAnimation[] a() {
        return new BalloonAnimation[]{NONE, ELASTIC, FADE, CIRCULAR, OVERSHOOT};
    }

    public static BalloonAnimation valueOf(String r1) {
        return (BalloonAnimation) Enum.valueOf(BalloonAnimation.class, r1);
    }

    public static BalloonAnimation[] values() {
        return (BalloonAnimation[]) f44095a.clone();
    }
}
