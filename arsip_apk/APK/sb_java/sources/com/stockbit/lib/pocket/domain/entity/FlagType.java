package com.stockbit.lib.pocket.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/lib/pocket/domain/entity/FlagType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "LOCAL", "REMOTE", "Companion", "pocket"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum FlagType extends Enum<FlagType> {
    public static final a Companion = null;
    public static final FlagType LOCAL = null;
    public static final FlagType REMOTE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FlagType[] f120337a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120338b = null;
    private final int type;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        LOCAL = new FlagType("LOCAL", 0, 0);
        REMOTE = new FlagType("REMOTE", 1, 1);
        FlagType[] r02 = a();
        f120337a = r02;
        f120338b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FlagType(String r1, int r2, int r3) {
        this.type = r3;
    }

    public static final /* synthetic */ FlagType[] a() {
        return new FlagType[]{LOCAL, REMOTE};
    }

    public static kotlin.enums.a getEntries() {
        return f120338b;
    }

    public static FlagType valueOf(String r1) {
        return (FlagType) Enum.valueOf(FlagType.class, r1);
    }

    public static FlagType[] values() {
        return (FlagType[]) f120337a.clone();
    }

    public final int getType() {
        return this.type;
    }
}
