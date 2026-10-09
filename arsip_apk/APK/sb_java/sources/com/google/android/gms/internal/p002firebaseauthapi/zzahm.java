package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahm implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private zzahx zzg;
    private boolean zzh;
    private zzahx zzi;
    private String zzj;

    public zzahm() {
        this.zzh = true;
        this.zzg = new zzahx();
        this.zzi = new zzahx();
    }

    public final zzahm zza(String r2) {
        Preconditions.checkNotEmpty(r2);
        this.zzi.zzb().add(r2);
        return this;
    }

    public final zzahm zzb(String r2) {
        if (r2 != null) goto L5;
        this.zzg.zzb().add("DISPLAY_NAME");
        return this;
    L5:
        this.zzb = r2;
        return this;
    }

    public final zzahm zzc(String r2) {
        if (r2 != null) goto L5;
        this.zzg.zzb().add("EMAIL");
        return this;
    L5:
        this.zzc = r2;
        return this;
    }

    public final zzahm zzd(String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
        return this;
    }

    public final zzahm zze(String r1) {
        this.zze = Preconditions.checkNotEmpty(r1);
        return this;
    }

    public final zzahm zzf(String r2) {
        if (r2 != null) goto L5;
        this.zzg.zzb().add("PASSWORD");
        return this;
    L5:
        this.zzd = r2;
        return this;
    }

    public final zzahm zzg(String r2) {
        if (r2 != null) goto L5;
        this.zzg.zzb().add("PHOTO_URL");
        return this;
    L5:
        this.zzf = r2;
        return this;
    }

    public final zzahm zzh(String r1) {
        this.zzj = r1;
        return this;
    }

    public final boolean zzi(String r2) {
        Preconditions.checkNotEmpty(r2);
        return this.zzg.zzb().contains(r2);
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r2 = new JSONObject();
        r2.put("returnSecureToken", this.zzh);
        int r4 = 0;
        if (this.zzi.zzb().isEmpty() == true) goto L9;
        List<String> r3 = this.zzi.zzb();
        JSONArray r5 = new JSONArray();
        int r6 = 0;
    L6:
        if (r6 >= r3.size()) goto L8;
        r5.put(r3.get(r6));
        r6 = r6 + 1;
        goto L6
    L8:
        r2.put("deleteProvider", r5);
    L9:
        List<String> r32 = this.zzg.zzb();
        int r52 = r32.size();
        int[] r62 = new int[r52];
        int r7 = 0;
    L11:
        if (r7 >= r32.size()) goto L38;
        String r8 = r32.get(r7);
        r8.getClass();
        char r9 = 65535;
        switch(r8.hashCode()) {
            case -333046776: goto L28;
            case 66081660: goto L24;
            case 1939891618: goto L20;
            case 1999612571: goto L16;
            default: goto L31;
        };
    L31:
        switch(r9) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L34;
            case 3: goto L33;
            default: goto L32;
        };
    L32:
        int r82 = 0;
    L37:
        r62[r7] = r82;
        r7 = r7 + 1;
        goto L11
    L33:
        r82 = 5;
        goto L37
    L34:
        r82 = 4;
        goto L37
    L35:
        r82 = 1;
        goto L37
    L36:
        r82 = 2;
        goto L37
    L16:
        if (r8.equals("PASSWORD") == false) goto L31;
        r9 = 3;
        goto L31
    L20:
        if (r8.equals("PHOTO_URL") == false) goto L31;
        r9 = 2;
        goto L31
    L24:
        if (r8.equals("EMAIL") == false) goto L31;
        r9 = 1;
        goto L31
    L28:
        if (r8.equals("DISPLAY_NAME") == false) goto L31;
        r9 = 0;
        goto L31
    L38:
        if (r52 <= 0) goto L43;
        JSONArray r02 = new JSONArray();
    L40:
        if (r4 >= r52) goto L42;
        r02.put(r62[r4]);
        r4 = r4 + 1;
        goto L40
    L42:
        r2.put("deleteAttribute", r02);
    L43:
        String r03 = this.zza;
        if (r03 == null) goto L46;
        r2.put("idToken", r03);
    L46:
        String r04 = this.zzc;
        if (r04 == null) goto L49;
        r2.put("email", r04);
    L49:
        String r05 = this.zzd;
        if (r05 == null) goto L52;
        r2.put("password", r05);
    L52:
        String r06 = this.zzb;
        if (r06 == null) goto L55;
        r2.put("displayName", r06);
    L55:
        String r07 = this.zzf;
        if (r07 == null) goto L58;
        r2.put("photoUrl", r07);
    L58:
        String r08 = this.zze;
        if (r08 == null) goto L61;
        r2.put("oobCode", r08);
    L61:
        String r09 = this.zzj;
        if (r09 == null) goto L65;
        r2.put("tenantId", r09);
    L65:
        return r2.toString();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
