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
package cn.songm.im.server.handler;

import cn.songm.im.business.IMException;
import cn.songm.im.model.Protocol;
import io.netty.channel.Channel;

/**
 * 消息事件操作
 * 
 * @author zhangsong
 *
 */
public interface Handler {

    public int operation();

    void action(Channel ch, Protocol pro) throws IMException;

}
