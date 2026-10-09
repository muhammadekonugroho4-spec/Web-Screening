package com.google.zxing.pdf417;

/* loaded from: classes6.dex */
public final class PDF417ResultMetadata {
    private String addressee;
    private int checksum;
    private String fileId;
    private String fileName;
    private long fileSize;
    private boolean lastSegment;
    private int[] optionalData;
    private int segmentCount;
    private int segmentIndex;
    private String sender;
    private long timestamp;

    public PDF417ResultMetadata() {
        this.segmentCount = -1;
        this.fileSize = -1;
        this.timestamp = -1;
        this.checksum = -1;
    }

    public String getAddressee() {
        return this.addressee;
    }

    public int getChecksum() {
        return this.checksum;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    @Deprecated
    public int[] getOptionalData() {
        return this.optionalData;
    }

    public int getSegmentCount() {
        return this.segmentCount;
    }

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    public String getSender() {
        return this.sender;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isLastSegment() {
        return this.lastSegment;
    }

    public void setAddressee(String r1) {
        this.addressee = r1;
    }

    public void setChecksum(int r1) {
        this.checksum = r1;
    }

    public void setFileId(String r1) {
        this.fileId = r1;
    }

    public void setFileName(String r1) {
        this.fileName = r1;
    }

    public void setFileSize(long r1) {
        this.fileSize = r1;
    }

    public void setLastSegment(boolean r1) {
        this.lastSegment = r1;
    }

    @Deprecated
    public void setOptionalData(int[] r1) {
        this.optionalData = r1;
    }

    public void setSegmentCount(int r1) {
        this.segmentCount = r1;
    }

    public void setSegmentIndex(int r1) {
        this.segmentIndex = r1;
    }

    public void setSender(String r1) {
        this.sender = r1;
    }

    public void setTimestamp(long r1) {
        this.timestamp = r1;
    }
}
