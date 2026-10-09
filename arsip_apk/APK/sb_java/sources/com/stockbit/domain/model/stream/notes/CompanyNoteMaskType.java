package com.stockbit.domain.model.stream.notes;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/stream/notes/CompanyNoteMaskType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "TYPE_COMPANY", "TYPE_USER", "TYPE_URL", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CompanyNoteMaskType extends Enum<CompanyNoteMaskType> {
    public static final a Companion = null;
    public static final CompanyNoteMaskType TYPE_COMPANY = null;
    public static final CompanyNoteMaskType TYPE_UNSPECIFIED = null;
    public static final CompanyNoteMaskType TYPE_URL = null;
    public static final CompanyNoteMaskType TYPE_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyNoteMaskType[] f85844a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85845b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CompanyNoteMaskType a(String r4) {
            Iterator<E> r02 = CompanyNoteMaskType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((CompanyNoteMaskType) r1).name(), r4) == false) goto L4;
        L9:
            CompanyNoteMaskType r12 = (CompanyNoteMaskType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return CompanyNoteMaskType.TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        TYPE_UNSPECIFIED = new CompanyNoteMaskType("TYPE_UNSPECIFIED", 0);
        TYPE_COMPANY = new CompanyNoteMaskType("TYPE_COMPANY", 1);
        TYPE_USER = new CompanyNoteMaskType("TYPE_USER", 2);
        TYPE_URL = new CompanyNoteMaskType("TYPE_URL", 3);
        CompanyNoteMaskType[] r02 = a();
        f85844a = r02;
        f85845b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CompanyNoteMaskType(String r1, int r2) {
    }

    public static final /* synthetic */ CompanyNoteMaskType[] a() {
        return new CompanyNoteMaskType[]{TYPE_UNSPECIFIED, TYPE_COMPANY, TYPE_USER, TYPE_URL};
    }

    public static kotlin.enums.a getEntries() {
        return f85845b;
    }

    public static CompanyNoteMaskType valueOf(String r1) {
        return (CompanyNoteMaskType) Enum.valueOf(CompanyNoteMaskType.class, r1);
    }

    public static CompanyNoteMaskType[] values() {
        return (CompanyNoteMaskType[]) f85844a.clone();
    }
}
