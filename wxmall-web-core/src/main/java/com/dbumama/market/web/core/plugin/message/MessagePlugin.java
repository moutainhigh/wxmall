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
package com.dbumama.market.web.core.plugin.message;

import java.util.List;

import com.dbumama.market.message.MessageListener;
import com.dbumama.market.message.MessageManager;
import com.dbumama.market.web.core.annotation.ClassUtils;
import com.jfinal.plugin.IPlugin;

/**
 * @author yangzy
 * 2017年7月13日
 */
public class MessagePlugin implements IPlugin {

	@Override
	public boolean start() {
		autoRegister();
		return true;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void autoRegister() {
		List<Class<MessageListener>> list = ClassUtils.scanPackageClass(MessageListener.class, "com/dbumama/market/web/core/listener");
		if (list != null && list.size() > 0) {
			for (Class listener : list) {
				MessageManager.me().registerListener(listener);
			}
		}
	}

	@Override
	public boolean stop() {
		return true;
	}

}
