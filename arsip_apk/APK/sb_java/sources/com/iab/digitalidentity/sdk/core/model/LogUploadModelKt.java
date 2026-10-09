package com.iab.digitalidentity.sdk.core.model;

import i0.EnumC11491o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li0/o;", "kycSdkPartner", "Lcom/iab/digitalidentity/sdk/core/model/LogType;", "getLogTypeFromPartner", "(Li0/o;)Lcom/iab/digitalidentity/sdk/core/model/LogType;", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogUploadModelKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r02 = new int[EnumC11491o.values().length];
            r02[0] = 1;     // Catch: NoSuchFieldError -> L44
        L67:
            r02[1] = 2;     // Catch: NoSuchFieldError -> L45
        L89:
            r02[2] = 3;     // Catch: NoSuchFieldError -> L46
        L79:
            r02[3] = 4;     // Catch: NoSuchFieldError -> L47
        L85:
            r02[4] = 5;     // Catch: NoSuchFieldError -> L48
        L97:
            r02[5] = 6;     // Catch: NoSuchFieldError -> L49
        L93:
            r02[6] = 7;     // Catch: NoSuchFieldError -> L50
        L105:
            r02[7] = 8;     // Catch: NoSuchFieldError -> L51
        L101:
            r02[8] = 9;     // Catch: NoSuchFieldError -> L52
        L73:
            r02[10] = 10;     // Catch: NoSuchFieldError -> L53
        L69:
            r02[13] = 11;     // Catch: NoSuchFieldError -> L54
        L83:
            r02[14] = 12;     // Catch: NoSuchFieldError -> L55
        L95:
            r02[18] = 13;     // Catch: NoSuchFieldError -> L56
        L91:
            r02[15] = 14;     // Catch: NoSuchFieldError -> L57
        L103:
            r02[16] = 15;     // Catch: NoSuchFieldError -> L58
        L99:
            r02[17] = 16;     // Catch: NoSuchFieldError -> L59
        L71:
            r02[19] = 17;     // Catch: NoSuchFieldError -> L60
        L75:
            r02[9] = 18;     // Catch: NoSuchFieldError -> L61
        L65:
            r02[11] = 19;     // Catch: NoSuchFieldError -> L62
        L87:
            r02[12] = 20;     // Catch: NoSuchFieldError -> L63
        L81:
            r02[20] = 21;     // Catch: NoSuchFieldError -> L64
        L42:
            $EnumSwitchMapping$0 = r02;
        }
    }

    public static final LogType getLogTypeFromPartner(EnumC11491o r1) {
        p.l(r1, "kycSdkPartner");
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 1: goto L29;
            case 2: goto L29;
            case 3: goto L29;
            case 4: goto L29;
            case 5: goto L29;
            case 6: goto L29;
            case 7: goto L27;
            case 8: goto L25;
            case 9: goto L23;
            case 10: goto L21;
            case 11: goto L19;
            case 12: goto L17;
            case 13: goto L17;
            case 14: goto L15;
            case 15: goto L15;
            case 16: goto L15;
            case 17: goto L13;
            case 18: goto L11;
            case 19: goto L9;
            case 20: goto L9;
            case 21: goto L7;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        return LogType.TEST_PARTNER_FLOW;
    L9:
        return LogType.ON_DEMAND_CICIL;
    L11:
        return LogType.VEHICLE_FINANCING;
    L13:
        return LogType.ON_DEMAND_GOBIZ;
    L15:
        return LogType.ON_DEMAND_LOGIN;
    L17:
        return LogType.ON_DEMAND_DRIVER;
    L19:
        return LogType.ON_DEMAND_GPS;
    L21:
        return LogType.ON_DEMAND_CASHLOAN;
    L23:
        return LogType.PINJAM_CICIL_COMBINED;
    L25:
        return LogType.WEB_WRAPPER_PAYLATER;
    L27:
        return LogType.WEB_WRAPPER_CASHLOAN;
    L29:
        return LogType.CORE_KYC;
    }
}
