package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzek {
    private static final long zza = 0;
    private static final zzek zzb = null;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long r1 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 7) goto L6;
        r1 = r1 | ((r3 + 1) << ((int) ((" #(+,-0".charAt(r3) - ' ') * 3)));
        r3 = r3 + 1;
        goto L4
    L6:
        zza = r1;
        zzb = new zzek(0, -1, -1);
    }

    private zzek(int r1, int r2, int r3) {
        this.zzc = r1;
        this.zzd = r2;
        this.zze = r3;
    }

    public static int zzd(String r3, boolean r4) {
        int r02 = 0;
        if (true == r4) goto L5;
        int r42 = 0;
    L7:
        if (r02 >= r3.length()) goto L13;
        int r2 = zzm(r3.charAt(r02));
        if (r2 < 0) goto L12;
        r42 = r42 | (1 << r2);
        r02 = r02 + 1;
        goto L7
    L12:
        throw new IllegalArgumentException("invalid flags: ".concat(r3));
    L13:
        return r42;
    L5:
        r42 = 128;
        goto L7
    }

    public static zzek zzf() {
        return zzb;
    }

    public static zzek zzg(String r7, int r8, int r9, boolean r10) throws zzhc {
        if (r8 != r9) goto L8;
        if (r10 == true) goto L8;
        return zzb;
    L8:
        if (true == r10) goto L10;
        int r102 = 0;
    L12:
        if (r8 == r9) goto L14;
        int r2 = r8 + 1;
        char r3 = r7.charAt(r8);
        if (r3 < ' ') goto L33;
        if (r3 > '0') goto L33;
        int r4 = zzm(r3);
        if (r4 < 0) goto L22;
        int r1 = 1 << r4;
        if ((r102 & r1) != 0) goto L31;
        r102 = r102 | r1;
        r8 = r2;
        goto L12
    L31:
        throw zzhc.zza("repeated flag", r7, r8);
    L22:
        if (r3 != '.') goto L26;
        return new zzek(r102, -1, zzn(r7, r2, r9));
    L26:
        throw zzhc.zza("invalid flag", r7, r8);
    L33:
        if (r3 > '9') goto L52;
        int r32 = r3 - '0';
    L35:
        if (r2 == r9) goto L37;
        int r02 = r2 + 1;
        char r42 = r7.charAt(r2);
        if (r42 == '.') goto L41;
        char r43 = (char) (r42 - '0');
        if (r43 >= '\n') goto L50;
        r32 = (r32 * 10) + r43;
        if (r32 > 999999) goto L48;
        r2 = r02;
        goto L35
    L48:
        throw zzhc.zzc("width too large", r7, r8, r9);
    L50:
        throw zzhc.zza("invalid width character", r7, r2);
    L41:
        return new zzek(r102, r32, zzn(r7, r02, r9));
    L37:
        return new zzek(r102, r32, -1);
    L52:
        throw zzhc.zza("invalid flag", r7, r8);
    L14:
        return new zzek(r102, -1, -1);
    L10:
        r102 = 128;
        goto L12
    }

    private static int zzm(char r4) {
        return ((int) ((zza >>> ((r4 - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(String r5, int r6, int r7) throws zzhc {
        if (r6 == r7) goto L22;
        int r1 = r6;
        int r2 = 0;
    L4:
        if (r1 >= r7) goto L14;
        char r3 = (char) (r5.charAt(r1) - '0');
        if (r3 >= '\n') goto L13;
        r2 = (r2 * 10) + r3;
        if (r2 > 999999) goto L11;
        r1 = r1 + 1;
        goto L4
    L11:
        throw zzhc.zzc("precision too large", r5, r6, r7);
    L13:
        throw zzhc.zza("invalid precision character", r5, r1);
    L14:
        if (r2 == 0) goto L16;
        return r2;
    L16:
        if (r7 != (r6 + 1)) goto L19;
        return 0;
    L19:
        throw zzhc.zzc("invalid precision", r5, r6, r7);
    L22:
        throw zzhc.zza("missing precision", r5, r6 - 1);
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzek) == false) goto L14;
        zzek r52 = (zzek) r5;
        if (r52.zzc != this.zzc) goto L14;
        if (r52.zzd != this.zzd) goto L14;
        if (r52.zze != this.zze) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzek zze(int r1, boolean r2, boolean r3) {
        if (zzj() == true) goto L14;
        int r12 = this.zzc;
        int r22 = r12 & 128;
        if (r22 == 0) goto L18;
        if (r22 != r12) goto L16;
        if (this.zzd != (-1)) goto L16;
        if (this.zze == (-1)) goto L14;
    L16:
        return new zzek(r22, -1, -1);
    L18:
        return zzb;
    L14:
        return this;
    }

    public final StringBuilder zzh(StringBuilder r5) {
        if (zzj() == true) goto L17;
        int r02 = this.zzc;
        int r1 = 0;
    L5:
        int r2 = r02 & (-129);
        int r3 = 1 << r1;
        if (r3 > r2) goto L11;
        if ((r2 & r3) == 0) goto L10;
        r5.append(" #(+,-0".charAt(r1));
    L10:
        r1 = r1 + 1;
        goto L5
    L11:
        int r03 = this.zzd;
        if (r03 == (-1)) goto L15;
        r5.append(r03);
    L15:
        if (this.zze == (-1)) goto L17;
        r5.append('.');
        r5.append(this.zze);
    L17:
        return r5;
    }

    public final boolean zzi(zzej r2) {
        return zzl(r2.zzb(), r2.zzd().zza());
    }

    public final boolean zzj() {
        if (this != zzb) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean zzk() {
        if ((this.zzc & 128) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean zzl(int r6, boolean r7) {
        if (zzj() == false) goto L5;
        return true;
    L5:
        int r02 = this.zzc;
        if (((~r6) & r02) == 0) goto L9;
        return false;
    L9:
        if (r7 == false) goto L11;
    L14:
        int r72 = this.zzd;
        if ((r02 & 9) != 9) goto L17;
        return false;
    L17:
        int r03 = r02 & 96;
        if (r03 != 96) goto L20;
        return false;
    L20:
        if (r03 == 0) goto L23;
        if (r72 != (-1)) goto L23;
        return false;
    L23:
        return true;
    L11:
        if (this.zze == (-1)) goto L14;
        return false;
    }
}
