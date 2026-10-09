package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;

/* renamed from: androidx.compose.foundation.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3009y {
    public static final void a(long r4, Orientation r6) {
        boolean r1 = false;
        if (r6 != Orientation.Vertical) goto L11;
        if (androidx.compose.ui.unit.c.k(r4) == Integer.MAX_VALUE) goto L7;
        r1 = true;
    L7:
        if (r1 == true) goto L16;
        androidx.compose.foundation.internal.e.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        return;
    L16:
        return;
    L11:
        if (androidx.compose.ui.unit.c.l(r4) == Integer.MAX_VALUE) goto L13;
        r1 = true;
    L13:
        if (r1 == true) goto L17;
        androidx.compose.foundation.internal.e.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        return;
    }
}
