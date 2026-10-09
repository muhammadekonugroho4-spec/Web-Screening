package com.stockbit.uikit.chips;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/uikit/chips/ChipsActionMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MULTI_PICK", "SINGLE_PICK", "CHOICE", "Companion", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ChipsActionMode extends Enum<ChipsActionMode> {
    public static final ChipsActionMode CHOICE = null;
    public static final a Companion = null;
    public static final ChipsActionMode MULTI_PICK = null;
    public static final ChipsActionMode SINGLE_PICK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChipsActionMode[] f151439a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151440b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ChipsActionMode a(int r6) {
            ChipsActionMode[] r02 = ChipsActionMode.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ChipsActionMode r3 = r02[r2];
            if (r3.getValue() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return ChipsActionMode.MULTI_PICK;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        MULTI_PICK = new ChipsActionMode("MULTI_PICK", 0, 0);
        SINGLE_PICK = new ChipsActionMode("SINGLE_PICK", 1, 1);
        CHOICE = new ChipsActionMode("CHOICE", 2, 2);
        ChipsActionMode[] r02 = a();
        f151439a = r02;
        f151440b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    ChipsActionMode(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChipsActionMode[] a() {
        return new ChipsActionMode[]{MULTI_PICK, SINGLE_PICK, CHOICE};
    }

    public static kotlin.enums.a getEntries() {
        return f151440b;
    }

    public static ChipsActionMode valueOf(String r1) {
        return (ChipsActionMode) Enum.valueOf(ChipsActionMode.class, r1);
    }

    public static ChipsActionMode[] values() {
        return (ChipsActionMode[]) f151439a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
