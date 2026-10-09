package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
class CLSUUID {
    private static final String ID_SHA = null;
    private static final AtomicLong sequenceNumber = null;
    private final String sessionId;

    static {
        ID_SHA = CommonUtils.sha1(UUID.randomUUID().toString() + System.currentTimeMillis());
        sequenceNumber = new AtomicLong(0);
    }

    public CLSUUID() {
        byte[] r02 = new byte[10];
        populateTime(r02);
        populateSequenceNumber(r02);
        populatePID(r02);
        String r03 = CommonUtils.hexify(r02);
        Locale r1 = Locale.US;
        this.sessionId = String.format(r1, "%s%s%s%s", new Object[]{r03.substring(0, 12), r03.substring(12, 16), r03.subSequence(16, 20), ID_SHA.substring(0, 12)}).toUpperCase(r1);
    }

    private static byte[] convertLongToFourByteBuffer(long r1) {
        ByteBuffer r02 = ByteBuffer.allocate(4);
        r02.putInt((int) r1);
        r02.order(ByteOrder.BIG_ENDIAN);
        r02.position(0);
        return r02.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long r1) {
        ByteBuffer r02 = ByteBuffer.allocate(2);
        r02.putShort((short) r1);
        r02.order(ByteOrder.BIG_ENDIAN);
        r02.position(0);
        return r02.array();
    }

    private void populatePID(byte[] r4) {
        byte[] r02 = convertLongToTwoByteBuffer(Integer.valueOf(Process.myPid()).shortValue());
        r4[8] = r02[0];
        r4[9] = r02[1];
    }

    private void populateSequenceNumber(byte[] r4) {
        byte[] r02 = convertLongToTwoByteBuffer(sequenceNumber.incrementAndGet());
        r4[6] = r02[0];
        r4[7] = r02[1];
    }

    private void populateTime(byte[] r8) {
        long r02 = new Date().getTime();
        long r4 = r02 / 1000;
        byte[] r2 = convertLongToFourByteBuffer(r4);
        r8[0] = r2[0];
        r8[1] = r2[1];
        r8[2] = r2[2];
        r8[3] = r2[3];
        byte[] r03 = convertLongToTwoByteBuffer(r02 % 1000);
        r8[4] = r03[0];
        r8[5] = r03[1];
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return this.sessionId;
    }
}
