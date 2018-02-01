package com.imooc.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.imooc.netty
 * @Description: 存储整个工程的全局配置
 * @date 2018/2/1 下午10:01
 */
public class NettyConfig {

    /**
     * 存储每个客户端接入进来的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
