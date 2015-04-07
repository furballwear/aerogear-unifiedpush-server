package org.jboss.aerogear.unifiedpush.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jboss.aerogear.unifiedpush.api.PushMessageInformation;
import org.jboss.aerogear.unifiedpush.api.Variant;

public class MessageWithTokens implements Serializable {

    private static final long serialVersionUID = -7955411139315335655L;

    private PushMessageInformation pushMessageInformation;
    private UnifiedPushMessage unifiedPushMessage;
    private Variant variant;
    private List<String> deviceTokens;

    public MessageWithTokens(PushMessageInformation pushMessageInformation, UnifiedPushMessage unifiedPushMessage, Variant variant, ArrayList<String> deviceTokens) {
        this.pushMessageInformation = pushMessageInformation;
        this.unifiedPushMessage = unifiedPushMessage;
        this.variant = variant;
        this.deviceTokens = deviceTokens;
    }

    public PushMessageInformation getPushMessageInformation() {
        return pushMessageInformation;
    }

    public UnifiedPushMessage getUnifiedPushMessage() {
        return unifiedPushMessage;
    }

    public Variant getVariant() {
        return variant;
    }

    public List<String> getDeviceTokens() {
        return deviceTokens;
    }
}