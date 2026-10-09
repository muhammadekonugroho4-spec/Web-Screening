package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Untransformed", "Insertion", "Replacement", "Deletion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum IndexTransformationType extends Enum<IndexTransformationType> {
    public static final IndexTransformationType Deletion = null;
    public static final IndexTransformationType Insertion = null;
    public static final IndexTransformationType Replacement = null;
    public static final IndexTransformationType Untransformed = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IndexTransformationType[] f10104a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10105b = null;

    static {
        Untransformed = new IndexTransformationType("Untransformed", 0);
        Insertion = new IndexTransformationType("Insertion", 1);
        Replacement = new IndexTransformationType("Replacement", 2);
        Deletion = new IndexTransformationType("Deletion", 3);
        IndexTransformationType[] r02 = a();
        f10104a = r02;
        f10105b = kotlin.enums.b.a(r02);
    }

    IndexTransformationType(String r1, int r2) {
    }

    public static final /* synthetic */ IndexTransformationType[] a() {
        return new IndexTransformationType[]{Untransformed, Insertion, Replacement, Deletion};
    }

    public static kotlin.enums.a getEntries() {
        return f10105b;
    }

    public static IndexTransformationType valueOf(String r1) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, r1);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) f10104a.clone();
    }
}
