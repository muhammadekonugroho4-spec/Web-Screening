package C0;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* renamed from: C0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977o extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f516b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1977o(Ref$BooleanRef r1, kotlin.jvm.functions.a r2) {
        this.f515a = r1;
        this.f516b = (Lambda) r2;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.a, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.f515a.element == true) goto L6;
        this.f516b.invoke();
    L6:
        return kotlin.w.f180450a;
    }
}
