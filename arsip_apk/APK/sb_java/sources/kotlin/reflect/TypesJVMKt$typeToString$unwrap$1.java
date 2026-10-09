package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements kotlin.jvm.functions.l {

    /* renamed from: a, reason: collision with root package name */
    public static final TypesJVMKt$typeToString$unwrap$1 f177576a = null;

    static {
        f177576a = new TypesJVMKt$typeToString$unwrap$1();
    }

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.l
    public /* bridge */ /* synthetic */ Object invoke(Object r1) {
        return s((Class) r1);
    }

    public final Class s(Class r2) {
        kotlin.jvm.internal.p.l(r2, "p0");
        return r2.getComponentType();
    }
}
