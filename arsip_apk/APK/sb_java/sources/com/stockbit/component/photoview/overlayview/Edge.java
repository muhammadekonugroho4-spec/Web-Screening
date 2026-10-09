package com.stockbit.component.photoview.overlayview;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/stockbit/component/photoview/overlayview/Edge;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "TOP", "RIGHT", "BOTTOM", "coordinate", "", "getCoordinate", "()F", "setCoordinate", "(F)V", "Companion", "photoview_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum Edge extends Enum<Edge> {
    public static final Edge BOTTOM = null;
    public static final a Companion = null;
    public static final Edge LEFT = null;
    public static final Edge RIGHT = null;
    public static final Edge TOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Edge[] f73976a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f73977b = null;
    private float coordinate;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final float a() {
            return Edge.BOTTOM.getCoordinate() - Edge.TOP.getCoordinate();
        }

        public final float b() {
            return Edge.RIGHT.getCoordinate() - Edge.LEFT.getCoordinate();
        }

        public a() {
        }
    }

    static {
        LEFT = new Edge("LEFT", 0);
        TOP = new Edge("TOP", 1);
        RIGHT = new Edge("RIGHT", 2);
        BOTTOM = new Edge("BOTTOM", 3);
        Edge[] r02 = a();
        f73976a = r02;
        f73977b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    Edge(String r1, int r2) {
    }

    public static final /* synthetic */ Edge[] a() {
        return new Edge[]{LEFT, TOP, RIGHT, BOTTOM};
    }

    public static kotlin.enums.a getEntries() {
        return f73977b;
    }

    public static Edge valueOf(String r1) {
        return (Edge) Enum.valueOf(Edge.class, r1);
    }

    public static Edge[] values() {
        return (Edge[]) f73976a.clone();
    }

    public final float getCoordinate() {
        return this.coordinate;
    }

    public final void setCoordinate(float r1) {
        this.coordinate = r1;
    }
}
