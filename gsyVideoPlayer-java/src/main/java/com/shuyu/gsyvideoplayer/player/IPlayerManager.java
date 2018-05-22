package com.shuyu.gsyvideoplayer.player;

import android.content.Context;
import android.os.Message;

import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;

import java.util.List;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * 播放器差异管理接口
 * Created by guoshuyu on 2018/1/11.
 */

public interface IPlayerManager {

    IMediaPlayer getMediaPlayer();

    /**
     * 初始化播放内核
     *
     * @param message         播放器所需初始化内容
     * @param optionModelList 配置信息
     * @param cacheManager    缓存管理
     */
    void initVideoPlayer(Context context, Message message, List<VideoOptionModel> optionModelList, ICacheManager cacheManager);

    /**
     * 设置渲染显示
     */
    void showDisplay(Message msg);

    /**
     * 是否静音
     */
    void setNeedMute(boolean needMute);

    /**
     * 释放渲染
     */
    void releaseSurface();

    /**
     * 释放内核
     */
    void release();

    /**
     * 缓存进度
     */
    int getBufferedPercentage();

    /**
     * 网络速度
     */
    long getNetSpeed();

    /**
     * 播放速度
     */
    void setSpeedPlaying(float speed, boolean soundTouch);

    void setSpeed(float speed, boolean soundTouch);
}
