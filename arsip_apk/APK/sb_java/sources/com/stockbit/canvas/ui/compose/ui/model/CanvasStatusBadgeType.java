package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/canvas/ui/compose/ui/model/CanvasStatusBadgeType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", DebugCoroutineInfoImplKt.SUSPENDED, "DELISTED", "canvas_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum CanvasStatusBadgeType extends Enum<CanvasStatusBadgeType> {
    public static final CanvasStatusBadgeType DELISTED = null;
    public static final CanvasStatusBadgeType NONE = null;
    public static final CanvasStatusBadgeType SUSPENDED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CanvasStatusBadgeType[] f51784a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f51785b = null;

    static {
        NONE = new CanvasStatusBadgeType("NONE", 0);
        SUSPENDED = new CanvasStatusBadgeType(DebugCoroutineInfoImplKt.SUSPENDED, 1);
        DELISTED = new CanvasStatusBadgeType("DELISTED", 2);
        CanvasStatusBadgeType[] r02 = a();
        f51784a = r02;
        f51785b = kotlin.enums.b.a(r02);
    }

    CanvasStatusBadgeType(String r1, int r2) {
    }

    public static final /* synthetic */ CanvasStatusBadgeType[] a() {
        return new CanvasStatusBadgeType[]{NONE, SUSPENDED, DELISTED};
    }

    public static kotlin.enums.a getEntries() {
        return f51785b;
    }

    public static CanvasStatusBadgeType valueOf(String r1) {
        return (CanvasStatusBadgeType) Enum.valueOf(CanvasStatusBadgeType.class, r1);
    }

    public static CanvasStatusBadgeType[] values() {
        return (CanvasStatusBadgeType[]) f51784a.clone();
    }
}
