package kotlin.text;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class G {
    public static final String a(char r5) {
        String r02 = String.valueOf(r5);
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type java.lang.String");
        Locale r2 = Locale.ROOT;
        String r03 = r02.toUpperCase(r2);
        kotlin.jvm.internal.p.k(r03, "toUpperCase(...)");
        if (r03.length() <= 1) goto L10;
        if (r5 != 329) goto L7;
        return r03;
    L7:
        char r52 = r03.charAt(0);
        kotlin.jvm.internal.p.j(r03, "null cannot be cast to non-null type java.lang.String");
        String r04 = r03.substring(1);
        kotlin.jvm.internal.p.k(r04, "substring(...)");
        kotlin.jvm.internal.p.j(r04, "null cannot be cast to non-null type java.lang.String");
        String r05 = r04.toLowerCase(r2);
        kotlin.jvm.internal.p.k(r05, "toLowerCase(...)");
        return r52 + r05;
    L10:
        return String.valueOf(Character.toTitleCase(r5));
    }
}
