package com.stockbit.usecase.trading.community.model.type;

import com.stockbit.lib.extension.s;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/trading/community/model/type/BibitRegistrationStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "STATUS_REGISTRATION_STILL_INPROGRESS", "STATUS_MISMATCH_USER_IDENTITY", "STATUS_ACCOUNT_BIBIT_SUSPENDED", "STATUS_ACCOUNT_BIBIT_DEACTIVATED", "STATUS_SUCCESS", "Companion", "usecase-trading-community"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BibitRegistrationStatusType extends Enum<BibitRegistrationStatusType> {
    public static final a Companion = null;
    public static final BibitRegistrationStatusType STATUS_ACCOUNT_BIBIT_DEACTIVATED = null;
    public static final BibitRegistrationStatusType STATUS_ACCOUNT_BIBIT_SUSPENDED = null;
    public static final BibitRegistrationStatusType STATUS_MISMATCH_USER_IDENTITY = null;
    public static final BibitRegistrationStatusType STATUS_REGISTRATION_STILL_INPROGRESS = null;
    public static final BibitRegistrationStatusType STATUS_SUCCESS = null;
    public static final BibitRegistrationStatusType STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BibitRegistrationStatusType[] f163293a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163294b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final boolean a(BibitRegistrationStatusType r2) {
            p.l(r2, "<this>");
            if (r2 == BibitRegistrationStatusType.STATUS_SUCCESS) goto L6;
            return true;
        L6:
            return false;
        }

        public final BibitRegistrationStatusType b(String r4) {
            p.l(r4, "type");
            Iterator<E> r02 = BibitRegistrationStatusType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (s.u(((BibitRegistrationStatusType) r1).name(), r4) == false) goto L4;
        L9:
            BibitRegistrationStatusType r12 = (BibitRegistrationStatusType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return BibitRegistrationStatusType.STATUS_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        STATUS_UNSPECIFIED = new BibitRegistrationStatusType("STATUS_UNSPECIFIED", 0);
        STATUS_REGISTRATION_STILL_INPROGRESS = new BibitRegistrationStatusType("STATUS_REGISTRATION_STILL_INPROGRESS", 1);
        STATUS_MISMATCH_USER_IDENTITY = new BibitRegistrationStatusType("STATUS_MISMATCH_USER_IDENTITY", 2);
        STATUS_ACCOUNT_BIBIT_SUSPENDED = new BibitRegistrationStatusType("STATUS_ACCOUNT_BIBIT_SUSPENDED", 3);
        STATUS_ACCOUNT_BIBIT_DEACTIVATED = new BibitRegistrationStatusType("STATUS_ACCOUNT_BIBIT_DEACTIVATED", 4);
        STATUS_SUCCESS = new BibitRegistrationStatusType("STATUS_SUCCESS", 5);
        BibitRegistrationStatusType[] r02 = a();
        f163293a = r02;
        f163294b = b.a(r02);
        Companion = new a(null);
    }

    BibitRegistrationStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ BibitRegistrationStatusType[] a() {
        return new BibitRegistrationStatusType[]{STATUS_UNSPECIFIED, STATUS_REGISTRATION_STILL_INPROGRESS, STATUS_MISMATCH_USER_IDENTITY, STATUS_ACCOUNT_BIBIT_SUSPENDED, STATUS_ACCOUNT_BIBIT_DEACTIVATED, STATUS_SUCCESS};
    }

    public static kotlin.enums.a getEntries() {
        return f163294b;
    }

    public static BibitRegistrationStatusType valueOf(String r1) {
        return (BibitRegistrationStatusType) Enum.valueOf(BibitRegistrationStatusType.class, r1);
    }

    public static BibitRegistrationStatusType[] values() {
        return (BibitRegistrationStatusType[]) f163293a.clone();
    }
}
