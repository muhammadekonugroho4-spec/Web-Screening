package com.iab.digitalidentity.ui.theme.commons;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/ui/theme/commons/DigitalIdentityTextAlignment;", "", "(Ljava/lang/String;I)V", "toAndroidTextAlignment", "", "toAndroidTextAlignment$OneKycSdk_universalRelease", "START", "CENTER", "END", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum DigitalIdentityTextAlignment extends Enum<DigitalIdentityTextAlignment> {
    public static final DigitalIdentityTextAlignment CENTER = null;
    public static final DigitalIdentityTextAlignment END = null;
    public static final DigitalIdentityTextAlignment START = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DigitalIdentityTextAlignment[] f40716a = null;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40717a = null;

        static {
            int[] r02 = new int[DigitalIdentityTextAlignment.values().length];
            r02[DigitalIdentityTextAlignment.START.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[DigitalIdentityTextAlignment.CENTER.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[DigitalIdentityTextAlignment.END.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f40717a = r02;
        }
    }

    static {
        START = new DigitalIdentityTextAlignment("START", 0);
        CENTER = new DigitalIdentityTextAlignment("CENTER", 1);
        END = new DigitalIdentityTextAlignment("END", 2);
        f40716a = a();
    }

    DigitalIdentityTextAlignment(String r1, int r2) {
    }

    public static final /* synthetic */ DigitalIdentityTextAlignment[] a() {
        return new DigitalIdentityTextAlignment[]{START, CENTER, END};
    }

    public static DigitalIdentityTextAlignment valueOf(String r1) {
        return (DigitalIdentityTextAlignment) Enum.valueOf(DigitalIdentityTextAlignment.class, r1);
    }

    public static DigitalIdentityTextAlignment[] values() {
        return (DigitalIdentityTextAlignment[]) f40716a.clone();
    }

    public final int toAndroidTextAlignment$OneKycSdk_universalRelease() {
        int r02 = a.f40717a[ordinal()];
        if (r02 != 1) goto L5;
        return 5;
    L5:
        if (r02 != 2) goto L7;
        return 4;
    L7:
        if (r02 != 3) goto L11;
        return 6;
    L11:
        throw new NoWhenBranchMatchedException();
    }
}
