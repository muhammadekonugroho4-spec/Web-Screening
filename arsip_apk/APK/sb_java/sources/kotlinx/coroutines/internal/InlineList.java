package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

@kotlin.jvm.b
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", ExifInterface.GpsLongitudeRef.EAST, "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "plus", "Lkotlin/Function1;", "Lkotlin/w;", Constants.KEY_ACTION, "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/l;)V", "forEachReversed", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object r1) {
        this.holder = r1;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineList m860boximpl(Object r1) {
        return new InlineList(r1);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m861constructorimpl(Object r02) {
        return r02;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m862constructorimpl$default(Object r02, int r1, kotlin.jvm.internal.i r2) {
        if ((r1 & 1) == 0) goto L6;
        r02 = null;
    L6:
        return m861constructorimpl(r02);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m863equalsimpl(Object r2, Object r3) {
        if ((r3 instanceof InlineList) == true) goto L6;
        return false;
    L6:
        if (p.g(r2, ((InlineList) r3).m869unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m864equalsimpl0(Object r02, Object r1) {
        return p.g(r02, r1);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m865forEachReversedimpl(Object r2, l r3) {
        if (r2 != null) goto L5;
        return;
    L5:
        if ((r2 instanceof ArrayList) == true) goto L8;
        r3.invoke(r2);
        return;
    L8:
        p.j(r2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList r22 = (ArrayList) r2;
        int r02 = r22.size();
    L9:
        r02 = r02 - 1;
        if ((-1) >= r02) goto L14;
        r3.invoke(r22.get(r02));
        goto L9
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m866hashCodeimpl(Object r02) {
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m867plusFjFbRPM(Object r2, E r3) {
        if (r2 != null) goto L6;
        return m861constructorimpl(r3);
    L6:
        if ((r2 instanceof ArrayList) == false) goto L9;
        p.j(r2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ((ArrayList) r2).add(r3);
        return m861constructorimpl(r2);
    L9:
        ArrayList r02 = new ArrayList(4);
        r02.add(r2);
        r02.add(r3);
        return m861constructorimpl(r02);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m868toStringimpl(Object r2) {
        return "InlineList(holder=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m863equalsimpl(this.holder, r2);
    }

    public int hashCode() {
        return m866hashCodeimpl(this.holder);
    }

    public String toString() {
        return m868toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m869unboximpl() {
        return this.holder;
    }
}
