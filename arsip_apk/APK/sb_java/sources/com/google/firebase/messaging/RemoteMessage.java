package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2337a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @SafeParcelable.Field(id = 2)
    Bundle bundle;
    private Map<String, String> data;
    private Notification notification;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final Bundle bundle;
        private final Map<String, String> data;

        public Builder(String r4) {
            Bundle r02 = new Bundle();
            this.bundle = r02;
            this.data = new C2337a();
            if (TextUtils.isEmpty(r4) == true) goto L7;
            r02.putString(Constants.MessagePayloadKeys.TO, r4);
            return;
        L7:
            throw new IllegalArgumentException("Invalid to: " + r4);
        }

        public Builder addData(String r2, String r3) {
            this.data.put(r2, r3);
            return this;
        }

        public RemoteMessage build() {
            Bundle r02 = new Bundle();
            Iterator<Map.Entry<String, String>> r1 = this.data.entrySet().iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            Map.Entry<String, String> r2 = r1.next();
            r02.putString(r2.getKey(), r2.getValue());
            goto L4
        L6:
            r02.putAll(this.bundle);
            this.bundle.remove(Constants.MessagePayloadKeys.FROM);
            return new RemoteMessage(r02);
        }

        public Builder clearData() {
            this.data.clear();
            return this;
        }

        public String getCollapseKey() {
            return this.bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
        }

        public Map<String, String> getData() {
            return this.data;
        }

        public String getMessageId() {
            return this.bundle.getString(Constants.MessagePayloadKeys.MSGID, "");
        }

        public String getMessageType() {
            return this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        public int getTtl() {
            return Integer.parseInt(this.bundle.getString(Constants.MessagePayloadKeys.TTL, "0"));
        }

        public Builder setCollapseKey(String r3) {
            this.bundle.putString(Constants.MessagePayloadKeys.COLLAPSE_KEY, r3);
            return this;
        }

        public Builder setData(Map<String, String> r2) {
            this.data.clear();
            this.data.putAll(r2);
            return this;
        }

        public Builder setMessageId(String r3) {
            this.bundle.putString(Constants.MessagePayloadKeys.MSGID, r3);
            return this;
        }

        public Builder setMessageType(String r3) {
            this.bundle.putString(Constants.MessagePayloadKeys.MESSAGE_TYPE, r3);
            return this;
        }

        @ShowFirstParty
        public Builder setRawData(byte[] r3) {
            this.bundle.putByteArray(Constants.MessagePayloadKeys.RAW_DATA, r3);
            return this;
        }

        public Builder setTtl(int r3) {
            this.bundle.putString(Constants.MessagePayloadKeys.TTL, String.valueOf(r3));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification {
        private final String body;
        private final String[] bodyLocArgs;
        private final String bodyLocKey;
        private final String channelId;
        private final String clickAction;
        private final String color;
        private final boolean defaultLightSettings;
        private final boolean defaultSound;
        private final boolean defaultVibrateTimings;
        private final Long eventTime;
        private final String icon;
        private final String imageUrl;
        private final int[] lightSettings;
        private final Uri link;
        private final boolean localOnly;
        private final Integer notificationCount;
        private final Integer notificationPriority;
        private final String sound;
        private final boolean sticky;
        private final String tag;
        private final String ticker;
        private final String title;
        private final String[] titleLocArgs;
        private final String titleLocKey;
        private final long[] vibrateTimings;
        private final Integer visibility;

        public /* synthetic */ Notification(NotificationParams r1, AnonymousClass1 r2) {
            this(r1);
        }

        private static String[] getLocalizationArgs(NotificationParams r2, String r3) {
            Object[] r22 = r2.getLocalizationArgsForKey(r3);
            if (r22 != null) goto L6;
            return null;
        L6:
            String[] r32 = new String[r22.length];
            int r02 = 0;
        L8:
            if (r02 >= r22.length) goto L10;
            r32[r02] = String.valueOf(r22[r02]);
            r02 = r02 + 1;
            goto L8
        L10:
            return r32;
        }

        public String getBody() {
            return this.body;
        }

        public String[] getBodyLocalizationArgs() {
            return this.bodyLocArgs;
        }

        public String getBodyLocalizationKey() {
            return this.bodyLocKey;
        }

        public String getChannelId() {
            return this.channelId;
        }

        public String getClickAction() {
            return this.clickAction;
        }

        public String getColor() {
            return this.color;
        }

        public boolean getDefaultLightSettings() {
            return this.defaultLightSettings;
        }

        public boolean getDefaultSound() {
            return this.defaultSound;
        }

        public boolean getDefaultVibrateSettings() {
            return this.defaultVibrateTimings;
        }

        public Long getEventTime() {
            return this.eventTime;
        }

        public String getIcon() {
            return this.icon;
        }

        public Uri getImageUrl() {
            String r02 = this.imageUrl;
            if (r02 != null) goto L5;
            return null;
        L5:
            return Uri.parse(r02);
        }

        public int[] getLightSettings() {
            return this.lightSettings;
        }

        public Uri getLink() {
            return this.link;
        }

        public boolean getLocalOnly() {
            return this.localOnly;
        }

        public Integer getNotificationCount() {
            return this.notificationCount;
        }

        public Integer getNotificationPriority() {
            return this.notificationPriority;
        }

        public String getSound() {
            return this.sound;
        }

        public boolean getSticky() {
            return this.sticky;
        }

        public String getTag() {
            return this.tag;
        }

        public String getTicker() {
            return this.ticker;
        }

        public String getTitle() {
            return this.title;
        }

        public String[] getTitleLocalizationArgs() {
            return this.titleLocArgs;
        }

        public String getTitleLocalizationKey() {
            return this.titleLocKey;
        }

        public long[] getVibrateTimings() {
            return this.vibrateTimings;
        }

        public Integer getVisibility() {
            return this.visibility;
        }

        private Notification(NotificationParams r3) {
            this.title = r3.getString(Constants.MessageNotificationKeys.TITLE);
            this.titleLocKey = r3.getLocalizationResourceForKey(Constants.MessageNotificationKeys.TITLE);
            this.titleLocArgs = getLocalizationArgs(r3, Constants.MessageNotificationKeys.TITLE);
            this.body = r3.getString(Constants.MessageNotificationKeys.BODY);
            this.bodyLocKey = r3.getLocalizationResourceForKey(Constants.MessageNotificationKeys.BODY);
            this.bodyLocArgs = getLocalizationArgs(r3, Constants.MessageNotificationKeys.BODY);
            this.icon = r3.getString(Constants.MessageNotificationKeys.ICON);
            this.sound = r3.getSoundResourceName();
            this.tag = r3.getString(Constants.MessageNotificationKeys.TAG);
            this.color = r3.getString(Constants.MessageNotificationKeys.COLOR);
            this.clickAction = r3.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
            this.channelId = r3.getString(Constants.MessageNotificationKeys.CHANNEL);
            this.link = r3.getLink();
            this.imageUrl = r3.getString(Constants.MessageNotificationKeys.IMAGE_URL);
            this.ticker = r3.getString(Constants.MessageNotificationKeys.TICKER);
            this.notificationPriority = r3.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.visibility = r3.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
            this.notificationCount = r3.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.sticky = r3.getBoolean(Constants.MessageNotificationKeys.STICKY);
            this.localOnly = r3.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.defaultSound = r3.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.defaultVibrateTimings = r3.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.defaultLightSettings = r3.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.eventTime = r3.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
            this.lightSettings = r3.getLightSettings();
            this.vibrateTimings = r3.getVibrateTimings();
        }
    }

    static {
        CREATOR = new RemoteMessageCreator();
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle r1) {
        this.bundle = r1;
    }

    private int getMessagePriority(String r2) {
        if (com.clevertap.android.sdk.Constants.PRIORITY_HIGH.equals(r2) == false) goto L7;
        return 1;
    L7:
        if ("normal".equals(r2) == false) goto L10;
        return 2;
    L10:
        return 0;
    }

    public String getCollapseKey() {
        return this.bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    public Map<String, String> getData() {
        if (this.data != null) goto L6;
        this.data = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
    L6:
        return this.data;
    }

    public String getFrom() {
        return this.bundle.getString(Constants.MessagePayloadKeys.FROM);
    }

    public String getMessageId() {
        String r02 = this.bundle.getString(Constants.MessagePayloadKeys.MSGID);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return this.bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
    }

    public String getMessageType() {
        return this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public Notification getNotification() {
        if (this.notification != null) goto L8;
        if (NotificationParams.isNotification(this.bundle) == false) goto L8;
        this.notification = new Notification(new NotificationParams(this.bundle), null);
    L8:
        return this.notification;
    }

    public int getOriginalPriority() {
        String r02 = this.bundle.getString(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (r02 != null) goto L6;
        r02 = this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
    L6:
        return getMessagePriority(r02);
    }

    public int getPriority() {
        String r02 = this.bundle.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (r02 != null) goto L10;
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19)) == false) goto L8;
        return 2;
    L8:
        r02 = this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
    L10:
        return getMessagePriority(r02);
    }

    @ShowFirstParty
    public byte[] getRawData() {
        return this.bundle.getByteArray(Constants.MessagePayloadKeys.RAW_DATA);
    }

    public String getSenderId() {
        return this.bundle.getString(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object r02 = this.bundle.get(Constants.MessagePayloadKeys.SENT_TIME);
        if ((r02 instanceof Long) == false) goto L7;
        return ((Long) r02).longValue();
    L7:
        if ((r02 instanceof String) == false) goto L15;
        return Long.parseLong((String) r02);
    L10:
        Log.w(Constants.TAG, "Invalid sent time: " + r02);
        return 0;
    L15:
        return 0;
    }

    @Deprecated
    public String getTo() {
        return this.bundle.getString(Constants.MessagePayloadKeys.TO);
    }

    public int getTtl() {
        Object r02 = this.bundle.get(Constants.MessagePayloadKeys.TTL);
        if ((r02 instanceof Integer) == false) goto L7;
        return ((Integer) r02).intValue();
    L7:
        if ((r02 instanceof String) == false) goto L15;
        return Integer.parseInt((String) r02);
    L10:
        Log.w(Constants.TAG, "Invalid TTL: " + r02);
        return 0;
    L15:
        return 0;
    }

    public void populateSendMessageIntent(Intent r2) {
        r2.putExtras(this.bundle);
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent r02 = new Intent();
        r02.putExtras(this.bundle);
        return r02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        RemoteMessageCreator.writeToParcel(this, r1, r2);
    }
}
