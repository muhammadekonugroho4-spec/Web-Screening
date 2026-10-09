package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/skydoves/balloon/BalloonHighlightAnimation;", "", "(Ljava/lang/String;I)V", "NONE", "HEARTBEAT", "SHAKE", "BREATH", "ROTATE", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BalloonHighlightAnimation extends Enum<BalloonHighlightAnimation> {
    public static final BalloonHighlightAnimation BREATH = null;
    public static final BalloonHighlightAnimation HEARTBEAT = null;
    public static final BalloonHighlightAnimation NONE = null;
    public static final BalloonHighlightAnimation ROTATE = null;
    public static final BalloonHighlightAnimation SHAKE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalloonHighlightAnimation[] f44098a = null;

    static {
        NONE = new BalloonHighlightAnimation("NONE", 0);
        HEARTBEAT = new BalloonHighlightAnimation("HEARTBEAT", 1);
        SHAKE = new BalloonHighlightAnimation("SHAKE", 2);
        BREATH = new BalloonHighlightAnimation("BREATH", 3);
        ROTATE = new BalloonHighlightAnimation("ROTATE", 4);
        f44098a = a();
    }

    BalloonHighlightAnimation(String r1, int r2) {
    }

    public static final /* synthetic */ BalloonHighlightAnimation[] a() {
        return new BalloonHighlightAnimation[]{NONE, HEARTBEAT, SHAKE, BREATH, ROTATE};
    }

    public static BalloonHighlightAnimation valueOf(String r1) {
        return (BalloonHighlightAnimation) Enum.valueOf(BalloonHighlightAnimation.class, r1);
    }

    public static BalloonHighlightAnimation[] values() {
        return (BalloonHighlightAnimation[]) f44098a.clone();
    }
}
