package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@KeepForSdk
/* loaded from: classes5.dex */
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object r1, zzai r2) {
            Preconditions.checkNotNull(r1);
            this.zzb = r1;
            this.zza = new ArrayList();
        }

        @KeepForSdk
        public ToStringHelper add(String r2, Object r3) {
            Preconditions.checkNotNull(r2);
            this.zza.add(r2 + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(r3));
            return this;
        }

        @KeepForSdk
        public String toString() {
            StringBuilder r02 = new StringBuilder(100);
            r02.append(this.zzb.getClass().getSimpleName());
            r02.append('{');
            int r1 = this.zza.size();
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            r02.append((String) this.zza.get(r2));
            if (r2 >= (r1 - 1)) goto L7;
            r02.append(", ");
        L7:
            r2 = r2 + 1;
            goto L3
        L8:
            r02.append('}');
            return r02.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(Bundle r5, Bundle r6) {
        if (r5 == null) goto L19;
        if (r6 == null) goto L19;
        if (r5.size() == r6.size()) goto L9;
        return false;
    L9:
        Set<String> r2 = r5.keySet();
        if (r2.containsAll(r6.keySet()) == true) goto L12;
        return false;
    L12:
        Iterator<String> r22 = r2.iterator();
    L14:
        if (r22.hasNext() == false) goto L18;
        String r3 = r22.next();
        if (equal(r5.get(r3), r6.get(r3)) == true) goto L14;
        return false;
    L18:
        return true;
    L19:
        if (r5 != r6) goto L21;
        return true;
    L21:
        return false;
    }

    @KeepForSdk
    public static boolean equal(Object r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
    L9:
        return false;
    L7:
        if (r2.equals(r3) == false) goto L9;
        return true;
    }

    @KeepForSdk
    public static int hashCode(Object... r02) {
        return Arrays.hashCode(r02);
    }

    @KeepForSdk
    public static ToStringHelper toStringHelper(Object r2) {
        return new ToStringHelper(r2, null);
    }
}
