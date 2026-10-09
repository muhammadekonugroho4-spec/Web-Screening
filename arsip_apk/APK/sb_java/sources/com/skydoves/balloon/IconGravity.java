package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/skydoves/balloon/IconGravity;", "", "(Ljava/lang/String;I)V", "START", "END", "TOP", "BOTTOM", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum IconGravity extends Enum<IconGravity> {
    public static final IconGravity BOTTOM = null;
    public static final IconGravity END = null;
    public static final IconGravity START = null;
    public static final IconGravity TOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IconGravity[] f44099a = null;

    static {
        START = new IconGravity("START", 0);
        END = new IconGravity("END", 1);
        TOP = new IconGravity("TOP", 2);
        BOTTOM = new IconGravity("BOTTOM", 3);
        f44099a = a();
    }

    IconGravity(String r1, int r2) {
    }

    public static final /* synthetic */ IconGravity[] a() {
        return new IconGravity[]{START, END, TOP, BOTTOM};
    }

    public static IconGravity valueOf(String r1) {
        return (IconGravity) Enum.valueOf(IconGravity.class, r1);
    }

    public static IconGravity[] values() {
        return (IconGravity[]) f44099a.clone();
    }
}
