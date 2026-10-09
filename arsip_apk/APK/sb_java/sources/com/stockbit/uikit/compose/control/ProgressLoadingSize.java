package com.stockbit.uikit.compose.control;

import androidx.compose.ui.unit.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/uikit/compose/control/ProgressLoadingSize;", "", "size", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "sweepAngle", "", "<init>", "(Ljava/lang/String;IFFF)V", "getSize-D9Ej5fM", "()F", "F", "getStrokeWidth-D9Ej5fM", "getSweepAngle", "LARGE", "SMALL", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ProgressLoadingSize extends Enum<ProgressLoadingSize> {
    public static final ProgressLoadingSize LARGE = null;
    public static final ProgressLoadingSize SMALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProgressLoadingSize[] f151793a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151794b = null;
    private final float size;
    private final float strokeWidth;
    private final float sweepAngle;

    static {
        LARGE = new ProgressLoadingSize("LARGE", 0, i.h(44), i.h(5), 150.0f);
        SMALL = new ProgressLoadingSize("SMALL", 1, i.h(20), i.h(2), 180.0f);
        ProgressLoadingSize[] r02 = a();
        f151793a = r02;
        f151794b = kotlin.enums.b.a(r02);
    }

    ProgressLoadingSize(String r1, int r2, float r3, float r4, float r5) {
        this.size = r3;
        this.strokeWidth = r4;
        this.sweepAngle = r5;
    }

    public static final /* synthetic */ ProgressLoadingSize[] a() {
        return new ProgressLoadingSize[]{LARGE, SMALL};
    }

    public static kotlin.enums.a getEntries() {
        return f151794b;
    }

    public static ProgressLoadingSize valueOf(String r1) {
        return (ProgressLoadingSize) Enum.valueOf(ProgressLoadingSize.class, r1);
    }

    public static ProgressLoadingSize[] values() {
        return (ProgressLoadingSize[]) f151793a.clone();
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m742getSizeD9Ej5fM() {
        return this.size;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m743getStrokeWidthD9Ej5fM() {
        return this.strokeWidth;
    }

    public final float getSweepAngle() {
        return this.sweepAngle;
    }
}
