package com.poovam.pinedittextfield;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/poovam/pinedittextfield/HighlightType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "a", "ALL_FIELDS", "CURRENT_FIELD", "COMPLETED_FIELDS", "NO_FIELDS", "app_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public enum HighlightType extends Enum<HighlightType> {
    public static final HighlightType ALL_FIELDS = null;
    public static final HighlightType COMPLETED_FIELDS = null;
    public static final HighlightType CURRENT_FIELD = null;
    public static final a Companion = null;
    public static final HighlightType NO_FIELDS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HighlightType[] f43734a = null;
    private final int code;

    public static final class a {
        public a() {
        }

        public final HighlightType a(int r6) {
            HighlightType[] r02 = HighlightType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L9;
            HighlightType r3 = r02[r2];
            if (r3.getCode() == r6) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L9:
            return HighlightType.ALL_FIELDS;
        }

        public /* synthetic */ a(i r1) {
            this();
        }
    }

    static {
        HighlightType r02 = new HighlightType("ALL_FIELDS", 0, 0);
        ALL_FIELDS = r02;
        HighlightType r1 = new HighlightType("CURRENT_FIELD", 1, 1);
        CURRENT_FIELD = r1;
        HighlightType r2 = new HighlightType("COMPLETED_FIELDS", 2, 2);
        COMPLETED_FIELDS = r2;
        HighlightType r3 = new HighlightType("NO_FIELDS", 3, 3);
        NO_FIELDS = r3;
        f43734a = new HighlightType[]{r02, r1, r2, r3};
        Companion = new a(null);
    }

    HighlightType(String r1, int r2, int r3) {
        this.code = r3;
    }

    public static HighlightType valueOf(String r1) {
        return (HighlightType) Enum.valueOf(HighlightType.class, r1);
    }

    public static HighlightType[] values() {
        return (HighlightType[]) f43734a.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
