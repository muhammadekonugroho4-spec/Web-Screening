package com.stockbit.navigation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/navigation/NavigationAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "RIGHT_LEFT", "DRAWER", "UP_DOWN", "navigation_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum NavigationAnimation extends Enum<NavigationAnimation> {
    public static final NavigationAnimation DRAWER = null;
    public static final NavigationAnimation NONE = null;
    public static final NavigationAnimation RIGHT_LEFT = null;
    public static final NavigationAnimation UP_DOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NavigationAnimation[] f122405a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122406b = null;

    static {
        NONE = new NavigationAnimation("NONE", 0);
        RIGHT_LEFT = new NavigationAnimation("RIGHT_LEFT", 1);
        DRAWER = new NavigationAnimation("DRAWER", 2);
        UP_DOWN = new NavigationAnimation("UP_DOWN", 3);
        NavigationAnimation[] r02 = a();
        f122405a = r02;
        f122406b = kotlin.enums.b.a(r02);
    }

    NavigationAnimation(String r1, int r2) {
    }

    public static final /* synthetic */ NavigationAnimation[] a() {
        return new NavigationAnimation[]{NONE, RIGHT_LEFT, DRAWER, UP_DOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f122406b;
    }

    public static NavigationAnimation valueOf(String r1) {
        return (NavigationAnimation) Enum.valueOf(NavigationAnimation.class, r1);
    }

    public static NavigationAnimation[] values() {
        return (NavigationAnimation[]) f122405a.clone();
    }
}
