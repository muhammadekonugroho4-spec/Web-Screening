package okhttp3.internal.idn;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", FirebaseAnalytics.Param.INDEX, "a", "(Ljava/lang/String;I)I", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdnaMappingTableKt {
    public static final int a(String r1, int r2) {
        p.l(r1, "<this>");
        char r02 = r1.charAt(r2);
        char r12 = r1.charAt(r2 + 1);
        return (r02 << 7) + r12;
    }
}
