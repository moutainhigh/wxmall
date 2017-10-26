/**
 * Copyright (c) 成都次时代信息科技有限公司 2016-2017, 33732992@qq.com.
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *	    http://www.ybwqy.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dbumama.market.queue;

import java.io.Serializable;

/**
 * 事件通知,仅包含wait和notify方法
 */
public final class Event implements Serializable{
	private static final long serialVersionUID = 1L;
    private boolean isWait = false;
    
    /**
     * 事件阻塞
     * 
     * @param lWaitTime 等待时间
     */
    public synchronized void WaitNotifyEvent(long lWaitTime)
    {
        try
        {
            isWait = true;
            wait(lWaitTime);
            isWait = false;
        }
        catch (java.lang.InterruptedException ex)
        {
        }
    }

    /** 事件通知 */
    public synchronized void notifyEvent()
    {
        notify();
    }
    
    /** 事件是否在等待 */
    public boolean isWait()
    {
        return isWait;
    }
}
