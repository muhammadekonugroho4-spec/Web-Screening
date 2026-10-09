package kotlin.enums;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class b {
    public static final a a(Enum[] r1) {
        p.l(r1, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        return new EnumEntriesList(r1);
    }
}
