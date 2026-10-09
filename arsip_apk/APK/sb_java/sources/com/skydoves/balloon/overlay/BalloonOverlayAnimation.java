package com.skydoves.balloon.overlay;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonOverlayAnimation;", "", "(Ljava/lang/String;I)V", "NONE", "FADE", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BalloonOverlayAnimation extends Enum<BalloonOverlayAnimation> {
    public static final BalloonOverlayAnimation FADE = null;
    public static final BalloonOverlayAnimation NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BalloonOverlayAnimation[] f44168a = null;

    static {
        NONE = new BalloonOverlayAnimation("NONE", 0);
        FADE = new BalloonOverlayAnimation("FADE", 1);
        f44168a = a();
    }

    BalloonOverlayAnimation(String r1, int r2) {
    }

    public static final /* synthetic */ BalloonOverlayAnimation[] a() {
        return new BalloonOverlayAnimation[]{NONE, FADE};
    }

    public static BalloonOverlayAnimation valueOf(String r1) {
        return (BalloonOverlayAnimation) Enum.valueOf(BalloonOverlayAnimation.class, r1);
    }

    public static BalloonOverlayAnimation[] values() {
        return (BalloonOverlayAnimation[]) f44168a.clone();
    }
}
