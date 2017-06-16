/*
 * Copyright [2016] [zhangsong <songm.cn>].
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package cn.songm.im.business;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelId;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoop;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

import java.net.SocketAddress;

/**
 * 聊天服务器与客户端的管道
 * 
 * @author zhangsong
 *
 */
public abstract class IMChannel implements Channel {

    @Override
    public <T> Attribute<T> attr(AttributeKey<T> key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> boolean hasAttr(AttributeKey<T> key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int compareTo(Channel o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ChannelId id() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventLoop eventLoop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Channel parent() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelConfig config() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isOpen() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isRegistered() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isActive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ChannelMetadata metadata() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SocketAddress localAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SocketAddress remoteAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture closeFuture() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWritable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Unsafe unsafe() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelPipeline pipeline() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ByteBufAllocator alloc() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelPromise newPromise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelProgressivePromise newProgressivePromise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture newSucceededFuture() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture newFailedFuture(Throwable cause) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelPromise voidPromise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture bind(SocketAddress localAddress) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture connect(SocketAddress remoteAddress) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture connect(SocketAddress remoteAddress,
            SocketAddress localAddress) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture disconnect() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture close() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture deregister() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture bind(SocketAddress localAddress, ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture connect(SocketAddress remoteAddress,
            ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture connect(SocketAddress remoteAddress,
            SocketAddress localAddress, ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture disconnect(ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture close(ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture deregister(ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Channel read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture write(Object msg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture write(Object msg, ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Channel flush() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture writeAndFlush(Object msg, ChannelPromise promise) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChannelFuture writeAndFlush(Object msg) {
        // TODO Auto-generated method stub
        return null;
    }

}
