package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/TextType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_CHANGE", "EACH_WORD_UPPERCASE", "ALL_UPPERCASE", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TextType extends Enum<TextType> {
    public static final TextType ALL_UPPERCASE = null;
    public static final a Companion = null;
    public static final TextType EACH_WORD_UPPERCASE = null;
    public static final TextType NO_CHANGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextType[] f86258a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86259b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TextType a(Integer r7) {
            TextType[] r02 = TextType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            TextType r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return TextType.NO_CHANGE;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        NO_CHANGE = new TextType("NO_CHANGE", 0, 0);
        EACH_WORD_UPPERCASE = new TextType("EACH_WORD_UPPERCASE", 1, 1);
        ALL_UPPERCASE = new TextType("ALL_UPPERCASE", 2, 2);
        TextType[] r02 = a();
        f86258a = r02;
        f86259b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    TextType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TextType[] a() {
        return new TextType[]{NO_CHANGE, EACH_WORD_UPPERCASE, ALL_UPPERCASE};
    }

    public static kotlin.enums.a getEntries() {
        return f86259b;
    }

    public static TextType valueOf(String r1) {
        return (TextType) Enum.valueOf(TextType.class, r1);
    }

    public static TextType[] values() {
        return (TextType[]) f86258a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
