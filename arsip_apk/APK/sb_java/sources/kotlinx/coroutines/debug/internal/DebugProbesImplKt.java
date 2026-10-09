package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"repr", "", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugProbesImplKt {
    public static final /* synthetic */ String access$repr(String r02) {
        return repr(r02);
    }

    private static final String repr(String r6) {
        StringBuilder r02 = new StringBuilder();
        r02.append('\"');
        int r2 = r6.length();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        char r4 = r6.charAt(r3);
        if (r4 == '\r') goto L16;
        if (r4 != '\"') goto L8;
        r02.append("\\\"");
    L17:
        r3 = r3 + 1;
        goto L3
    L8:
        if (r4 == '\\') goto L14;
        switch(r4) {
            case 8: goto L13;
            case 9: goto L12;
            case 10: goto L11;
            default: goto L10;
        };
    L10:
        r02.append(r4);
        goto L17
    L11:
        r02.append("\\n");
        goto L17
    L12:
        r02.append("\\t");
        goto L17
    L13:
        r02.append("\\b");
        goto L17
    L14:
        r02.append("\\\\");
        goto L17
    L16:
        r02.append("\\r");
        goto L17
    L18:
        r02.append('\"');
        return r02.toString();
    }
}
