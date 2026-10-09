package com.stockbit.usecase.insider.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/insider/model/ColorType;", "", "<init>", "(Ljava/lang/String;I)V", "PURPLE", "GREEN", "RED", "PRIMARY", "SECONDARY", "usecase-insider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ColorType extends Enum<ColorType> {
    public static final ColorType GREEN = null;
    public static final ColorType PRIMARY = null;
    public static final ColorType PURPLE = null;
    public static final ColorType RED = null;
    public static final ColorType SECONDARY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ColorType[] f158045a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158046b = null;

    static {
        PURPLE = new ColorType("PURPLE", 0);
        GREEN = new ColorType("GREEN", 1);
        RED = new ColorType("RED", 2);
        PRIMARY = new ColorType("PRIMARY", 3);
        SECONDARY = new ColorType("SECONDARY", 4);
        ColorType[] r02 = a();
        f158045a = r02;
        f158046b = kotlin.enums.b.a(r02);
    }

    ColorType(String r1, int r2) {
    }

    public static final /* synthetic */ ColorType[] a() {
        return new ColorType[]{PURPLE, GREEN, RED, PRIMARY, SECONDARY};
    }

    public static kotlin.enums.a getEntries() {
        return f158046b;
    }

    public static ColorType valueOf(String r1) {
        return (ColorType) Enum.valueOf(ColorType.class, r1);
    }

    public static ColorType[] values() {
        return (ColorType[]) f158045a.clone();
    }
}
