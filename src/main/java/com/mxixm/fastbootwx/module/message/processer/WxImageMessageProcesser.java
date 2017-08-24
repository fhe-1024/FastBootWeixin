package com.mxixm.fastbootwx.module.message.processer;

import com.mxixm.fastbootwx.module.WxRequest;
import com.mxixm.fastbootwx.module.media.WxMediaManager;
import com.mxixm.fastbootwx.module.message.WxMessage;

/**
 * FastBootWeixin  WxCommonMessageProcesser
 *
 * @author Guangshan
 * @summary FastBootWeixin  WxCommonMessageProcesser
 * @Copyright (c) 2017, Guangshan Group All Rights Reserved
 * @since 2017/8/20 22:53
 */
public class WxImageMessageProcesser extends AbstractWxMediaMessageProcesser<WxMessage.Image> {

    public WxImageMessageProcesser(WxMediaManager wxMediaManager) {
        super(wxMediaManager);
    }

    public WxMessage.Image process(WxRequest wxRequest, WxMessage.Image wxMessage) {
        if (wxMessage == null) {
            return wxMessage;
        }
        processBody(wxRequest, wxMessage.getBody());
        return wxMessage;
    }

}