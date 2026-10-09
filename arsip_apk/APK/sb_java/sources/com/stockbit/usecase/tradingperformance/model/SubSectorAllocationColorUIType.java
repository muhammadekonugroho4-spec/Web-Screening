package com.stockbit.usecase.tradingperformance.model;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/tradingperformance/model/SubSectorAllocationColorUIType;", "", "<init>", "(Ljava/lang/String;I)V", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5", "Rank6", "Rank7", "Rank8", "Rank9", "Rank10", "Other", "Companion", "usecase-tradingperformance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SubSectorAllocationColorUIType extends Enum<SubSectorAllocationColorUIType> {
    public static final a Companion = null;
    public static final SubSectorAllocationColorUIType Other = null;
    public static final SubSectorAllocationColorUIType Rank1 = null;
    public static final SubSectorAllocationColorUIType Rank10 = null;
    public static final SubSectorAllocationColorUIType Rank2 = null;
    public static final SubSectorAllocationColorUIType Rank3 = null;
    public static final SubSectorAllocationColorUIType Rank4 = null;
    public static final SubSectorAllocationColorUIType Rank5 = null;
    public static final SubSectorAllocationColorUIType Rank6 = null;
    public static final SubSectorAllocationColorUIType Rank7 = null;
    public static final SubSectorAllocationColorUIType Rank8 = null;
    public static final SubSectorAllocationColorUIType Rank9 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SubSectorAllocationColorUIType[] f163443a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163444b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final SubSectorAllocationColorUIType a(int r4) {
            Iterator<E> r02 = SubSectorAllocationColorUIType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((SubSectorAllocationColorUIType) r1).ordinal() != r4) goto L4;
        L9:
            SubSectorAllocationColorUIType r12 = (SubSectorAllocationColorUIType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return SubSectorAllocationColorUIType.Other;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        Rank1 = new SubSectorAllocationColorUIType("Rank1", 0);
        Rank2 = new SubSectorAllocationColorUIType("Rank2", 1);
        Rank3 = new SubSectorAllocationColorUIType("Rank3", 2);
        Rank4 = new SubSectorAllocationColorUIType("Rank4", 3);
        Rank5 = new SubSectorAllocationColorUIType("Rank5", 4);
        Rank6 = new SubSectorAllocationColorUIType("Rank6", 5);
        Rank7 = new SubSectorAllocationColorUIType("Rank7", 6);
        Rank8 = new SubSectorAllocationColorUIType("Rank8", 7);
        Rank9 = new SubSectorAllocationColorUIType("Rank9", 8);
        Rank10 = new SubSectorAllocationColorUIType("Rank10", 9);
        Other = new SubSectorAllocationColorUIType("Other", 10);
        SubSectorAllocationColorUIType[] r02 = a();
        f163443a = r02;
        f163444b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SubSectorAllocationColorUIType(String r1, int r2) {
    }

    public static final /* synthetic */ SubSectorAllocationColorUIType[] a() {
        return new SubSectorAllocationColorUIType[]{Rank1, Rank2, Rank3, Rank4, Rank5, Rank6, Rank7, Rank8, Rank9, Rank10, Other};
    }

    public static kotlin.enums.a getEntries() {
        return f163444b;
    }

    public static SubSectorAllocationColorUIType valueOf(String r1) {
        return (SubSectorAllocationColorUIType) Enum.valueOf(SubSectorAllocationColorUIType.class, r1);
    }

    public static SubSectorAllocationColorUIType[] values() {
        return (SubSectorAllocationColorUIType[]) f163443a.clone();
    }
}
