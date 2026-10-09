package com.stockbit.component.dialog.shortinformation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/dialog/shortinformation/SingleCtaStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Outline", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum SingleCtaStyle extends Enum<SingleCtaStyle> {
    public static final SingleCtaStyle Outline = null;
    public static final SingleCtaStyle Primary = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SingleCtaStyle[] f70767a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70768b = null;

    static {
        Primary = new SingleCtaStyle("Primary", 0);
        Outline = new SingleCtaStyle("Outline", 1);
        SingleCtaStyle[] r02 = a();
        f70767a = r02;
        f70768b = kotlin.enums.b.a(r02);
    }

    SingleCtaStyle(String r1, int r2) {
    }

    public static final /* synthetic */ SingleCtaStyle[] a() {
        return new SingleCtaStyle[]{Primary, Outline};
    }

    public static kotlin.enums.a getEntries() {
        return f70768b;
    }

    public static SingleCtaStyle valueOf(String r1) {
        return (SingleCtaStyle) Enum.valueOf(SingleCtaStyle.class, r1);
    }

    public static SingleCtaStyle[] values() {
        return (SingleCtaStyle[]) f70767a.clone();
    }
}
