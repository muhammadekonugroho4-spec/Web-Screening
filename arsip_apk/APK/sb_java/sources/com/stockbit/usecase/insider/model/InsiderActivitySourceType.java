package com.stockbit.usecase.insider.model;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/insider/model/InsiderActivitySourceType;", "", Constants.KEY_TITLE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "SOURCE_TYPE_UNSPECIFIED", "SOURCE_TYPE_IDX", "SOURCE_TYPE_KSEI", "Companion", "usecase-insider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum InsiderActivitySourceType extends Enum<InsiderActivitySourceType> {
    public static final a Companion = null;
    public static final InsiderActivitySourceType SOURCE_TYPE_IDX = null;
    public static final InsiderActivitySourceType SOURCE_TYPE_KSEI = null;
    public static final InsiderActivitySourceType SOURCE_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InsiderActivitySourceType[] f158060a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158061b = null;
    private final String title;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InsiderActivitySourceType a(String r4) {
            p.l(r4, "type");
            Iterator<E> r02 = InsiderActivitySourceType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(r4, ((InsiderActivitySourceType) r1).name()) == false) goto L4;
        L9:
            InsiderActivitySourceType r12 = (InsiderActivitySourceType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return InsiderActivitySourceType.SOURCE_TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SOURCE_TYPE_UNSPECIFIED = new InsiderActivitySourceType("SOURCE_TYPE_UNSPECIFIED", 0, "All");
        SOURCE_TYPE_IDX = new InsiderActivitySourceType("SOURCE_TYPE_IDX", 1, "IDX");
        SOURCE_TYPE_KSEI = new InsiderActivitySourceType("SOURCE_TYPE_KSEI", 2, "KSEI");
        InsiderActivitySourceType[] r02 = a();
        f158060a = r02;
        f158061b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    InsiderActivitySourceType(String r1, int r2, String r3) {
        this.title = r3;
    }

    public static final /* synthetic */ InsiderActivitySourceType[] a() {
        return new InsiderActivitySourceType[]{SOURCE_TYPE_UNSPECIFIED, SOURCE_TYPE_IDX, SOURCE_TYPE_KSEI};
    }

    public static kotlin.enums.a getEntries() {
        return f158061b;
    }

    public static InsiderActivitySourceType valueOf(String r1) {
        return (InsiderActivitySourceType) Enum.valueOf(InsiderActivitySourceType.class, r1);
    }

    public static InsiderActivitySourceType[] values() {
        return (InsiderActivitySourceType[]) f158060a.clone();
    }

    public final String getTitle() {
        return this.title;
    }
}
