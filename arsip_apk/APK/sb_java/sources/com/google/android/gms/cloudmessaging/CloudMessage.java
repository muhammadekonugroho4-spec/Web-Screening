package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.C2337a;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes5.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @SafeParcelable.Field(id = 1)
    final Intent zza;
    private Map zzb;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    static {
        CREATOR = new zza();
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public CloudMessage(@SafeParcelable.Param(id = 1) Intent r1) {
        this.zza = r1;
    }

    private static int zzb(String r1) {
        if (Objects.equals(r1, Constants.PRIORITY_HIGH) == false) goto L7;
        return 1;
    L7:
        if (Objects.equals(r1, "normal") == false) goto L10;
        return 2;
    L10:
        return 0;
    }

    public String getCollapseKey() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    public synchronized Map<String, String> getData() {
        monitor-enter(this);
    L22:
        th = move-exception;
        throw th;
    L4:
        if (this.zzb != null) goto L25;
        Bundle r02 = this.zza.getExtras();     // Catch: Throwable -> L22
        C2337a r1 = new C2337a();     // Catch: Throwable -> L22
        if (r02 == null) goto L24;
        Iterator<String> r2 = r02.keySet().iterator();     // Catch: Throwable -> L22
    L10:
        if (r2.hasNext() == false) goto L24;
        String r3 = r2.next();     // Catch: Throwable -> L22
        Object r4 = r02.get(r3);     // Catch: Throwable -> L22
        if ((r4 instanceof String) == false) goto L10;
        String r42 = (String) r4;     // Catch: Throwable -> L22
        if (r3.startsWith(Constants.MessagePayloadKeys.RESERVED_PREFIX) == true) goto L10;
        if (r3.equals(Constants.MessagePayloadKeys.FROM) == true) goto L10;
        if (r3.equals(Constants.MessagePayloadKeys.MESSAGE_TYPE) == true) goto L10;
        if (r3.equals(Constants.MessagePayloadKeys.COLLAPSE_KEY) == true) goto L10;
        r1.put(r3, r42);     // Catch: Throwable -> L22
    L24:
        this.zzb = r1;     // Catch: Throwable -> L22
    L25:
        Map<String, String> r03 = this.zzb;     // Catch: Throwable -> L22
        monitor-exit(this);
        return r03;
    }

    public String getFrom() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.FROM);
    }

    public Intent getIntent() {
        return this.zza;
    }

    public String getMessageId() {
        String r02 = this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
    }

    public String getMessageType() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public int getOriginalPriority() {
        String r02 = this.zza.getStringExtra(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (r02 != null) goto L6;
        r02 = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
    L6:
        return zzb(r02);
    }

    public int getPriority() {
        String r02 = this.zza.getStringExtra(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (r02 != null) goto L10;
        if (Objects.equals(this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19), GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A) == false) goto L8;
        return 2;
    L8:
        r02 = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
    L10:
        return zzb(r02);
    }

    public byte[] getRawData() {
        return this.zza.getByteArrayExtra(Constants.MessagePayloadKeys.RAW_DATA);
    }

    public String getSenderId() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Bundle r02 = this.zza.getExtras();
        if (r02 == null) goto L5;
        Object r03 = r02.get(Constants.MessagePayloadKeys.SENT_TIME);
    L7:
        if ((r03 instanceof Long) == false) goto L11;
        return ((Long) r03).longValue();
    L11:
        if ((r03 instanceof String) == false) goto L19;
        return Long.parseLong((String) r03);
    L14:
        Log.w("CloudMessage", "Invalid sent time: ".concat(String.valueOf(r03)));
        return 0;
    L19:
        return 0;
    L5:
        r03 = null;
        goto L7
    }

    public String getTo() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.TO);
    }

    public int getTtl() {
        Bundle r02 = this.zza.getExtras();
        if (r02 == null) goto L5;
        Object r03 = r02.get(Constants.MessagePayloadKeys.TTL);
    L7:
        if ((r03 instanceof Integer) == false) goto L11;
        return ((Integer) r03).intValue();
    L11:
        if ((r03 instanceof String) == false) goto L19;
        return Integer.parseInt((String) r03);
    L14:
        Log.w("CloudMessage", "Invalid TTL: ".concat(String.valueOf(r03)));
        return 0;
    L19:
        return 0;
    L5:
        r03 = null;
        goto L7
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, this.zza, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    public final Integer zza() {
        if (this.zza.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) == true) goto L5;
        return null;
    L5:
        return Integer.valueOf(this.zza.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0));
    }
}
