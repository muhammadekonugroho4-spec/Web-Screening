package com.stockbit.usecase.stream.model.notes;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/stream/model/notes/NoteMaskType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "TYPE_COMPANY", "TYPE_USER", "TYPE_URL", "Companion", "usecase-stream"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum NoteMaskType extends Enum<NoteMaskType> {
    public static final a Companion = null;
    public static final NoteMaskType TYPE_COMPANY = null;
    public static final NoteMaskType TYPE_UNSPECIFIED = null;
    public static final NoteMaskType TYPE_URL = null;
    public static final NoteMaskType TYPE_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NoteMaskType[] f163051a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163052b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final NoteMaskType a(String r4) {
            Iterator<E> r02 = NoteMaskType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((NoteMaskType) r1).name(), r4) == false) goto L4;
        L9:
            NoteMaskType r12 = (NoteMaskType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return NoteMaskType.TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        TYPE_UNSPECIFIED = new NoteMaskType("TYPE_UNSPECIFIED", 0);
        TYPE_COMPANY = new NoteMaskType("TYPE_COMPANY", 1);
        TYPE_USER = new NoteMaskType("TYPE_USER", 2);
        TYPE_URL = new NoteMaskType("TYPE_URL", 3);
        NoteMaskType[] r02 = a();
        f163051a = r02;
        f163052b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    NoteMaskType(String r1, int r2) {
    }

    public static final /* synthetic */ NoteMaskType[] a() {
        return new NoteMaskType[]{TYPE_UNSPECIFIED, TYPE_COMPANY, TYPE_USER, TYPE_URL};
    }

    public static kotlin.enums.a getEntries() {
        return f163052b;
    }

    public static NoteMaskType valueOf(String r1) {
        return (NoteMaskType) Enum.valueOf(NoteMaskType.class, r1);
    }

    public static NoteMaskType[] values() {
        return (NoteMaskType[]) f163051a.clone();
    }
}
