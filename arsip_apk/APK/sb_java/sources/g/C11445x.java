package g;

import kotlin.jvm.internal.Lambda;

/* renamed from: g.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11445x extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f174317a;

    public C11445x(Exception r1) {
        this.f174317a = r1;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return kotlin.jvm.internal.p.u("CSHealthEventProcessorImpl#Deletion failed : ", this.f174317a.getMessage());
    }
}
