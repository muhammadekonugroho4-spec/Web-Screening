package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements kotlin.jvm.functions.l {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewKt$ancestors$1 f23142a = null;

    static {
        f23142a = new ViewKt$ancestors$1();
    }

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.l
    public /* bridge */ /* synthetic */ Object invoke(Object r1) {
        return s((ViewParent) r1);
    }

    public final ViewParent s(ViewParent r1) {
        return r1.getParent();
    }
}
