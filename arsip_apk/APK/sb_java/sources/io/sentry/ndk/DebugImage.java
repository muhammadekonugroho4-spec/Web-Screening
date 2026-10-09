package io.sentry.ndk;

import java.util.Map;

/* loaded from: classes3.dex */
public final class DebugImage {
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public DebugImage() {
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setArch(String r1) {
        this.arch = r1;
    }

    public void setCodeFile(String r1) {
        this.codeFile = r1;
    }

    public void setCodeId(String r1) {
        this.codeId = r1;
    }

    public void setDebugFile(String r1) {
        this.debugFile = r1;
    }

    public void setDebugId(String r1) {
        this.debugId = r1;
    }

    public void setImageAddr(String r1) {
        this.imageAddr = r1;
    }

    public void setImageSize(Long r1) {
        this.imageSize = r1;
    }

    public void setType(String r1) {
        this.type = r1;
    }

    public void setUuid(String r1) {
        this.uuid = r1;
    }

    public void setImageSize(long r1) {
        this.imageSize = Long.valueOf(r1);
    }
}
