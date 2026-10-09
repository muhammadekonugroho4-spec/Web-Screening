package C0;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class A extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f460b;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Ref$BooleanRef r1, kotlin.jvm.functions.a r2) {
        this.f459a = r1;
        this.f460b = (Lambda) r2;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.a, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.f459a.element == true) goto L6;
        this.f460b.invoke();
    L6:
        return kotlin.w.f180450a;
    }
}
