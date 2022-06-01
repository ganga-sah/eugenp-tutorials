package com.baeldung.cassandra.java.client.domain;

import java.util.UUID;

public class ItemAttribute {

    private UUID item_id;

    private String field_id;

    private String attachment_id;

    private String channel_id;

    private String ext_id;

    private String value;

    ItemAttribute() {
    }

    public ItemAttribute(UUID item_id, String field_id, String attachment_id, String channel_id, String ext_id, String value) {
        this.item_id = item_id;
        this.field_id = field_id;
        this.attachment_id = attachment_id;
        this.channel_id = channel_id;
        this.ext_id = ext_id;
        this.value = value;
    }

    public UUID getItem_id() {
        return item_id;
    }

    public void setItem_id(UUID item_id) {
        this.item_id = item_id;
    }

    public String getField_id() {
        return field_id;
    }

    public void setField_id(String field_id) {
        this.field_id = field_id;
    }

    public String getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(String attachment_id) {
        this.attachment_id = attachment_id;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
