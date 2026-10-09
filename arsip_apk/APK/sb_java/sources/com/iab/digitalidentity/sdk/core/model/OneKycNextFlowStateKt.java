package com.iab.digitalidentity.sdk.core.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getOneKycNextFlowStateFromString", "Lcom/iab/digitalidentity/sdk/core/model/OneKycNextFlowState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneKycNextFlowStateKt {
    public static final OneKycNextFlowState getOneKycNextFlowStateFromString(String r2) {
        if (r2 == null) goto L5;
        String r22 = r2.toUpperCase(Locale.ROOT);
        p.k(r22, "this as java.lang.String).toUpperCase(Locale.ROOT)");
    L6:
        if (r22 != null) goto L8;
    L45:
        return null;
    L8:
        switch(r22.hashCode()) {
            case -1839152142: goto L41;
            case -105739197: goto L36;
            case -104965307: goto L31;
            case 2163908: goto L26;
            case 696544716: goto L21;
            case 1395945474: goto L16;
            case 1669483514: goto L11;
            default: goto L45;
        };
    L11:
        if (r22.equals("CONSENT") == false) goto L45;
        return OneKycNextFlowState.CONSENT;
    L16:
        if (r22.equals("DOCUMENT_CAPTURE") == false) goto L45;
        return OneKycNextFlowState.DOCUMENT_CAPTURE;
    L21:
        if (r22.equals("BLOCKED") == false) goto L45;
        return OneKycNextFlowState.BLOCKED;
    L26:
        if (r22.equals("FORM") == false) goto L45;
        return OneKycNextFlowState.FORM;
    L31:
        if (r22.equals("USER_DETAIL") == false) goto L45;
        return OneKycNextFlowState.USER_DETAIL;
    L36:
        if (r22.equals("CHALLENGE") == false) goto L45;
        return OneKycNextFlowState.CHALLENGE;
    L41:
        if (r22.equals("STATUS") == false) goto L45;
        return OneKycNextFlowState.STATUS;
    L5:
        r22 = null;
        goto L6
    }
}
