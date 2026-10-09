package C0;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* renamed from: C0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965c extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f489b;

    public C1965c(Ref$BooleanRef r1, kotlin.jvm.functions.a r2) {
        this.f488a = r1;
        this.f489b = r2;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.a] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.f488a.element == true) goto L6;
        this.f489b.invoke();
    L6:
        return kotlin.w.f180450a;
    }
}
