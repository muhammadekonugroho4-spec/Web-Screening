package C0;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class E extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f466c;

    /* JADX WARN: Multi-variable type inference failed */
    public E(Ref$BooleanRef r1, kotlin.jvm.functions.l r2, Ref$BooleanRef r3) {
        this.f464a = r1;
        this.f465b = (Lambda) r2;
        this.f466c = r3;
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        this.f464a.element = true;
        this.f465b.invoke(Boolean.valueOf(this.f466c.element));
        return kotlin.w.f180450a;
    }
}
