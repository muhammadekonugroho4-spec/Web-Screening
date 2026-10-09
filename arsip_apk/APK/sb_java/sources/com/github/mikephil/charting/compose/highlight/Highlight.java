package com.github.mikephil.charting.compose.highlight;

import androidx.compose.ui.geometry.e;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013¨\u0006("}, d2 = {"Lcom/github/mikephil/charting/compose/highlight/Highlight;", "", "", "dataSetIndex", "entryIndex", "", "x", "y", "Landroidx/compose/ui/geometry/e;", "pixelPosition", "<init>", "(IIFFJLkotlin/jvm/internal/i;)V", "component1", "()I", "component2", "component3", "()F", "component4", "component5-F1C5BW0", "()J", "component5", "copy-0mBilkg", "(IIFFJ)Lcom/github/mikephil/charting/compose/highlight/Highlight;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDataSetIndex", "getEntryIndex", "F", "getX", "getY", "J", "getPixelPosition-F1C5BW0", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Highlight {
    public static final int $stable = 0;
    private final int dataSetIndex;
    private final int entryIndex;
    private final long pixelPosition;

    /* renamed from: x, reason: collision with root package name */
    private final float f37816x;

    /* renamed from: y, reason: collision with root package name */
    private final float f37817y;

    static {
    }

    public /* synthetic */ Highlight(int r1, int r2, float r3, float r4, long r5, i r7) {
        this(r1, r2, r3, r4, r5);
    }

    /* renamed from: copy-0mBilkg$default, reason: not valid java name */
    public static /* synthetic */ Highlight m153copy0mBilkg$default(Highlight r02, int r1, int r2, float r3, float r4, long r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.dataSetIndex;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.entryIndex;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f37816x;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.f37817y;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r5 = r02.pixelPosition;
    L17:
        long r72 = r5;
        float r52 = r3;
        float r6 = r4;
        return r02.m155copy0mBilkg(r1, r2, r52, r6, r72);
    }

    public final int component1() {
        return this.dataSetIndex;
    }

    public final int component2() {
        return this.entryIndex;
    }

    public final float component3() {
        return this.f37816x;
    }

    public final float component4() {
        return this.f37817y;
    }

    /* renamed from: component5-F1C5BW0, reason: not valid java name */
    public final long m154component5F1C5BW0() {
        return this.pixelPosition;
    }

    /* renamed from: copy-0mBilkg, reason: not valid java name */
    public final Highlight m155copy0mBilkg(int r9, int r10, float r11, float r12, long r13) {
        return new Highlight(r9, r10, r11, r12, r13, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Highlight) == true) goto L8;
        return false;
    L8:
        Highlight r82 = (Highlight) r8;
        if (this.dataSetIndex == r82.dataSetIndex) goto L12;
        return false;
    L12:
        if (this.entryIndex == r82.entryIndex) goto L15;
        return false;
    L15:
        if (Float.compare(this.f37816x, r82.f37816x) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.f37817y, r82.f37817y) == 0) goto L21;
        return false;
    L21:
        if (e.j(this.pixelPosition, r82.pixelPosition) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getDataSetIndex() {
        return this.dataSetIndex;
    }

    public final int getEntryIndex() {
        return this.entryIndex;
    }

    /* renamed from: getPixelPosition-F1C5BW0, reason: not valid java name */
    public final long m156getPixelPositionF1C5BW0() {
        return this.pixelPosition;
    }

    public final float getX() {
        return this.f37816x;
    }

    public final float getY() {
        return this.f37817y;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.dataSetIndex) * 31) + Integer.hashCode(this.entryIndex)) * 31) + Float.hashCode(this.f37816x)) * 31) + Float.hashCode(this.f37817y)) * 31) + e.o(this.pixelPosition);
    }

    public String toString() {
        return "Highlight(dataSetIndex=" + this.dataSetIndex + ", entryIndex=" + this.entryIndex + ", x=" + this.f37816x + ", y=" + this.f37817y + ", pixelPosition=" + e.s(this.pixelPosition) + ")";
    }

    private Highlight(int r1, int r2, float r3, float r4, long r5) {
        this.dataSetIndex = r1;
        this.entryIndex = r2;
        this.f37816x = r3;
        this.f37817y = r4;
        this.pixelPosition = r5;
    }
}
