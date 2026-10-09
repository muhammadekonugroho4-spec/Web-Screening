package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* loaded from: classes5.dex */
final /* synthetic */ class zzci {
    static final /* synthetic */ int[] zza = null;

    static {
        int[] r02 = new int[RoundingMode.values().length];
        zza = r02;
        r02[RoundingMode.UNNECESSARY.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
    L20:
        zza[RoundingMode.DOWN.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
    L24:
        zza[RoundingMode.FLOOR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
    L34:
        zza[RoundingMode.UP.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
    L22:
        zza[RoundingMode.CEILING.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
    L26:
        zza[RoundingMode.HALF_DOWN.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
    L28:
        zza[RoundingMode.HALF_UP.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
    L30:
        zza[RoundingMode.HALF_EVEN.ordinal()] = 8;     // Catch: NoSuchFieldError -> L19
        return;
    }
}
