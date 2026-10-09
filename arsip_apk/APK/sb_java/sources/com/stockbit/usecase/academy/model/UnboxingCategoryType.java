package com.stockbit.usecase.academy.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.search.SearchEntryPoint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.B;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/academy/model/UnboxingCategoryType;", "", "value", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getTitle", "SECTOR", "EMITEN", "Companion", "usecase-academy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum UnboxingCategoryType extends Enum<UnboxingCategoryType> {
    public static final a Companion = null;
    public static final UnboxingCategoryType EMITEN = null;
    public static final UnboxingCategoryType SECTOR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnboxingCategoryType[] f154305a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154306b = null;
    private final String title;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final UnboxingCategoryType a(String r5) {
            p.l(r5, "value");
            Iterator<E> r02 = UnboxingCategoryType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (B.e0(r5, ((UnboxingCategoryType) r1).getValue(), true) == false) goto L4;
        L10:
            return (UnboxingCategoryType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        SECTOR = new UnboxingCategoryType("SECTOR", 0, SearchEntryPoint.KEY_SECTOR, "Sector");
        EMITEN = new UnboxingCategoryType("EMITEN", 1, "emitten", "Emiten");
        UnboxingCategoryType[] r02 = a();
        f154305a = r02;
        f154306b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    UnboxingCategoryType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.title = r4;
    }

    public static final /* synthetic */ UnboxingCategoryType[] a() {
        return new UnboxingCategoryType[]{SECTOR, EMITEN};
    }

    public static kotlin.enums.a getEntries() {
        return f154306b;
    }

    public static UnboxingCategoryType valueOf(String r1) {
        return (UnboxingCategoryType) Enum.valueOf(UnboxingCategoryType.class, r1);
    }

    public static UnboxingCategoryType[] values() {
        return (UnboxingCategoryType[]) f154305a.clone();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
