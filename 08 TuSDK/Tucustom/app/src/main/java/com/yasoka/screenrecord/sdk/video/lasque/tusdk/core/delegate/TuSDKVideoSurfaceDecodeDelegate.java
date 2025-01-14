// 
// Decompiled by Procyon v0.5.36
// 

package com.yasoka.screenrecord.sdk.video.lasque.tusdk.core.delegate;

import android.media.MediaCodec;

import com.yasoka.screenrecord.sdk.video.lasque.tusdk.core.decoder.TuSDKMediaDecoder;
import com.yasoka.screenrecord.sdk.video.lasque.tusdk.core.decoder.TuSDKVideoInfo;
//import org.lasque.tusdk.core.decoder.TuSDKVideoInfo;
//import org.lasque.tusdk.core.decoder.TuSDKMediaDecoder;

public interface TuSDKVideoSurfaceDecodeDelegate
{
    void onDecoderError(final TuSDKMediaDecoder.TuSDKMediaDecoderError p0);
    
    void onVideoInfoReady(final TuSDKVideoInfo p0);
    
    void onProgressChanged(final long p0, final float p1);
    
    void onVideoDecoderNewFrameAvailable(final int p0, final MediaCodec.BufferInfo p1);
    
    void onDecoderComplete();
}
